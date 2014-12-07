package com.application.ciadobusao.telas;

import java.util.ArrayList;

import com.application.ciadobusao.R;
import com.application.ciadobusao.db.SingletonDB;
import com.application.ciadobusao.util.Encontro;

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
	private ListView tweetListView;
	private SingletonDB meusEncontros = SingletonDB.getInstance();
	private ArrayAdapter tweetItemArrayAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// setContentView(R.layout.fragment_meus_encontros);

		View rootView = inflater.inflate(R.layout.fragment_meus_encontros,
				container, false);

		// stringArray = new String[15];
//		 for(int i=0; i < SingletonDB.getInstance().getEncontros().size(); i++){
//		 meusEncontros.add();
//		 }

//		meusEncontros = SingletonDB.getInstance().getEncontros();
		tweetItemArrayAdapter = new ArrayAdapter(this.getActivity(),
				android.R.layout.simple_list_item_1, meusEncontros.getEncontros());
		tweetListView = (ListView) rootView.findViewById(R.id.encontros);
		tweetListView.setAdapter(tweetItemArrayAdapter);

		// String[] values = new String[] {"a","b","c","d","e","f","g",
		// "Android", "iPhone", "WindowsMobile",
		// "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		// "Linux", "OS/2" };
		// ArrayAdapter<String> adapter = new
		// ArrayAdapter<String>(getActivity(),
		// android.R.layout.simple_list_item_1, values);
		// tweetListView.setAdapter(adapter);
		
		tweetListView.setOnItemClickListener(new OnItemClickListener() {
		 @Override
		  public void onItemClick(AdapterView<?> parent, View view,
		    int position, long id) {
//			  ImageView imageView = (ImageView) view.findViewById(R.id.icon);
				  try {
					  meusEncontros.delEncontroAtIndex(position);
				} catch (Exception e) {
					// TODO: handle exception
				} 
		    Toast.makeText(getActivity().getApplicationContext(),
		      "Encontro " + position + " removido" , Toast.LENGTH_LONG)
		      .show();
		    tweetItemArrayAdapter.notifyDataSetChanged();
		  }
		}); 

		return rootView;
	}
	
}
