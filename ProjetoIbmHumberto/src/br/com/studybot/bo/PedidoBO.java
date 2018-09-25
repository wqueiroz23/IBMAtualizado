package br.com.studybot.bo;


import br.com.studybot.beans.Pedido;

public class PedidoBO {
	
	public static String entradaPedido(Pedido objPedido) throws Exception{
		
		if(objPedido.getCodigo() < 1) {
			return "Código invalido";
		}
		
		if(objPedido.getData().length() < 10  &&  objPedido.getData().length() > 10) {
			return "Data invalida, digite DD/MM/AAAA";
			
		}
		
		if(objPedido.getAluno().getCdAluno() < 0) {
			return "Codigo aluno invalido";
		}
		
		if(objPedido.getValor() < 0) {
			return "Valor invalido";
		}
		
		
		return null;
	}

}

