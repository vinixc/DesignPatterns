package br.com.design.patterns.descontos;

import br.com.design.patterns.model.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento{
	
	private boolean descontoAprovado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAprovado) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAprovado = true;
		}
		else {
			throw new RuntimeException("Esse desconto já foi aplicado.");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já esta aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados nao podem ser reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estatoAtual = new Finalizado();
	}

}
