package com.application.ciadobusao.telas;

import java.util.ArrayList;
import java.util.List;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.ClienteRest;
import com.application.ciadobusao.util.AdapterListEncontroView;
import com.application.ciadobusao.util.CheckNetwork;
import com.application.ciadobusao.util.Encontro;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v4.app.Fragment;

public class MeusEncontrosFragment extends Fragment {
	private ListView mListView;
	private AdapterListEncontroView myAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (!checaConexao()) {
			getActivity().getSupportFragmentManager().popBackStack();
			getActivity().finish();
		}
		View rootView = inflater.inflate(R.layout.fragment_meus_encontros,
				container, false);
		mListView = (ListView) rootView.findViewById(R.id.encontros);
        if (!CheckNetwork.isInternetAvailable(getActivity())) {
			Toast.makeText(getActivity(),"Verifique sua conexão com a Internet e tente novamente.",1500).show();
		} else {
			new MeuAsyncTask().execute();
		}
		return rootView;
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

	public static List<Encontro> getMeusEncontros() {
		ClienteRest clientRest = new ClienteRest();
		
		try {
			return clientRest.getMeusEncontros(PerfilFragment.getUser().getId());
		} catch (Exception e) {
			e.getMessage();
		}
		return null;

    }

	class MeuAsyncTask extends AsyncTask<Void, Void, List<Encontro>> {

		@Override
		protected List<Encontro> doInBackground(Void... params) {
			return getMeusEncontros();
		}

		@Override
		protected void onPostExecute(List<Encontro> result) {
			super.onPostExecute(result);
			myAdapter = new AdapterListEncontroView(getActivity().getApplicationContext(), (ArrayList<Encontro>) result);
			mListView.setAdapter(myAdapter);

			mListView.setOnItemClickListener(new OnItemClickListener() {
				@SuppressWarnings("deprecation")
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					final int pos = position;
					Encontro item = myAdapter.getItem(position);
					ClienteRest newRest = new ClienteRest();

					AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
					.create(); // Read Update
					alertDialog.setTitle(item.getNome());
					try {
						String nomes = "";
						List<String> auxList = newRest.getPerfisChegaram(item.getId()+"");
						for (String nome : auxList) {
							nomes += "\n"+ nome;
						}
						
						String nomesNao = "";
						List<String> auxListNao = newRest.getPerfisNaoChegaram(item.getId()+"");
						for (String nome : auxListNao) {
							nomesNao += "\n"+ nome;
						}
						alertDialog.setMessage("Ponto: " + item.getPonto()
								+ "\n"
								+ "Linha: " + item.getLinha()
								+ "\n"
								+ "Data: " + item.getData().toString()
								+ "\n"
								+ "Horario: " + item.getHorario().toString()
								+ "\n" + "\n"
								+ "Chegaram: "
								+ nomes
								+ "\n" + "\n"
								+ "Não chegaram: "
								+ nomesNao);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					alertDialog.setButton("Desconfirmar",
							new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialog,
								int which) {
							ClienteRest newRest = new ClienteRest();
							if (myAdapter.getItem(pos).getIdDono().equals(PerfilFragment.getUser().getId())) {
								newRest.deletarEncontro(myAdapter.getItem(pos).getId());
								new MeuAsyncTask().execute();
							} else {
								newRest.desconfirmarPresenca(myAdapter.getItem(pos).getId(), PerfilFragment.getUser().getId());
								new MeuAsyncTask().execute();
							}
						}
					});
					alertDialog.setButton2("Fechar",
							new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int which) {
						}
					});
					String nomeBotao = "Já Cheguei!";
					try {
						List<String> array = newRest.getPerfisChegaram(item.getId()+"");
						for (String nomeUser : array) {
							System.out.println(nomeUser);
							if (nomeUser.equals(PerfilFragment.getUser().getName())) {
								nomeBotao = "";
							}
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					alertDialog.setButton3(nomeBotao, 
							new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int which) {
							ClienteRest newRest = new ClienteRest();
							
							String resp = newRest.confirmaQueChegou(myAdapter.getItem(pos).getId(), PerfilFragment.getUser().getId()+ "");
							new MeuAsyncTask().execute(); 
						}
					});
					alertDialog.show();
				}
			});
		}
	}
}
