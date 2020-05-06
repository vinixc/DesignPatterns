package br.com.design.patterns.descontos;

import br.com.design.patterns.model.Orcamento;

public abstract class TemplateDeDesconto implements Desconto{
	
	protected Desconto proximoDesconto;

	@Override
	public final double desconta(Orcamento orcamento) {
		if(utilizaDesconto(orcamento)) {
			return desconto(orcamento);
		}
		return proximoDesconto(orcamento);
	}

	protected abstract double proximoDesconto(Orcamento orcamento);

	protected abstract double desconto(Orcamento orcamento);

	protected abstract boolean utilizaDesconto(Orcamento orcamento);

}
