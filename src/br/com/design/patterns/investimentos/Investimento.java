package br.com.design.patterns.investimentos;

public interface Investimento {
	
	/**
	 * Metodo implementado pelos diversos tipos de investimento.
	 * @param conta
	 * @return
	 */
	public double investir(double valor);
	
	/**
	 * Metodo default que retorna o valor de um investimento
	 * sem os impostos de 25% sobre o valor total rendido.
	 * @param valor
	 * @return
	 */
	public default double calculaImpostoFinal(double valor) {
		return valor * 0.75;
	}
}
