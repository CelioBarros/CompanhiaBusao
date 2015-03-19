package com.application.ciadobusao.telas;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
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
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragment extends Fragment {

	private static View rootView;
	private double latitude;
	private double longitude;
	private double latitudeZoom;
	private double longitudeZoom;
	private LocationManager locationManager;
	private String provider;
	private GoogleMap map;
	private Button sairButton;
	private boolean zoomed;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (!checaConexao()) {
			getActivity().getSupportFragmentManager().popBackStack();
			getActivity().finish();
		}
		if (!CheckNetwork.isInternetAvailable(getActivity())) {
			Toast.makeText(getActivity(),"Verifique sua conexão com a Internet e tente novamente.",1500).show();
		} else {
		if (rootView != null) {
			ViewGroup parent = (ViewGroup) rootView.getParent();
			if (parent != null)
				parent.removeView(rootView);
		}
		try {
			rootView = inflater
					.inflate(R.layout.fragment_map, container, false);
		} catch (InflateException e) {
			/* map is already there*/
		}
		zoomed = false;
		
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
					if (latitude != 0) {
						NovoEncontroFragment.localEncontro = "Local definido";
					} else {
						NovoEncontroFragment.localEncontro = "";
					}
					NovoEncontroFragment novoEncontroFragment = new NovoEncontroFragment();
					FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
					fragmentManager.beginTransaction().replace(R.id.container, novoEncontroFragment).commit();
				}
			});
		} else {
			createMarkers(map);
		}
		
		map.setMyLocationEnabled(true);
		if (!CheckNetwork.isInternetAvailable(getActivity())) {
			Toast.makeText(getActivity(),
					"Verifique sua conexão com a Internet e tente novamente.",
					1500).show();
		}
		locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
		map.setOnMyLocationChangeListener(new OnMyLocationChangeListener() {
			
			@Override
			public void onMyLocationChange(Location arg0) {
			    Criteria criteria = new Criteria();
			    provider = locationManager.getBestProvider(criteria, false);
			    Location location = locationManager.getLastKnownLocation(provider);
			    latitudeZoom = location.getLatitude();
				longitudeZoom = location.getLongitude();
				if (latitudeZoom != 0 && zoomed == false) {
					CameraUpdate zoomLocation = CameraUpdateFactory.newLatLngZoom(new LatLng(latitudeZoom, longitudeZoom), 15);
					map.animateCamera(zoomLocation);
					if (map.getCameraPosition().zoom == 15) {
						zoomed = true;
					}
				}
			}
		});
		}
		return rootView;
		
	}

	private boolean checaConexao() {
	 	ConnectivityManager conMgr = (ConnectivityManager) getActivity().getApplicationContext()
	  .getSystemService(Context.CONNECTIVITY_SERVICE);
	 	NetworkInfo i = conMgr.getActiveNetworkInfo();
	 	if (i == null) {
	 	return false;
	 	}
	 	if (!i.isConnected() && !i.isAvailable()) {
	 	return false;
	 	}
	 	return true;
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