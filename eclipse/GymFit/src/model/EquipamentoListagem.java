package model;

import java.util.ArrayList;

public class EquipamentoListagem {
	private ArrayList<EquipamentoDAO> listaEquipamentos;

	public EquipamentoListagem() {
		listaEquipamentos = new ArrayList<EquipamentoDAO>();
	}

	public void adicionar(EquipamentoDAO instrutor) {
		listaEquipamentos.add(instrutor);
	}

	public EquipamentoDAO getOne(int posicao) {
		return listaEquipamentos.get(posicao);
	}

	public int getSize() {
		return listaEquipamentos.size();
	}

	public void removeRegister(int posicao) {
		listaEquipamentos.remove(posicao);
	}

	public void editRegister(int posicao, EquipamentoDAO e) {
		listaEquipamentos.set(posicao, e);
	}

}
