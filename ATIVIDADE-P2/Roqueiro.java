import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Roqueiro extends UsuarioHumano  {
  private int qtdCamisasPretas; 
  private String dataQueFezBarba;

  public Roqueiro(String nome, String cpf, int qtdCamisasPretas, String dataQueFezBarba) {
    setNome(nome);
    setCpf(cpf);
    setQtdCamisasPretas(qtdCamisasPretas);
    setDataQueFezBarba(dataQueFezBarba);
  }

  public void setQtdCamisasPretas (int qtdCamisasPretas) {
    this.qtdCamisasPretas = qtdCamisasPretas;
  }

  public int getQtdCamisasPretas() {
    return this.qtdCamisasPretas;
  }

  public void setDataQueFezBarba(String data) {
    this.dataQueFezBarba = data;
  }

  public String getDataQueFezBarba() {
    return this.dataQueFezBarba;
  }

  @Override
  public void imprimeInformacoes() {
    System.out.println("------- ROQUEIRO -------");
    System.out.println("Nome: " + getNome());
    System.out.println("CPF: " + getCpf());
    System.out.println("Quantidade de Camisas Pretas: " + getQtdCamisasPretas());
    System.out.println("Data que fez a barba pela última vez: " + getDataQueFezBarba());
    System.out.println("------------------------");
  }
  
  @Override
  public void enviarAbracoAfinidade() {
    this.setQtdCamisasPretas(getQtdCamisasPretas() - 1);
    this.imprimeInformacoes();
  }

  @Override
  public void enviarAbracoSemAfinidade() {
    LocalDateTime agora = LocalDateTime.now();  
    DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    this.setDataQueFezBarba(formatarData.format(agora));
    this.imprimeInformacoes();
  }

  @Override
  public void receberAbracoAfinidade() {
    System.out.println("Rock'n'roll baby");
    this.setQtdCamisasPretas(getQtdCamisasPretas() + 1);
    this.imprimeInformacoes();
  }

  @Override
  public void receberAbracoSemAfinidade() {
    System.out.println("Obrigado");
  }
} 