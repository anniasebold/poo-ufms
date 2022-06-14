public class Politico extends Pessoa {
	private double valorPropina;

	public Politico(String nome, int cpf, double valorPropina) {
		super(nome, cpf);
		setValorPropina(valorPropina);
	}

	public void setValorPropina(double propina) {
		this.valorPropina = propina;
	}

	public double getValorPropina() {
		return this.valorPropina;
	}

	public void receberOracao(Oracao o) {
		System.out.println("Muito obrigada!!");
		if(o instanceof Politico) {
			System.out.println("Por favor não me investigue.");
		}
	}

	public void fazerOracao(Oracao o) {
		if(o instanceof Professor) {
		 	setValorPropina(getValorPropina() - 100);
		} else if(o instanceof Esportista) {
			setValorPropina(getValorPropina() - 80);
		} else if(o instanceof Animal) {
			setValorPropina(getValorPropina() - 60);
		}
		System.out.println("Valor propina: " + getValorPropina());
		o.receberOracao(this);
	}
}