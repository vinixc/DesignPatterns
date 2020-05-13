package br.com.design.patterns.model;

public class ConcluiPedido implements Comando{
	
	private Pedido p;
	
	public ConcluiPedido(Pedido pedido) {
		p = pedido;
	}
	
	@Override
	public void executa() {
		System.out.println("Concluindo pedido do: " + p.getCliente());
		p.finaliza();
	}

}
