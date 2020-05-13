package br.com.design.patterns.util;

import br.com.design.patterns.model.Divisao;
import br.com.design.patterns.model.Multiplicacao;
import br.com.design.patterns.model.NotaFiscal;
import br.com.design.patterns.model.Numero;
import br.com.design.patterns.model.RaizQuadrada;
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
		System.out.print("(");
		
		//valor esquerda
		mult.getEsquerda().aceita(this);
		
		System.out.print(" * ");
		
		//valor direita
		mult.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaDivisao(Divisao div) {
		System.out.print("(");
		
		//valor esquerda
		div.getEsquerda().aceita(this);
		
		System.out.print(" / ");
		
		//valor direita
		div.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaQuadrada(RaizQuadrada quadrada) {
		System.out.print("(");
				
		System.out.print("V^");
		
		//valor direita
		quadrada.getNumero().aceita(this);;
		
		System.out.print(")");
	}
	
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}

}
