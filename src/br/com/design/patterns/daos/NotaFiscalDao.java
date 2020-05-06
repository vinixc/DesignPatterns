package br.com.design.patterns.daos;

import br.com.design.patterns.model.NotaFiscal;
import br.com.design.patterns.observer.AcaoAposGerarNotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNotaFiscal{
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvando no banco...");
	}
}
