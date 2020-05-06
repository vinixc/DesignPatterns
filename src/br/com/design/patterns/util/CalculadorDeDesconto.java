package br.com.design.patterns.util;

import br.com.design.patterns.descontos.Desconto;
import br.com.design.patterns.descontos.DescontoPorCincoItens;
import br.com.design.patterns.descontos.DescontoPorMaisDeQuinhentosReais;
import br.com.design.patterns.descontos.SemDesconto;
import br.com.design.patterns.model.Orcamento;

public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		return d1.desconta(orcamento);
	}
}
