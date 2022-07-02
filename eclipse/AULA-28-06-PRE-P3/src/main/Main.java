package main;

public class Main {
	public static void main(String[] args) {
		MySet<Integer> v = new MySet<Integer>();
		
		v.add(10);
		v.add(20);
		
		try {
			v.remove(90);
		} catch (ElementoNaoEncontradoException e) {
			e.printStackTrace();
		}
	}
	
	
}
