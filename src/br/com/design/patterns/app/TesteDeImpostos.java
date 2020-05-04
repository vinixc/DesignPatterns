package br.com.design.patterns.app;

import br.com.design.patterns.impostos.ICCC;
import br.com.design.patterns.impostos.ICMS;
import br.com.design.patterns.impostos.ISS;
import br.com.design.patterns.impostos.Imposto;
import br.com.design.patterns.model.Orcamento;
import br.com.design.patterns.util.CalculadorDeImposto;

public class TesteDeImpostos {
	
	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(8000.00);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);
	}

}
