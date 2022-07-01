// Sou verificada! Estendo da exception...
public class InvalidCpfException extends Exception {
    private String mensagem;

    public InvalidCpfException(String cpf) {
        if(cpf.length() != 14) {
            setMensagem("Tamanho inválido...");
        }
        else {
            setMensagem("Formatação inválida...");
        }
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
