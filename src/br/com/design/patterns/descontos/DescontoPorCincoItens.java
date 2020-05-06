package br.com.design.patterns.descontos;

import br.com.design.patterns.model.Orcamento;

public class DescontoPorCincoItens extends TemplateDeDesconto{
	
	public DescontoPorCincoItens() {
		this.proximoDesconto = new DescontoPorMaisDeQuinhentosReais();
	}
	
	@Override
	protected double proximoDesconto(Orcamento orcamento) {
		return proximoDesconto.desconta(orcamento);
	}

	@Override
	protected double desconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected boolean utilizaDesconto(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}
}
