package com.application.ciadobusao.util;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.application.ciadobusao.R;

public class AdapterListEncontroView extends BaseAdapter {
	private LayoutInflater mInflater;
	private List<Encontro> itens;

	public AdapterListEncontroView(Context context, List<Encontro> itens) {
		this.itens = itens;
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return itens.size();
	}

	@Override
	public Encontro getItem(int position) {
		return itens.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
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
