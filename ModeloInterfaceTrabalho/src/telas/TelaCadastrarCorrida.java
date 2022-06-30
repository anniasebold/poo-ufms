package telas;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Entidades.Corrida;

public class TelaCadastrarCorrida implements Tela {
	private JPanel tela;
	private JMenuItem botaoOrigem;
	private JPanel cadastrarNome;
	private JTextField nome;
	private JPanel cadastrarMaximoCorredores;
	private JTextField maximoCorredores;
	private JPanel cadastrarKm;
	private JTextField km;
	private JButton salvar;
	private ArrayList<Corrida> corridas;
	
	public TelaCadastrarCorrida(JMenuItem botaoOrigem, ArrayList<Corrida> corridas) {
		this.botaoOrigem = botaoOrigem;
		this.corridas = corridas;
		tela = new JPanel();
		tela.setLayout(new BoxLayout(tela, BoxLayout.Y_AXIS));
		
		nome = new JTextField(40);
		cadastrarNome = new JPanel();
		cadastrarNome.setLayout(new FlowLayout());
		cadastrarNome.add(new JLabel("Nome da corrida"));
		cadastrarNome.add(nome);
		tela.add(cadastrarNome);

		maximoCorredores = new JTextField(40);
		cadastrarMaximoCorredores = new JPanel();
		cadastrarMaximoCorredores.setLayout(new FlowLayout());
		cadastrarMaximoCorredores.add(new JLabel("Máximo de corredores"));
		cadastrarMaximoCorredores.add(maximoCorredores);
		tela.add(cadastrarMaximoCorredores);
		
		km = new JTextField(40);
		cadastrarKm = new JPanel();
		cadastrarKm.setLayout(new FlowLayout());
		cadastrarKm.add(new JLabel("KM"));
		cadastrarKm.add(km);
		tela.add(cadastrarKm);
		
		salvar = new JButton("Salvar");
		salvar.addActionListener((e) -> {
			try {
				corridas.add(new Corrida(nome.getText(), Integer.parseInt(maximoCorredores.getText()), Integer.parseInt(km.getText())));
				JOptionPane.showMessageDialog(null, "Corrida salva com sucesso");
			}
			catch(Exception exception) {
				JOptionPane.showMessageDialog(null, "Parâmetros inválidos para a corrida!");
			}
		});
		tela.add(salvar);
		
	}
	
	@Override
	public JPanel getTela() {
		return tela;
	}

	@Override
	public JMenuItem getSource() {
		return botaoOrigem;
	}

	@Override
	public String getMensagemStatus() {
		return "Cadastrando uma nova corrida...";
	}

}
