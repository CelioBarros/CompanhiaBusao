package com.application.ciadobusao.util;

import java.util.ArrayList;
import java.util.List;


public class Encontro{
	
	private String nome, linha, ponto;
	private HorarioDoEncontro horario;
	private DataDoEncontro data;
	private List<String> perfisConfirmados;
	private List<String> perfisChegaram;		
	private int id;
	private String idDono;
	private String nomeDono;
	private double latitude, longitude;

	public Encontro() {
		perfisChegaram = new ArrayList<String>();
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
	
	public void delPerfilConfirmado(String perfil){
		int pos = -1;
	     for (int i = 0; i < perfisConfirmados.size(); i++) {
	         if (perfisConfirmados.get(i) == perfil){
	             pos = i;
	         }
	     }
	     perfisConfirmados.remove(pos);
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

	public List<String> getPerfisConfirmados() {
		return perfisConfirmados;
	}

	public void addPerfisConfirmados(String perfil) {
		perfisConfirmados.add(perfil);
	}
	
	public void addPerfisChegados(String perfil) { 
		perfisChegaram.add(perfil);
	}
	
	public List<String> getPerfisChegaram() {
		return perfisChegaram;
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
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


}
