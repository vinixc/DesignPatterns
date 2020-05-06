package br.com.design.patterns.app;

import br.com.design.patterns.model.Item;
import br.com.design.patterns.model.Orcamento;
import br.com.design.patterns.util.CalculadorDeDesconto;

public class TestaDesconto {
	
	public static void main(String[] args) {
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(600.0);
		
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}
