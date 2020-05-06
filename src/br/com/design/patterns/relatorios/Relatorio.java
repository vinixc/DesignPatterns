package br.com.design.patterns.relatorios;

import java.util.List;

import br.com.design.patterns.model.ContaBancaria;

public abstract class Relatorio {
	
	protected abstract void cabecalho();
	protected abstract void corpo(List<ContaBancaria> conta);
	protected abstract void rodape();
	
	public void imprime(List<ContaBancaria> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}
}
