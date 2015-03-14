package com.application.ciadobusao.telas;

import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.application.ciadobusao.R;
import com.application.ciadobusao.util.CheckNetwork;
import com.application.ciadobusao.util.Encontro;
import com.application.ciadobusao.util.MyLocation;
import com.application.ciadobusao.util.MyLocation.LocationResult;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragment extends Fragment {

	private static View rootView;
	private LocationResult locationResult;
	private double latitude;
	private double longitude;
	private GoogleMap map;
	private Button sairButton;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (rootView != null) {
			ViewGroup parent = (ViewGroup) rootView.getParent();
			if (parent != null)
				parent.removeView(rootView);
		}
		try {
			rootView = inflater
					.inflate(R.layout.fragment_map, container, false);
		} catch (InflateException e) {
			/* map is already there, just return view as it is */
		}
		
		SupportMapFragment mapFragment = (SupportMapFragment) getFragmentManager()
				.findFragmentById(R.id.map);

		map = mapFragment.getMap();

		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
		sairButton = (Button) rootView.findViewById(R.id.sairButton);
		sairButton.setVisibility(View.INVISIBLE);
		map.setOnMapClickListener(null);
		if (NovoEncontroFragment.novoEncontro == true) {
			map.clear();
			map.setOnMapClickListener(new OnMapClickListener() {
				@Override
				public void onMapClick(LatLng location) {
					latitude = location.latitude;
					longitude = location.longitude;
					onMapReady(map);
				}
			});
			sairButton.setVisibility(View.VISIBLE);
			sairButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					NovoEncontroFragment.latitudeEncontro = latitude;
					NovoEncontroFragment.longitudeEncontro = longitude;
					NovoEncontroFragment.localEncontro = "Local definido";
					NovoEncontroFragment novoEncontroFragment = new NovoEncontroFragment();
					FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
					fragmentManager.beginTransaction().replace(R.id.container, novoEncontroFragment).commit();
				}
			});
		} else {
			createMarkers(map);
		}
		
		locationResult = new LocationResult() {
			@Override
			public void gotLocation(Location location) {
				latitude = location.getLatitude();
				longitude = location.getLongitude();
			}
		};
		MyLocation myLocation = new MyLocation();
		myLocation.getLocation(getActivity(), locationResult);
		map.setMyLocationEnabled(true);

		if (!CheckNetwork.isInternetAvailable(getActivity())) {
			Toast.makeText(getActivity(),
					"Verifique sua conexão com a Internet e tente novamente.",
					1500).show();
		}
		
		return rootView;
	}

	public void onMapReady(GoogleMap map) {
		map.clear();
		map.addMarker(new MarkerOptions().position(
				new LatLng(latitude, longitude)).title("Encontro"));
	}
	
	public void createMarkers (GoogleMap map) {
		map.clear();
		for (Encontro encontro : MeusEncontrosFragment.getMeusEncontros()) {
			if (encontro.getLatitude()!= 0) {
				map.addMarker(new MarkerOptions().position(
				new LatLng(encontro.getLatitude(), encontro.getLongitude())).title(encontro.getNome() + "\n" + encontro.getHorario()));
			}
		}
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	@Override
	public void onSaveInstanceState(Bundle bundle) {
		super.onSaveInstanceState(bundle);
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

}