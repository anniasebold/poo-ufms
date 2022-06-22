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

import controller.EquipamentoListagem;
import model.Equipamento;

public class EquipamentoView extends JPanel {

	private JLabel titulo;
	private JLabel nome;
	private JLabel musculoTrab;
	private JLabel estado;
	private JTextField inputNome;
	private JTextField inputMusculoTrab;
	private JTextField inputEstado;
	private JButton salvar;
	private JButton editar;
	private JButton excluir;
	private JButton selecionarLinha;

	private JTable tabelaEquipamentos = new JTable();
	EquipamentoListagem listaEquipamentos = new EquipamentoListagem();

	String colunas[] = { "Nome", "Músculo Trabalhado", "Estado" };
	DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

	public EquipamentoView() {
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

		titulo = new JLabel("Menu de Equipamento");
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

		musculoTrab = new JLabel("Músculo Trabalhado ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(musculoTrab, gbc);
		
		inputMusculoTrab = new JTextField(30);
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(inputMusculoTrab, gbc);

		estado = new JLabel("Estado ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(estado, gbc);

		inputEstado = new JTextField(30);
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(inputEstado, gbc);

		salvar = new JButton("Salvar");
		gbc.gridx = 1;
		gbc.gridy = 4;
		add(salvar, gbc);

		selecionarLinha = new JButton("Selecionar Registro");
		gbc.gridx = 1;
		gbc.gridy = 5;
		add(selecionarLinha, gbc);

		editar = new JButton("Editar");
		gbc.gridx = 1;
		gbc.gridy = 6;
		add(editar, gbc);
		editar.setVisible(false);

		excluir = new JButton("Excluir");
		gbc.gridx = 1;
		gbc.gridy = 7;
		add(excluir, gbc);

		tabelaEquipamentos.setModel(modelo);
		tabelaEquipamentos.setVisible(true);

		gbc.gridx = 1;
		gbc.gridy = 9;
		add(new JScrollPane(tabelaEquipamentos), gbc);

	}
	
	private void organizarEventos() {
		salvar.addActionListener((event) -> {
			String nome = inputNome.getText();
			String musculoTrab = inputMusculoTrab.getText();
			String estado = inputEstado.getText();

			Equipamento equipamento = new Equipamento(nome, musculoTrab, estado);
			listaEquipamentos.adicionar(equipamento);

			inputNome.setText("");
			inputMusculoTrab.setText("");
			inputEstado.setText("");
			modelo.setRowCount(0);

			for (int i = 0; i < listaEquipamentos.getSize(); i++) {
				Object[] lista = { 
						listaEquipamentos.getOne(i).getNome(), 
						listaEquipamentos.getOne(i).getMusculoTrab(), 
						listaEquipamentos.getOne(i).getEstado(), 
				};

				modelo.addRow(lista);
			}
		});

		selecionarLinha.addActionListener((event) -> {
			int linhaSelecionada = tabelaEquipamentos.getSelectedRow();
			if (linhaSelecionada != -1) {
				inputNome.setText(tabelaEquipamentos.getValueAt(linhaSelecionada, 0).toString());
				inputMusculoTrab.setText(tabelaEquipamentos.getValueAt(linhaSelecionada, 1).toString());
				inputEstado.setText(tabelaEquipamentos.getValueAt(linhaSelecionada, 2).toString());
				editar.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Selecione um equipamento.");
			}
		});

		editar.addActionListener((event) -> {
			int linhaSelecionada = tabelaEquipamentos.getSelectedRow();

			String nome = inputNome.getText();
			String musculoTrab = inputMusculoTrab.getText();
			String estado = inputEstado.getText();
			Equipamento equipamentoEditado = new Equipamento(nome, musculoTrab, estado);

			inputNome.setText("");
			inputMusculoTrab.setText("");
			inputEstado.setText("");

			listaEquipamentos.editRegister(linhaSelecionada, equipamentoEditado);

			tabelaEquipamentos.setValueAt(nome, linhaSelecionada, 0);
			tabelaEquipamentos.setValueAt(musculoTrab, linhaSelecionada, 1);
			tabelaEquipamentos.setValueAt(estado, linhaSelecionada, 2);

		});

		excluir.addActionListener((event) -> {
			int linhaSelecionada = tabelaEquipamentos.getSelectedRow();
			if (linhaSelecionada != -1) {
				listaEquipamentos.removeRegister(linhaSelecionada);
				modelo.removeRow(linhaSelecionada);
			} else {
				JOptionPane.showMessageDialog(null, "Selecione um equipamento para ser excluído.");
			}
		});
		
	}

	private void finalizar() {
		setVisible(true);
	}
}
