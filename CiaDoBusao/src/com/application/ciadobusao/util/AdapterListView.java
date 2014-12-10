package com.application.ciadobusao.util;

import java.util.ArrayList;

import com.application.ciadobusao.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



public class AdapterListView extends BaseAdapter  
{
    private LayoutInflater mInflater;
    private ArrayList<Encontro> itens;

 
    public AdapterListView(Context context, ArrayList<Encontro> itens)
    {
        //Itens que preencheram o listview
        this.itens = itens;
        //responsavel por pegar o Layout do item.
        mInflater = LayoutInflater.from(context);
    }
    
    
 
    /**
     * Retorna a quantidade de itens
     *
     * @return
     */
    public int getCount()
    {
        return itens.size();
    }
 
    /**
     * Retorna o item de acordo com a posicao dele na tela.
     *
     * @param position
     * @return
     */
    public Encontro getItem(int position)
    {
        return itens.get(position);
    }
 
    /**
     * Sem implementa��o
     *
     * @param position
     * @return
     */
    public long getItemId(int position)
    {
        return position; 
    }
 
    public View getView(int position, View view, ViewGroup parent)
    {
        //Pega o item de acordo com a pos��o.
    	Encontro item = itens.get(position);
        //infla o layout para podermos preencher os dados
        view = mInflater.inflate(R.layout.listview_layout, null);
 
        //atravez do layout pego pelo LayoutInflater, pegamos cada id relacionado
        //ao item e definimos as informa��es.
      
        ((TextView) view.findViewById(R.id.nomeEncontroTVid)).setText(item.getNome());
        ((TextView) view.findViewById(R.id.data)).setText(item.getData().toString());
        ((TextView) view.findViewById(R.id.horarioId)).setText(item.getHorario().toString());
 
        return view;
    }

	
}

