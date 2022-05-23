public class Ciclope extends SuperHeroi {
  private enum oculos {Oakley, HB, Rayban};

  @Override
  public void machucar(SuperHeroi heroi) {
    if(heroi instanceof Wolverine) {
    } else {
      this.setNivelDeResistencia(heroi.getNivelDeResistencia() - 10);
    }
  }
  @Override
  public void ajudar(SuperHeroi heroi) {
    this.setNivelDeResistencia(heroi.getNivelDeResistencia() + 10);
  }
}