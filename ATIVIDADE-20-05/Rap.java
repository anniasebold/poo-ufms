public class Rap extends FaixaMusical {
  private String estilo;
  private String paisesQueFoiTocada[] = new String[5];
  int cont = 0;

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

  public void calculaValor() {
    if (getEstilo() == "FREESTYLE") {
      setValor(10000);
    } else if(getEstilo() == "FLOW" || getEstilo() == "GANGSTA") {
      setValor(1000);
      for(int i = 0; i < getPaisesQueFoiTocada().length; i++) {
        if(paisesQueFoiTocada[i] == "JAPAO") {
          setValor(15000);
        } else {
          setValor(500);
        }
      }
      setValor(10000);
    }
  }
}