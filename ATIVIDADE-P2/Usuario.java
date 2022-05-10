public class Usuario {
  private String nome;
  private String cpf;

  public Usuario(String nome, String cpf) {
    setNome(nome);
    setCpf(cpf);
  }

  public void setNome(String nome) {
    if (nome.length() <= 20) {
      this.nome = nome;
    } else {
      System.out.println("Nome maior do que o permitido (20 caracteres).");
    }
  }

  public String getNome() {
    return this.nome;
  }

  public void setCpf(String cpf) {
    if (cpf.length() != 14) {
      System.out.println("CPF inválido.");
    } else {
      this.cpf = cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})", "$1.$2.$3-$4");
    }
  }

  public String getCpf() {
    return this.cpf;
  }
}