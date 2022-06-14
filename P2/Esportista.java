public class Esportista extends Pessoa {
	private String nomeEsporte;

	public Esportista(String nome, int cpf, String nomeEsporte) {
		super(nome, cpf);
		setNomeEsporte(nomeEsporte);
	}

	public void setNomeEsporte(String esporte) {
		this.nomeEsporte = esporte;
	}

	public String getNomeEsporte() {
		return this.nomeEsporte;
	}

	public void receberOracao(Oracao o) {
		System.out.println("Torça por mim nas próximas olimpiadas!");
		if(o instanceof Esportista) {
			System.out.println("Me empresta um pouco de Whey Protein?");
		}
	}

	public void fazerOracao(Oracao o) {
		if(o instanceof Esportista) {
		 	System.out.println("No pain, no gain");
		} else {
			System.out.println("RECEBA!!!");
		}
		o.receberOracao(this);
	}
}