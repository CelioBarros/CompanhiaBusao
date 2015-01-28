package com.application.ciadobusao.util;

import java.util.ArrayList;

import com.application.ciadobusao.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



public class AdapterListNotificacoesView extends BaseAdapter  
{
    private LayoutInflater mInflater;
    private ArrayList<String> itens;

 
    public AdapterListNotificacoesView(Context context, ArrayList<String> result)
    {
        //Itens que preencheram o listview
        this.itens = result;
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
    public String getItem(int position)
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
    	String item = itens.get(position);
        view = mInflater.inflate(R.layout.element_listview, null);
        ((TextView) view.findViewById(R.id.nomeEncontro)).setText(item);
 
        return view;
    }

	
}

