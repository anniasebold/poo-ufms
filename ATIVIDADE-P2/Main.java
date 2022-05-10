import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Usuario user = new Usuario();
    System.out.println("Digite o NOME: ");
    user.setNome(sc.nextLine());
    System.out.println("Digite o CPF: (Escrito sem pontos e traços)");
    user.setCpf(sc.nextLine());
  
    System.out.println(user.getCpf() + "\n" + user.getNome());
  }
}