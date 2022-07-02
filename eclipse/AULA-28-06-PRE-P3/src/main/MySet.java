package main;

public class MySet<T> implements Set<T> {
	
	private Object vetor[];
	private int quantidade;
	
	public MySet() {
		vetor = new Object[10];
		quantidade = 0;
	}

	@Override
	public void add(T elemento) {
		if(!contains(elemento)) {
			vetor[quantidade] = elemento;
			quantidade++;
		} else {
			throw new ElementoDuplicadoException();
		}
		
		if(quantidade == vetor.length) {
			Object[] vetorAuxiliar = new Object[vetor.length*2];
			
			for(int i = 0; i < vetor.length; i++) {
				vetorAuxiliar[i] = vetor[i];
			}
			
			vetor = vetorAuxiliar;
		}
	}

	@Override
	public void clear() {
		for(int i = 0; i < quantidade; i++) {
			vetor[i] = null;
		}
		
		vetor = new Object[10];
		quantidade = 0;
	}

	@Override
	public boolean contains(Object elemento) {
		for(int i = 0; i < quantidade; i++) {
			if(vetor[i].equals(elemento)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void remove(Object elemento) throws ElementoNaoEncontradoException {
		for(int i = 0; i < quantidade; i++) {
			if(vetor[i].equals(elemento)) {
				vetor[i] = vetor[quantidade-1];
				quantidade--;
				return;
			}
		}
		
		throw new ElementoNaoEncontradoException();
	}

	@Override
	public int size() {
		return quantidade;
	}
}
