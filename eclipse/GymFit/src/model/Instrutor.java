package model;

public class Instrutor extends Entidade {
	
	private String formacao;

	public Instrutor(String nome, String formacao) {
		super(nome);
		setFormacao(formacao);
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
}
