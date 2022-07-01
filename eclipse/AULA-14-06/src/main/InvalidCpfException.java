package main;

// Exceção verificada, estendendo da exception...

public class InvalidCpfException extends Exception {
	private String mensagem;
	
	public InvalidCpfException(String cpf) {
		if(cpf.length() != 14) {
			setMensagem("Tamanho inválido do CPF");
		} else {
			setMensagem("Formatação inválida do CPF");
		}
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	@Override
	public String getMessage() {
		return getMensagem();
	}
}
