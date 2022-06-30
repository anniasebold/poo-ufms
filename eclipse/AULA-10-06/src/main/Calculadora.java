package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		try {
			int num1 = leitor.nextInt();
			int num2 = leitor.nextInt();
			int resultado = num1/num2;
			
			System.out.println(resultado);
		} catch(InputMismatchException e) {
			e.printStackTrace();
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Tchau!");
	}
}
