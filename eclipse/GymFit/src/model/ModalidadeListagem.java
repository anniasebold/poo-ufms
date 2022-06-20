package model;

import java.util.ArrayList;

public class ModalidadeListagem {
	private ArrayList<ModalidadeDAO> listaModalidades;

	public ModalidadeListagem() {
		listaModalidades = new ArrayList<ModalidadeDAO>();
	}

	public void adicionar(ModalidadeDAO modalidade) {
		listaModalidades.add(modalidade);
	}

	public ModalidadeDAO getOne(int posicao) {
		return listaModalidades.get(posicao);
	}

	public int getSize() {
		return listaModalidades.size();
	}

	public void removeRegister(int posicao) {
		listaModalidades.remove(posicao);
	}

	public void editRegister(int posicao, ModalidadeDAO m) {
		listaModalidades.set(posicao, m);
	}

}
