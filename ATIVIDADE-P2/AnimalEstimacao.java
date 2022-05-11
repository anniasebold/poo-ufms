public class AnimalEstimacao extends Usuario {
  private String tipoAnimal;
  private boolean vacinasAtualizadas;

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
  public void enviarAbracoAfinidade() {
    System.out.println("Me visite e traga comida assim que a Covid-19 passar");
  }

  @Override
  public void enviarAbracoSemAfinidade() {
    this.enviarAbracoAfinidade();
  }

  @Override
  public void receberAbracoAfinidade() {
    this.setVacinasAtualizadas(true);
  }

  @Override
  public void receberAbracoSemAfinidade() {
    System.out.println("...");
  }
}