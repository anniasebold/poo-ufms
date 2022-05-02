public class ApostaDeBicho extends Aposta {
  private double dezena1, dezena2;

  public double getDezena1() {
    return this.dezena1;
  }

  public double getDezena2() {
    return this.dezena2;
  }

  public void setDezena1(double dezena1) {
    if (dezena1 >= 10 && dezena1 <= 99) {
      this.dezena1 = dezena1;
    }
  }

  public void setDezena2(double dezena2) {
    this.dezena2 = dezena2;
  }
}