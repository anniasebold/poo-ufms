public class Moto extends VeiculoTerrestre {
  private boolean isFan;

  public Moto(double peso, boolean tracado, boolean isFan) {
    super(peso, tracado);
    setIsFan(isFan);
  }

  public void setIsFan(boolean isFan) {
    this.isFan = isFan;
  }

  public boolean getIsFan() {
    return this.isFan;
  }
}