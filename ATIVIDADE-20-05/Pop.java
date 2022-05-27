public class Pop extends FaixaMusical {
  private int vezesTocada;
  private int qtdProcessos;

  public Pop(String nome, String dataComposicao, int qtdReps, int vezesTocada, int qtdProcessos) {
    super(nome, dataComposicao, qtdReps);
    setVezesTocada(vezesTocada);
    setQtdProcessos(qtdProcessos);
    this.calculaValor(this);
  }

  public void setVezesTocada(int vezesTocada) {
    this.vezesTocada = vezesTocada;
  }

  public int getVezesTocada() {
    return this.vezesTocada;
  }

  public void setQtdProcessos(int qtdProcessos) {
    this.qtdProcessos = qtdProcessos;
  }

  public int getQtdProcessos() {
    return this.qtdProcessos;
  }
}