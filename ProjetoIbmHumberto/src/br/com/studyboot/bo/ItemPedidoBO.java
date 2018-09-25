package br.com.studyboot.bo;


import br.com.studybot.beans.ItemPedido;
import br.com.studybot.dao.ItemPedidoDAO;
import br.com.studybot.dao.PedidoDAO;

/**
 * 
 * @author studyBot
 * @version 1.0
 * @see ItemPedidoBO, ItemPedido
 *
 */


public class ItemPedidoBO {
	
	/**
	 * 
	 * @param objPedido
	 * @return
	 * @throws Exception
	 * 
	 * Classe responsavel por manipular as regras relacionadas 
	 * ao itemPedido
	 * 
	 * Codigo n�o pode ser menor que < 0 (getCodigo)
	 * Numero do pedido n�o pode ser < 0 (getPedido)
	 * Valor pedido n�o pode ser  < 0 (getValor)
	 * Quantidade de intem vendido n�o pode ser < 0 
	 * 
	 */
	
	public static String detalheItemPedido(ItemPedido objPedido) throws Exception{
		
		if(objPedido.getCodigo() < 0) {
			return "Codigo invalido";
		}
		if(objPedido.getNumero() < 0) {
			return "Numero invalido";
		}
		if(objPedido.getValor() < 0) {
			return "Valor n�o pode ser 0";
		}
		if(objPedido.getQtVendida() < 0) {
			return "A quantidade vendida n�o pode ser 0";
		}
		 ItemPedidoDAO dao = new ItemPedidoDAO();
		 dao.adicionarItem(objPedido);
		 
		return null;
	}

}


//private int codigo;
//private double valor;
//private int numero;
//private int qtVendida;
//private Pedido pedido;
//private Curso curso;