package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

import model.ModalidadeListagem;
import model.ModalidadeDAO;

public class Modalidade extends JPanel {

	private JLabel titulo;
	private JLabel nome;
	private JLabel valor;
	private JTextField inputNome;
	private JTextField inputValor;
	private JButton salvar;
	private JButton editar;
	private JButton excluir;
	private JButton selecionarLinha;
	
	private JTable tabelaModalidades = new JTable();
	ModalidadeListagem listaModalidades = new ModalidadeListagem();

	String colunas[] = { "Nome", "Valor" };
	DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

	public Modalidade() {
		prepararJanela();
		organizarComponentes();
		organizarEventos();
//		finalizar();
	}

	public void prepararJanela() {
		setLayout(new GridBagLayout());
	}

	private void organizarComponentes() {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5, 5, 5, 5);

		titulo = new JLabel("Menu de Modalidades");
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(titulo, gbc);

		nome = new JLabel("Nome ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(nome, gbc);

		inputNome = new JTextField(30);
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(inputNome, gbc);

		valor = new JLabel("Valor ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(valor, gbc);

		inputValor = new JTextField(30);
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(inputValor, gbc);

		salvar = new JButton("Salvar");
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(salvar, gbc);

		selecionarLinha = new JButton("Selecionar Registro");
		gbc.gridx = 1;
		gbc.gridy = 4;
		add(selecionarLinha, gbc);
		
		editar = new JButton("Editar");
		gbc.gridx = 1;
		gbc.gridy = 5;
		add(editar, gbc);
		editar.setVisible(false);

		excluir = new JButton("Excluir");
		gbc.gridx = 1;
		gbc.gridy = 6;
		add(excluir, gbc);

		tabelaModalidades.setModel(modelo);
		tabelaModalidades.setVisible(true);

		gbc.gridx = 1;
		gbc.gridy = 9;
		add(new JScrollPane(tabelaModalidades), gbc);

	}

	private void organizarEventos() {
		salvar.addActionListener((event) -> {
			String nome = inputNome.getText();
			double valor = Double.parseDouble(inputValor.getText());

			ModalidadeDAO modalidade = new ModalidadeDAO(nome, valor);
			listaModalidades.adicionar(modalidade);

			inputNome.setText("");
			inputValor.setText("");
			modelo.setRowCount(0);

			for (int i = 0; i < listaModalidades.getSize(); i++) {
				Object[] lista = { listaModalidades.getOne(i).getNome(), listaModalidades.getOne(i).getValor() };

				modelo.addRow(lista);
			}
		});

		selecionarLinha.addActionListener((event) -> {
			int linhaSelecionada = tabelaModalidades.getSelectedRow();
			if (linhaSelecionada != -1) {
				inputNome.setText(tabelaModalidades.getValueAt(linhaSelecionada, 0).toString());
				inputValor.setText(tabelaModalidades.getValueAt(linhaSelecionada, 1).toString());
				editar.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Seleciona uma modalidade para ser selecionada.");
			}
		});

		editar.addActionListener((event) -> {
			int linhaSelecionada = tabelaModalidades.getSelectedRow();

			String nome = inputNome.getText();
			double valor = Double.parseDouble(inputValor.getText());
			ModalidadeDAO modalidadeEditada = new ModalidadeDAO(nome, valor);

			inputNome.setText("");
			inputValor.setText("");

			listaModalidades.editRegister(linhaSelecionada, modalidadeEditada);

			tabelaModalidades.setValueAt(nome, linhaSelecionada, 0);
			tabelaModalidades.setValueAt(valor, linhaSelecionada, 1);

		});

		excluir.addActionListener((event) -> {
			int linhaSelecionada = tabelaModalidades.getSelectedRow();
			if (linhaSelecionada != -1) {
				listaModalidades.removeRegister(linhaSelecionada);
				modelo.removeRow(linhaSelecionada);
			} else {
				JOptionPane.showMessageDialog(null, "Seleciona uma modalidade para ser excluída.");
			}
		});

	}

	private void finalizar() {
		setVisible(true);
	}
}
