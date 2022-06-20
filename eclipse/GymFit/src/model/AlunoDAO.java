package model;

public class AlunoDAO extends EntidadeDAO {
	private int idade;
	private String objetivo;

	public AlunoDAO(String nome, int idade, String objetivo) {
		super(nome);
		setIdade(idade);
		setObjetivo(objetivo);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

}
