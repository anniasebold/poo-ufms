public class Professor extends Pessoa {
	private double valorDivida;

	public Professor(String nome, int cpf, double valorDivida) {
		super(nome, cpf);
		setValorDivida(valorDivida);
	}

	public void setValorDivida(double valorDivida) {
		if(this.valorDivida == 0) {
			if(valorDivida > 1000) {
				this.valorDivida = valorDivida;
			}
		} else {
			this.valorDivida = valorDivida;
		}
	}

	public double getValorDivida() {
		return this.valorDivida;
	}

	public void receberOracao(Oracao o) {
		setValorDivida(getValorDivida() - 250);
		if(o instanceof Animal) {
			setValorDivida(getValorDivida() - 100);
		}
	}

	public void fazerOracao(Oracao o) {
		if(o instanceof Politico) {
		 	setValorDivida(getValorDivida() - getValorDivida() * 0.10);;
		} else {
			setValorDivida(getValorDivida() - (getValorDivida() * 0.05));
		}
		o.receberOracao(this);
	}

}