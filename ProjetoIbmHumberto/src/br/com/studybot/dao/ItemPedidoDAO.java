package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.studybot.beans.Aula;
import br.com.studybot.beans.Disciplina;
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
	public int excluirItemPedido(ItemPedido item) throws Exception {
		stmt = con.prepareStatement("DELETE FROM T_STB_ITEM_PEDIDO WHERE CD_ITEM_PEDIDO=?");
		stmt.setInt(1,item.getCodigo() );
		return stmt.executeUpdate();
	}
	
	public List<ItemPedido>MostrarItems(int codigo)throws Exception{
		List<ItemPedido>lista=new ArrayList<ItemPedido>();
		stmt=con.prepareStatement("SELECT * FROM T_STB_ITEM_PEDIDO WHERE CD_ITEM_PEDIDO LIKE ?");
		
		stmt
		
		
		
	}
	
	
	
	

	
}
