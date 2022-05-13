public class Tanque extends VeiculoTerrestre {
  private String dataFabricacao;

  public Tanque(double peso, boolean tracado, String dataFabricacao) {
    super(peso, tracado);
    setDataFabricacao(dataFabricacao);
  } 

  public void guerrear() {
    System.out.println("Estou guerreando");
  }

  public void setDataFabricacao(String dataFabricacao) {
    this.dataFabricacao = dataFabricacao;
  }

  public String getDataFabricacao() {
    return this.dataFabricacao;
  }
}