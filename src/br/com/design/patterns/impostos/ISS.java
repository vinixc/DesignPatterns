package br.com.design.patterns.impostos;

import br.com.design.patterns.model.Orcamento;

public class ISS extends Imposto{
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ISS() {
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}
}
