package br.com.design.patterns.descontos;

import br.com.design.patterns.model.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento{
	
	private boolean descontoAprovado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAprovado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAprovado = true;
		}
		else {
			throw new RuntimeException("Esse desconto já foi aplicado.");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estatoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estatoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação nao podem ir direto para finalizado!");
	}

}
