package com.application.ciadobusao;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.application.ciadobusao.util.CheckNetwork;

public class MainActivity extends FragmentActivity {

	private MainFragment mainFragment;

	@SuppressLint("ShowToast")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (!CheckNetwork.isInternetAvailable(this)) {
			Toast.makeText(this,"Verifique sua conexão com a Internet e tente novamente.",1500).show();
		}
		if (savedInstanceState == null) {
			// Add the fragment on initial activity setup
			mainFragment = new MainFragment();
			getSupportFragmentManager().beginTransaction()
					.add(android.R.id.content, mainFragment).commit();
		} else {
			// Or set the fragment from restored state info
			mainFragment = (MainFragment) getSupportFragmentManager()
					.findFragmentById(android.R.id.content);
		}
	}

}
