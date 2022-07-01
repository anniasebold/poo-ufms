package main;

public class Pessoa {
	private String cpf;
	private String nome;
	
	public Pessoa(String cpf, String nome) {
		super();
		setCpf(cpf);
		setNome(nome);
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length() == 14 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' & cpf.charAt(11) == '-' ) {
			this.cpf = cpf;
		} else {
			throw new InvalidCpfException(cpf);
		}
	}
	public String getNome() { 
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() <= 10) {
			throw new InvalidNameException();
		} else {
			this.nome = nome;
		}
	}
	
	
}
