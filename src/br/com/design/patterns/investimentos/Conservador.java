package br.com.design.patterns.investimentos;

public class Conservador implements Investimento{

	@Override
	public double investir(double valor) {
		double lucroInvestimento = valor * 0.008;
		return calculaImpostoFinal(lucroInvestimento);
	}
}
