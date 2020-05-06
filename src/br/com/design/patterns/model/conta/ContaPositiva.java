package br.com.design.patterns.model.conta;

import br.com.design.patterns.model.ContaBancaria;
import br.com.design.patterns.model.EstadoConta;

public class ContaPositiva extends EstadoConta{

	@Override
	public void saca(ContaBancaria conta, double valor) {
		double saldo = conta.getSaldo();
		saldo -= valor;
		conta.setSaldo(saldo);
		podeFicarNegativa(conta);
	}
	
	@Override
	public void deposita(ContaBancaria conta, double valor) {
		double saldo = conta.getSaldo();
		saldo += valor * 0.98; //deposita apenas 98% do valor;
		conta.setSaldo(saldo);
		podeFicarPositiva(conta);
	}

	@Override
	public String toString() {
		return "POSITIVA";
	}
}
