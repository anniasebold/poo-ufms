package gymFit;

public class ModalidadeDTO {
	private String nome;
	private String tipo;
	
	public ModalidadeDTO(String nome, String tipo) {
		super();
		setNome(nome);
		setTipo(tipo);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
