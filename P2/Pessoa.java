public abstract class Pessoa implements Oracao {
	private String nome;
	private int cpf;

	public Pessoa(String nome, int cpf) {
		setNome(nome);
		setCpf(cpf);
	}

	public void setNome(String nome) {
		if(nome.length() <= 25) {
			this.nome = nome;
		}
	}

	public String getNome() {
		return this.nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCpf() {
		return this.cpf;
	}
}