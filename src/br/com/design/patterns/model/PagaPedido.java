package br.com.design.patterns.model;

public class PagaPedido implements Comando{
	
	private Pedido p;
	
	public PagaPedido(Pedido pedido) {
		p = pedido;
	}
	
	@Override
	public void executa() {
		System.out.println("Pagando pedido do: " + p.getCliente());
		p.paga();
	}

}
