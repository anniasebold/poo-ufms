public class Veiculo {
  private double peso;
  private static int cont;

  public Veiculo(double peso) {
    setPeso(peso);
    setCont();
  }

  public void setCont() {
    cont = getCont() + 1;
  }

  public int getCont() {
    return cont;
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

  public void bater(Veiculo veiculo) {
    System.out.println("Estou batendo no " + veiculo.getClass().getName());
  }

  @Override
  public String toString() {
    return "Peso" + getPeso();
  }
}