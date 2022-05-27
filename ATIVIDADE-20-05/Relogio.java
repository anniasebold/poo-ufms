public class Relogio extends BemMaterial {
  private String[] digitalOuAnalogico  = new String[2];
  private String marca;

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return this.marca;
  }

  public void calculaValor() {}
}