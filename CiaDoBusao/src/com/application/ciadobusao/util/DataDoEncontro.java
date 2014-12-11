package com.application.ciadobusao.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DataDoEncontro {

	private int dia, mes, ano;
	
	public DataDoEncontro(){
	}

	public DataDoEncontro(int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		NumberFormat formatter1 = new DecimalFormat("00");
		NumberFormat formatter2 = new DecimalFormat("0000"); 
		String d = formatter1.format(dia);
		String m = formatter1.format(mes);
		String a = formatter2.format(ano);
		return d + "/" + m + "/" + a;
	}

}
