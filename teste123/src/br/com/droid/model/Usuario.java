package br.com.droid.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario {

	private String idFace;
	private String nome;
	private String id_gcm;
	private String foto;

	public String getIdFace() {
		return idFace;
	}

	public void setIdFace(String idFace) {
		this.idFace = idFace;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId_gcm() {
		return id_gcm;
	}

	public void setId_gcm(String id_gcm) {
		this.id_gcm = id_gcm;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}