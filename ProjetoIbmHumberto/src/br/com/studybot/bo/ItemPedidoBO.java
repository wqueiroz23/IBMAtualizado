package br.com.studybot.bo;


import br.com.studybot.beans.ItemPedido;

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
	 * Classe responsável por manipular as regras relacionadas 
	 * ao itemPedido
	 * 
	 * Código não pode ser menor que < 0 (getCodigo)
	 * Número do pedido não pode ser < 0 (getPedido)
	 * Valor pedido não pode ser  < 0 (getValor)
	 * Quantidade de intem vendido não pode ser < 0 
	 * 
	 */
	
	public static String detalheItemPedido(ItemPedido objPedido) throws Exception{
		
		if(objPedido.getCodigo() < 0) {
			return "Código invalido";
		}
		if(objPedido.getNumero() < 0) {
			return "Número invalido";
		}
		if(objPedido.getValor() < 0) {
			return "Valor não pode ser 0";
		}
		if(objPedido.getQtVendida() < 0) {
			return "A quantidade vendida não pode ser 0";
		}
		
		
		
		return null;
	}

}


//private int codigo;
//private double valor;
//private int numero;
//private int qtVendida;
//private Pedido pedido;
//private Curso curso;