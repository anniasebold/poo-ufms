public class Relogio extends BemMaterial {
  private String digitalOuAnalogico;
  private String marca;

  public Relogio(int anoCompra, boolean bomEstado, boolean digitalOuAnalogico, String marca) {
    super(anoCompra, bomEstado);
    setDigitalOuAnalogico(digitalOuAnalogico);
    setMarca(marca);
    this.calculaValor(this);
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setDigitalOuAnalogico(boolean tipo) {
    if(tipo == true) {
      this.digitalOuAnalogico = "DIGITAL";
    } else {
      this.digitalOuAnalogico = "ANALOGICO";
    }
  }
}