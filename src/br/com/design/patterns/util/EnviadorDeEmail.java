package br.com.design.patterns.util;

import br.com.design.patterns.model.NotaFiscal;
import br.com.design.patterns.observer.AcaoAposGerarNotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal{
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando por email...");
	}

}
