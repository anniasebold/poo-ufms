public abstract class UsuarioHumano extends Usuario {
  private String nome;
  private String cpf;

  public UsuarioHumano(String nome, String cpf) {
    setNome(nome);
    setCpf(cpf);
  }

  public void setNome(String nome) {
    if (nome.length() <= 20) {
      this.nome = nome;
    } else {
      this.nome = nome.substring(0,20);
    }
  }

  public String getNome() {
    return this.nome;
  }

  public void setCpf(String cpf) {
    if (cpf.length() == 11 || cpf.length() == 14) {
      this.cpf = cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})", "$1.$2.$3-$4");
    } else {
      System.out.println("CPF inválido.");
    }
  }

  public String getCpf() {
    return this.cpf;
  }
}