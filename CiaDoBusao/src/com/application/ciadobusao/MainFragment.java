package com.application.ciadobusao;

import java.util.Arrays;

import com.application.ciadobusao.telas.MenuActivity;
import com.facebook.Session;
import com.facebook.SessionState;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facebook.UiLifecycleHelper;
import com.facebook.widget.LoginButton;

public class MainFragment extends Fragment {
	
	private UiLifecycleHelper uiHelper;
	private static final String TAG = "MainFragment";
	private int countTelas = 0;
	private Button inicioButton;
	private int visivel;
	private int invisivel;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.activity_main, container, false);
	    LoginButton authButton = (LoginButton) view.findViewById(R.id.authButton);
	    authButton.setReadPermissions(Arrays.asList("public_profile"));
	    authButton.setReadPermissions(Arrays.asList("user_friends"));
	    authButton.setFragment(this);
	    inicioButton = (Button) view.findViewById(R.id.buttonInicio);
	    visivel = View.VISIBLE;
	    invisivel = View.INVISIBLE;
	    inicioButton.setVisibility(invisivel);
	    inicioButton.setClickable(false);

	    return view;
	}
	
	private void onSessionStateChange(Session session, SessionState state, Exception exception) {
	    if (state.isOpened()) {
	        Log.i(TAG, "Logged in...");
	        inicioButton.setVisibility(visivel);
		    inicioButton.setClickable(true);
		    inicioButton.setOnClickListener(new View.OnClickListener() {
		        @Override
		        public void onClick(View v) {
		            Intent intent = new Intent(getActivity(), MenuActivity.class);
			        getActivity().startActivity(intent);
		        }
		    });
	        if(countTelas==0){
	        	countTelas++;
	        Intent intent = new Intent(getActivity(), MenuActivity.class);
	        getActivity().startActivity(intent);
	        //getActivity().finish();
	        }
	    } else if (state.isClosed()) {
	        Log.i(TAG, "Logged out...");
	        countTelas--;
	        inicioButton.setVisibility(invisivel);
		    inicioButton.setClickable(false);
	    }
	}
	
	private Session.StatusCallback callback = new Session.StatusCallback() {
	    @Override
	    public void call(Session session, SessionState state, Exception exception) {
	        onSessionStateChange(session, state, exception);
	    }
	};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    uiHelper = new UiLifecycleHelper(getActivity(), callback);
	    uiHelper.onCreate(savedInstanceState);
	}
	
	@Override
	public void onResume() {
	    super.onResume();
	    
	    Session session = Session.getActiveSession();
	    if (session != null &&
	           (session.isOpened() || session.isClosed()) ) {
	        onSessionStateChange(session, session.getState(), null);
	    }
	    
	    uiHelper.onResume();
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);
	    uiHelper.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onPause() {
	    super.onPause();
	    uiHelper.onPause();
	}

	@Override
	public void onDestroy() {
	    super.onDestroy();
	    uiHelper.onDestroy();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
	    super.onSaveInstanceState(outState);
	    uiHelper.onSaveInstanceState(outState);
	}
	
	
}
