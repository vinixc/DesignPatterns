package br.com.design.patterns.descontos;

import java.util.List;

import br.com.design.patterns.model.Item;
import br.com.design.patterns.model.Orcamento;

public class DescontoPorVendaCasada extends TemplateDeDesconto{

	public DescontoPorVendaCasada() {
		this.proximoDesconto = new SemDesconto();
	}

	@Override
	protected double proximoDesconto(Orcamento orcamento) {
		return proximoDesconto(orcamento);
	}

	@Override
	protected double desconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected boolean utilizaDesconto(Orcamento orcamento) {
		return contemItemDeNome("LAPIS", orcamento.getItens()) && contemItemDeNome("CANETA", orcamento.getItens());
	}
	
	public boolean contemItemDeNome(String nome, List<Item> itens) {
		for(Item item : itens) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				return true;
			}
		}
		
		return false;
	}

}
