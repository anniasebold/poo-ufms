public class Cancelado {
  private String nome;
  private int idadeAtual;
  public Cancelamento cancelamento[] = new Cancelamento[5];

  public Cancelado(String nome, int idadeAtual) {
    setNome(nome);
    setIdadeAtual(idadeAtual);
  }

  public String getNome() {
    return this.nome;
  }

  public int getIdadeAtual() {
    return this.idadeAtual;
  }

  private void setNome(String nome) {
    this.nome = nome;
  }

  private void setIdadeAtual(int idadeAtual) {
    this.idadeAtual = idadeAtual;
  }

  public void setCancelamento(int posicaoAtual, Cancelamento canc) {
    cancelamento[posicaoAtual] = canc;
  }
}