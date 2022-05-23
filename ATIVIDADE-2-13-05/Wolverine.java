public class Wolverine extends SuperHeroi {
  private double qtdAdamantium;
  private int tempoCicatrizacao;

  public Wolverine(String nomeOriginal, String descricao, String paisNatal, int nivelDeResistencia, double qtdAdamantium, int tempoCicatrizacao) {
    super(nomeOriginal, descricao, paisNatal, nivelDeResistencia);
    setQtdAdamantium(qtdAdamantium);
    setTempoCicatrizacao(tempoCicatrizacao);
  }

  public void setQtdAdamantium(double qtdAdamantium) {
    this.qtdAdamantium = qtdAdamantium;
  }

  public double getQtdAdamantium() {
    return this.qtdAdamantium;
  }

  public void setTempoCicatrizacao(int tempoCicatrizacao) {
    this.tempoCicatrizacao = tempoCicatrizacao;
  }

  public int getTempoCicatrizacao() {
    return this.tempoCicatrizacao;
  }
  
  @Override
  public void machucar(SuperHeroi heroi) {
    if(heroi instanceof HomemDeFerro) {
      HomemDeFerro temp = (HomemDeFerro)heroi;
      temp.setQtdNamoradas(temp.getQtdNamoradas() - 1);
      heroi = temp;
    } 
    heroi.setNivelDeResistencia(heroi.getNivelDeResistencia() - 1);
  }
  @Override
  public void ajudar(SuperHeroi heroi) {
    heroi.setNivelDeResistencia(heroi.getNivelDeResistencia() + 20);
  }
}