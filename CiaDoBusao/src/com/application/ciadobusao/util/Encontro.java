package com.application.ciadobusao.util;

public class Encontro {
	
	private String nome, linha, ponto;
	private HorarioDoEncontro horario;
	private DataDoEncontro data;
	
	public Encontro(String nome, String linha, String ponto, HorarioDoEncontro horario, DataDoEncontro data) {
		this.setNome(nome);
		this.linha = linha;
		this.ponto = ponto;
		this.horario = horario;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Encontro [nome=" + nome + ", linha=" + linha + ", ponto="
				+ ponto + ", horario=" + horario + ", data=" + data + "]";
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
		return data;
	}

	public void setData(DataDoEncontro data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
