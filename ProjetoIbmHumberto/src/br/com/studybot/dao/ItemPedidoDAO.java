package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.studybot.beans.ItemPedido;
import br.com.studybot.conexao.Conexao;

public class ItemPedidoDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public ItemPedidoDAO() throws Exception {
		con = new Conexao().getConexao();
	}

	public String adicionarItem(ItemPedido item1) throws Exception {

		stmt = con.prepareStatement(
				" INSERT INTO T_STB_ITEM_PEDIDO (CD_ITEM_PEDIDO,VL_ITEM_PEDIDO,NR_ITEM,QT_VENDIDA,CD_PAGAMENTO,CD_PEDIDO,CD_CURSO"
						+ "VALUES(?,?,?,?,?,?,?");

		stmt.setInt(1, item1.getCodigo());
		stmt.setDouble(2, item1.getValor());
		stmt.setInt(3, item1.getNumero());
		stmt.setInt(4, item1.getQtVendida());
		stmt.setInt(5, item1.getPagamento().getCodigo());
		stmt.setInt(6, item1.getPedido().getCodigo());
		stmt.setInt(7, item1.getCurso().getCodigo());

		stmt.executeUpdate();

		return "Cadastrado com sucesso";
	}

}
