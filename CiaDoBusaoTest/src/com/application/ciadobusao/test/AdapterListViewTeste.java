package com.application.ciadobusao.test;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.application.ciadobusao.util.AdapterListEncontroView;
import com.application.ciadobusao.util.Encontro;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AdapterListViewTeste extends TestCase {
	
	private AdapterListEncontroView adapter;
	private Context context;
	private List<Encontro> itens;

	protected void setUp() throws Exception {
		super.setUp();
		
		int id = 8;
		String idDono = "890";
		String nomeDono = "paulo";
		
		Encontro encontro = new Encontro();
		Encontro encontro1 = new Encontro();
		encontro.setId(id);
		encontro.setIdDono(idDono);
		encontro.setNomeDono(nomeDono);
		itens.add(encontro);
		itens.add(encontro1);
		
		adapter = new AdapterListEncontroView(context, itens);
	}
	
	
	private void test(){
		
		Assert.assertEquals(2, adapter.getCount());
		
		Assert.assertEquals(8, adapter.getItem(0).getId());
		Assert.assertEquals("890", adapter.getItem(0).getIdDono());
		Assert.assertEquals("paulo", adapter.getItem(0).getNomeDono());
		
		
		Assert.assertEquals(0, adapter.getItem(1).getPerfisChegaram().size());
		Assert.assertEquals(0,adapter.getItem(1).getPerfisConfirmados().size());
		
		
		
		// verificar validade da acao abaixo
		itens.remove(0);
		Assert.assertEquals(1,adapter.getCount());
		Assert.assertEquals(null, adapter.getItem(0).getNomeDono());	
		
		
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
