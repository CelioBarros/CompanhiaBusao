package com.application.ciadobusao.util;

import java.util.ArrayList;

import com.application.ciadobusao.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterListNotificacoesView extends BaseAdapter {
	private LayoutInflater mInflater;
	private ArrayList<String> itens;

	public AdapterListNotificacoesView(Context context, ArrayList<String> result) {
		this.itens = result;
		mInflater = LayoutInflater.from(context);
	}

	public int getCount() {
		return itens.size();
	}

	public String getItem(int position) {
		return itens.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View view, ViewGroup parent) {
		String item = itens.get(position);
		view = mInflater.inflate(R.layout.element_notficacoeslistview, null);
		((TextView) view.findViewById(R.id.mensagemNotificacao)).setText(item);
		return view;
	}

}
