package com.application.ciadobusao.db;

import java.util.ArrayList;

import com.application.ciadobusao.util.DataDoEncontro;
import com.application.ciadobusao.util.Encontro;
import com.application.ciadobusao.util.HorarioDoEncontro;

public class SingletonDB {
	private static SingletonDB mInstance = null;

	private ArrayList<Encontro> encontros;
	private ArrayList<Encontro> notificacoes;
	//abaixo provisorio pra criar notificacoes fake
	private HorarioDoEncontro horario;
	private DataDoEncontro data;

	private SingletonDB() {
		encontros = new ArrayList<Encontro>();
		notificacoes = new ArrayList<Encontro>();

	}

	public static SingletonDB getInstance() {
		if (mInstance == null) {
			mInstance = new SingletonDB();
		}
		return mInstance;
	}

	public ArrayList<Encontro> getEncontros() {
		return this.encontros;
	}

	public void setEncontro(Encontro encontro) {
		// encontros.indexOf(encontro) = talcoisa;
	}

	public void addEncontro(Encontro encontro) {
		encontros.add(encontro);
	}

	public void delEncontro(Encontro encontro) {
		encontros.remove(encontro);
	}

	public boolean contem(Encontro encontro) {
		if(encontros.size() == 0 )
			return false;
		
		for (int i = 0; i < encontros.size(); i++){
			if ((encontro.getNome() == encontros.get(i).getNome())
					&& (encontro.getPonto() == encontros.get(i).getPonto())
					&& (encontro.getLinha() == encontros.get(i).getLinha())
					&& (encontro.getData() == encontros.get(i).getData()) 
					&& (encontro.getHorario() == encontros.get(i).getHorario()))
				return true;
		}
		return false;
	}

	public void delEncontroAtIndex(int position) {
		encontros.remove(position);

	}
	
	
	//notificaçoes
	public ArrayList<Encontro> getNotificacoes() {
		return this.notificacoes;
	}

	

	public void addNotificacao(Encontro encontro) {
		notificacoes.add(encontro);
	}

	public void delNotificacao(Encontro encontro) {
		notificacoes.remove(encontro);
	}
	public void delNotificacaoAtIndex(int position) {
		notificacoes.remove(position);

	}
}
