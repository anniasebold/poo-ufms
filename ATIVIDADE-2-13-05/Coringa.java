public class Coringa implements Comportamento {
  private String pais;

  public Coringa(String pais) {
    setPais(pais);
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public String getPais() {
    return this.pais;
  }

  @Override
  public void machucar(SuperHeroi heroi) {
    heroi.setNivelDeResistencia(1);
  }
  @Override
  public void ajudar(SuperHeroi heroi) {
    heroi.setNivelDeResistencia(heroi.getNivelDeResistencia() + 1);
  }
}