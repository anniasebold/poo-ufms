import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TesteVetoriusInfinitus {
	public static void main(String[] args) {
		VetoriusInfinitus<Integer> v = new VetoriusInfinitus<Integer>();
		
		v.add(15); //0
		v.add(34); //1
		
		try {
			System.out.println(v.get(4)); // 30
		} catch (PosicaoInexistenteException e) {
			e.printStackTrace();
		} 
		
		VetoriusInfinitus<Object> v2 = new VetoriusInfinitus<Object>();
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		
		arrayList.add(15);
		arrayList.add(23);
		arrayList.get(0); // 15
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(30);
		
		Iterator<Integer> iterador = hashSet.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		HashMap<String,Pessoa> mapa = new HashMap<String,Pessoa>();
		
		mapa.put("123.123.123-12", new Pessoa("Wallace", 7, "Marrom"));
		mapa.put("345.464.123-12", new Pessoa("Pafunildo", 10, "Roxo"));
		mapa.put("345.464.123-12", new Pessoa("Ziguifrido", 10, "Vermelho"));
		
		
		Pessoa pessoa = mapa.get("123.123.123-12");
		
	}
}
