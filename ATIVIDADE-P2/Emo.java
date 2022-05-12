
public class Emo extends UsuarioHumano {
  private double comprimentoFranja;
  private String corCabelo;

  public Emo(String nome, String cpf, double comprimentoFranja, String corCabelo) {
    super(nome, cpf);
    setComprimentoFranja(comprimentoFranja);
    setCorCabelo(corCabelo);
  }

  public void setComprimentoFranja(double comprimentoFranja) {
    this.comprimentoFranja = comprimentoFranja;
  }

  public double getComprimentoFranja() {
    return this.comprimentoFranja;
  }

  public void setCorCabelo(String corCabelo) {
    corCabelo = corCabelo.toUpperCase();

    if (corCabelo.equals("ROSA") || corCabelo.equals("VERDE") || corCabelo.equals("AMARELO")) {
      this.corCabelo = corCabelo;
    } else {
      System.out.println("Cor inválida");
    }
  }
  
  @Override
  public void imprimeInformacoes() {
    System.out.println("------- EMO -------");
    System.out.println("Nome: " + getNome());
    System.out.println("CPF: " + getCpf());
    System.out.println("Comprimento da franja: " +  String.format("%.2f", getComprimentoFranja()));
    System.out.println("Cor do cabelo: " + getCorCabelo());
    System.out.println("-------------------");
  }

  public String getCorCabelo() {
    return this.corCabelo;
  }

  @Override
  public void enviarAbracoAfinidade() {
    this.setCorCabelo("ROSA");
    this.imprimeInformacoes();
  }

  @Override
  public void enviarAbracoSemAfinidade() {
    this.setCorCabelo("VERDE");
    this.imprimeInformacoes();
  }

  @Override
  public void receberAbracoAfinidade() {
    this.setComprimentoFranja(getComprimentoFranja() + 2);
    this.imprimeInformacoes();
  }

  @Override
  public void receberAbracoSemAfinidade() {
    this.setComprimentoFranja(getComprimentoFranja() + 1);
    this.imprimeInformacoes();
  }
}