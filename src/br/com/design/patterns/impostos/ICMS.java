package br.com.design.patterns.impostos;

import br.com.design.patterns.model.Orcamento;

public class ICMS extends Imposto{
	
	 final double valorFixo = 50.00;
	 
	public ICMS() {
	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05)+ calculoDoOutroImposto(orcamento) + valorFixo;
	}

}
