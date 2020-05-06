package br.com.design.patterns.impostos;

import br.com.design.patterns.model.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	public TemplateDeImpostoCondicional() {
	}
	
	public TemplateDeImpostoCondicional(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public final double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
