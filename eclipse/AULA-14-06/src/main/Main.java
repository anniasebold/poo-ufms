package main;

public class Main {
	public static void main(String[] args) {
		try {
			Pessoa pessoa = new Pessoa("123.123.123-12", "Annia Sebold aaaaaaaaa");
			
			System.out.println(pessoa.getCpf());
		} catch(InvalidCpfException e) {
			System.out.println(e.getMessage());
		} catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
	}
}
