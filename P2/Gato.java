public class Gato extends Animal {
	private String nomeRacaoFavorita;

	public Gato(String raca, int idade, String nomeRacaoFavorita) {
		super(raca, idade);
		setNomeRacaoFavorita(nomeRacaoFavorita);
	}

	public void setNomeRacaoFavorita(String nome) {
		this.nomeRacaoFavorita = nome;
	}

	public String getNomeRacaoFavorita() {
		return this.nomeRacaoFavorita;
	}

	public void receberOracao(Oracao o) {
		System.out.println("...");
	}

	public void fazerOracao(Oracao o) {
		System.out.println("Mi mi mi mi");
		o.receberOracao(this);
	}

}