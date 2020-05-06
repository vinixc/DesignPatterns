package br.com.design.patterns.util;

import br.com.design.patterns.descontos.Desconto;
import br.com.design.patterns.descontos.DescontoPorCincoItens;
import br.com.design.patterns.model.Orcamento;

public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		
		return d1.desconta(orcamento);
	}
}
