package br.com.design.patterns.model;

public class Divisao implements Expressao {

	private Expressao direita;
	private Expressao esquerda;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorEsquerda = esquerda.avalia();
		int valorDireita = direita.avalia();
		
		return valorEsquerda / valorDireita;
	}

}
