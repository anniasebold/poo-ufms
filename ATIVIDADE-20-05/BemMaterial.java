public abstract class BemMaterial extends BensHeranca implements Padrao {
  private int anoCompra;
  private boolean bomEstado;

  public BemMaterial(int anoCompra, boolean bomEstado) {
    setAnoCompra(anoCompra);
    setBomEstado(bomEstado);
  }

  public void setAnoCompra(int anoCompra) {
    this.anoCompra = anoCompra;
  }

  public void setBomEstado(boolean bomEstado) {
    this.bomEstado = bomEstado;
  }

  public int getAnoCompra() {
    return this.anoCompra;
  }

  public boolean getBomEstado() {
    return this.bomEstado;
  }

  @Override
  public void calculaValor(Padrao item) {
    if(getBomEstado() == true) {
      for(int i = getAnoCompra(); i < 2022; i++) {
        setValor(BensHeranca.getValor() + 1000);
      }
    } else {
      for(int i = getAnoCompra(); i < 2022; i++) {
        setValor(BensHeranca.getValor() + 500);
      }
    }
  }
}