import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TSE extends JFrame {
	
	private JLabel imagemDaciolo;
	private JButton votarDaciolo;
	private JLabel placarDaciolo;
	private JLabel imagemEymael;
	private JButton votarEymael;
	private JLabel placarEymael;
	private JButton reiniciar;
	
	private Votar votar;
	
	public TSE() {
		super("TSE");
		prepararJanela();
		organizarComponentes();
		organizarEventos();
		finalizar();	
	}
	
	private void prepararJanela() {
		setSize(750, 850);
		setLayout(new FlowLayout());
	}
	
	private void organizarComponentes() {
		imagemDaciolo = new JLabel(new ImageIcon("/home/anniasebold/Desktop/UFMS/poo-ufms/eclipse/AULA-3-6/imagens/daciolo.png"));
		votarDaciolo = new JButton("Glória a Deus");
		placarDaciolo = new JLabel("0");
		imagemEymael = new JLabel(new ImageIcon("/home/anniasebold/Desktop/UFMS/poo-ufms/eclipse/AULA-3-6/imagens/eymael.png"));
		votarEymael = new JButton("Democrata cristão");
		placarEymael = new JLabel("0");
		reiniciar = new JButton("Reiniciar");
		
		add(imagemDaciolo);
		add(votarDaciolo);
		add(placarDaciolo);
		add(imagemEymael);
		add(votarEymael);
		add(placarEymael);
		add(reiniciar);
	}
	
	private void organizarEventos() {
		votar = new Votar(votarDaciolo, votarEymael, placarDaciolo, placarEymael);
		votarDaciolo.addActionListener(votar);
		votarEymael.addActionListener(votar);
		
		reiniciar.addActionListener(
			(event) -> {
				placarDaciolo.setText("0");
				placarEymael.setText("0");
			}
		);
	}
	
	private void finalizar() {
		setVisible(true);
	}
}
