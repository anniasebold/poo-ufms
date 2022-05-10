import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Usuario user = new Usuario();
    System.out.println("Digite o NOME: (Maximo de 20 caracteres)");
    user.setNome(sc.nextLine());
    System.out.println("Digite o CPF: (Escrito sem pontos e traços)");
    user.setCpf(sc.nextLine());
  
    System.out.println(user.getCpf() + "\n" + user.getNome());

    Roqueiro rock = new Roqueiro();
    System.out.println("Data que fez a barba pela ultima vez");
    rock.setDataQueFezBarba(sc.nextLine());
    System.out.println("qtdCamisetasPretas");
    rock.setQtdCamisasPretas(sc.nextInt());

    System.out.println(rock.getQtdCamisasPretas() +  "\n" + rock.getDataQueFezBarba());
  }
}