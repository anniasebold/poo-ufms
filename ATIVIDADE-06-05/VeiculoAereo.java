public class VeiculoAereo extends Veiculo {
  private double velocidade;

  public VeiculoAereo(double peso, double velocidade) {
    super(peso);
    setVelocidade(velocidade);
  }

  public void setVelocidade(double velocidade) {
    this.velocidade = velocidade;
  }

  public double getVelocidade() {
    return this.velocidade;
  }

  public void voar() {
    System.out.println("Estou voando");
  }
}