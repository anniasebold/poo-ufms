package DAO;

import connection.Conexao;
import model.Modalidade;

public class ModalidadeDAO extends Conexao {
	
	public boolean salvarModalidade(Modalidade modalidade) {
		conectar();
		String sql = "INSERT INTO modalidades (nome, valor, instrutor_id)";
		desconectar();
		return true;
	}
}
