package br.com.design.patterns.relatorios;

import java.util.List;

import br.com.design.patterns.model.ContaBancaria;

public class RelatorioSimples extends Relatorio{

	@Override
	protected void cabecalho() {
		System.out.println("Banco Carvalho");
	}


	@Override
	protected void rodape() {
		System.out.println("1111111111");
	}


	@Override
	protected void corpo(List<ContaBancaria> contas) {
		for(ContaBancaria conta : contas) {
			System.out.println(conta.getNome() + " - " + conta.getSaldo());
		}
	}
}
