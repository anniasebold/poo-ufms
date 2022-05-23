public class Ciclope extends SuperHeroi {

  public Ciclope(String nomeOriginal, String descricao, String paisNatal, int nivelDeResistencia) {
    super(nomeOriginal, descricao, paisNatal, nivelDeResistencia);
  }

  @Override
  public void machucar(SuperHeroi heroi) {
    if(heroi instanceof Wolverine) {
      Wolverine temp = (Wolverine)heroi;
      temp.setTempoCicatrizacao(temp.getTempoCicatrizacao() + 5);
    }
    heroi.setNivelDeResistencia(heroi.getNivelDeResistencia() - 10);
  }
  @Override
  public void ajudar(SuperHeroi heroi) {
    heroi.setNivelDeResistencia(heroi.getNivelDeResistencia() + 10);
  }
}