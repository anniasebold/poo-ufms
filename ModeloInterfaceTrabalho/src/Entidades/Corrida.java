package Entidades;

public class Corrida {
	private String nome;
	private int maximoCorredores;
	private int km;
	
	public Corrida(String nome, int maximoCorredores, int km) {
		setNome(nome);
		setMaximoCorredores(maximoCorredores);
		setKm(km);
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the maximoCorredores
	 */
	public int getMaximoCorredores() {
		return maximoCorredores;
	}
	/**
	 * @param maximoCorredores the maximoCorredores to set
	 */
	public void setMaximoCorredores(int maximoCorredores) {
		this.maximoCorredores = maximoCorredores;
	}
	/**
	 * @return the km
	 */
	public int getKm() {
		return km;
	}
	/**
	 * @param km the km to set
	 */
	public void setKm(int km) {
		this.km = km;
	}
	
	@Override
	public String toString() {
		return "Corrida [nome=" + nome + ", maximoCorredores=" + maximoCorredores + ", km=" + km + "]";
	}
}
