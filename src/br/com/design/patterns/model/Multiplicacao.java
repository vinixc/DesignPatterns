package br.com.design.patterns.model;

import br.com.design.patterns.util.Impressora;

public class Multiplicacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		this.setEsquerda(esquerda);
		this.setDireita(direita);
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = getEsquerda().avalia();
		int valorDaDireita = getDireita().avalia();
		
		return valorDaEsquerda * valorDaDireita;
	}

	@Override
	public void aceita(Impressora impressora) {
		impressora.visitaMultiplicacao(this);
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Expressao esquerda) {
		this.esquerda = esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}

	public void setDireita(Expressao direita) {
		this.direita = direita;
	}
}
