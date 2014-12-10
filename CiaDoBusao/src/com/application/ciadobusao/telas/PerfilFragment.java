package com.application.ciadobusao.telas;

import com.application.ciadobusao.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class PerfilFragment extends Fragment {
	private ImageView profilePhoto;
	private TextView profileName;
	private TextView profileSex;
	private String name;
	private String sex;
	private View view;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_perfil,container, false);
		
		profilePhoto = (ImageView) view.findViewById(R.id.profilePhoto);
		profileName = (TextView) view.findViewById(R.id.profileName);
		profileSex = (TextView) view.findViewById(R.id.profileSex);
		
		name = "Test Bot";
		sex = "Undefined";
		
		profileName.setText(profileName.getText() + " " + name);
		profileSex.setText(profileSex.getText() + " " + sex);
		
		
		return view;
	}

}
