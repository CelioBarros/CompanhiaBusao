package br.com.droid.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.droid.DataDoEncontro;
import br.com.droid.HorarioDoEncontro;

@XmlRootElement
public class Encontro implements Comparable<Date>{
	
	private String nome, linha, ponto;
	private HorarioDoEncontro horario;
	private DataDoEncontro data;
	private ArrayList<String> perfisConfirmados;
	private ArrayList<String> perfisChegaram;		//----NOVO----
	private int id;
	private String idDono;
	private String nomeDono;

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

	public ArrayList<String> getPerfisConfirmados() {
		return perfisConfirmados;
	}

	public void addPerfisConfirmados(String perfil) {
		perfisConfirmados.add(perfil);
	}
	
	//----Adiciona um perfil a lista dos que chegaram e //retorna o nome para ser exibido nas notificações---- 
	public void addPerfisChegados(String perfil) { 
		perfisChegaram.add(perfil);
	}
	
	public ArrayList<String> getPerfisChegaram() {
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

	@Override
	public int compareTo(Date data) {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		Date data2 = new Date();
		try {
			data2 = (Date)formatter.parse(this.getData().toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(data.before(data2)){
			return 1;
		}else if(data2.before(data)){
			return -1;
		}
		return 0;
	}

}
