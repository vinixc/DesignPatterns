package br.com.design.patterns.model;

import br.com.design.patterns.util.Impressora;

public class Numero implements Expressao{
	
	private int numero;
	
	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return getNumero();
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void aceita(Impressora impressora) {
		impressora.visitaNumero(this);
		
	}
}
