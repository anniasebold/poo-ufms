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

import controller.InstrutorListagem;
import controller.ModalidadeListagem;
import model.Instrutor;
import model.Modalidade;

public class ModalidadeView extends JPanel {

	private JLabel titulo;
	private JLabel nome;
	private JLabel valor;
	private JLabel nomeInstrutor;
	private JTextField inputNome;
	private JTextField inputValor;
	private JTextField inputInstrutor;
	private JButton salvar;
	private JButton editar;
	private JButton excluir;
	private JButton selecionarLinha;

	private JTable tabelaModalidades = new JTable();
	ModalidadeListagem listaModalidades;
	InstrutorListagem listaInstrutores;

	String colunas[] = { "Nome", "Valor", "Nome Instrutor" };
	DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

	public ModalidadeView(ModalidadeListagem listaModalidades, InstrutorListagem listaInstrutores) {
		prepararJanela();
		organizarComponentes();
		organizarEventos();
		this.listaModalidades = listaModalidades;
		this.listaInstrutores = listaInstrutores;
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

		nomeInstrutor = new JLabel("Nome Instrutor ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(nomeInstrutor, gbc);

		inputInstrutor = new JTextField(30);
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(inputInstrutor, gbc);

		salvar = new JButton("Salvar");
		gbc.gridx = 1;
		gbc.gridy = 4;
		add(salvar, gbc);

		selecionarLinha = new JButton("Selecionar Registro");
		gbc.gridx = 1;
		gbc.gridy = 5;
		add(selecionarLinha, gbc);

		excluir = new JButton("Excluir");
		gbc.gridx = 1;
		gbc.gridy = 6;
		add(excluir, gbc);

		tabelaModalidades.setModel(modelo);
		tabelaModalidades.setVisible(true);

		gbc.gridx = 1;
		gbc.gridy = 7;
		add(new JScrollPane(tabelaModalidades), gbc);
		
		editar = new JButton("Editar");
		gbc.gridx = 1;
		gbc.gridy = 8;
		add(editar, gbc);
		editar.setVisible(false);

	}

	private Object organizarEventos() {
		salvar.addActionListener((event) -> {
			if (inputNome.getText().isEmpty() || inputValor.getText().isEmpty() || inputInstrutor.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
				return;
			}
			
			if(listaInstrutores.getSize() <= 0) {
				JOptionPane.showMessageDialog(null, "Cadastre ao menos um instrutor para atrelá-lo a uma modalidade.");
				return;
			}

			String nome = inputNome.getText();
			double valor = Double.parseDouble(inputValor.getText());
			String nomeInstrutor = inputInstrutor.getText();
			
			
			for (int y = 0; y < listaInstrutores.getSize(); y++) {
				System.out.println(listaInstrutores.getOne(y).getNome());
				if (nomeInstrutor.equals(listaInstrutores.getOne(y).getNome())) {
					Instrutor instrutor = listaInstrutores.getOne(y);
					Modalidade modalidade = new Modalidade(nome, valor, instrutor);
					listaModalidades.adicionar(modalidade);
				} else {
					JOptionPane.showMessageDialog(null, "Digite um nome de instrutor válido.");
					return;
				}
			}

			modelo.setRowCount(0);

			for (int i = 0; i < listaModalidades.getSize(); i++) {
				Object[] lista = { listaModalidades.getOne(i).getNome(), listaModalidades.getOne(i).getValor(),
						listaModalidades.getOne(i).getInstrutor().getNome() };

				modelo.addRow(lista);
			}

			inputNome.setText("");
			inputValor.setText("");
			inputInstrutor.setText("");
		});

		selecionarLinha.addActionListener((event) -> {
			int linhaSelecionada = tabelaModalidades.getSelectedRow();
			if (linhaSelecionada != -1) {
				inputNome.setText(tabelaModalidades.getValueAt(linhaSelecionada, 0).toString());
				inputValor.setText(tabelaModalidades.getValueAt(linhaSelecionada, 1).toString());
				inputInstrutor.setText(tabelaModalidades.getValueAt(linhaSelecionada, 2).toString());
				editar.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Selecione uma modalidade.");
			}
		});

		editar.addActionListener((event) -> {
			if (inputNome.getText().isEmpty() || inputValor.getText().isEmpty() || inputInstrutor.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
				return;
			}

			int linhaSelecionada = tabelaModalidades.getSelectedRow();

			String nome = inputNome.getText();
			double valor = Double.parseDouble(inputValor.getText());
			String nomeInstrutor = inputInstrutor.getText();

			for (int y = 0; y < listaInstrutores.getSize(); y++) {
				System.out.println(listaInstrutores.getOne(y).getNome());
				if (nomeInstrutor.equals(listaInstrutores.getOne(y).getNome())) {
					Instrutor instrutor = listaInstrutores.getOne(y);
					Modalidade modalidadeEditada = new Modalidade(nome, valor, instrutor);

					listaModalidades.editRegister(linhaSelecionada, modalidadeEditada);
				} else {
					JOptionPane.showMessageDialog(null, "Digite um nome de instrutor válido.");
					return;
				}
			}
			
			tabelaModalidades.setValueAt(nome, linhaSelecionada, 0);
			tabelaModalidades.setValueAt(valor, linhaSelecionada, 1);
			tabelaModalidades.setValueAt(nomeInstrutor, linhaSelecionada, 2);

			inputNome.setText("");
			inputValor.setText("");
			inputInstrutor.setText("");

			editar.setVisible(false);
		});

		excluir.addActionListener((event) -> {
			int linhaSelecionada = tabelaModalidades.getSelectedRow();
			if (linhaSelecionada != -1) {
				listaModalidades.removeRegister(linhaSelecionada);
				modelo.removeRow(linhaSelecionada);
			} else {
				JOptionPane.showMessageDialog(null, "Selecione uma modalidade para ser excluída.");
				return;
			}
		});
		return null;

	}

	private void finalizar() {
		setVisible(true);
	}
}
