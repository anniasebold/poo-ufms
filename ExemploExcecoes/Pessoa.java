public class Pessoa {
    private String cpf; // YYY.YYY.YYY-YY -> InvalidCpfException (Verificada)
    private String nome; // Max 20 caracteres -> InvalidNameException (Não verificada)

    public Pessoa(String cpf, String nome) throws InvalidCpfException{
        setCpf(cpf);
        setNome(nome);
    }

    public void setCpf(String cpf) throws InvalidCpfException {
        if(cpf.length() == 14 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-')
            this.cpf = cpf;
        else
            throw new InvalidCpfException(cpf);
    }

    public void setNome(String nome) {
        if(nome.length() <= 20)
            this.nome = nome;
        else
            throw new InvalidNameException();
    }
}
