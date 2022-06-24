package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connection.Conexao;
import model.Instrutor;
import model.Modalidade;

public class ModalidadeDAO extends Conexao {
	
	public boolean salvarModalidade(Modalidade modalidade, int idInstrutor) {
		conectar();
		String sql = "INSERT INTO modalidades (nome, valor, instrutor_id) VALUES  (?, ?, ?)";
		PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		try {
			preparedStatement.setString(1, modalidade.getNome());
			preparedStatement.setDouble(2, modalidade.getValor());
			preparedStatement.setInt(3, modalidade.getIdinstrutor());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		try {
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		return true;
	}
	
	public ArrayList<Modalidade> listarModalidades() {
		conectar();
		
		ArrayList<Modalidade> listaModalidades = new ArrayList<>();
		String sql = "SELECT m.id, m.nome, m.valor, i.id, i.nome \n" + 
				"FROM modalidades m \n" + 
				"INNER JOIN instrutores i ON i.id = m.instrutor_id";		
		PreparedStatement preparedStatement = criarPreparedStatement(sql);
		
		try {
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Modalidade modalidade = new Modalidade();
				modalidade.setId(resultSet.getInt(1));
				modalidade.setNome(resultSet.getString(2));
				modalidade.setValor(resultSet.getDouble(3));
				modalidade.setIdinstrutor(resultSet.getInt(4));
				modalidade.setNomeInstrutor(resultSet.getString(5));
				listaModalidades.add(modalidade);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return listaModalidades;
	}
	
	public boolean removerModalidade(int id) {
		conectar();
		
		String sql = "DELETE FROM modalidades WHERE id = '" + id + "'";
		PreparedStatement preparedStatement = criarPreparedStatement(sql);
		
		try {
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		desconectar();
		
		return true;
	}
}
