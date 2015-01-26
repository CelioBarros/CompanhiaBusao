package com.application.ciadobusao.telas;

import java.util.ArrayList;
import java.util.List;

import com.application.ciadobusao.MainFragment;
import com.application.ciadobusao.R;
import com.facebook.HttpMethod;
import com.facebook.Request;
import com.facebook.Request.GraphUserCallback;
import com.facebook.Request.GraphUserListCallback;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import com.facebook.model.GraphUser;
import com.facebook.widget.ProfilePictureView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PerfilFragment extends Fragment {

	private static final int REAUTH_ACTIVITY_CODE = 100;
	private static ProfilePictureView profilePictureView;
	private View view;
	private static TextView userNameView;
	private static TextView userNameGender;
	private static GraphUser userMe;
	private ArrayList<GraphUser> friendlist = new ArrayList<GraphUser>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		uiHelper = new UiLifecycleHelper(getActivity(), callback);
		uiHelper.onCreate(savedInstanceState);
	}
	
	public ArrayList<GraphUser> getFriendList() {
		getFriends();
		return friendlist;
	}
	
	public static GraphUser getUser() {
		makeMeRequest(Session.getActiveSession());
		return userMe;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.fragment_perfil, container, false);

		profilePictureView = (ProfilePictureView) view
				.findViewById(R.id.selection_profile_pic);
		profilePictureView.setCropped(true);
		userNameView = (TextView) view.findViewById(R.id.selection_user_name);
		userNameGender = (TextView) view.findViewById(R.id.selection_gender);
		Session session = Session.getActiveSession();
		if (session != null && session.isOpened()) {
			makeMeRequest(session);
			getFriends();
		}
		return view;
	}
	
	private void getFriends(){
	    Session activeSession = Session.getActiveSession();
	    if(activeSession.getState().isOpened()){
	        Request friendRequest = Request.newMyFriendsRequest(activeSession, 
	            new GraphUserListCallback(){
	                @Override
	                public void onCompleted(List<GraphUser> users,
	                        Response response) {
	                	if(response.getError() == null){
	                        for (int i = 0; i < users.size(); i++) {
	                            friendlist.add(users.get(i));
	                        }
	                    } else {
	                        Toast.makeText(view.getContext(), 
	                                       response.getError().getErrorMessage(), 
	                                       Toast.LENGTH_SHORT).show();
	                    }
	                }
	        });
	        Bundle params = new Bundle();
	        params.putString("fields", "id, name, picture");
	        friendRequest.setParameters(params);
	        friendRequest.executeAsync();
	    }
	}

	private static void makeMeRequest(final Session session) {
		Request request = Request.newMeRequest(session,
				new Request.GraphUserCallback() {
					@Override
					public void onCompleted(GraphUser user, Response response) {
						userMe = user;
						if (session == Session.getActiveSession()) {
							if (userMe != null) {
								profilePictureView.setProfileId(userMe.getId());
								userNameView.setText(userMe.getName());
								String gender = "";
								if (userMe.asMap().get("gender").toString()
										.equals("male")) {
									gender = "Masculino";
								} else if (userMe.asMap().get("gender")
										.toString().equals("female")) {
									gender = "Feminino";
								} else {
									gender = "Indefinido";
								}
								userNameGender.setText("Gênero: " + gender);
							}
						}
						if (response.getError() != null) {
						}
					}
				});
		request.executeAsync();
	}

	private void onSessionStateChange(final Session session,
			SessionState state, Exception exception) {
		if (session != null && session.isOpened()) {
			makeMeRequest(session);
			getFriends();
		}
	}

	private UiLifecycleHelper uiHelper;
	private Session.StatusCallback callback = new Session.StatusCallback() {
		@Override
		public void call(final Session session, final SessionState state,
				final Exception exception) {
			onSessionStateChange(session, state, exception);
		}
	};

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == REAUTH_ACTIVITY_CODE) {
			uiHelper.onActivityResult(requestCode, resultCode, data);
		}
	}

	@Override
	public void onResume() {
		super.onResume();
		uiHelper.onResume();
	}

	@Override
	public void onSaveInstanceState(Bundle bundle) {
		super.onSaveInstanceState(bundle);
		uiHelper.onSaveInstanceState(bundle);
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

}
