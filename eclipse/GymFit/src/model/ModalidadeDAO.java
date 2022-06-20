package model;

public class ModalidadeDAO extends EntidadeDAO {
	private double valor;

	public ModalidadeDAO(String nome, double valor) {
		super(nome);
		setValor(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
