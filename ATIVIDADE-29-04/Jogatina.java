import java.util.Scanner;

public class Jogatina {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Versao 1.0
    ApostaDoBicho apostasB[] = new ApostaDoBicho[2];
    ApostaDeCavalo apostasC[] = new ApostaDeCavalo[2];

    // Cadastro de Apostas de Bicho
    for(int i = 0; i < 2; i++) {
      System.out.println("Cadastro de Aposta de Bicho \n");
      System.out.println("Digite a Dezena 1, Dezena 2, Valor e Ganho");
      apostasB[i] = new ApostaDoBicho(sc.nextInt(), sc.nextInt(), sc.nextDouble());
    }

    // Cadastro de apostas
    // (1) Cadastrar aposta de cavalo (vetor de apostas de cavalo)
    // (2) Cadastrar aposta do bicho (vetor de apostas do bicho)
    // (3) Listar apostas
    // (4) Sair

    // Versão 2.0
    Aposta aposta[] = new Aposta[10];
    // Cadastro de apostas
    // (1) Cadastrar aposta de cavalo (vetor de apostas)
    // (2) Cadastrar aposta do bicho (vetor de apostas)
    // (3) Listar apostas
    // (4) Sair
  }
}