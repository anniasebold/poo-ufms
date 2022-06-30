package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int n = sc.nextInt();
		int escolha;
		int vetor[] = new int[n];;
		
		do {
			System.out.println("Informe a posicão e o valor que deseja inserir: ");
			int posicao = sc.nextInt();
			int valor = sc.nextInt();
			
			try {
				vetor[posicao] += valor;
			} catch(ArrayIndexOutOfBoundsException e) {
				for(int i = 0; i < vetor.length; i++) {
					vetor[i] = -1;
				}
				
				System.out.println(e.getMessage());
			}
			
			System.out.println("Digite 1 para continuar e 0 para sair.");
			escolha = sc.nextInt();

		} while(escolha == 1);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
} 
