package gymFit;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Modalidade extends JFrame {
	
	private JLabel titulo;
	
	
	public Modalidade() {
		prepararJanela();
		organizarComponentes();
		organizarEventos();
		finalizar();
	}
	
	public void prepararJanela() {
		setLayout(new BorderLayout());
	}
	
	private void organizarComponentes() {
		titulo = new JLabel("Cadastro de Modalidades");
		
		add(titulo);
	}
	
	private void organizarEventos() {
		
	} 
	
	public void finalizar() {
		setVisible(true);
	}
}
