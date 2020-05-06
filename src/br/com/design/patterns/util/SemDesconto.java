package br.com.design.patterns.util;

import br.com.design.patterns.model.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		
	}

}
