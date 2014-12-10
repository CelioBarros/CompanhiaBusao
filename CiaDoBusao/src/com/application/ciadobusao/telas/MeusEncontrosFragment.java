package com.application.ciadobusao.telas;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.SingletonDB;
import com.application.ciadobusao.util.AdapterListView;
import com.application.ciadobusao.util.Encontro;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
	private SingletonDB meusEncontros = SingletonDB.getInstance();
	private SingletonDB notificacoes = SingletonDB.getInstance();
	//private ArrayAdapter tweetItemArrayAdapter;
	private AdapterListView adapterListView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// setContentView(R.layout.fragment_meus_encontros);

		View rootView = inflater.inflate(R.layout.fragment_meus_encontros,
				container, false);
		mListView = (ListView) rootView.findViewById(R.id.encontros);
		// stringArray = new String[15];
		// for(int i=0; i < SingletonDB.getInstance().getEncontros().size();
		// i++){
		// meusEncontros.add();
		// }

		// meusEncontros = SingletonDB.getInstance().getEncontros();
		////////tweetItemArrayAdapter = new ArrayAdapter(this.getActivity(),
		//////		android.R.layout.simple_list_item_1,
		//////		meusEncontros.getEncontros());
		//////tweetListView = (ListView) rootView.findViewById(R.id.encontros);
		////tweetListView.setAdapter(tweetItemArrayAdapter);
		
		adapterListView = new AdapterListView(getActivity(), meusEncontros.getEncontros());
		mListView.setAdapter(adapterListView);
		// String[] values = new String[] {"a","b","c","d","e","f","g",
		// "Android", "iPhone", "WindowsMobile",
		// "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		// "Linux", "OS/2" };
		// ArrayAdapter<String> adapter = new
		// ArrayAdapter<String>(getActivity(),
		// android.R.layout.simple_list_item_1, values);
		// tweetListView.setAdapter(adapter);

		mListView.setOnItemClickListener(new OnItemClickListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				final int pos = position;
				Encontro item = adapterListView.getItem(position);
				
				AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
						.create(); // Read Update
				alertDialog.setTitle(item
						.getNome());
				alertDialog
						.setMessage(item
								.getPonto()
								+ "\n"
								+ item.getLinha()
								+ "\n"
								+ item.getData().toString()
								+ "\n"
								+ item.getHorario().toString()
								+ "\n"
								+ "confirmados: \n"
								+ "Mussum ipsums cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis."
								+ "Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis. Interagi no mé, cursus quis, vehicula ac nisi. Aenean vel dui dui. Nullam leo erat, aliquet quis tempus a, posuere ut mi. Ut scelerisque neque et turpis posuere pulvinar pellentesque nibh ullamcorper. Pharetra in mattis molestie, volutpat elementum justo. Aenean ut ante turpis. Pellentesque laoreet mé vel lectus scelerisque interdum cursus velit auctor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ac mauris lectus, non scelerisque augue. Aenean justo massa.");

				alertDialog.setButton("Desconfirmar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								try {
									notificacoes.addNotificacao(meusEncontros.getEncontros().get(pos));
									meusEncontros.delEncontroAtIndex(pos);
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
				// alertDialog.setButton3("Editar", new
				// DialogInterface.OnClickListener() {
				// public void onClick(DialogInterface dialog, int which) {
				// // ir pra ediçao talvez
				// }
				// });

				alertDialog.show();

				// ImageView imageView = (ImageView)
				// view.findViewById(R.id.icon);
				// try {
				// meusEncontros.delEncontroAtIndex(position);
				// } catch (Exception e) {
				// // TODO: handle exception
				// }
				// Toast.makeText(getActivity().getApplicationContext(),
				// "Encontro " + position + " removido" , Toast.LENGTH_LONG)
				// .show();
				// tweetItemArrayAdapter.notifyDataSetChanged();
			}
		});

		return rootView;
	}

	public SingletonDB getMeusEncontros() {
		return meusEncontros;
	}
	

}
