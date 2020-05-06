package br.com.design.patterns.util;

import br.com.design.patterns.model.NotaFiscal;
import br.com.design.patterns.observer.AcaoAposGerarNotaFiscal;

public class Multiplicador implements AcaoAposGerarNotaFiscal{

	private int fator;

	public Multiplicador(int fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println(nf.getValorBruto() * fator);
	}
}
