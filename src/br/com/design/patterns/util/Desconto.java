package br.com.design.patterns.util;

import br.com.design.patterns.model.Orcamento;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);

}
