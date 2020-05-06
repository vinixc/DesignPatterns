package br.com.design.patterns.app;

import br.com.design.patterns.impostos.ICMS;
import br.com.design.patterns.impostos.Imposto;
import br.com.design.patterns.impostos.ImpostoMuitoAlto;
import br.com.design.patterns.model.Orcamento;

public class TesteDeImpostosComplexo {
	
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = icms.calcula(orcamento);
		
		System.out.println(valor);
		
		Imposto icms2 = new ICMS(new ImpostoMuitoAlto());
		Imposto icms3 = new ImpostoMuitoAlto(new ICMS());
		
		double valorComImpostoAlto = icms2.calcula(orcamento);
		double valorComImpostoAlto1 = icms3.calcula(orcamento);
		
		System.out.println(valorComImpostoAlto);
		System.out.println(valorComImpostoAlto1);
		
	}

}
