package telas;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Entidades.Corrida;

public class Janela extends JFrame {
	private JMenuBar menuBar;
	private JMenu menu;
	private JLabel status;
	
	private ArrayList<Tela> telas;
	private Tela telaAtual;
	
	// TODO Atualizar
	private JMenuItem menuListarCorridas, menuAdicionarCorrida;
	// TODO Atualizar
	private ArrayList<Corrida> corridas;
	
	public Janela() {
		super("Teste");
		setLayout(new BorderLayout());
		
		configuraVetoresDeEntidades();
		
		configuraMenuStatus();
		
		configuraTelas(); 
		
		configuraListeners();
		
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void configuraVetoresDeEntidades() {
		corridas = new ArrayList<Corrida>();
		
		// TODO Atualizar
		// Valores iniciais
		corridas.add(new Corrida("Volta das nações", 100, 6));
		corridas.add(new Corrida("Volta dos idosos", 500, 3));
	}
	
	private void configuraMenuStatus() {
		menuBar = new JMenuBar();
		menu = new JMenu("Corrida");
		
		// TODO Atualizar
		menuListarCorridas = new JMenuItem("Listar");
		menuAdicionarCorrida = new JMenuItem("Adicionar");
		menu.add(menuListarCorridas);
		menu.add(menuAdicionarCorrida);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		status = new JLabel("Status");
		add(status, BorderLayout.SOUTH);
	}
	
	private void configuraTelas() {
		telas = new ArrayList<Tela>();
			
		// TODO Atualizar
		telas.add(new TelaListarCorridas(menuListarCorridas, corridas));
		telas.add(new TelaCadastrarCorrida(menuAdicionarCorrida, corridas));
	}

	private void configuraListeners() {
		ActionListener listenerPadrao = (e) -> {
			if(telaAtual != null)
				remove(telaAtual.getTela());
			
			for(int i = 0 ; i < telas.size() ; i++) {
				if(telas.get(i).getSource().equals(e.getSource())) {
					telaAtual = telas.get(i);
					break;
				}
			}
			add(telaAtual.getTela(), BorderLayout.CENTER);
			status.setText(telaAtual.getMensagemStatus());
			setVisible(true);
		};
		
		// TODO Atualizar
		menuListarCorridas.addActionListener(listenerPadrao);
		menuAdicionarCorrida.addActionListener(listenerPadrao);
	}

}
