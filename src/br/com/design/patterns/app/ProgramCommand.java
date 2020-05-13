package br.com.design.patterns.app;

import br.com.design.patterns.model.ConcluiPedido;
import br.com.design.patterns.model.FilaDeTrabalho;
import br.com.design.patterns.model.PagaPedido;
import br.com.design.patterns.model.Pedido;

public class ProgramCommand {
	
	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido("Vinicius", 500);
		Pedido pedido2 = new Pedido("Yasmin", 150.0);
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new ConcluiPedido(pedido1));
		
		fila.processa();
		
	}

}
