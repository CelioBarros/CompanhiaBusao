package com.application.ciadobusao.telas;

import java.util.ArrayList;

import java.util.List;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;


import com.application.ciadobusao.R;
import com.application.ciadobusao.db.ClienteRest;
import com.application.ciadobusao.util.AdapterListNotificacoesView;
import com.application.ciadobusao.util.CheckNetwork;
import com.application.ciadobusao.util.Encontro;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class NotificacoesFragment extends Fragment {

	private ListView listView;
	private List<String> listaNotificacoes = new ArrayList<String>();
	private List<Encontro> listaEncontros;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_map,
				container, false);
		
		SupportMapFragment mapFragment = (SupportMapFragment) getFragmentManager().findFragmentById(R.id.map);
		 
		 GoogleMap map = mapFragment.getMap();
		       
		 map.setMapType(GoogleMap.MAP_TYPE_HYBRID);


		if (!CheckNetwork.isInternetAvailable(getActivity())) {
			Toast.makeText(getActivity(),"Verifique sua conexão com a Internet e tente novamente.",1500).show();
		} 
		return rootView;
	}
	
	

}