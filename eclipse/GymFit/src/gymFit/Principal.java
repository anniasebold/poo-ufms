package gymFit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class Principal extends JFrame {
	
	private JMenuBar barraTopo;
	private JButton modalidade;
	private JButton aluno;
	private JButton equipamento;
	private JButton instrutor;
	private JFrame telaSelecionada;
	private JButton sair;
	private JMenuBar barraRodape;
	private JLabel status;
		
	public Principal() {
		super("Principal");
		prepararJanela();
		organizarComponentes();
		organizarEventos();
		finalizar();
	}
	
	private void prepararJanela() {
		setSize(750, 850);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void organizarComponentes() {
		barraTopo = new JMenuBar();
		modalidade = new JButton("Modalidade");
		aluno = new JButton("Aluno");
		equipamento = new JButton("Equipamento");
		instrutor = new JButton("Instrutor");
		telaSelecionada = new JFrame();
		sair = new JButton("Sair");
		status = new JLabel("Status: ");
		barraRodape = new JMenuBar();
		
		this.setJMenuBar(barraTopo);
		this.setJMenuBar(barraRodape);
		
		
		add(barraTopo, BorderLayout.NORTH);
		barraTopo.add(modalidade);
		barraTopo.add(aluno);
		barraTopo.add(equipamento);
		barraTopo.add(instrutor);
		barraTopo.add(sair);
		
		add(telaSelecionada, BorderLayout.CENTER);
		
		add(barraRodape, BorderLayout.SOUTH);
		barraRodape.add(status);
		
	}
	
	private void organizarEventos() {
		modalidade.addActionListener(
				(event) -> {
					Modalidade modalidade = new Modalidade();
					telaSelecionada.add(modalidade);
		});
		
		sair.addActionListener(
			(event) -> {
				setVisible(false);
		});
	}
	
	private void finalizar() {
		setVisible(true);
	}
	
}
