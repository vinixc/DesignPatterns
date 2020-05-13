package br.com.design.patterns.app;

import br.com.design.patterns.model.Expressao;
import br.com.design.patterns.model.Numero;
import br.com.design.patterns.model.Soma;
import br.com.design.patterns.model.Subtracao;

public class ProgramaDsl {
	
	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao(new Soma(new Numero(10), new Numero(30)), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda,direita);
		
		int resultado = soma.avalia();
		System.out.println(resultado);
	}

}
