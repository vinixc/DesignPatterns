package br.com.design.patterns.impostos;

import br.com.design.patterns.model.Orcamento;

public class ICMS implements Imposto{
	
	 final double valorFixo = 50.00;
	
	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + valorFixo;
	}

}
