package com.application.ciadobusao.db;

import java.util.ArrayList;
import java.util.List;

import com.application.ciadobusao.util.Encontro;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class ClienteRest {

	private static final String URL_WS = "http://rnnvp.ddns.net:8080/teste123/cliente/";

	public String inserirEncontro(Encontro encontro) throws Exception {
		Gson gson = new Gson();
		String clienteJSON = gson.toJson(encontro);
		String[] resposta = new WebServiceCliente().post(URL_WS + "inserir",
				clienteJSON);
		if ("200".equals(resposta[0])) {
			return resposta[1];
		} else {
			throw new Exception(resposta[1]);
		}
	}

	public Encontro getEncontro(int id) throws Exception {

		String[] resposta = new WebServiceCliente().get(URL_WS + id);

		if ("200".equals(resposta[0])) {
			Gson gson = new Gson();
			Encontro cliente = gson.fromJson(resposta[1], Encontro.class);
			return cliente;
		} else {
			throw new Exception(resposta[1]);
		}
	}

	public List<Encontro> getListaEncontro() throws Exception {

		String[] resposta = new WebServiceCliente().get(URL_WS
				+ "buscarTodosGSON"); 

		if ("200".equals(resposta[0])) {
			Gson gson = new Gson();
			List<Encontro> listaCliente = new ArrayList<Encontro>();
			JsonParser parser = new JsonParser();
			JsonArray array = parser.parse(resposta[1]).getAsJsonArray();

			for (int i = 0; i < array.size(); i++) {
				listaCliente.add(gson.fromJson(array.get(i), Encontro.class));
			}
			return listaCliente;
		} else {
			throw new Exception(resposta[1]);
		}
	}

	public String deletarEncontro(int id) {
		String[] resposta = new WebServiceCliente()
				.get(URL_WS + "delete/" + id);
		return resposta[1];
	}

	public String confirmaPresenca(int id, String nome) {
		String[] resposta = new WebServiceCliente().get(URL_WS + "confirma/"
				+ id + "/" + nome);
		return resposta[1];
	}

	// ----NOVO----
	public String confirmaQueChegou(int id, String nome) {
		String[] resposta = new WebServiceCliente().get(URL_WS + "cheguei/"
				+ id + "/" + nome);
		return resposta[1]; // resposta do cheguei no webService
	}
	public String criarUsuario(String id, String nome, String idgcm) {
		String[] resposta = new WebServiceCliente().get(URL_WS
				+ "criarusuario/" + id + "/" + nome+ "/" + idgcm);
		return resposta[1];
	}

	public String desconfirmarPresenca(int id, String idUser) {
		String[] resposta = new WebServiceCliente().get(URL_WS
				+ "desconfirmar/" + id + "/" + idUser);
		return resposta[1];
	}

	
	
	public List<Encontro> getMeusEncontros(String idUsuario) throws Exception {

		String[] resposta = new WebServiceCliente().get(URL_WS
				+ "getMeusEncontros/"+idUsuario); 

		if ("200".equals(resposta[0])) {
			Gson gson = new Gson();
			List<Encontro> listaCliente = new ArrayList<Encontro>();
			JsonParser parser = new JsonParser();
			JsonArray array = parser.parse(resposta[1]).getAsJsonArray();

			for (int i = 0; i < array.size(); i++) {
				listaCliente.add(gson.fromJson(array.get(i), Encontro.class));
			}
			return listaCliente;
		} else {
			throw new Exception(resposta[1]);
		}
	}
	
	public List<Encontro> getEncontrosNaoParticipo(String idUsuario) throws Exception {

		String[] resposta = new WebServiceCliente().get(URL_WS
				+ "getEncontrosNaoParticipo/"+idUsuario); 

		if ("200".equals(resposta[0])) {
			Gson gson = new Gson();
			List<Encontro> listaCliente = new ArrayList<Encontro>();
			JsonParser parser = new JsonParser();
			JsonArray array = parser.parse(resposta[1]).getAsJsonArray();

			for (int i = 0; i < array.size(); i++) {
				listaCliente.add(gson.fromJson(array.get(i), Encontro.class));
			}
			return listaCliente;
		} else {
			throw new Exception(resposta[1]);
		}
	}
	
	public List<String> getPerfisChegaram(String idUsuario) throws Exception {

		String[] resposta = new WebServiceCliente().get(URL_WS
				+ "getPerfisChegaram/"+idUsuario); 

		if ("200".equals(resposta[0])) {
			Gson gson = new Gson();
			List<String> pessoasChegaram = new ArrayList<String>();
			JsonParser parser = new JsonParser();
			JsonArray array = parser.parse(resposta[1]).getAsJsonArray();

			for (int i = 0; i < array.size(); i++) {
				pessoasChegaram.add(gson.fromJson(array.get(i), String.class));
			}
			return pessoasChegaram;
		} else {
			throw new Exception(resposta[1]);
		}
	}
	
	public List<String> getPerfisConfirmados(String idUsuario) throws Exception {

		String[] resposta = new WebServiceCliente().get(URL_WS
				+ "getPerfisConfirmados/"+idUsuario); 

		if ("200".equals(resposta[0])) {
			Gson gson = new Gson();
			List<String> pessoasConfirmados = new ArrayList<String>();
			JsonParser parser = new JsonParser();
			JsonArray array = parser.parse(resposta[1]).getAsJsonArray();

			for (int i = 0; i < array.size(); i++) {
				pessoasConfirmados.add(gson.fromJson(array.get(i), String.class));
			}
			return pessoasConfirmados;
		} else {
			throw new Exception(resposta[1]);
		}
	}
 

}