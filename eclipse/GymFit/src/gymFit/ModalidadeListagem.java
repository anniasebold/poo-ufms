package gymFit;

import java.util.ArrayList;

public class ModalidadeListagem {
	private ArrayList<ModalidadeDTO> listaModalidades;
	
	public ModalidadeListagem() {
		listaModalidades = new ArrayList<ModalidadeDTO>();
	}
	
	public void adicionar(ModalidadeDTO modalidade) {
		listaModalidades.add(modalidade);
	}
	
	public ModalidadeDTO getOne(int posicao) {
		return listaModalidades.get(posicao);
	}
	
	public int getSize() {
		return listaModalidades.size();
	}
	
	public void removeRegister(int posicao) {
		listaModalidades.remove(posicao);
	}
	
}
