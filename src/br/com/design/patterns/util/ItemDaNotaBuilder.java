package br.com.design.patterns.util;

import br.com.design.patterns.model.ItemDaNota;

public class ItemDaNotaBuilder {
	
	private String nome;
	private double value;

	public ItemDaNotaBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public ItemDaNotaBuilder comValue(double value) {
		this.value = value;
		return this;
	}
	
	public ItemDaNota constroi() {
		return new ItemDaNota(nome, value);
	}
}
