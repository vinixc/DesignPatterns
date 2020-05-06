package br.com.design.patterns.model.conta;

import br.com.design.patterns.model.ContaBancaria;
import br.com.design.patterns.model.EstadoConta;

public class ContaNegativa extends EstadoConta{

	@Override
	public void saca(ContaBancaria conta, double valor) {
		throw new 
		RuntimeException(String.format
				("Operação saque não permitida para conta negativas! SALDO: %s"
						,conta.getSaldo()));
	}
	
	@Override
	public void deposita(ContaBancaria conta, double valor) {
		double saldo = conta.getSaldo();
		saldo += valor * 0.95; //deposita apenas 95% do valor
		conta.setSaldo(saldo);
		podeFicarPositiva(conta);
	}
	
	@Override
	public String toString() {
		return "NEGATIVA";
	}
}
