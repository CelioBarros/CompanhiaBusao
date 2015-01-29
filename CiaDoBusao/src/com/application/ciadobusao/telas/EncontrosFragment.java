package com.application.ciadobusao.telas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.ClienteRest;
import com.application.ciadobusao.telas.MeusEncontrosFragment.MeuAsyncTask;
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

				AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
						.create(); // Read Update
				alertDialog.setTitle(listaEncontros.get(position).getNome());
				alertDialog.setMessage(listaEncontros.get(position).getPonto()
						+ "\n" + listaEncontros.get(position).getLinha() + "\n"
						+ listaEncontros.get(position).getData() + "\n"
						+ listaEncontros.get(position).getHorario() + "\n"
						+ "confirmados: "
						+ listaEncontros.get(position).getPerfisConfirmados());

				alertDialog.setButton("Confirmar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								newRest.confirmaPresenca(
										listaEncontros.get(position).getId(),
										PerfilFragment.getUser().getName());
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
				listaEncontros = clientRest.getListaEncontro();
				List<Encontro> auxListEnc = clientRest.getListaEncontro();
				List<Encontro> auxListResp = new ArrayList<Encontro>();
				DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				Date data = new Date();
				for (Encontro enc : listaEncontros) {
					if (enc.compareTo((Date) formatter.parse(formatter
							.format(data))) < 0) {
						clientRest.deletarEncontro(enc.getId());
					}
				}
				Encontro enc = new Encontro();
				for (int i = auxListEnc.size() - 1; i >= 0; i--) {
					enc = auxListEnc.get(i);
					for (int j = auxListEnc.size() - 1; j >= 0; j--) {
						if (i != j) {
							if (enc.compareTo((Date) formatter.parse(auxListEnc
									.get(j).getData().toString())) > 0) {
								enc = auxListEnc.get(j);
							}
						}
					}
					if(!listaEncontros.get(i).getPerfisConfirmados().contains(PerfilFragment.getUser().getName())){
						auxListResp.add(enc);
					}
					auxListEnc.remove(enc);
				}
				
				listaEncontros = auxListResp;

			} catch (Exception e) {
				e.printStackTrace();
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