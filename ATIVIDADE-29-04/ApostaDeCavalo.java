public class ApostaDeCavalo extends Aposta {
  private int numeroDoCavalo;

  public ApostaDeCavalo(int numeroDoCavalo, double valor) {
    super(valor);
    setNumeroDoCavalo(numeroDoCavalo);
  }

  public int getNumeroDoCavalo() {
    return this.numeroDoCavalo;
  }

  public void setNumeroDoCavalo(int numeroDoCavalo) {  
    this.numeroDoCavalo = numeroDoCavalo;
  }
}