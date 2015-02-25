package com.application.ciadobusao.telas;

import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.Toast;

import com.application.ciadobusao.R;
import com.application.ciadobusao.util.CheckNetwork;
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

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if(rootView != null){
			 ViewGroup parent = (ViewGroup) rootView.getParent();
		        if (parent != null)
		            parent.removeView(rootView);
		}
		try {
		rootView = inflater.inflate(R.layout.fragment_map, container, false);
		 } catch (InflateException e) {
		        /* map is already there, just return view as it is */
		 }

		SupportMapFragment mapFragment = (SupportMapFragment) getFragmentManager()
				.findFragmentById(R.id.map);

		map = mapFragment.getMap();

		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
		
		map.setOnMapClickListener(new OnMapClickListener() {
			
			@Override
			public void onMapClick(LatLng location) {
				latitude = location.latitude;
				longitude = location.longitude;
				onMapReady(map);
			}
		});

		locationResult = new LocationResult() {
			@Override
			public void gotLocation(Location location) {
				map.setMyLocationEnabled(true);
				latitude = location.getLatitude();
				longitude = location.getLongitude();
			}
		};
		MyLocation myLocation = new MyLocation();
		myLocation.getLocation(getActivity(), locationResult);

		if (!CheckNetwork.isInternetAvailable(getActivity())) {
			Toast.makeText(getActivity(),
					"Verifique sua conexão com a Internet e tente novamente.",
					1500).show();
		}
		return rootView;
	}
	
	public void onMapReady(GoogleMap map) {
		map.clear();
	    map.addMarker(new MarkerOptions()
	        .position(new LatLng(latitude, longitude))
	        .title("Encontro"));
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