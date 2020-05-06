package br.com.design.patterns.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.design.patterns.descontos.EmAprovacao;
import br.com.design.patterns.descontos.EstadoDeUmOrcamento;

public class Orcamento {
	
	public double valor;
	
	private final List<Item> itens;
	
	public EstadoDeUmOrcamento estatoAtual;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estatoAtual = new EmAprovacao();
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public void aplicaDescontoExtra() {
		estatoAtual.aplicaDescontoExtra(this);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	
	public void aprova() {
		estatoAtual.aprova(this);
	}
	
	public void reprova() {
		estatoAtual.reprova(this);
	}
	
	public void finaliza() {
		estatoAtual.finaliza(this);
	}
}
