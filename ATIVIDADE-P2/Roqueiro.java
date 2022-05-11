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
  }

  @Override
  public void enviarAbracoAfinidade() {
    this.setQtdCamisasPretas(getQtdCamisasPretas() - 1);
  }

  @Override
  public void enviarAbracoSemAfinidade() {
    LocalDateTime agora = LocalDateTime.now();  
    DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
    this.setDataQueFezBarba(formatarData.format(agora));
  }

  @Override
  public void receberAbracoAfinidade() {
    System.out.println("Rock'n'roll baby");
  }

  @Override
  public void receberAbracoSemAfinidade() {
    System.out.println("Obrigado");
  }
} 