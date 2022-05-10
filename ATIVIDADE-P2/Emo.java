import java.text.DecimalFormat;

public class Emo extends Usuario {
  private double comprimentoFranja;
  private String corCabelo;
  DecimalFormat df = new DecimalFormat("#.##");

  public Emo() {

  }

  public void setComprimentoFranja(double comprimentoFranja) {
    this.comprimentoFranja = Double.parseDouble(df.format(comprimentoFranja));
  }

  public double getComprimentoFranja() {
    return this.comprimentoFranja;
  }

  public void setCorCabelo(String corCabelo) {
    corCabelo = corCabelo.toUpperCase();

    if (corCabelo != "ROSA" || corCabelo != "VERDE" || corCabelo != "AMARELO") {
      System.out.println("Cor inválida (Digite entre as opções ROSA / VERDE / AMARELO)");
    } else {
      this.corCabelo = corCabelo;
    }
  }

  public String getCorCabelo() {
    return this.corCabelo;
  }

}