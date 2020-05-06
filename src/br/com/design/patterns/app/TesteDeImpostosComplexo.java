package br.com.design.patterns.app;

import br.com.design.patterns.impostos.ICCC;
import br.com.design.patterns.impostos.ICMS;
import br.com.design.patterns.impostos.Imposto;
import br.com.design.patterns.model.Orcamento;

public class TesteDeImpostosComplexo {
	
	public static void main(String[] args) {
		Imposto icms = new ICMS(new ICCC());
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = icms.calcula(orcamento);
		
		System.out.println(valor);
		
	}

}
