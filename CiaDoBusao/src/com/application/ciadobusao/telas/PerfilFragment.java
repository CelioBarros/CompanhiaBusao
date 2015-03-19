package com.application.ciadobusao.telas;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.application.ciadobusao.MainActivity;
import com.application.ciadobusao.MainFragment;
import com.application.ciadobusao.R;
import com.application.ciadobusao.db.ClienteRest;
import com.application.ciadobusao.util.Usuario;
import com.facebook.Request;
import com.facebook.Request.GraphUserListCallback;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.model.GraphUser;
import com.facebook.widget.ProfilePictureView;
import com.google.android.gms.gcm.GoogleCloudMessaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PerfilFragment extends Fragment {

	private static final int REAUTH_ACTIVITY_CODE = 100;
	public static ProfilePictureView profilePictureView;
	private View view;
	private static TextView userNameView;
//	private static TextView userNameGender;
	protected static GraphUser userMe;
	private static List<GraphUser> friendlist;
	public static String encodedImage;
	GoogleCloudMessaging gcm;
	String regid;
	String PROJECT_NUMBER = "622595980917";
	int primeiravez =0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		if (!checaConexao()) {
			getActivity().getSupportFragmentManager().popBackStack();
		}
		super.onCreate(savedInstanceState);
		uiHelper = new UiLifecycleHelper(getActivity(), callback);
		uiHelper.onCreate(savedInstanceState);
	}
	
	

	public static List<GraphUser> getFriendList() {
		return friendlist;
	}
	public void criaUsuarioERegID(){
		if(checaConexao()) {
		new AsyncTask<Void, Void, String>() {
			@Override
			protected String doInBackground(Void... params) {
				String msg = "";
				try {
					if (gcm == null) {
						gcm = GoogleCloudMessaging.getInstance(getActivity().getApplicationContext());
					}
					regid = gcm.register(PROJECT_NUMBER);
					msg = regid;
					Log.i("GCM",  msg);

				} catch (IOException ex) {
					msg = "Error :" + ex.getMessage();

				}
				return msg;
			}

			@Override
			protected void onPostExecute(String msg) {
				Usuario usuario = new Usuario();
				usuario.setIdFace(PerfilFragment.getUser().getId()+"");
				usuario.setNome(PerfilFragment.getUser().getName());
				usuario.setId_gcm(msg);
				usuario.setFoto(encodedImage);
				if (userMe != null) {
					ClienteRest cliREST = new ClienteRest();
					try {
						cliREST.criarUsuario(usuario);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}            		
				} else {
					makeMeRequest(Session.getActiveSession());
				}

			}
		}.execute(null,null,null);
		}
	}

	public static GraphUser getUser() {
		makeMeRequest(Session.getActiveSession());
		return userMe;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (!checaConexao()) {
			getActivity().getSupportFragmentManager().popBackStack();
		}
		view = inflater.inflate(R.layout.fragment_perfil, container, false);

		profilePictureView = (ProfilePictureView) view
				.findViewById(R.id.selection_profile_pic);
		profilePictureView.setCropped(true);
		
		userNameView = (TextView) view.findViewById(R.id.selection_user_name);
		Session session = Session.getActiveSession();
		if (session != null && session.isOpened()) {
			makeMeRequest(session);
			getFriends();
			if(primeiravez ==0){
				criaUsuarioERegID();
				primeiravez =+ primeiravez +1;
			}
		}
		
		getActivity().getActionBar().setTitle(R.string.title_section5);
		
		Button criaEncontro = (Button) view.findViewById(R.id.criaEncontro);
		criaEncontro.setOnClickListener(new View.OnClickListener() {

		@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				getActivity().getActionBar().setTitle(R.string.title_section2);
				FragmentManager fragmentManager = getActivity()
						.getSupportFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.container, new NovoEncontroFragment()).commit();

			}
		});
		
		Button meusEncontros = (Button) view.findViewById(R.id.meusEncontros);
		meusEncontros.setOnClickListener(new View.OnClickListener() {

		@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				getActivity().getActionBar().setTitle(R.string.title_section3);
				FragmentManager fragmentManager = getActivity()
						.getSupportFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.container, new MeusEncontrosFragment()).commit();

			}
		});
		
		Button mapa = (Button) view.findViewById(R.id.mapa);
		mapa.setOnClickListener(new View.OnClickListener() {

		@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				getActivity().getActionBar().setTitle(R.string.title_section7);
				FragmentManager fragmentManager = getActivity()
						.getSupportFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.container, new MapFragment()).commit();

			}
		});
		
		Button encontros = (Button) view.findViewById(R.id.encontros);
		encontros.setOnClickListener(new View.OnClickListener() {

		@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				getActivity().getActionBar().setTitle(R.string.title_section4);
				FragmentManager fragmentManager = getActivity()
						.getSupportFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.container, new EncontrosFragment()).commit();

			}
		});
		
		Button sobre = (Button) view.findViewById(R.id.sobre);
		sobre.setOnClickListener(new View.OnClickListener() {

		@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				getActivity().getActionBar().setTitle(R.string.title_section1);
				FragmentManager fragmentManager = getActivity()
						.getSupportFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.container, new AboutFragment()).commit();

			}
		});
		
		Button sair = (Button) view.findViewById(R.id.sair);
		sair.setOnClickListener(new View.OnClickListener() {

		@Override
			public void onClick(View v) {
	        getActivity().finish();
	        }
		});
		
		return view;
	}

	private void getFriends() {
		
		Session activeSession = Session.getActiveSession();
		friendlist = new ArrayList<GraphUser>();
		if (activeSession.getState().isOpened()) {
			Request friendRequest = Request.newMyFriendsRequest(activeSession,
					new GraphUserListCallback() {
						@SuppressLint("ShowToast")
						@Override
						public void onCompleted(List<GraphUser> users,
								Response response) {
							if (response.getError() == null) {
								for (int i = 0; i < users.size(); i++) {
									friendlist.add(users.get(i));
								}
							} else {
								Toast.makeText(getActivity(), "Verifique sua conexão com a Internet e tente novamente.", 1500).show();
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
								profilePictureView.setDrawingCacheEnabled(true);
								Bitmap foto = profilePictureView.getDrawingCache();
								ByteArrayOutputStream baos = new ByteArrayOutputStream();  
								foto.compress(Bitmap.CompressFormat.JPEG, 100, baos);  
								byte[] b = baos.toByteArray();
								encodedImage = Base64.encodeToString(b, Base64.DEFAULT);
								userNameView.setText(userMe.getName());
							}
						}
						if (response.getError() != null) {
						}
					}
				});
		request.executeAsync();
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
