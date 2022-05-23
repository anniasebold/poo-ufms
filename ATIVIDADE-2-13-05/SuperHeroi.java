public abstract class SuperHeroi implements Comportamento {
  private String nomeOriginal;
  private String descricao;
  private String dataCriacao;
  private String paisNatal;
  private int nivelDeResistencia;
  private String estadoDeSaude;
  private String habilidades[];

  public SuperHeroi(String nomeOriginal, String descricao, String paisNatal, int nivelDeResistencia) {
    habilidades = new String[10];
    setNomeOriginal(nomeOriginal);
    setDescricao(descricao);
    setPaisNatal(paisNatal);
    setNivelDeResistencia(nivelDeResistencia);
  }

  public void setNomeOriginal(String nomeOriginal) {
    this.nomeOriginal = nomeOriginal;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public void setPaisNatal(String paisNatal) {
    this.paisNatal = paisNatal;
  }

  public void setNivelDeResistencia(int nivelDeResistencia) {
    if(nivelDeResistencia >= 0 && nivelDeResistencia <= 100) {
      this.nivelDeResistencia = nivelDeResistencia;
      this.setEstadoDeSaude();
    }
  }

  private void setEstadoDeSaude() {
    if(getNivelDeResistencia() >= 0 && getNivelDeResistencia() <= 30) {
      this.estadoDeSaude.equals("Ruim");
    } else if(getNivelDeResistencia() >= 31 && getNivelDeResistencia() <= 70) {
      this.estadoDeSaude.equals("Bom");
    } else if(getNivelDeResistencia() >= 71 && getNivelDeResistencia() <= 100) {
      this.estadoDeSaude.equals("Excelente");
    }
  }

  public String getNomeOriginal() {
    return this.nomeOriginal;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public String getDataCriacao() {
    return this.dataCriacao;
  }

  public String getPaisNatal() {
    return this.paisNatal;
  }

  public int getNivelDeResistencia() {
    return this.nivelDeResistencia;
  }

  public String getEstadoDeSaude() {
    return this.estadoDeSaude;
  }

}