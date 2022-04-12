import java.util.Random;

public class Aposta {
  Random random = new Random();
  int numerosAposta[] = new int[3];
  
  int dezena1;
  int dezena2;
  int dezena3;
  double porcentagemDeGanho;
  double montanteApostado;
  double montanteGanho;

  Apostador apostador;
  
  public double getMontanteGanho() {
    return montanteGanho;
  }

  public void setMontanteGanho(double montanteGanho) {
    this.montanteGanho = montanteGanho;
  }

  public int[] getNumerosAposta() {
    return numerosAposta;
  }

  public void setNumerosAposta(int[] numerosAposta) {
      this.numerosAposta = numerosAposta;
  }

  public double getPorcentagemDeGanho() {
    return porcentagemDeGanho;
  }

  public void setPorcentagemDeGanho(double porcentagemDeGanho) {
    this.porcentagemDeGanho = porcentagemDeGanho;
  }

  public double getMontanteApostado() {
    return montanteApostado;
  }

  public void setMontanteApostado(double montanteApostado) {
    this.montanteApostado = montanteApostado;
  }

  public Apostador getApostador() {
      return apostador;
  }

  public void setApostador(Apostador apostador) {
    this.apostador = apostador;
  }
  
  public void gerarAposta(int dezena1, int dezena2) {
    for(int i = 0; i < 3; i++) {
      if(dezena1 == getNumerosAposta()[i]) {
        setMontanteGanho(getMontanteGanho() + getPorcentagemDeGanho());
      } else if(dezena2 == getNumerosAposta()[i]) {
        setMontanteGanho(getMontanteGanho() + getPorcentagemDeGanho());
      }
    }
    
    System.out.println("Ganho em reais obtido = R$" + getMontanteGanho());
  }
  
  public void gerarAposta(int dezena1, int dezena2, int dezena3) {
    for(int i = 0; i < 3; i++) {
      if(dezena1 == getNumerosAposta()[i]) {
        setMontanteGanho(getMontanteGanho() + getPorcentagemDeGanho());
      } else if(dezena2 == getNumerosAposta()[i]) {
        setMontanteGanho(getMontanteGanho() + getPorcentagemDeGanho());
      } else if(dezena3 == getNumerosAposta()[i]) {
        setMontanteGanho(getMontanteGanho() + getPorcentagemDeGanho());
      }
    }
    
    System.out.println("Ganho em reais obtido = R$" + getMontanteGanho());
  }
  
  
  Aposta(int dezena1, int dezena2, double montanteApostado, String nome, String cpf, String endereco) {
    setMontanteApostado(montanteApostado);
    setPorcentagemDeGanho(getMontanteApostado() * 0.6);
    this.numerosAposta[0] = 10;
    this.numerosAposta[1] = 20;

    apostador = new Apostador(nome, cpf, endereco);
    gerarAposta(dezena1, dezena2);
  }
  
  Aposta(int dezena1, int dezena2, int dezena3, double montanteApostado, String nome, String cpf, String endereco) {
    setMontanteApostado(montanteApostado);
    setPorcentagemDeGanho(getMontanteApostado() * 0.45);
    this.numerosAposta[0] = 12;
    this.numerosAposta[1] = 45;
    this.numerosAposta[2] = 55;
    
    apostador = new Apostador(nome, cpf, endereco);
    gerarAposta(dezena1, dezena2, dezena3);
  }
}
