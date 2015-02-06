package com.application.ciadobusao.util;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.application.ciadobusao.R;

public class AdapterListNotificacoesView extends BaseAdapter {
	private LayoutInflater mInflater;
	private List<String> itens;

	public AdapterListNotificacoesView(Context context, List<String> result) {
		this.itens = result;
		mInflater = LayoutInflater.from(context);
	}
	
	@Override
	public int getCount() {
		return itens.size();
	}

	@Override
	public String getItem(int position) {
		return itens.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		String item = itens.get(position);
		view = mInflater.inflate(R.layout.element_notficacoeslistview, null);
		((TextView) view.findViewById(R.id.mensagemNotificacao)).setText(item);
		return view;
	}

}
