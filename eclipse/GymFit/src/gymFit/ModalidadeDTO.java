package gymFit;

public class ModalidadeDTO {
	private String nome;
	private double valor;
	
	public ModalidadeDTO(String nome, double valor) {
		super();
		setNome(nome);
		setValor(valor);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
