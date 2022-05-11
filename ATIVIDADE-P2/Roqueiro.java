import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Roqueiro extends UsuarioHumano  {
  private int qtdCamisasPretas; 
  private String dataQueFezBarba;

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