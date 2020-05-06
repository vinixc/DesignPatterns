package br.com.design.patterns.relatorios;

import java.util.Calendar;
import java.util.List;

import br.com.design.patterns.model.ContaBancaria;

public class RelatorioComplexo extends Relatorio{

	@Override
	protected void cabecalho() {
		System.out.println("Banco Carvalho");
		System.out.println("Avenida Paulista, 1234");
        System.out.println("(11) 1234-5678");
	}


	@Override
	protected void rodape() {
		System.out.println("banco@xyz.com.br");
        System.out.println(Calendar.getInstance().getTime());
	}


	@Override
	protected void corpo(List<ContaBancaria> contas) {
		for(ContaBancaria conta : contas) {
			System.out.println(conta.getNome() + " - " + conta.getSaldo() + " - " + conta.getInvestido());
		}
	}
}
