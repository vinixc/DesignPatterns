package br.com.design.patterns.model;

import br.com.design.patterns.util.Impressora;

public class Divisao implements Expressao {

	private Expressao direita;
	private Expressao esquerda;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.setEsquerda(esquerda);
		this.setDireita(direita);
	}

	@Override
	public int avalia() {
		int valorEsquerda = getEsquerda().avalia();
		int valorDireita = getDireita().avalia();
		
		return valorEsquerda / valorDireita;
	}

	@Override
	public void aceita(Impressora impressora) {
		impressora.visitaDivisao(this);
	}

	public Expressao getDireita() {
		return direita;
	}

	public void setDireita(Expressao direita) {
		this.direita = direita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Expressao esquerda) {
		this.esquerda = esquerda;
	}

}
