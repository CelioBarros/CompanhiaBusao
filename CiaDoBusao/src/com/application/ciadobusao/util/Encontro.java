package com.application.ciadobusao.util;
import java.util.ArrayList;

import com.application.ciadobusao.telas.PerfilFragment;

public class Encontro {
	
	private String nome, linha, ponto;
	private HorarioDoEncontro horario;
	private DataDoEncontro data;
	private ArrayList<String> perfisConfirmados;
	private int id;
	private String idDono;
	private String nomeDono;

	public Encontro() {

		perfisConfirmados = new ArrayList<String> ();
	}

	@Override
	public String toString() {
		return "Encontro [nome=" + nome + ", linha=" + linha + ", ponto="
				+ ponto + ", horario=" + horario + ", data=" + data + "]";
	}
	
	public String getNomeDono() {
		return nomeDono;
	}
	
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getIdDono() {
		return idDono;
	}
	
	public void setIdDono(String idDono) {
		this.idDono = idDono;
	}
	
	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public ArrayList<String> getPerfisConfirmados() {
		return perfisConfirmados;
	}

	public void addPerfisConfirmados(String perfil) {
		perfisConfirmados.add(perfil);
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
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}

}
