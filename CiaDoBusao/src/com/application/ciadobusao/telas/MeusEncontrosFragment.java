package com.application.ciadobusao.telas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v4.app.Fragment;

public class MeusEncontrosFragment extends Fragment {
	private ListView mListView;
	private List<Encontro> meusEncontros;
	private AdapterListEncontroView myAdapter;
	private List<Encontro> auxMeusEncontros;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

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

	public List<Encontro> getMeusEncontros() {
		String idUser = PerfilFragment.getUser().getId();
		String nomeUser = PerfilFragment.getUser().getName();
		auxMeusEncontros = new ArrayList<Encontro>();
		ClienteRest clientRest = new ClienteRest();

		try {
			meusEncontros = clientRest.getListaEncontro();
  		  	DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
  		  	Date data = new Date(); 
	        for (Encontro enc : meusEncontros) {
	        	if (enc.compareTo((Date)formatter.parse(formatter.format(data)))<0) {
					clientRest.deletarEncontro(enc.getId());
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
		for (Encontro encontro : meusEncontros) {
			if (encontro.getIdDono().equals(idUser)) {
				auxMeusEncontros.add(encontro);
			} else if (encontro.getPerfisConfirmados().contains(nomeUser)) {
				auxMeusEncontros.add(encontro);
			}
		}
		List<Encontro> auxListEnc;
		try {
			
			auxListEnc = auxMeusEncontros;
			List<Encontro> auxListResp = new ArrayList<Encontro>();
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date data = new Date();
			for (Encontro enc : auxMeusEncontros) {
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
				auxListResp.add(enc);
				auxListEnc.remove(enc);
			}
			auxMeusEncontros = auxListResp;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return auxMeusEncontros;
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

					AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
					.create(); // Read Update
					alertDialog.setTitle(item.getNome());
					alertDialog.setMessage(item.getPonto()
							+ "\n"
							+ item.getLinha()
							+ "\n"
							+ item.getData().toString()
							+ "\n"
							+ item.getHorario().toString()
							+ "\n"
							+ item.getPerfisConfirmados());

					alertDialog.setButton("Desconfirmar",
							new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialog,
								int which) {
							ClienteRest newRest = new ClienteRest();
							if (myAdapter.getItem(pos).getIdDono().equals(PerfilFragment.getUser().getId())) {
								newRest.deletarEncontro(myAdapter.getItem(pos).getId());
								new MeuAsyncTask().execute();
							} else {
								newRest.desconfirmarPresenca(myAdapter.getItem(pos).getId(), PerfilFragment.getUser().getName());
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
					
					alertDialog.setButton3("Já cheguei!", 
							new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int which) {
							ClienteRest newRest = new ClienteRest();
							String resp = newRest.confirmaQueChegou(meusEncontros.get(pos).getId(), PerfilFragment.getUser().getName());
							Toast.makeText(getActivity().getApplicationContext(), resp, Toast.LENGTH_SHORT).show(); 
							new MeuAsyncTask().execute(); 
						}
					});
					alertDialog.show();
				}
			});
		}
	}
}
