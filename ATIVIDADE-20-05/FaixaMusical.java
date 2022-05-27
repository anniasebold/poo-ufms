public abstract class FaixaMusical extends BensHeranca implements Padrao {
  private String nome;
  private String dataComposicao;
  private int qtdReps;

  public FaixaMusical(String nome, String dataComposicao, int qtdReps) {
    setNome(nome);
    setDataComposicao(dataComposicao);
    setQtdReps(qtdReps);
    // this.calculaValor(this);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDataComposicao(String dataComposicao) {
    this.dataComposicao = dataComposicao;
  }

  public void setQtdReps(int qtdReps) {
    this.qtdReps = qtdReps;
  }

  public String getNome() {
    return this.nome;
  }

  public String getDataComposicao() {
    return this.dataComposicao;
  }

  public int getQtdReps() {
    return this.qtdReps;
  }

  @Override
  public void calculaValor(Padrao item) {
    if (item instanceof Rap) {
      Rap temp = (Rap)item;
      if (temp.getEstilo() == "FREESTYLE") {
        BensHeranca.setValor(10000);
      } else if(temp.getEstilo() == "FLOW" || temp.getEstilo() == "GANGSTA") {
        BensHeranca.setValor(1000);
        for(int i = 0; i < temp.getPaisesQueFoiTocada().length; i++) {
          if(temp.paisesQueFoiTocada[i] == "JAPAO") {
            BensHeranca.setValor(15000);
          } else {
            BensHeranca.setValor(500);
          }
        }
        BensHeranca.setValor(10000);
      }
    } else if(item instanceof Pop) {
      Pop temp = (Pop)item;
      BensHeranca.setValor(BensHeranca.getValor() + (temp.getVezesTocada() * 0.01));
      for(int i = 0; i < temp.getQtdProcessos(); i++) {
        BensHeranca.setValor(BensHeranca.getValor() - 100);
      }
    } else if(item instanceof Funk) {
      Funk temp = (Funk)item;
      if(temp.getEstiloProibidao() == true) {
        BensHeranca.setValor(BensHeranca.getValor() + 1000);
      } else {
        for(int i = 0; i < temp.getParceirosComposicao().length; i++) {
          if(temp.parceirosComposicao[i] != null) {
            if(temp.parceirosComposicao[i] == "VALESCA POPOZUDA") {
              BensHeranca.setValor(BensHeranca.getValor() + 100000);
            } else {
              BensHeranca.setValor(BensHeranca.getValor() + 50000);
            }
          }
        }
      }
    }
  }
}