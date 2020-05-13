package br.com.design.patterns.util;

import br.com.design.patterns.model.Multiplicacao;
import br.com.design.patterns.model.NotaFiscal;
import br.com.design.patterns.model.Numero;
import br.com.design.patterns.model.Soma;
import br.com.design.patterns.model.Subtracao;
import br.com.design.patterns.observer.AcaoAposGerarNotaFiscal;

public class Impressora implements AcaoAposGerarNotaFiscal{
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo...");
	}
	
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		
		//esquerda
		soma.getEsquerda().aceita(this);
		
		System.out.print(" + ");
		
		//direita
		soma.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaSubtracao(Subtracao sub) {
		System.out.print("(");
		
		//esquerda
		sub.getEsquerda().aceita(this);
		
		System.out.print(" - ");
		
		//direita
		sub.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaMultiplicacao(Multiplicacao mult) {
		
	}
	
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}

}
