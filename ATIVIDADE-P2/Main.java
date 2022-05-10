import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome e o cpf");
    Usuario user = new Usuario(sc.next(), sc.next());
  
    System.out.println(user.getCpf() + "\n" + user.getNome());
  }
}