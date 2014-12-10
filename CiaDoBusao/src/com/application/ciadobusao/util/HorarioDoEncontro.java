package com.application.ciadobusao.util;

public class HorarioDoEncontro {
	
	private int hora, min;
	
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
		return hora + ":"+ min;
	}
	
	

}
