package br.com.design.patterns.app;

import br.com.design.patterns.model.Divisao;
import br.com.design.patterns.model.Expressao;
import br.com.design.patterns.model.Multiplicacao;
import br.com.design.patterns.model.Numero;
import br.com.design.patterns.model.RaizQuadrada;
import br.com.design.patterns.model.Soma;
import br.com.design.patterns.model.Subtracao;
import br.com.design.patterns.util.Impressora;

public class ProgramaDsl {
	
	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao(new Soma(new Numero(10), new Numero(30)), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda,direita);
		
		Expressao multiplicacao = new Multiplicacao(new Numero(10), new Numero(2));
		Expressao divisao = new Divisao(new Numero(10), new Numero(2));
		
		Expressao raizQuadrada = new RaizQuadrada(new Numero(16));
		
		int resultSoma = soma.avalia();
		int resultMult = multiplicacao.avalia();
		int resultDiv = divisao.avalia();
		int resultQuadrada = raizQuadrada.avalia();
		
		System.out.println(resultSoma);
		System.out.println(resultMult);
		System.out.println(resultDiv);
		System.out.println(resultQuadrada);
		
		
		Impressora impressora = new Impressora();
		
		soma.aceita(impressora);
	}

}
