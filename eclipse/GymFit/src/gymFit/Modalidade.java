package gymFit;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Modalidade extends JPanel {
	
	private JLabel titulo;
	private JButton cadastroMenu;
	private JButton listagemMenu;
	private JPanel cadastro;
	private JLabel nome;
	private JLabel tipo;
	private JTextField inputNome;
	private JTextField inputTipo;
	private JButton salvar;
	private JButton editar;
	public ModalidadeDTO modalidades = new ArrayList<ModalidadeDTO>;
	
	
	public Modalidade() {
		prepararJanela();
		organizarComponentes();
		organizarEventos();
		finalizar();
	}
	
	public void prepararJanela() {
		setLayout(new GridBagLayout());
	}
	
	private void organizarComponentes() {
		GridBagConstraints gbc  = new GridBagConstraints();
		titulo = new JLabel("Menu de Modalidades");
		nome = new JLabel("Nome ");
		tipo = new JLabel("Tipo");
		inputNome = new JTextField(30);
		inputTipo = new JTextField(30);
		salvar = new JButton("Salvar");
		editar = new JButton("Editar");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5,5,5,5);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(titulo, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(nome, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(inputNome, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(tipo, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(inputTipo, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(salvar, gbc);
		
//		gbc.gridx = 2;
//		gbc.gridy = 3;
//		add(editar, gbc);
		
	}
	
	private void organizarEventos() {
		salvar.addActionListener(
				(event) -> {
					
		});
	} 
	
	private void finalizar() {
		setVisible(true);
	}
}
