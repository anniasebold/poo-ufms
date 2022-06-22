package model;

public class ModalidadeDAO extends EntidadeDAO {
	private double valor;
	private InstrutorDAO instrutor;
	
	public ModalidadeDAO(String nome, double valor, InstrutorDAO instrutor) {
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
	
	public InstrutorDAO getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(InstrutorDAO instrutor) {
		this.instrutor = instrutor;
	}

}
