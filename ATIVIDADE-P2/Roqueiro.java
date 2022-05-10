
public class Roqueiro extends Usuario  {
  private int qtdCamisasPretas; 
  private String dataQueFezBarba;

  public void setQtdCamisasPretas (int qtdCamisasPretas) {
    this.qtdCamisasPretas = qtdCamisasPretas;
  }

  public int getQtdCamisasPretas() {
    return this.qtdCamisasPretas;
  }

  public void setDataQueFezBarba(String data) {
    this.dataQueFezBarba = data;
  }

  public String getDataQueFezBarba() {
    return this.dataQueFezBarba;
  }
} 