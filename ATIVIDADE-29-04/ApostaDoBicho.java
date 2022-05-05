public class ApostaDoBicho extends Aposta {
  private int dezena1, dezena2;

  public ApostaDoBicho(int dezena1, int dezena2, double valor) {
    super(valor);
    setDezena1(dezena1);
    setDezena2(dezena2);
  }

  public int getDezena1() {
    return this.dezena1;
  }

  public int getDezena2() {
    return this.dezena2;
  }

  public void setDezena1(int dezena1) {
    if (dezena1 >= 10 && dezena1 <= 99) {
      this.dezena1 = dezena1;
    }
  }

  public void setDezena2(int dezena2) {
    this.dezena2 = dezena2;
  }
}