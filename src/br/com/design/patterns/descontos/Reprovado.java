package br.com.design.patterns.descontos;

import br.com.design.patterns.model.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento{
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados nao recebem desconto extra");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já esta reprovado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estatoAtual = new Finalizado();
	}
}
