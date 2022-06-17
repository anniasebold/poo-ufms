package gymFit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import java.awt.BorderLayout;

public class Principal extends JFrame {
	
	private JMenuBar barraTopo;
	private JButton academia;
	private JButton aluno;
	private JButton equipamento;
	private JButton instrutor;
	private JMenuBar barraRodape;
	private JLabel status;
		
	public Principal() {
		super("Principal");
		prepararJanela();
		organizarComponentes();
		finalizar();
	}
	
	private void prepararJanela() {
		setSize(750, 850);
		setLayout(new BorderLayout());
	}
	
	private void organizarComponentes() {
		barraTopo = new JMenuBar();
		academia = new JButton("Academia");
		aluno = new JButton("Aluno");
		equipamento = new JButton("Equipamento");
		instrutor = new JButton("Instrutor");
		status = new JLabel("Status: ");
		barraRodape = new JMenuBar();
		
		this.setJMenuBar(barraTopo);
		this.setJMenuBar(barraRodape);
		
		
		add(barraTopo, BorderLayout.NORTH);
		barraTopo.add(academia);
		barraTopo.add(aluno);
		barraTopo.add(equipamento);
		barraTopo.add(instrutor);
		
		add(barraRodape, BorderLayout.SOUTH);
		barraRodape.add(status);
		
	}
	
	private void finalizar() {
		setVisible(true);
	}
	
}
