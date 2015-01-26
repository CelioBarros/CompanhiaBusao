package com.application.ciadobusao.telas;

import java.util.ArrayList;
import java.util.List;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.ClienteRest;
import com.application.ciadobusao.db.SingletonDB;
import com.application.ciadobusao.telas.NotificacoesFragment.MeuAsyncTask;
import com.application.ciadobusao.util.AdapterListView;
import com.application.ciadobusao.util.Encontro;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v4.app.Fragment;

public class MeusEncontrosFragment extends Fragment {
	private ListView mListView;
	private List<Encontro> meusEncontros;
//	private SingletonDB notificacoes = SingletonDB.getInstance();

	private AdapterListView adapterListView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_meus_encontros,
				container, false);
		mListView = (ListView) rootView.findViewById(R.id.encontros);
		
		new MeuAsyncTask().execute();

//		mListView.setAdapter(adapterListView);

		mListView.setOnItemClickListener(new OnItemClickListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				final int pos = position;
				Encontro item = adapterListView.getItem(position);

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
						+ item.getPerfisConfirmados()
						+ "\n"
						+ "Mussum ipsums cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis."
						+ "Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis. Interagi no mé, cursus quis, vehicula ac nisi. Aenean vel dui dui. Nullam leo erat, aliquet quis tempus a, posuere ut mi. Ut scelerisque neque et turpis posuere pulvinar pellentesque nibh ullamcorper. Pharetra in mattis molestie, volutpat elementum justo. Aenean ut ante turpis. Pellentesque laoreet mé vel lectus scelerisque interdum cursus velit auctor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ac mauris lectus, non scelerisque augue. Aenean justo massa.");

				alertDialog.setButton("Desconfirmar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								try {
									// notificacoes.addNotificacao(meusEncontros.getEncontros().get(pos));
									// meusEncontros.delEncontroAtIndex(pos);
								} catch (Exception e) {
									// TODO: handle exception
								}
								adapterListView.notifyDataSetChanged();
							}
						});
				alertDialog.setButton2("Fechar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// simplesmente fecha a janela
							}
						});

				alertDialog.show();

			}
		});

		return rootView;
	}

	public List<Encontro> getMeusEncontros() {
		String idUser = PerfilFragment.getUser().getId();
		String nomeUser = PerfilFragment.getUser().getName();
		ArrayList<Encontro> auxMeusEncontros = new ArrayList<Encontro>();
		ClienteRest clientRest = new ClienteRest();
		try {
			meusEncontros = clientRest.getListaEncontro();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Encontro encontro : meusEncontros) {
			if (encontro.getIdDono().equals(idUser)) {
				auxMeusEncontros.add(encontro);
			} else if (encontro.getPerfisConfirmados().contains(nomeUser)) {
				auxMeusEncontros.add(encontro);
			}
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
			AdapterListView myAdapter = new AdapterListView(getActivity()
					.getApplicationContext(), (ArrayList<Encontro>) result);
			mListView.setAdapter(myAdapter);
		}
	}

}
