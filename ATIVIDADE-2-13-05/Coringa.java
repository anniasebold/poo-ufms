public class Coringa implements Comportamento {
  public enum NomePais { BRA, USA, CAN };

  @Override
  public void machucar(SuperHeroi heroi) {
    heroi.setNivelDeResistencia(1);
  }
  @Override
  public void ajudar(SuperHeroi heroi) {
    heroi.setNivelDeResistencia(heroi.getNivelDeResistencia() + 1);
  }
}