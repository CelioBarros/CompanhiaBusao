package com.application.ciadobusao.telas;

import java.util.ArrayList;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.SingletonDB;
import com.application.ciadobusao.util.DataDoEncontro;
import com.application.ciadobusao.util.Encontro;
import com.application.ciadobusao.util.HorarioDoEncontro;
//import com.application.ciadobusao.util.NotificacoesAdapter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class NotificacoesFragment extends Fragment {
	private ListView tweetListView;
	private ArrayList<Encontro> notificacoes = new ArrayList<Encontro>();
	private ArrayAdapter tweetItemArrayAdapter;
	private HorarioDoEncontro horario;
	private DataDoEncontro data;
	private SingletonDB meusEncontros = SingletonDB.getInstance();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// setContentView(R.layout.fragment_meus_encontros);

		data = new DataDoEncontro(12, 12, 14);
		horario = new HorarioDoEncontro(12, 12);
		View rootView = inflater.inflate(R.layout.fragment_notificacoes,
				container, false);

		for (int i = 0; i < 10; i++) {
			Encontro encontro = new Encontro("encontro " + String.valueOf(i),
					" ponto " + String.valueOf(i), " linha "
							+ String.valueOf(i), null, null);
//			if (!meusEncontros.contem(notificacoes.get(i)))
				notificacoes.add(encontro);
		}

		tweetItemArrayAdapter = new ArrayAdapter(this.getActivity(),
				android.R.layout.simple_list_item_1, notificacoes);
		tweetListView = (ListView) rootView.findViewById(R.id.notificacoes);
		tweetListView.setAdapter(tweetItemArrayAdapter);

		tweetListView = (ListView) rootView.findViewById(R.id.notificacoes);
		tweetListView.setOnItemClickListener(new OnItemClickListener() {

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
				alertDialog.setTitle(notificacoes.get(position).getNome());
				alertDialog
						.setMessage(notificacoes.get(position).getPonto()
								+ "\n"
								+ notificacoes.get(position).getLinha()
								+ "\n"
								+ notificacoes.get(position).getData()
								+ "\n"
								+ notificacoes.get(position).getHorario()
								+ "\n"
								+ "confirmados: \n"
								+ "Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis."
								+ "Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis. Interagi no mé, cursus quis, vehicula ac nisi. Aenean vel dui dui. Nullam leo erat, aliquet quis tempus a, posuere ut mi. Ut scelerisque neque et turpis posuere pulvinar pellentesque nibh ullamcorper. Pharetra in mattis molestie, volutpat elementum justo. Aenean ut ante turpis. Pellentesque laoreet mé vel lectus scelerisque interdum cursus velit auctor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ac mauris lectus, non scelerisque augue. Aenean justo massa.");

				alertDialog.setButton("Confirmar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								meusEncontros.addEncontro(notificacoes.get(pos));
								notificacoes.remove(pos);
								Toast.makeText(
										getActivity().getApplicationContext(),
										"Encontro " + pos + " adicionado",
										Toast.LENGTH_LONG).show();
								tweetItemArrayAdapter.notifyDataSetChanged();

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
				tweetItemArrayAdapter.notifyDataSetChanged();
			}
		});
		return rootView;
	}
}
