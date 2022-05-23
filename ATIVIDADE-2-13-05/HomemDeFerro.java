public class HomemDeFerro extends SuperHeroi {
  private int qtdNamoradas;
  private int nivelArmaruda;

  public HomemDeFerro(String nomeOriginal, String descricao, String paisNatal, int nivelDeResistencia, int qtdNamoradas, int nivelArmaruda) {
    super(nomeOriginal, descricao, paisNatal, nivelDeResistencia);
    setQtdNamoradas(qtdNamoradas);
    setNivelArmaruda(nivelArmaruda);
  }

  public void setNivelArmaruda(int nivelArmaruda) {
    if(nivelArmaruda >= 1 || nivelArmaruda <= 10) {
      this.nivelArmaruda = nivelArmaruda;
    }
  }

  public int getNivelArmaruda() {
    return this.nivelArmaruda;
  }

  public void setQtdNamoradas(int qtdNamoradas) {
    this.qtdNamoradas = qtdNamoradas;
  }

  public int getQtdNamoradas() {
    return this.qtdNamoradas;
  }
  
  @Override
  public void machucar(SuperHeroi heroi) {
    heroi.setNivelDeResistencia(heroi.getNivelDeResistencia() - 20);
  }
  @Override
  public void ajudar(SuperHeroi heroi) {
    heroi.setNivelDeResistencia(heroi.getNivelDeResistencia() + 5);
  }
}