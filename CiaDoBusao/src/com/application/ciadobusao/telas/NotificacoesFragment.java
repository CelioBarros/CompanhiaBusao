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

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.ClienteRest;
import com.application.ciadobusao.util.AdapterListNotificacoesView;
import com.application.ciadobusao.util.Encontro;

public class NotificacoesFragment extends Fragment {

	private ListView listView;
	private List<String> listaNotificacoes = new ArrayList<String>();
	private List<Encontro> listaEncontros;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_notificacoes,
				container, false);
		listView = (ListView) rootView.findViewById(R.id.notificacoes);

		new MeuAsyncTask().execute();
		return rootView;
	}

	class MeuAsyncTask extends AsyncTask<Void, Void, List<String>> {

		@Override
		protected List<String> doInBackground(Void... params) {
			ClienteRest clientRest = new ClienteRest();
			try {
				listaEncontros = clientRest.getListaEncontro();
				for (int i = 0; i < listaEncontros.size(); i++) {
					for (int j = 0; j < listaEncontros.get(i).getPerfisConfirmados().size(); j++) {
						List<String> temp = listaEncontros.get(i).getPerfisConfirmados();
						Log.d("Aqui",listaEncontros.get(i).getIdDono());
						if (temp.contains(PerfilFragment.userMe.getName()) || listaEncontros.get(i).getNomeDono() == PerfilFragment.userMe.getName()) {
							listaNotificacoes.add(temp.get(j) + " confirmou presença no encontro " + listaEncontros.get(i).getNome());
						}
					}
					for (int j = 0; j < listaEncontros.get(i).getPerfisChegaram().size(); j++) {
						List<String> temp = listaEncontros.get(i).getPerfisChegaram();
						if (temp.contains(PerfilFragment.userMe.getName()) || listaEncontros.get(i).getIdDono() == PerfilFragment.userMe.getName()) {
							listaNotificacoes.add(listaEncontros.get(i).getPerfisChegaram().get(j) + " chegou ao encontro " + listaEncontros.get(i).getNome());
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return listaNotificacoes;
		}

		@Override
		protected void onPostExecute(List<String> result) {
			super.onPostExecute(result);
			AdapterListNotificacoesView myAdapter = new AdapterListNotificacoesView(getActivity()
					.getApplicationContext(), (ArrayList<String>) result);
			listView.setAdapter(myAdapter);
		}
	}
}