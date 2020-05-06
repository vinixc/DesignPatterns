package br.com.design.patterns.descontos;

import br.com.design.patterns.model.Orcamento;

public class DescontoPorMaisDeQuinhentosReais  extends TemplateDeDesconto{
	
	public DescontoPorMaisDeQuinhentosReais() {
		this.proximoDesconto = new DescontoPorVendaCasada();
	}

	@Override
	protected double proximoDesconto(Orcamento orcamento) {
		return proximoDesconto.desconta(orcamento);
	}

	@Override
	protected double desconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean utilizaDesconto(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}
}
