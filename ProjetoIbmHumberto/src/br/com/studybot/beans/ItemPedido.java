package br.com.studybot.beans;

public class ItemPedido {

	private int codigo;
	private double valor;
	private int numero;
	private int qtVendida;
	private Pedido pedido;
	private Curso curso;
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQtVendida() {
		return qtVendida;
	}
	public void setQtVendida(int qtVendida) {
		this.qtVendida = qtVendida;
	}
	public Pagamento getPagamento() {
		return getPagamento();
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
