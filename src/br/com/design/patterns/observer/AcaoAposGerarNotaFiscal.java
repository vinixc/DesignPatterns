package br.com.design.patterns.observer;

import br.com.design.patterns.model.NotaFiscal;

public interface AcaoAposGerarNotaFiscal {
	
	void executa(NotaFiscal nf);

}
