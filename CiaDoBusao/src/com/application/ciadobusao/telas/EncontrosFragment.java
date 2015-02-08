package com.application.ciadobusao.telas;

import java.util.ArrayList;
import java.util.List;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.ClienteRest;
import com.application.ciadobusao.util.AdapterListEncontroView;
import com.application.ciadobusao.util.CheckNetwork;
import com.application.ciadobusao.util.Encontro;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.support.v4.app.Fragment;

public class EncontrosFragment extends Fragment {
	private ListView listView;
	private List<Encontro> listaEncontros;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_notificacoes,
				container, false);
		listView = (ListView) rootView.findViewById(R.id.notificacoes);

        if (!CheckNetwork.isInternetAvailable(getActivity())) {
			Toast.makeText(getActivity(),"Verifique sua conexão com a Internet e tente novamente.",1500).show();
		} else {
			new MeuAsyncTask().execute();
		}

		final ClienteRest newRest = new ClienteRest();

		listView.setOnItemClickListener(new OnItemClickListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					final int position, long id) {
				String listaConfirmados = "";
				try {
					listaConfirmados = newRest.getPerfisConfirmados(""+listaEncontros.get(position).getId()).toString();
				} catch (Exception e) {
					e.getMessage();
				}
				AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
						.create(); // Read Update
				alertDialog.setTitle(listaEncontros.get(position).getNome());
				alertDialog.setMessage(listaEncontros.get(position).getPonto()
						+ "\n" + listaEncontros.get(position).getLinha() + "\n"
						+ listaEncontros.get(position).getData() + "\n"
						+ listaEncontros.get(position).getHorario() + "\n"
						+ "confirmados: "
						+ listaConfirmados);

				alertDialog.setButton("Confirmar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								newRest.confirmaPresenca(
										listaEncontros.get(position).getId(),
										PerfilFragment.getUser().getId());
								new MeuAsyncTask().execute();
							}
						});
				alertDialog.setButton2("Fechar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
							}
						});

				alertDialog.show();
			}
		});
		return rootView;
	}

	class MeuAsyncTask extends AsyncTask<Void, Void, List<Encontro>> {

		@Override
		protected List<Encontro> doInBackground(Void... params) {
			ClienteRest clientRest = new ClienteRest();
			try {
				listaEncontros = clientRest.getEncontrosNaoParticipo(PerfilFragment.getUser().getId());
			} catch (Exception e) {
				e.getMessage();
			}
			return listaEncontros;
		}

		@Override
		protected void onPostExecute(List<Encontro> result) {
			super.onPostExecute(result);
			AdapterListEncontroView myAdapter = new AdapterListEncontroView(getActivity()
					.getApplicationContext(), (ArrayList<Encontro>) result);
			listView.setAdapter(myAdapter);
		}
	}
}