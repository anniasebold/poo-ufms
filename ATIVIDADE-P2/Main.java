import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOpcao = 0;

    Usuario usuarios[] = new UsuarioHumano[20];
    int cont = 0;

    do {
      System.out.println("--------- MENU ---------");
      System.out.println("1. Cadastrar Emo");
      System.out.println("2. Cadastrar Roqueiro");
      System.out.println("3. Cadastrar Animal de Estimação");
      System.out.println("4. Enviar abraço");
      System.out.println("5. Sair");
      numOpcao = sc.nextInt();

      switch(numOpcao) {
        case 1:
          System.out.println("Cadastro de Emo");
          System.out.println("Digite o NOME (Máximo 20 caracteres)");
          String nome = sc.next();
          System.out.println("Digite o CPF (Com pontos e vírgulas)");
          String cpf = sc.next();
          System.out.println("Digite o Comprimento da Franja");
          double comprimentoFranja = sc.nextDouble();
          System.out.println("Digite a Cor do Cabelo (ROSA / VERDE / AMARELO)");
          String corCabelo = sc.next();
          usuarios[cont] = new Emo(nome, cpf, comprimentoFranja, corCabelo);
          cont += 1;
          break;
        case 2:
          break;
        case 3:
          break;
        case 4: 
          break;
        case 5:
          System.out.println("Até a próxima!");
          break;
      }
    } while(numOpcao != 5);

    // UsuarioHumano user = new Roqueiro();
    // System.out.println("Digite o NOME: (Maximo de 20 caracteres)");
    // user.setNome(sc.nextLine());
    // System.out.println("Digite o CPF: (Escrito sem pontos e traços)");
    // user.setCpf(sc.nextLine());
  
    // System.out.println(user.getCpf() + "\n" + user.getNome());

    // Roqueiro rock = new Roqueiro();
    // System.out.println("Data que fez a barba pela ultima vez");
    // rock.setDataQueFezBarba(sc.nextLine());
    // System.out.println("qtdCamisetasPretas");
    // rock.setQtdCamisasPretas(sc.nextInt());

    // System.out.println(rock.getQtdCamisasPretas() +  "\n" + rock.getDataQueFezBarba());

    // Emo emo = new Emo();
    // System.out.println("Cor do cabelo");
    // emo.setCorCabelo(sc.nextLine());
    // System.out.println("Comprimento franja");
    // emo.setComprimentoFranja(sc.nextDouble());

    // System.out.println(emo.getComprimentoFranja() +  "\n" + emo.getCorCabelo());
  }
}