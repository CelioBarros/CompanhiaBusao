package com.application.ciadobusao.util;

import java.util.ArrayList;

import com.application.ciadobusao.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



public class AdapterListEncontroView extends BaseAdapter  
{
    private LayoutInflater mInflater;
    private ArrayList<Encontro> itens;

 
    public AdapterListEncontroView(Context context, ArrayList<Encontro> itens)
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
        view = mInflater.inflate(R.layout.element_listview, null);
 
        //atravez do layout pego pelo LayoutInflater, pegamos cada id relacionado
        //ao item e definimos as informa��es.
      
        ((TextView) view.findViewById(R.id.nomeEncontro)).setText(item.getNome());
        ((TextView) view.findViewById(R.id.nomeCriador)).setText(item.getNomeDono());
        ((TextView) view.findViewById(R.id.data)).setText(item.getData().toString());
        ((TextView) view.findViewById(R.id.hora)).setText(item.getHorario().toString());
        ((TextView) view.findViewById(R.id.ponto)).setText(item.getPonto());
        ((TextView) view.findViewById(R.id.linha)).setText(item.getLinha());
        
        
 
        return view;
    }

	
}

