package br.com.droid;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DataDoEncontro implements Comparable<DataDoEncontro> {

	private int dia, mes, ano;

	public DataDoEncontro() {
	}

	public DataDoEncontro(int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes+1);
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

	@Override
	public int compareTo(DataDoEncontro outra) {
		if ((this.getAno() < outra.getAno())
				|| (this.getAno() == outra.getAno() && this.getMes() < outra
						.getMes())
				|| (this.getAno() == outra.getAno()
						&& this.getMes() == outra.getMes() && this.getDia() < outra
						.getDia())) {
			return -1;
		} else if ((this.getAno() > outra.getAno())
				|| (this.getAno() == outra.getAno() && this.getMes() > outra
						.getMes())
				|| (this.getAno() == outra.getAno()
						&& this.getMes() == outra.getMes() && this.getDia() > outra
						.getDia())) {
			return 1;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		DataDoEncontro outra = (DataDoEncontro)obj;
		if ((this.getAno() < outra.getAno())
				|| (this.getAno() == outra.getAno() && this.getMes() < outra
						.getMes())
				|| (this.getAno() == outra.getAno()
						&& this.getMes() == outra.getMes() && this.getDia() < outra
						.getDia())) {
			return false;
		} else if ((this.getAno() > outra.getAno())
				|| (this.getAno() == outra.getAno() && this.getMes() > outra
						.getMes())
				|| (this.getAno() == outra.getAno()
						&& this.getMes() == outra.getMes() && this.getDia() > outra
						.getDia())) {
			return false;
		}

		return true;
	}
	

}

