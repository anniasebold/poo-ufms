package gymFit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class Principal extends JFrame {
	
	private JMenuBar barraTopo;
	private JMenu modalidade;
	private JMenuItem opcoesModalidade;
	private JMenu aluno;
	private JMenu equipamento;
	private JMenu instrutor;
	private JMenu sair;
	private JMenuItem exit;
	private JPanel telaSelecionada;
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
		setTitle("GymFit");
		setSize(750, 750);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void organizarComponentes() {
		barraTopo = new JMenuBar();
		modalidade = new JMenu("Modalidade");
		opcoesModalidade = new JMenuItem("Menu");
		aluno = new JMenu("Aluno");
		equipamento = new JMenu("Equipamento");
		instrutor = new JMenu("Instrutor");
		sair = new JMenu("Sair");
		exit = new JMenuItem("Exit");
		telaSelecionada = new JPanel();
		barraRodape = new JMenuBar();
		status = new JLabel("Status: ");
		
		this.setJMenuBar(barraTopo);
		this.setJMenuBar(barraRodape);
		
		
		add(barraTopo, BorderLayout.PAGE_START);
		barraTopo.add(modalidade);
		barraTopo.add(aluno);
		barraTopo.add(equipamento);
		barraTopo.add(instrutor);
		barraTopo.add(sair);
		modalidade.add(opcoesModalidade);
		sair.add(exit);
		
		add(telaSelecionada);
		
		add(barraRodape, BorderLayout.PAGE_END);
		barraRodape.add(status);
	}
	
	private void organizarEventos() {
		opcoesModalidade.addActionListener(
				(event) -> {
					Modalidade modalidade = new Modalidade();
					telaSelecionada.add(modalidade);
		});
		
		exit.addActionListener(
			(event) -> {
				this.setVisible(false);
		});
	}
	
	private void finalizar() {
		setVisible(true);
	}
	
}
