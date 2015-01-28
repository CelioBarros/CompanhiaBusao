package com.application.ciadobusao.util;

import java.util.ArrayList;

import com.application.ciadobusao.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterListEncontroView extends BaseAdapter {
	private LayoutInflater mInflater;
	private ArrayList<Encontro> itens;

	public AdapterListEncontroView(Context context, ArrayList<Encontro> itens) {
		this.itens = itens;
		mInflater = LayoutInflater.from(context);
	}

	public int getCount() {
		return itens.size();
	}

	public Encontro getItem(int position) {
		return itens.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View view, ViewGroup parent) {
		Encontro item = itens.get(position);
		view = mInflater.inflate(R.layout.element_encontrolistview, null);
		((TextView) view.findViewById(R.id.nomeEncontro)).setText(item
				.getNome());
		((TextView) view.findViewById(R.id.nomeCriador)).setText(item
				.getNomeDono());
		((TextView) view.findViewById(R.id.data)).setText(item.getData()
				.toString());
		((TextView) view.findViewById(R.id.hora)).setText(item.getHorario()
				.toString());
		((TextView) view.findViewById(R.id.ponto)).setText(item.getPonto());
		((TextView) view.findViewById(R.id.linha)).setText(item.getLinha());

		return view;
	}

}
