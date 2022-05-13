public class Veiculo {
  private double peso;

  public Veiculo(double peso) {
    setPeso(peso);
  }

  public void locomover() {
    System.out.println("Estou me locomovendo!");
  }

  public void setPeso(double peso) {
    if(peso > 0) {
      this.peso = peso;
    }
  }

  public double getPeso() {
    return this.peso;
  }
}