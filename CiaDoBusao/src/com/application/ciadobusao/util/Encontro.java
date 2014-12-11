package com.application.ciadobusao.util;

public class Encontro {

	private int id;
	private String nome, linha, ponto;
	private HorarioDoEncontro horario;
	private DataDoEncontro dataDoEncontro;

	public Encontro() {
	}

	public Encontro(int id, String nome, String linha, String ponto,
			HorarioDoEncontro horario, DataDoEncontro dataDoEncontro) {
		this.id = id;
		this.nome = nome;
		this.linha = linha;
		this.ponto = ponto;
		this.horario = horario;
		this.dataDoEncontro = dataDoEncontro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public String getPonto() {
		return ponto;
	}

	public void setPonto(String ponto) {
		this.ponto = ponto;
	}

	public HorarioDoEncontro getHorario() {
		return horario;
	}

	public void setHorario(HorarioDoEncontro horario) {
		this.horario = horario;
	}

	public DataDoEncontro getData() {
		return dataDoEncontro;
	}

	public void setData(DataDoEncontro data) {
		this.dataDoEncontro = data;
	}

	@Override
	public String toString() {
		return nome + 
				"\nLinha:" + linha + 
				"\nPonto=" + ponto + 
				"\nHorario=" + horario.toString() + 
				"\nData=" + dataDoEncontro.toString();
	}

}
