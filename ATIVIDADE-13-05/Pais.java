class Pais {
  private String codIso;
  private String nome;
  private int populacao;
  private double dimensao;
  Pais paisesFronteiras[] = new Pais[20];
  int cont = 0;
  private static int contador;

  public Pais(String codISO, String nome, double dimensao) {
    setCodIso(codISO);
    setNome(nome);
    setDimensao(dimensao);
    setContador();
  }

  public static int getContador() {
    return contador;
  }

  public static void setContador() {
    contador = getContador() + 1;
  }


  public void setCodIso(String codIso) {
    this.codIso = codIso;
  }

  public String getCodIso() {
    return this.codIso;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setPopulacao(int populacao) {
    this.populacao = populacao;
  }

  public int getPopulacao() {
    return this.populacao;
  }

  public void setDimensao(double dimensao) {
    this.dimensao = dimensao;
  }

  public double getDimensao() {
    return this.dimensao;
  }

  public void setPaisFronteira(Pais pais) {
    if(paisesFronteiras[cont] == null) {
      paisesFronteiras[cont] = pais;
    }
    cont++;
  }

  public void getPaisesFronteira() {
    for(int i = 0; i < paisesFronteiras.length; i++) {
      if(paisesFronteiras[i] != null) {
        System.out.println("País " + i);
        System.out.println(paisesFronteiras[i].getCodIso());
        System.out.println(paisesFronteiras[i].getNome());
      }
    }
  }

  public boolean fazFronteira(Pais pais) {
    for(int i = 0; i < paisesFronteiras.length; i++) {
      if(paisesFronteiras[i] != null) {
        if(paisesFronteiras[i].equals(pais)) {
          return true;
        }
      }
    }

    return false;
  }

  public double getDensidadePopulacional() {
    return getPopulacao() / getDimensao();
  }

  public Pais[] listPaisesVizinhos(Pais pais) {
    int cont = 0;
    Pais paisesVizinhos[] = new Pais[20];
    for(int i = 0; i < paisesFronteiras.length; i++) {
      for(int y = 0; y < pais.paisesFronteiras.length; y++) {
        if(paisesFronteiras[i] != null && pais.paisesFronteiras[y] != null) {
          if(paisesFronteiras[i].equals(pais.paisesFronteiras[y])) {
            paisesVizinhos[cont] = paisesFronteiras[i];
            System.out.println("País vizinho: " + paisesVizinhos[cont].getNome());
            cont++;
          }
        }
      }
    }

    return paisesVizinhos;
  }

  public boolean equals(Pais p) {
    return getCodIso().equals(p.getCodIso());
  }
}