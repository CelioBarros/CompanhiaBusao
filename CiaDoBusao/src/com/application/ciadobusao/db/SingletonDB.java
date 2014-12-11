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
		criaNotificacoes();
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

	public ArrayList<Encontro> criaNotificacoes() {
		for (int i = 0; i < 10; i++) {
			data = new DataDoEncontro(12, 12, 2014);
			horario = new HorarioDoEncontro(10, 10);
			Encontro encontro = new Encontro(0, "encontro " + String.valueOf(i),
					String.valueOf(i*100), String.valueOf(i+3), horario, data);
//			horario = new HorarioDoEncontro(12, 12);
//			Encontro encontro = new Encontro(0,"encontro " + String.valueOf(i),
//					" ponto " + String.valueOf(i), " linha "
//							+ String.valueOf(i), horario, data);
//			if (!meusEncontros.contem(notificacoes.get(i)))
				notificacoes.add(encontro);
		}
		return notificacoes;
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
