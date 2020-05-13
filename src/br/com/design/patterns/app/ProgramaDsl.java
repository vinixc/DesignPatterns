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
		
		
		Expressao maluca = new Soma(
				new Numero(5),
				new Multiplicacao(
						new Soma(
								new Multiplicacao(
										new Subtracao(
												new Soma(
														new Numero(54),
														new Numero(12)),
												new Numero(34)),
										new Numero(4)),
								new Numero(40)),
						new Divisao(
								new Numero(12),
								new RaizQuadrada(
										new Numero(9))))
				);
		Impressora impressora = new Impressora();
		
		maluca.aceita(impressora);
		System.out.println("");
		System.out.println(maluca.avalia());
		
		int resultSoma = soma.avalia();
		int resultMult = multiplicacao.avalia();
		int resultDiv = divisao.avalia();
		int resultQuadrada = raizQuadrada.avalia();
		
//		System.out.println(resultSoma);
//		System.out.println(resultMult);
//		System.out.println(resultDiv);
//		System.out.println(resultQuadrada);
		
		
		
//		soma.aceita(impressora);
		
		System.out.println("");
		
//		multiplicacao.aceita(impressora);
	}

}
