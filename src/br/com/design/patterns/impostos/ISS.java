package br.com.design.patterns.impostos;

import br.com.design.patterns.model.Orcamento;

public class ISS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
