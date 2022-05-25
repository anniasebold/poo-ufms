public abstract class FaixaMusical implements Padrao {
  private String nome;
  private String dataComposicao;
  private int qtdReps;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDataComposicao(String dataComposicao) {
    this.dataComposicao = dataComposicao;
  }

  public void setQtdReps(int qtdReps) {
    this.qtdReps = qtdReps;
  }

  public String getNome() {
    return this.nome;
  }

  public String getDataComposicao() {
    return this.dataComposicao;
  }

  public int getQtdReps() {
    return this.qtdReps;
  }
}