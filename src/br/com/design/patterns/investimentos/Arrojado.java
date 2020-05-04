package br.com.design.patterns.investimentos;

import java.util.Random;

public class Arrojado implements Investimento{

	@Override
	public double investir(double valor) {
		boolean retorna3porcento = new Random().nextDouble() > 0.30;
		boolean retorna06porcento = new Random().nextDouble() > 0.50;
		
		if(retorna06porcento) {
			double lucroInvestimento = valor * 0.006;
			return calculaImpostoFinal(lucroInvestimento);
		}
		else if(retorna3porcento) {
			double lucroInvestimento = valor * 0.03;
			return calculaImpostoFinal(lucroInvestimento);
		}
		else {
			double lucroInvestimento = valor * 0.05;
			return calculaImpostoFinal(lucroInvestimento);
		}
	}

}
