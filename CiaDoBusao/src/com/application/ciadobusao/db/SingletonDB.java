package com.application.ciadobusao.db;

import java.util.ArrayList;

import com.application.ciadobusao.util.Encontro;

public class SingletonDB {
	private static SingletonDB mInstance = null;

	private ArrayList<Encontro> encontros;

	private SingletonDB() {
		encontros = new ArrayList<Encontro>();
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
		System.out.println(encontros.size());
	}

	public void delEncontro(Encontro encontro) {
		encontros.remove(encontro);
		System.out.println(encontros.size());
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
}
