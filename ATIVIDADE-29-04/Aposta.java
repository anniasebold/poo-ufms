public class Aposta {
  private double valor, ganho;

  public Aposta(double valor) {
    setValor(valor);
  }

  public double getValor() {
    return this.valor;
  }

  public double getGanho() {
    return this.ganho;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public void setGanho(double ganho) {
    this.ganho = ganho;
  }
}