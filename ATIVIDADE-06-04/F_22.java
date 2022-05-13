public class F_22 extends VeiculoAereo {
  private boolean isMillitary;

  public F_22(double peso, double velocidade, boolean isMillitary) {
    super(peso, velocidade);
    setIsMillitary(isMillitary);
  }
  
  public void setIsMillitary(boolean isMillitary) {
    this.isMillitary = isMillitary;
  }

  public boolean getIsMillitary() {
    return this.isMillitary;
  }
}