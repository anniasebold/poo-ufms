import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOpcao = 0;

    Usuario usuarios[] = new Usuario[20];
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
          sc.nextLine();
          System.out.println("Digite o CPF (Com pontos e vírgulas)");
          String cpfEmo = sc.next();
          sc.nextLine();
          System.out.println("Digite o Comprimento da Franja");
          double comprimentoFranja = sc.nextDouble();
          sc.nextLine();
          System.out.println("Digite a Cor do Cabelo (ROSA / VERDE / AMARELO)");
          String corCabelo = sc.next();
          sc.nextLine();
          usuarios[cont] = new Emo(nomeEmo, cpfEmo, comprimentoFranja, corCabelo);
          cont += 1;
          break;
        case 2:
          System.out.println("Cadastro de Roqueiro");
          System.out.println("Digite o NOME (Máximo 20 caracteres)");
          String nomeRock = sc.next();
          sc.nextLine();
          System.out.println("Digite o CPF (Com pontos e vírgulas)");
          String cpfRock = sc.next();
          sc.nextLine();
          System.out.println("Digite a quantidade de camisas pretas que você possui");
          int qtdCamisasPretas = sc.nextInt();
          sc.nextLine();
          System.out.println("Digite a data que fez a barba pela última vez");
          String dataQueFezBarba = sc.next();
          sc.nextLine();
          usuarios[cont] = new Roqueiro(nomeRock, cpfRock, qtdCamisasPretas, dataQueFezBarba);
          cont += 1;
          break;
        case 3:
          System.out.println("Cadastro de Animal de Estimação");
          System.out.println("Digite o Tipo do Animal ");
          String tipoAnimal = sc.next();
          sc.nextLine();
          System.out.println("As vacinas estão atualizadas? (true p/ SIM ou false p/ NÃO)");
          boolean vacinasAtualizadas = sc.nextBoolean();
          sc.nextLine();
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
          System.out.println("Enviar abraço: ");
          System.out.println("Qual o seu usuário (número):");
          int numUsuarioSend = sc.nextInt();
          System.out.println("Qual o usuário que deseja enviar o abraço (número):");
          int numUsuarioReceive = sc.nextInt();
          if((usuarios[numUsuarioSend].getClass()).equals((usuarios[numUsuarioReceive]).getClass())) {
            System.out.println("Entrou no if");
            System.out.println(usuarios[numUsuarioSend].getClass());
            usuarios[numUsuarioSend].enviarAbracoAfinidade();
            usuarios[numUsuarioReceive].receberAbracoAfinidade();
          } else if(usuarios[numUsuarioReceive] instanceof AnimalEstimacao) {
            System.out.println("Entrou no else if de animal");
            if(usuarios[numUsuarioSend] instanceof AnimalEstimacao || usuarios[numUsuarioSend] instanceof Roqueiro) {
              usuarios[numUsuarioSend].enviarAbracoSemAfinidade();
              usuarios[numUsuarioReceive].receberAbracoAfinidade();
            } else {
              usuarios[numUsuarioReceive].receberAbracoSemAfinidade();
            }
          } else {
            System.out.println("Entrou no else");
            usuarios[numUsuarioSend].enviarAbracoSemAfinidade();
            usuarios[numUsuarioReceive].receberAbracoSemAfinidade();
          }
          break;
          case 6:
            System.out.println("Até a próxima!");
            sc.close();
            break;
      }
    } while(numOpcao != 6);
  }
}