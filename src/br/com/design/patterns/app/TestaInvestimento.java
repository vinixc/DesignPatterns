package br.com.design.patterns.app;

import br.com.design.patterns.investimentos.Arrojado;
import br.com.design.patterns.investimentos.Conservador;
import br.com.design.patterns.investimentos.Investimento;
import br.com.design.patterns.investimentos.Moderado;
import br.com.design.patterns.model.ContaBancaria;

public class TestaInvestimento {
	public static void main(String[] args) {
		ContaBancaria minhaConta = new ContaBancaria(1500);
		
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		
		minhaConta.investir(500, conservador);
		minhaConta.investir(500, moderado);
		minhaConta.investir(500, arrojado);
		
	}

}
