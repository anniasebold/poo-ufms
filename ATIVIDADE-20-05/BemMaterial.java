public abstract class BemMaterial implements Padrao {
  private int anoCompra;
  private boolean bomEstado;
  private double valor;

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
  public void calculaValor() {
    if(getBomEstado() == true) {
      for(int i = getAnoCompra(); i < 2022; i++) {
        setValor(1000);
      }
    } else {
      for(int i = getAnoCompra(); i < 2022; i++) {
        setValor(1000);
      }
    }
  }

  @Override
  public void setValor(double valor) {
    this.valor += valor;
  }

  @Override
  public double getValor() {
    return this.valor;
  }
}