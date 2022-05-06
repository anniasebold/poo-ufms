import java.util.Scanner;

public class Jogatina {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ApostaDoBicho apostasB[] = new ApostaDoBicho[2];
    ApostaDeCavalo apostasC[] = new ApostaDeCavalo[2];
    int opcaoVersao;
    int opcao;
    
    do {
      System.out.printf("Digite a versão (1) , (2) ou (3) p/sair: ");
      opcaoVersao = sc.nextInt();
      switch (opcaoVersao) {
        // VERSÃO 1.0
        case 1:
          int contB = 0;
          int contC = 0;
          do {
            System.out.println("\nMENU VERSÃO 1");
            System.out.println("(1)  Cadastrar aposta de cavalo");
            System.out.println("(2) Cadastrar aposta do bicho");
            System.out.println("(3) Listar apostas");
            System.out.println("(4) Sair");
            System.out.printf("Digite uma opção: ");
            opcao = sc.nextInt();
            switch(opcao) {
              case 1:
                if(contC < apostasC.length) {
                  System.out.println("\nCadastro de Aposta de CAVALO");
                  System.out.println("Digite o Número do Cavalo e Valor");
                  apostasC[contC] = new ApostaDeCavalo(sc.nextInt(), sc.nextDouble());
                  contC ++;
                } else {
                  System.out.println("\nVocê atingiu o valor máximo de apostas de cavalo!\n");
                }
                break;
              case 2:
                if(contB < apostasB.length) {
                  System.out.println("\nCadastro de Aposta de BICHO");
                  System.out.println("Digite a Dezena 1, Dezena 2 e Valor");
                  apostasB[contB] = new ApostaDoBicho(sc.nextInt(), sc.nextInt(), sc.nextDouble());
                  contB ++;
                } else {
                  System.out.println("\nVocê atingiu o valor máximo de apostas de bicho!\n");
                }
                break;
              case 3:
                // Listando Apostas
                System.out.println("\nLISTANDO APOSTAS: ");
                for(int i = 0; i < apostasB.length; i++) {
                  if(apostasB[i] != null) {
                    // System.out.println("-----------------------------------");
                    System.out.println("\nApostas de Bicho: ");
                    System.out.println("Dezena 1: " + apostasB[i].getDezena1());
                    System.out.println("Dezena 2: " + apostasB[i].getDezena2());
                    System.out.println("Valor: " + apostasB[i].getValor());
                    // System.out.println("-----------------------------------");
                  }
                }
      
                // Cadastro de Apostas de Cavalo
                for(int i = 0; i < apostasC.length; i++) {
                  if(apostasC[i] != null) {
                    // System.out.println("-----------------------------------");
                    System.out.println("\nApostas de Cavalo: ");
                    System.out.println("Dezena 1: " + apostasC[i].getNumeroDoCavalo());
                    System.out.println("Valor: " + apostasC[i].getValor());
                    // System.out.println("-----------------------------------");
                  }
                }
                break;
              case 4: 
                System.out.println("Até a próxima!");
                break;
              default:
                System.out.println("Opção inválida.");
                break;
            }
          } while(opcao != 4);
          break;
          // VERSÃO 2.0
          case 2:
            Aposta apostas[] = new Aposta[4];
            int cont = 0;
            do {
              System.out.println("\nMENU VERSÃO 2");
              System.out.println("(1)  Cadastrar aposta de cavalo");
              System.out.println("(2) Cadastrar aposta do bicho");
              System.out.println("(3) Listar apostas");
              System.out.println("(4) Sair");
              System.out.printf("Digite uma opção: ");
              opcao = sc.nextInt();
              switch(opcao) {
                case 1:
                  if(cont < apostas.length) {
                    System.out.println("\nCadastro de Aposta de CAVALO");
                    System.out.println("Digite o Número do Cavalo e Valor");
                    apostas[cont] = new ApostaDeCavalo(sc.nextInt(), sc.nextDouble());
                    cont ++;
                  } else {
                    System.out.println("\nVocê atingiu o valor máximo de apostas de cavalo!\n");
                  }
                  break;
                case 2:
                  if(cont < apostas.length) {
                    System.out.println("\nCadastro de Aposta de BICHO");
                    System.out.println("Digite a Dezena 1, Dezena 2 e Valor");
                    apostas[cont] = new ApostaDoBicho(sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    cont ++;
                  } else {
                    System.out.println("\nVocê atingiu o valor máximo de apostas de bicho!\n");
                  }
                  break;
                case 3:
                  // Listando Apostas
                  System.out.println("\nLISTANDO APOSTAS: ");
                  for(int i = 0; i < apostas.length; i++) {
                    if(apostas[i] != null) {
                      if(apostas[i] instanceof ApostaDoBicho) {
                        ApostaDoBicho temp = (ApostaDoBicho)apostas[i];
                        System.out.println("\n Apostas de Bicho: ");
                        System.out.println("Dezena 1: " + temp.getDezena1());
                        System.out.println("Dezena 2: " + temp.getDezena2());
                        System.out.println("Valor: " + temp.getValor());
                        System.out.println("-----------------------------------");
                      } else if(apostas[i] instanceof ApostaDeCavalo) {
                        ApostaDeCavalo temp = (ApostaDeCavalo)apostas[i];
                        System.out.println("\nApostas de Cavalo: ");
                        System.out.println("Dezena 1: " + temp.getNumeroDoCavalo());
                        System.out.println("Valor: " + temp.getValor());
                        System.out.println("-----------------------------------");
                      }
                    }
                  }
                  break;
                case 4: 
                  System.out.println("Até a próxima!");
                  break;
                default:
                  System.out.println("Opção inválida.");
                  break;
              }
            } while(opcao != 4);
            break;
          case 3: 
            System.out.println("Até a próxima!");
            break;
          default:
            System.out.println("Opção inválida.");
            break;
      }
    } while(opcaoVersao != 3);
  }
}