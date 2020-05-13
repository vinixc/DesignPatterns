package br.com.design.patterns.model;

import br.com.design.patterns.util.Impressora;

public class Soma implements Expressao {
	
	private Expressao esquerda;
	private Expressao direita;
	
	public Soma(Expressao esquerda, Expressao direita) {
		this.setEsquerda(esquerda);
		this.setDireita(direita);
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = getEsquerda().avalia();
		int valorDaDireita = getDireita().avalia();
		
		return valorDaEsquerda + valorDaDireita;
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

	@Override
	public void aceita(Impressora impressora) {
		impressora.visitaSoma(this);
	}

}
