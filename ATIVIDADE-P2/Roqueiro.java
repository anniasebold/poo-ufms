import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Roqueiro extends UsuarioHumano  {
  private int qtdCamisasPretas; 
  private String dataQueFezBarba;
  LocalDateTime agora = LocalDateTime.now();  
  DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public Roqueiro(String nome, String cpf, int qtdCamisasPretas, String dataQueFezBarba) {
    super(nome, cpf);
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
  public void enviaAbraco(Usuario receiver) {
    if(receiver instanceof Roqueiro) {
      this.setQtdCamisasPretas(getQtdCamisasPretas() - 1);
    } else {
      this.setDataQueFezBarba(formatarData.format(agora));
    }
    this.imprimeInformacoes();
    receiver.recebeAbraco(this);
  }

  @Override
  public void recebeAbraco(Usuario sender) {
    if(sender instanceof Roqueiro) {
      System.out.println("Rock'n'roll baby");
      this.setQtdCamisasPretas(getQtdCamisasPretas() + 1);
    } else {
      System.out.println("Obrigado");
    }
    this.imprimeInformacoes();
  }
} 