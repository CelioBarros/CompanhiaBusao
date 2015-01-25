package com.application.ciadobusao.telas;


import java.util.ArrayList;
import java.util.List;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.ClienteRest;
import com.application.ciadobusao.db.SingletonDB;
import com.application.ciadobusao.util.AdapterListView;
import com.application.ciadobusao.util.Encontro;
//import com.application.ciadobusao.util.NotificacoesAdapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class NotificacoesFragment extends Fragment {
	private ListView listView;
	 private List<Encontro> listaEncontros;
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_notificacoes,
				container, false);
		listView = (ListView) rootView.findViewById(R.id.notificacoes);
		
		
		new MeuAsyncTask().execute();

		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				String situacao = "";
				final int pos = position;
				// ImageView imageView = (ImageView)
				// view.findViewById(R.id.icon);

				AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
						.create(); // Read Update
				alertDialog.setTitle(listaEncontros.get(position).getNome());
				alertDialog
						.setMessage(listaEncontros.get(position).getPonto()
								+ "\n"
								+ listaEncontros.get(position).getLinha()
								+ "\n"
								+ listaEncontros.get(position).getData()
								+ "\n"
								+ listaEncontros.get(position).getHorario()
								+ "\n"
								+ "confirmados: \n"
								+ "Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis."
								+ "Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis. Interagi no mé, cursus quis, vehicula ac nisi. Aenean vel dui dui. Nullam leo erat, aliquet quis tempus a, posuere ut mi. Ut scelerisque neque et turpis posuere pulvinar pellentesque nibh ullamcorper. Pharetra in mattis molestie, volutpat elementum justo. Aenean ut ante turpis. Pellentesque laoreet mé vel lectus scelerisque interdum cursus velit auctor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ac mauris lectus, non scelerisque augue. Aenean justo massa.");

				alertDialog.setButton("Confirmar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								//meusEncontros.addEncontro(notificacoes.getNotificacoes().get(pos));
								///notificacoes.delNotificacaoAtIndex(pos);
								//Toast.makeText(
							//			getActivity().getApplicationContext(),
								//		"Encontro adicionado",
								//		Toast.LENGTH_LONG).show();
								//tweetItemArrayAdapter.notifyDataSetChanged();

							}
						});
				alertDialog.setButton2("Fechar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// simplesmente sai da janela
							}
						});

				alertDialog.show();

				// if (meusEncontros.contem(notificacoes.get(position))){
				// meusEncontros.delEncontro(notificacoes.get(position));
				// situacao = "removido";
				// }
				// else {
				// meusEncontros.addEncontro(notificacoes.get(position));
				// situacao = "adicionado";
				// }
				// Toast.makeText(getActivity().getApplicationContext(),
				// "Encontro " + position + " " + situacao, Toast.LENGTH_LONG)
				// .show();
				//tweetItemArrayAdapter.notifyDataSetChanged();
			}
		});
		return rootView;
	}
	
	 class MeuAsyncTask extends AsyncTask<Void, Void, List<Encontro>>{  
	   
		 @Override  
	      protected List<Encontro> doInBackground(Void... params) {  
	    	  ClienteRest clientRest = new ClienteRest();
	    	  try {
				listaEncontros = clientRest.getListaEncontro();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	  return listaEncontros;  
	      }  
		 @Override  
	      protected void onPostExecute(List<Encontro> result) {  
	           super.onPostExecute(result);  
	           AdapterListView myAdapter = new AdapterListView(getActivity().getApplicationContext(),(ArrayList<Encontro>) result);
	           listView.setAdapter(myAdapter);
		 }  
	 }  
}
