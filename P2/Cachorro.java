public class Cachorro extends Animal {
	private int qtdMordidas;

	public Cachorro(String raca, int idade, int qtdMordidas) {
		super(raca, idade);
		setQtdMordidas(qtdMordidas);
	}

	public void setQtdMordidas(int qtdMordidas) {
		this.qtdMordidas = qtdMordidas;
	}

	public int getQtdMordidas() {
		return this.qtdMordidas;
	}

	public void receberOracao(Oracao o) {
		setQtdMordidas(getQtdMordidas() - 1);
		System.out.println("Mordidas: " + getQtdMordidas());
	}

	public void fazerOracao(Oracao o) {
		System.out.println("Au au au au");
		o.receberOracao(this);
	}
}