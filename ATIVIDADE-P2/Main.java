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
      System.out.println("4. Imprimir lista de cadastrados");
      System.out.println("5. Enviar abraço");
      System.out.println("6. Sair");
      numOpcao = sc.nextInt();

      switch(numOpcao) {
        case 1:
          System.out.println("Cadastro de Emo");
          System.out.println("Digite o NOME (Máximo 20 caracteres)");
          String nomeEmo = sc.next();
          System.out.println("Digite o CPF (Com pontos e vírgulas)");
          String cpfEmo = sc.next();
          System.out.println("Digite o Comprimento da Franja");
          double comprimentoFranja = sc.nextDouble();
          System.out.println("Digite a Cor do Cabelo (ROSA / VERDE / AMARELO)");
          String corCabelo = sc.next();
          usuarios[cont] = new Emo(nomeEmo, cpfEmo, comprimentoFranja, corCabelo);
          cont += 1;
          break;
        case 2:
          System.out.println("Cadastro de Roqueiro");
          System.out.println("Digite o NOME (Máximo 20 caracteres)");
          String nomeRock = sc.next();
          System.out.println("Digite o CPF (Com pontos e vírgulas)");
          String cpfRock = sc.next();
          System.out.println("Digite a quantidade de camisas pretas que você possui ");
          int qtdCamisasPretas = sc.nextInt();
          System.out.println("Digite a Data que fez a Barba pela última vez");
          String dataQueFezBarba = sc.next();
          usuarios[cont] = new Roqueiro(nomeRock, nomeRock, qtdCamisasPretas, dataQueFezBarba);
          cont += 1;
          break;
        case 3:
          System.out.println("Cadastro de Animal de Estimação");
          System.out.println("Digite o Tipo do Animal ");
          String tipoAnimal = sc.next();
          System.out.println("As vacinas estão atualizadas? (true p/ SIM ou false p/ NÃO)");
          boolean vacinasAtualizadas = sc.nextBoolean();
          usuarios[cont] = new AnimalEstimacao(tipoAnimal, vacinasAtualizadas);
          break;
        case 4:
          System.out.println("Lista de usuários: ");
          for(int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null) {
              System.out.println("Número do usuário: " + i);
              usuarios[i].imprimeInformacoes();
            }
          } 
          break;
        case 5:
          break;
        case 6:
          System.out.println("Até a próxima!");
          break;
      }
    } while(numOpcao != 6);
  }
}