package br.com.design.patterns.app;

import java.time.LocalDate;

import br.com.design.patterns.daos.NotaFiscalDao;
import br.com.design.patterns.model.NotaFiscal;
import br.com.design.patterns.util.EnviadorDeEmail;
import br.com.design.patterns.util.EnviadorDeSMS;
import br.com.design.patterns.util.Impressora;
import br.com.design.patterns.util.ItemDaNotaBuilder;
import br.com.design.patterns.util.NotaFiscalBuilder;

public class TestaAcao {
	
	public static void main(String[] args) {
		ItemDaNotaBuilder builderItem = new ItemDaNotaBuilder();
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviadorDeSMS());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new Impressora());
		
		builder.paraEmpresa("Vinicius Carvalho LTDA")
		.comCnpj("12.345.678/0001-12")
		.com(builderItem.comNome("Item 1").comValue(200.0).constroi())
		.com(builderItem.comNome("Item 2").comValue(400.0).constroi())
		.com(builderItem.comNome("Item 3").comValue(500.0).constroi())
		.comObservacao("observacao")
		.comData(LocalDate.now());
		
		NotaFiscal notaFiscal = builder.controi();
		
		System.out.println(notaFiscal.getValorBruto());
	}

}
