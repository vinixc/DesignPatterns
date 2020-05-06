package br.com.design.patterns.impostos;

import br.com.design.patterns.model.Orcamento;

public class ImpostoMuitoAlto extends Imposto{
	
	public ImpostoMuitoAlto() {
	}

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculoDoOutroImposto(orcamento);
	}

}
