class Cancelamento {
  private String motivo;
  private Boolean perdaPatrocinio;
  public Cancelado cancelado;

  public Cancelamento(String motivo, Boolean perdaPatrocinio) {
    setMotivo(motivo);
    setPerdaPatrocinio(perdaPatrocinio);
  }

  private void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  private void setPerdaPatrocinio(Boolean perdaPatrocinio) {
    this.perdaPatrocinio = perdaPatrocinio;
  }

  public String getMotivo() {
    return this.motivo;
  }

  public Boolean getPerdaPatrocinio() {
    return this.perdaPatrocinio;
  }
}
