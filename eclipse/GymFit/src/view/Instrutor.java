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

import model.InstrutorDAO;
import model.InstrutorListagem;

public class Instrutor extends JPanel {
	private JLabel titulo;
	private JLabel nome;
	private JLabel valor;
	private JTextField inputNome;
	private JTextField inputFormacao;
	private JButton salvar;
	private JButton editar;
	private JButton excluir;
	private JButton selecionarLinha;
	
	private JTable tabelaModalidades = new JTable();
	InstrutorListagem listaInstrutores = new InstrutorListagem();

	String colunas[] = { "Nome", "Formação" };
	DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

	public Instrutor() {
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

		titulo = new JLabel("Menu de Instrutores");
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

		valor = new JLabel("Formação ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(valor, gbc);

		inputFormacao = new JTextField(30);
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(inputFormacao, gbc);

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
			String formacao = inputFormacao.getText();

			InstrutorDAO instrutor = new InstrutorDAO(nome, formacao);
			listaInstrutores.adicionar(instrutor);

			inputNome.setText("");
			inputFormacao.setText("");
			modelo.setRowCount(0);

			for (int i = 0; i < listaInstrutores.getSize(); i++) {
				Object[] lista = { listaInstrutores.getOne(i).getNome(), listaInstrutores.getOne(i).getFormacao() };

				modelo.addRow(lista);
			}
		});

		selecionarLinha.addActionListener((event) -> {
			int linhaSelecionada = tabelaModalidades.getSelectedRow();
			if (linhaSelecionada != -1) {
				inputNome.setText(tabelaModalidades.getValueAt(linhaSelecionada, 0).toString());
				inputFormacao.setText(tabelaModalidades.getValueAt(linhaSelecionada, 1).toString());
				editar.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Selecione um instrutor.");
			}
		});

		editar.addActionListener((event) -> {
			int linhaSelecionada = tabelaModalidades.getSelectedRow();

			String nome = inputNome.getText();
			String formacao = inputFormacao.getText();
			InstrutorDAO instrutorEditado = new InstrutorDAO(nome, formacao);

			inputNome.setText("");
			inputFormacao.setText("");

			listaInstrutores.editRegister(linhaSelecionada, instrutorEditado);

			tabelaModalidades.setValueAt(nome, linhaSelecionada, 0);
			tabelaModalidades.setValueAt(formacao, linhaSelecionada, 1);

		});

		excluir.addActionListener((event) -> {
			int linhaSelecionada = tabelaModalidades.getSelectedRow();
			if (linhaSelecionada != -1) {
				listaInstrutores.removeRegister(linhaSelecionada);
				modelo.removeRow(linhaSelecionada);
			} else {
				JOptionPane.showMessageDialog(null, "Selecione um instrutor para ser excluído.");
			}
		});

	}

	private void finalizar() {
		setVisible(true);
	}
}
