public abstract class BemMaterial implements Padrao {
  private int anoCompra;
  private boolean bomEstado;

  public void setAnoCompra(int anoCompra) {
    this.anoCompra = anoCompra;
  }

  public void setBomEstado(boolean bomEstado) {
    this.bomEstado = bomEstado;
  }

  public int getAnoCompra() {
    return this.anoCompra;
  }
}