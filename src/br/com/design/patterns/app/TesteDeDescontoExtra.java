package br.com.design.patterns.app;

import br.com.design.patterns.model.Orcamento;

public class TesteDeDescontoExtra {
	
	public static void main(String[] args) {
		
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		reforma.aprova();
		reforma.aplicaDescontoExtra();
		
		reforma.finaliza();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}

}
