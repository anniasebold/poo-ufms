package model;

import java.util.ArrayList;

public class AlunoListagem {
	private ArrayList<AlunoDAO> listaAlunos;

	public AlunoListagem() {
		listaAlunos = new ArrayList<AlunoDAO>();
	}

	public void adicionar(AlunoDAO aluno) {
		listaAlunos.add(aluno);
	}

	public AlunoDAO getOne(int posicao) {
		return listaAlunos.get(posicao);
	}

	public int getSize() {
		return listaAlunos.size();
	}

	public void removeRegister(int posicao) {
		listaAlunos.remove(posicao);
	}

	public void editRegister(int posicao, AlunoDAO a) {
		listaAlunos.set(posicao, a);
	}
}
