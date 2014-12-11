package com.application.ciadobusao.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HorarioDoEncontro {
	
	private int hora, min;
	
	public HorarioDoEncontro(){
	}
	
	public HorarioDoEncontro(int hora, int min) {
		this.setHora(hora);
		this.setMin(min);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public String toString() {
		NumberFormat formatter = new DecimalFormat("00"); 
		String h = formatter.format(hora);
		String m = formatter.format(min);
		return h + ":" + m;
	}

}
