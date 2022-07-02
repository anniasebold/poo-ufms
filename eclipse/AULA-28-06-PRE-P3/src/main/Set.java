package main;

public interface Set<T> {
	void add(T elemento);
	void clear();
	boolean contains(Object elemento);
	void remove(Object elemento) throws ElementoNaoEncontradoException;
	int size();
}
