package model;

import java.util.ArrayList;

public class InstrutorListagem {
	private ArrayList<InstrutorDAO> listaInstrutores;

	public InstrutorListagem() {
		listaInstrutores = new ArrayList<InstrutorDAO>();
	}

	public void adicionar(InstrutorDAO instrutor) {
		listaInstrutores.add(instrutor);
	}

	public InstrutorDAO getOne(int posicao) {
		return listaInstrutores.get(posicao);
	}

	public int getSize() {
		return listaInstrutores.size();
	}

	public void removeRegister(int posicao) {
		listaInstrutores.remove(posicao);
	}

	public void editRegister(int posicao, InstrutorDAO i) {
		listaInstrutores.set(posicao, i);
	}

}
