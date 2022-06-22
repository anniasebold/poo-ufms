package model;

abstract public class Entidade {
	private String nome;

	public Entidade(String nome) {
		super();
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
