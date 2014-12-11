package com.application.ciadobusao.db;

import java.util.ArrayList;
import java.util.Vector;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import com.application.ciadobusao.util.DataDoEncontro;
import com.application.ciadobusao.util.Encontro;
import com.application.ciadobusao.util.HorarioDoEncontro;

public class EncontroDAO {
	
	//IP da máquina de Ramon
	private static final String URL = "http://192.168.1.9:8080/CiaDoBusao/services/EncontroDAO?wsdl"; 
	private static final String NAMESPACE = "http://CiaDoBusao.application.com";
	private static final String INSERIR = "inserirEncontro";
	private static final String EXCLUIR = "excluiEncontro";
	private static final String ATUALIZAR = "atualizarEncontro";
	private static final String BUSCAR_TODOS = "buscarTodosEncontros";
	private static final String BUSCAR_POR_ID = "buscarEncontroPorID";
	
	public boolean inserirEncontro(Encontro e) {
		SoapObject objParaInserir = new SoapObject(NAMESPACE, INSERIR);

		SoapObject enc = new SoapObject(NAMESPACE, "e");

		enc.addProperty("id", e.getId());
		enc.addProperty("nome", e.getNome());
		enc.addProperty("linha", e.getLinha());
		enc.addProperty("ponto", e.getPonto());
		enc.addProperty("horario", e.getHorario().toString());
		enc.addProperty("dataDoEncontro", e.getData().toString());

		objParaInserir.addSoapObject(enc);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.setOutputSoapObject(objParaInserir);

		envelope.implicitTypes = true;
		// envelope.setAddAdornments(false);

		HttpTransportSE http = new HttpTransportSE(URL);
		try {
			http.call("urn:" + INSERIR, envelope);
			SoapPrimitive resposta = (SoapPrimitive) envelope.getResponse();
			return Boolean.parseBoolean(resposta.toString());
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
	}

	public boolean atualizarEncontro(Encontro e) {
		SoapObject objParaAtualizar = new SoapObject(NAMESPACE, ATUALIZAR);

		SoapObject enc = new SoapObject(NAMESPACE, "usr");

		enc.addProperty("id", e.getId());
		enc.addProperty("nome", e.getNome());
		enc.addProperty("linha", e.getLinha());
		enc.addProperty("ponto", e.getPonto());
		enc.addProperty("horario", e.getHorario().toString());
		enc.addProperty("dataDoEncontro", e.getData().toString());

		objParaAtualizar.addSoapObject(enc);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.setOutputSoapObject(objParaAtualizar);

		envelope.implicitTypes = true;
		// envelope.setAddAdornments(false);

		HttpTransportSE http = new HttpTransportSE(URL);
		try {
			http.call("urn:" + ATUALIZAR, envelope);
			SoapPrimitive resposta = (SoapPrimitive) envelope.getResponse();
			return Boolean.parseBoolean(resposta.toString());
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
	}

	public boolean excluiUsuario(int id) {
		return excluirUsuario(new Encontro(id, "", "", "", null, null));
	}

	public boolean excluirUsuario(Encontro e) {
		SoapObject objParaExcluir = new SoapObject(NAMESPACE, EXCLUIR);

		SoapObject enc = new SoapObject(NAMESPACE, "usr");

		enc.addProperty("id", e.getId());
		enc.addProperty("nome", e.getNome());
		enc.addProperty("linha", e.getLinha());
		enc.addProperty("ponto", e.getPonto());
		enc.addProperty("horario", e.getHorario().toString());
		enc.addProperty("dataDoEncontro", e.getData().toString());

		objParaExcluir.addSoapObject(enc);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.setOutputSoapObject(objParaExcluir);

		envelope.implicitTypes = true;
		// envelope.setAddAdornments(false);

		HttpTransportSE http = new HttpTransportSE(URL);
		try {
			http.call("urn:" + EXCLUIR, envelope);
			SoapPrimitive resposta = (SoapPrimitive) envelope.getResponse();
			return Boolean.parseBoolean(resposta.toString());
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Encontro> buscarTodosEncontros() {
		ArrayList<Encontro> lista = new ArrayList<Encontro>();
		SoapObject buscarEncontros = new SoapObject(NAMESPACE, BUSCAR_TODOS);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.setOutputSoapObject(buscarEncontros);

		envelope.implicitTypes = true;
		// envelope.setAddAdornments(false);

		HttpTransportSE http = new HttpTransportSE(URL);
		try {
			http.call("urn:" + BUSCAR_TODOS, envelope);

			Vector<SoapObject> resposta = (Vector<SoapObject>) envelope
					.getResponse();

			for (SoapObject soapObject : resposta) {
				Encontro enc = new Encontro();
				
				enc.setId(Integer.parseInt(soapObject.getProperty("id").toString()));
				enc.setNome(soapObject.getProperty("nome").toString());
				enc.setLinha(soapObject.getProperty("linha").toString());
				enc.setPonto(soapObject.getProperty("ponto").toString());
				enc.setHorario(new HorarioDoEncontro(Integer.parseInt(soapObject.getProperty("horario").toString().substring(0, 3)), 
						Integer.parseInt(soapObject.getProperty("id").toString().substring(4))));
				enc.setData(new DataDoEncontro(Integer.parseInt(soapObject.getProperty("dataDoEncontro").toString().substring(0, 3)), 
						Integer.parseInt(soapObject.getProperty("dataDoEncontro").toString().substring(4, 6)), 
						Integer.parseInt(soapObject.getProperty("dataDoEncontro").toString().substring(7))));

				lista.add(enc);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return lista;
	}

	@SuppressWarnings("null")
	public Encontro buscarEncontroPorID(int id) {
		Encontro enc = null;
		
		SoapObject buscarUsuarios = new SoapObject(NAMESPACE, BUSCAR_POR_ID);
		buscarUsuarios.addProperty("id", id);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.setOutputSoapObject(buscarUsuarios);

		envelope.implicitTypes = true;
		// envelope.setAddAdornments(false);

		HttpTransportSE http = new HttpTransportSE(URL);
		try {
			http.call("urn:" + BUSCAR_POR_ID, envelope);

			SoapObject soapObject = (SoapObject) envelope.getResponse();

			enc.setId(Integer.parseInt(soapObject.getProperty("id").toString()));
			enc.setNome(soapObject.getProperty("nome").toString());
			enc.setLinha(soapObject.getProperty("linha").toString());
			enc.setPonto(soapObject.getProperty("ponto").toString());
			enc.setHorario(new HorarioDoEncontro(Integer.parseInt(soapObject.getProperty("horario").toString().substring(0, 3)), 
					Integer.parseInt(soapObject.getProperty("id").toString().substring(4))));
			enc.setData(new DataDoEncontro(Integer.parseInt(soapObject.getProperty("dataDoEncontro").toString().substring(0, 3)), 
					Integer.parseInt(soapObject.getProperty("dataDoEncontro").toString().substring(4, 6)), 
					Integer.parseInt(soapObject.getProperty("dataDoEncontro").toString().substring(7))));
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return enc;
	}

}
