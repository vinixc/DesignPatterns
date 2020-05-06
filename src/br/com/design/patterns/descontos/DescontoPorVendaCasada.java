package br.com.design.patterns.descontos;

import java.util.List;

import br.com.design.patterns.model.Item;
import br.com.design.patterns.model.Orcamento;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if(contemItemDeNome("LAPIS", orcamento.getItens()) && contemItemDeNome("CANETA", orcamento.getItens())) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
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
