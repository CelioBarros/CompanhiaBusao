package com.application.ciadobusao;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class NovoEncontroFragment extends Fragment{
	private Button buttonCriar;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_novo_encontro, container, false);
		
		
		return rootView;
	}
	
	public void criarEncontro(View view) {
		
		System.out.println("OOOOO");
		
	}

}
