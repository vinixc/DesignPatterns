package br.com.design.patterns.impostos;

import br.com.design.patterns.model.Orcamento;

public class ICCC extends Imposto{
	
	public ICCC() {}
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05 + calculoDoOutroImposto(orcamento);
		}
		else if(orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07 + calculoDoOutroImposto(orcamento);
		}
		else {
			return orcamento.getValor() * 0.08 + 30 + calculoDoOutroImposto(orcamento);
		}
	}
}
