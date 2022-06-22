package model;

public class Modalidade extends Entidade {
	private double valor;
	private Instrutor instrutor;
	
	public Modalidade(String nome, double valor, Instrutor instrutor) {
		super(nome);
		setValor(valor);
		setInstrutor(instrutor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

}
