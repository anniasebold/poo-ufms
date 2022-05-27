public class Pop extends FaixaMusical {
  private int vezesTocada;
  private int qtdProcessos;

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
  
  public void calculaValor() {
    setValor(getVezesTocada() * 0.01);
    for(int i = 0; i < getQtdProcessos(); i++) {
      setValor(getValor() - 100);
    }
  }
}