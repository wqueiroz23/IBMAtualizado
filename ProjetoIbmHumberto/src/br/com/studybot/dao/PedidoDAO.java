package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.studybot.beans.Pedido;
import br.com.studybot.conexao.Conexao;

public class PedidoDAO {

	private Connection conexao;
	private PreparedStatement stmt;
	private ResultSet rs;

	public PedidoDAO() throws Exception {
		conexao = new Conexao().getConexao();
	}

	public String fechar() throws Exception {

		conexao.close();
		return "fechou";
	}

	public String adicionar(Pedido p) throws Exception {

		stmt = conexao.prepareStatement("INSERT INTO T_STB_PEDIDO(CD_PEDIDO,DT_PEDIDO,VL_TOTAL_PEDIDO,CD_PAGAMENTO,CD_ALUNO) VALUES (?,?,?,?,?)");
		stmt.setInt(1, p.getCodigo());
		stmt.setString(2, p.getData());
		stmt.setDouble(3, p.getValor());
		stmt.setInt(4, p.getPagamento().getCodigo());
		stmt.setInt(5, p.getAluno().getCdAluno());

		stmt.executeUpdate();
		return "Cadastrado com sucesso";
	}

}
