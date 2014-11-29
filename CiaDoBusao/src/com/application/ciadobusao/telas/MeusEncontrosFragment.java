package com.application.ciadobusao.telas;

import com.application.ciadobusao.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.support.v4.app.Fragment;


public class MeusEncontrosFragment extends Fragment{
	private ListView tweetListView;
    private String[] stringArray ;
    private ArrayAdapter tweetItemArrayAdapter;

    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	      //setContentView(R.layout.fragment_meus_encontros);



		View rootView = inflater.inflate(R.layout.fragment_meus_encontros, container, false);

	       stringArray = new String[15];
	        for(int i=0; i < stringArray.length; i++){
	            stringArray[i] = "String " + i;
	        }
	        
	      tweetItemArrayAdapter = new ArrayAdapter(this.getActivity(), android.R.layout.simple_list_item_1, stringArray);
	      tweetListView = (ListView) rootView.findViewById(R.id.encontros);
	      tweetListView.setAdapter(tweetItemArrayAdapter);
	        
	        
	        
	        
	       
//	          String[] values = new String[] {"a","b","c","d","e","f","g",  "Android", "iPhone", "WindowsMobile",
//	              "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
//	              "Linux", "OS/2" };
//	          ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
//	              android.R.layout.simple_list_item_1, values);
//	          tweetListView.setAdapter(adapter);
		
		return rootView;
	}
}
