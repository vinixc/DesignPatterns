package br.com.design.patterns.descontos;

import br.com.design.patterns.model.Orcamento;

public class SemDesconto extends TemplateDeDesconto{

	@Override
	protected double proximoDesconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	protected double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	protected boolean utilizaDesconto(Orcamento orcamento) {
		return true;
	}

}
