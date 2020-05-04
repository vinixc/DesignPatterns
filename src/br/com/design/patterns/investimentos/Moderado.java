package br.com.design.patterns.investimentos;

import java.util.Random;

public class Moderado implements Investimento{

	@Override
	public double investir(double valor) {
		boolean retorna2EMeioPorcento = new Random().nextDouble() > 0.50;
		
		if(retorna2EMeioPorcento) {
			double lucroInvestimento = valor * 0.025;
			return calculaImpostoFinal(lucroInvestimento);
		}
		else {
			double lucroInvestimento = valor * 0.007;
			return calculaImpostoFinal(lucroInvestimento);
		}
	}

}
