package br.com.design.patterns.util;

import br.com.design.patterns.impostos.Imposto;
import br.com.design.patterns.model.Orcamento;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
			double icms = impostoQualquer.calcula(orcamento);
			System.out.println(icms);
	}
}
