package br.com.design.patterns.model;

import br.com.design.patterns.util.Impressora;

public class RaizQuadrada implements Expressao {

	private Expressao numero;

	public RaizQuadrada(Expressao numero) {
		this.setNumero(numero);
	}

	@Override
	public int avalia() {
		return (int) Math.sqrt(getNumero().avalia());
	}

	@Override
	public void aceita(Impressora impressora) {
		impressora.visitaQuadrada(this);
		
	}
	public Expressao getNumero() {
		return numero;
	}

	public void setNumero(Expressao numero) {
		this.numero = numero;
	}

}
