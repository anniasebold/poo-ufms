public class Boieng extends VeiculoAereo {
  private boolean isComercial;

  public Boieng(double peso, double velocidade, boolean isComercial) {
    super(peso, velocidade);
    setIsComercial(isComercial);
  }
  
  public void setIsComercial(boolean isComercial) {
    this.isComercial = isComercial;
  }

  public boolean getIsComercial() {
    return this.isComercial;
  }
}