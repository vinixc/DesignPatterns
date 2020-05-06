package br.com.design.patterns.app;

import br.com.design.patterns.model.ItemDaNota;
import br.com.design.patterns.model.NotaFiscal;
import br.com.design.patterns.util.NotaFiscalBuilder;

public class TesteDaNotaFiscal {
	
	public static void main(String[] args) {
	
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Vinicius Carvalho LTDA")
		.comCnpj("12.345.678/0001-12")
		.comItem(new ItemDaNota("Item 1", 200.0))
		.comItem(new ItemDaNota("Item 2", 300.0))
		.comItem(new ItemDaNota("Item 3", 400.0))
		.comObservacao("observacao")
		.comData();
		
		NotaFiscal nf = builder.controi();
		
		System.out.println(nf.getValorBruto());
		
	}
}
