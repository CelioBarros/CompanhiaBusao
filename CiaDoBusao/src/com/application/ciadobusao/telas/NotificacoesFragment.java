package com.application.ciadobusao.telas;

import com.application.ciadobusao.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class NotificacoesFragment extends Fragment{

	private ListView listView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_notificacoes,
				container, false);
		listView = (ListView) rootView.findViewById(R.id.notificacoes);
		return rootView;
	}
}
