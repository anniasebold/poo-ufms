public class Cancelado {
  private String nome;
  private int idadeAtual;
  public Cancelamento cancelamento[] = new Cancelamento[3];
  private int posicaoAtual = 0;

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

  public void setCancelamento(Cancelamento canc) {
    if(posicaoAtual > cancelamento.length) {
      System.out.println("Só pode ser adicionado até 5 cancelamentos.");
    } else {
      cancelamento[posicaoAtual] = canc;
    }
    posicaoAtual += 1;
  }
}