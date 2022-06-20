package model;

public class EntidadeDAO {
	private String nome;

	public EntidadeDAO(String nome) {
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
