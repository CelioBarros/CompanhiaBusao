package com.application.ciadobusao.test;

import com.application.ciadobusao.util.Encontro;

import junit.framework.Assert;
import junit.framework.TestCase;

public class EncontroTeste extends TestCase {
	
	private Encontro encontro;
	

	protected void setUp() throws Exception {
		super.setUp();
		encontro = new Encontro();
	}
	
	public void test(){
		String paulo = "paulo";
		encontro.setNomeDono(paulo);
		Assert.assertEquals(paulo, encontro.getNomeDono());
		
		String Id = "001";
		encontro.setIdDono(Id);
		Assert.assertEquals(Id, encontro.getIdDono());
		
		String linha =  "333";
		encontro.setLinha(linha);
		Assert.assertEquals(linha, encontro.getLinha());
		
		String ponto = "p12";
		encontro.setPonto(ponto);
		Assert.assertEquals(ponto, encontro.getPonto());
		
		encontro.addPerfisConfirmados(paulo);
		Assert.assertTrue(encontro.getPerfisConfirmados().contains(paulo));
		
		encontro.addPerfisChegados(paulo);
		Assert.assertTrue(encontro.getPerfisChegaram().contains(paulo));
		
		encontro.delPerfilConfirmado(paulo);
		Assert.assertFalse(encontro.getPerfisConfirmados().contains(paulo));
		
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
