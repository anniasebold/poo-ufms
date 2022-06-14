public abstract class Animal implements Oracao {
	private String raca;
	private int idade;

	public Animal(String raca, int idade) {
		setRaca(raca);
		setIdade(idade);
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}
}