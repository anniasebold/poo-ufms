public class Funk extends FaixaMusical {
  private boolean estiloProibidao;
  public String parceirosComposicao[] = new String[10];
  int cont = 0;

  public Funk(String nome, String dataComposicao, int qtdReps, boolean estiloProibidao, String nomeParceiro) {
    super(nome, dataComposicao, qtdReps);
    setEstiloProibidao(estiloProibidao);
    setParceirosComposicao(nomeParceiro);
    this.calculaValor(this);
  }

  public void setEstiloProibidao(boolean estiloProibidao) {
    this.estiloProibidao = estiloProibidao;
  }

  public boolean getEstiloProibidao() {
    return this.estiloProibidao;
  }

  public void setParceirosComposicao(String nome) {
    if(parceirosComposicao[cont] == null) {
      nome.toUpperCase();
      parceirosComposicao[cont] = nome;
      cont++;
    }
  }

  public String[] getParceirosComposicao() {
    return parceirosComposicao;
  }
}