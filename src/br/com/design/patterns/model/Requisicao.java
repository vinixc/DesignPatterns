package br.com.design.patterns.model;

import br.com.design.patterns.enums.FormatoRequisicao;

public class Requisicao {
	private FormatoRequisicao formato;
	
	private ContaBancaria conta;

	public Requisicao(FormatoRequisicao formato, ContaBancaria conta) {
		this.setFormato(formato);
		this.conta = conta;
	}

	public FormatoRequisicao getFormato() {
		return formato;
	}

	public void setFormato(FormatoRequisicao formato) {
		this.formato = formato;
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
}


