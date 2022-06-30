package telas;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Entidades.Corrida;

public class TelaListarCorridas implements Tela {
	private JMenuItem botaoOrigem;
	private JPanel tela;
	private ArrayList<Corrida> corridasAtual;
	private ArrayList<Corrida> ultimasCorridasListadas;
	
	public TelaListarCorridas(JMenuItem botaoOrigem, ArrayList<Corrida> corridas) {
		this.botaoOrigem = botaoOrigem;
		this.corridasAtual = corridas;
		tela = new JPanel();
		tela.setLayout(new BoxLayout(tela, BoxLayout.Y_AXIS));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public JPanel getTela() {
		if(!corridasAtual.equals(ultimasCorridasListadas)) {
			ultimasCorridasListadas = (ArrayList<Corrida>)corridasAtual.clone();
			
			tela.removeAll();
			
			for(int i = 0 ; i < ultimasCorridasListadas.size() ; i++) 
				tela.add(new JLabel(ultimasCorridasListadas.get(i).toString()));
		}
		
		return tela;
	}

	@Override
	public JMenuItem getSource() {
		return botaoOrigem;
	}

	@Override
	public String getMensagemStatus() {
		return "Listando Corridas...";
	}
}
