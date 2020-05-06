package br.com.design.patterns.descontos;

import br.com.design.patterns.model.Orcamento;

public interface EstadoDeUmOrcamento {
	
	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
}
