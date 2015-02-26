package com.application.ciadobusao.test;

import com.application.ciadobusao.util.HorarioDoEncontro;

import junit.framework.Assert;
import junit.framework.TestCase;

public class HorarioDoEncontroTeste extends TestCase {
	
	private HorarioDoEncontro horario;

	protected void setUp() throws Exception {
		super.setUp();
		
		horario = new HorarioDoEncontro(0, 0);
	}
	
	private void test(){
		int hora = 5;
		int min = 45;
		
		horario.setHora(hora);
		Assert.assertEquals(hora,horario.getHora());
		
		horario.setMin(min);
		Assert.assertEquals(min,horario.getMin());
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
