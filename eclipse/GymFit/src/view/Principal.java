package view;

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
	private JMenuItem opcoesAluno;
	private JMenu equipamento;
	private JMenu instrutor;
	private JMenu sair;
	private JMenuItem exit;
	private JPanel telaSelecionada;
	private JButton voltar;
	private JMenuBar barraRodape;
	private JLabel status;
	
	Modalidade modalidadeView = new Modalidade();
	Aluno alunoView = new Aluno();

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
		opcoesAluno = new JMenuItem("Menu");
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
		modalidade.add(opcoesModalidade);
		barraTopo.add(aluno);
		aluno.add(opcoesAluno);
		barraTopo.add(equipamento);
		barraTopo.add(instrutor);
		barraTopo.add(sair);
		sair.add(exit);

		add(telaSelecionada);

		add(barraRodape, BorderLayout.PAGE_END);
		barraRodape.add(status);
	}

	private void organizarEventos() {
		opcoesModalidade.addActionListener((event) -> {
			alunoView.setVisible(false);
			telaSelecionada.add(modalidadeView);
			modalidadeView.setVisible(true);
		});

		opcoesAluno.addActionListener((event) -> {
			modalidadeView.setVisible(false);
			telaSelecionada.add(alunoView);
			alunoView.setVisible(true);
		});

		exit.addActionListener((event) -> {
			System.exit(0);
		});
	}

	private void finalizar() {
		setVisible(true);
	}

}
