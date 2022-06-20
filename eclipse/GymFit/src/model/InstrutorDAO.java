package model;

public class InstrutorDAO extends EntidadeDAO {
	
	private String formacao;

	public InstrutorDAO(String nome, String formacao) {
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
