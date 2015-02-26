package com.application.ciadobusao.test;

import com.application.ciadobusao.util.DataDoEncontro;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DataDoEncontroTeste extends TestCase {
	
	private DataDoEncontro data;

	protected void setUp() throws Exception {
		super.setUp();
		
		data = new DataDoEncontro();
	}
	
	public void test(){
		int dia = 23;
		int mes = 07;
		int ano = 2004;
		
		data.setDia(dia);
		Assert.assertEquals(dia, data.getDia());
		
		data.setMes(mes);
		Assert.assertEquals(mes, data.getMes());
		
		data.setAno(ano);
		Assert.assertEquals(ano, data.getAno());
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
