package br.com.design.patterns.impostos;

import java.util.ArrayList;
import java.util.List;

import br.com.design.patterns.model.Item;
import br.com.design.patterns.model.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{
	
	public IHIT() {}
	
	public IHIT(Imposto outroImposto)
	{
		super(outroImposto);
	}
	
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.01) * orcamento.getItens().size();
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return temDoisItemComOMesmoNome(orcamento);
	}

	private boolean temDoisItemComOMesmoNome(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();
		for(Item item : orcamento.getItens()) {
			if(noOrcamento.contains(item.getNome())) return true;
			else noOrcamento.add(item.getNome());
		}
		return false;
	}
}
