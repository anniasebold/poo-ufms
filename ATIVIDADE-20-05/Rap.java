public class Rap extends FaixaMusical {
  private String estilo;
  public String paisesQueFoiTocada[] = new String[5];
  int cont = 0;

  public Rap(String nome, String dataComposicao, int qtdReps, String estilo, String nomePais) {
    super(nome, dataComposicao, qtdReps);
    setEstilo(estilo);
    setPaisesQueFoiTocada(nomePais);
    this.calculaValor(this);
  }

  public void setEstilo(String estilo) {
    estilo.toUpperCase();
    if (estilo.equals("FREESTYLE")) {
      estilo = "FREESTYLE";
    } else if(estilo.equals("FLOW")) {
      estilo = "FLOW";
    } else if(estilo.equals("GANGSTA")){
      estilo = "GANGSTA";
    }
  }

  public String getEstilo() {
    return this.estilo;
  }

  public void setPaisesQueFoiTocada(String nomePais) {
    if(paisesQueFoiTocada[cont] == null) {
      nomePais.toUpperCase();
      paisesQueFoiTocada[cont] = nomePais;
      cont++;
    }
  }

  public String[] getPaisesQueFoiTocada() {
    return paisesQueFoiTocada;
  }
}