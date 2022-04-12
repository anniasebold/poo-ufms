public class Apostador {
  String nome;
  String cpf;
  String endereco;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf; 
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  
  Apostador(String cpf, String nome, String endereco) {
    this.setCpf(cpf);
    this.setNome(nome);
    this.setEndereco(endereco);
  }
}
