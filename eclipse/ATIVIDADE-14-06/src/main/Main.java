package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		File arquivo = new File("/home/anniasebold/Desktop/UFMS/poo-ufms/eclipse/ATIVIDADE-14-06/pessoas.txt");
	    Scanner sc;
	    
		try {
			sc = new Scanner(arquivo);
			ArrayList<Pessoa> pessoas = new ArrayList<>();
			
			while (sc.hasNext()) {
				String linha = sc.nextLine();
				
				String[] dados = linha.split("/");
				
				try {
					Pessoa pessoa = new Pessoa(dados[0], dados[1]);
					
					pessoas.add(pessoa);
				} catch(InvalidCpfException e) {
					System.out.println(e.getMessage());
				} catch (InvalidNameException e) {
					System.out.println("Nome muito curto.");
				}
				
		    }
			
			for(int i = 0; i < pessoas.size(); i++) {
				System.out.println(pessoas.get(i).getCpf());
				System.out.println(pessoas.get(i).getNome());
				System.out.println("\n");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
