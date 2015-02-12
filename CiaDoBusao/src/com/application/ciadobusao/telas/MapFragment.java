package com.application.ciadobusao.telas;

import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.application.ciadobusao.R;
import com.application.ciadobusao.util.CheckNetwork;
import com.application.ciadobusao.util.MyLocation;
import com.application.ciadobusao.util.MyLocation.LocationResult;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class MapFragment extends Fragment {

	private View rootView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		rootView = inflater.inflate(R.layout.fragment_map, container, false);

		SupportMapFragment mapFragment = (SupportMapFragment) getFragmentManager()
				.findFragmentById(R.id.map);

		final GoogleMap map = mapFragment.getMap();

		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

		LocationResult locationResult = new LocationResult() {
			@Override
			public void gotLocation(Location location) {
				map.setMyLocationEnabled(true);
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