public class Funk extends FaixaMusical {
  private boolean estiloProibidao;
  private String parceirosComposicao[] = new String[10];
  int cont = 0;

  public void setEstiloProibidao(boolean estiloProibidao) {
    this.estiloProibidao = estiloProibidao;
  }

  public boolean getEstiloProibidao() {
    return this.estiloProibidao;
  }

  public void setParceirosComposicao(String nome) {
    if(parceirosComposicao[cont] == null) {
      parceirosComposicao[cont] = nome;
      cont++;
    }
  }

  public String[] getParceirosComposicao() {
    return parceirosComposicao;
  }
  
  public void calculaValor() {
    if(getEstiloProibidao() == true) {
      setValor(1000);
    } else {
      for(int i = 0; i < parceirosComposicao.length; i++) {
        if(parceirosComposicao[i] != null) {
          if(parceirosComposicao[i] == "Valesca Popozuda") {
            setValor(100000);
          } else {
            setValor(50000);
          }
        }
      }
    }
  }
}