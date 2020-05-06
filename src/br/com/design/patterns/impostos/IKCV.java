package br.com.design.patterns.impostos;

import br.com.design.patterns.model.Item;
import br.com.design.patterns.model.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional{
	
	public IKCV() {}
	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0 && temItemMaiorQue100ReaisNo(orcamento);
	}
	
	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(item.getValor() > 100.0) return true;
		}
		return false;
	}
}
