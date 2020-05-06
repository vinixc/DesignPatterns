package br.com.design.patterns.app;

import java.util.Arrays;

import br.com.design.patterns.model.ContaBancaria;
import br.com.design.patterns.relatorios.Relatorio;
import br.com.design.patterns.relatorios.RelatorioComplexo;
import br.com.design.patterns.relatorios.RelatorioSimples;

public class TestaRelatorio {

	public static void main(String[] args) {
		Relatorio simples = new RelatorioSimples();
		Relatorio complexo = new RelatorioComplexo();
		
		
		simples.imprime(Arrays.asList(new ContaBancaria(1000.0, "Vinicius"),new ContaBancaria(5000.0, "Joao")));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		complexo.imprime(Arrays.asList(new ContaBancaria(1000.0, "Vinicius"),new ContaBancaria(5000.0, "Joao")));
	}

}
