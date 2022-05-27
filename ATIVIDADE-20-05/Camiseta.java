public class Camiseta extends BemMaterial {
  private int tamanho;
  private String cor;

  public Camiseta(int anoCompra, boolean bomEstado, int tamanho, String cor) {
    super(anoCompra, bomEstado);
    setTamanho(tamanho);
    setCor(cor);
    this.calculaValor(this);
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getCor() {
    return this.cor;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public int getTamanho() {
    return this.tamanho;
  }
}