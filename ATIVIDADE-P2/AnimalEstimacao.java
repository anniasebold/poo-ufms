public class AnimalEstimacao extends Usuario {
  private String tipoAnimal;
  private boolean vacinasAtualizadas;

  public AnimalEstimacao(String tipoAnimal, boolean vacinasAtualizadas) {
    setTipoAnimal(tipoAnimal);
    setVacinasAtualizadas(vacinasAtualizadas);
  }

  public void setTipoAnimal(String tipoAnimal) {
    this.tipoAnimal = tipoAnimal;
  }

  public String getTipoAnimal() {
    return this.tipoAnimal;
  }

  public void setVacinasAtualizadas(boolean vacinasAtualizadas) {
    this.vacinasAtualizadas = vacinasAtualizadas;
  }

  public boolean getVacinasAtualizadas() {
    return vacinasAtualizadas;
  }

  @Override
  public void imprimeInformacoes() {
    System.out.println("------- ANIMAL DE ESTIMAÇÃO -------");
    System.out.println("Tipo do Animal: " + getTipoAnimal());
    System.out.println("As vacinas estão em dia? " + getVacinasAtualizadas());
    System.out.println("-----------------------------------");
  }

  @Override
  public void enviaAbraco(Usuario receiver) {
    System.out.println("Me visite e traga comida assim que a Covid-19 passar");
    receiver.recebeAbraco(this);
  }

  @Override
  public void recebeAbraco(Usuario sender) {
    if (sender instanceof AnimalEstimacao || sender instanceof Roqueiro) {
      this.setVacinasAtualizadas(true);
      System.out.println("Vacinas atualizadas! Novo status: " + getVacinasAtualizadas());
    }
  }
}