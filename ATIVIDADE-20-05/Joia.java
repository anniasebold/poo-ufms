public class Joia extends BemMaterial {
  private int quilates;
  private String tipo;

  public Joia(int anoCompra, boolean bomEstado, int quilates, String tipo) {
    super(anoCompra, bomEstado);
    setQuilates(quilates);
    setTipo(tipo);
    this.calculaValor(this);
  }

  public void setQuilates(int quilates) {
    this.quilates = quilates;
  }

  public int getQuilates() {
    return this.quilates;
  }

  public void setTipo(String tipo) {
    tipo.toUpperCase();
    if(tipo == "PULSEIRA") {
      this.tipo = "PULSEIRA";
    } else if(tipo == "BRINCO") {
      this.tipo = "BRINCO";
    }
  }
}