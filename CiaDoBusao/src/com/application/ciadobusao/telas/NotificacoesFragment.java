package com.application.ciadobusao.telas;

import java.util.ArrayList;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.SingletonDB;
import com.application.ciadobusao.util.DataDoEncontro;
import com.application.ciadobusao.util.Encontro;
import com.application.ciadobusao.util.HorarioDoEncontro;
//import com.application.ciadobusao.util.NotificacoesAdapter;

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


public class NotificacoesFragment extends Fragment{
	private ListView tweetListView;
    private ArrayList<Encontro> notificacoes ;
    private ArrayAdapter tweetItemArrayAdapter;
    private HorarioDoEncontro horario;
    private DataDoEncontro data;
    private SingletonDB meusEncontros = SingletonDB.getInstance();

    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	      //setContentView(R.layout.fragment_meus_encontros);

    	notificacoes = new ArrayList<Encontro>();
    	data = new DataDoEncontro(12, 12, 14);
    	horario = new HorarioDoEncontro(12, 12);
		View rootView = inflater.inflate(R.layout.fragment_notificacoes, container, false);
		
		for (int i = 0 ; i < 10 ;  i++){
				Encontro encontro = new Encontro("encontro " + String.valueOf(i),  
						" ponto " + String.valueOf(i),
						" linha " +   String.valueOf(i),
						null, 
						null);
				notificacoes.add(encontro);
		}
		
		
	       
	        
	      tweetItemArrayAdapter = new ArrayAdapter(this.getActivity(), android.R.layout.simple_list_item_1, notificacoes);
	      tweetListView = (ListView) rootView.findViewById(R.id.notificacoes);
	      tweetListView.setAdapter(tweetItemArrayAdapter);
	        
	      tweetListView= (ListView) rootView.findViewById(R.id.notificacoes);
	      tweetListView.setOnItemClickListener(new OnItemClickListener() {


	    		  @Override
	    		  public void onItemClick(AdapterView<?> parent, View view,
	    		    int position, long id) {
//	    			  ImageView imageView = (ImageView) view.findViewById(R.id.icon);
	    			  String situacao;
	    			  if (meusEncontros.contem(notificacoes.get(position))){
	    				  meusEncontros.delEncontro(notificacoes.get(position));
	    				  situacao = "removido";
	    			  }
	    			  else {
	    				  meusEncontros.addEncontro(notificacoes.get(position));
	    				  situacao = "adicionado";
	    			  }
	    		    Toast.makeText(getActivity().getApplicationContext(),
	    		      "Encontro " + position + " " +  situacao, Toast.LENGTH_LONG)
	    		      .show();
	    		    tweetItemArrayAdapter.notifyDataSetChanged();
	    		  }
	    		}); 
		return rootView;
	}
}
