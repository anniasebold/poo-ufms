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
  public void enviarAbraco() {
    
  }
}