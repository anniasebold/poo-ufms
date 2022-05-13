public class VeiculoTerrestre extends Veiculo {
  private boolean tracado;

  public VeiculoTerrestre(double peso, boolean tracado) {
    super(peso);
    setTracado(tracado);
  }

  public void andar() {
    System.out.println("Estou andando!");
  }

  public void setTracado(boolean tracado) {
    this.tracado = tracado;
  }

  public boolean getTracado() {
    return this.tracado;
  }
}