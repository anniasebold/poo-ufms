
public class VetoriusInfinitus<Type> {
	private Object[] vetorFinito;
	private int quantidade;
	
	public VetoriusInfinitus() {
		vetorFinito = new Object[100];
		quantidade = 0;
	}
	
	public void add(Type valor) {
		vetorFinito[quantidade] = valor;
		quantidade++;
		
		if(quantidade == vetorFinito.length) {
			Object[] vetorAuxiliar = new Object[vetorFinito.length*2];
			
			for(int i = 0 ; i < vetorFinito.length ; i++)
				vetorAuxiliar[i] = vetorFinito[i];
			
			vetorFinito = vetorAuxiliar;
		}
		
	}
	
//	@SuppressWarnings("unchecked")
	public Type get(int posicao) throws PosicaoInexistenteException {
		if(posicao < 0 || posicao > quantidade)
			throw new PosicaoInexistenteException();
			
		return (Type)vetorFinito[posicao];
	}
	
	// Relançamento de exceção
	@SuppressWarnings("unchecked")
	public Type getDiferentao(int posicao) throws PosicaoInexistenteException {
		try {
			return (Type)vetorFinito[posicao];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new PosicaoInexistenteException();
		}
	}
	
	
	
	
	
	
	
	
	
}
