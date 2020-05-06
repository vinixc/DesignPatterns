package br.com.design.patterns.impostos;

import br.com.design.patterns.model.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional{
	
	public ICPP() {}
	
	public ICPP(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + calculoDoOutroImposto(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07 + calculoDoOutroImposto(orcamento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
}
