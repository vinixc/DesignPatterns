package br.com.design.patterns.app;

import br.com.design.patterns.model.ContaBancaria;

public class TestaContaPositivaOrNegativa {
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria(500);
		conta.saca(100);
		conta.deposita(100);
		conta.saca(200);
		conta.deposita(20);
		conta.saca(400);
//		conta.saca(100);
		conta.deposita(83);
		conta.deposita(3);
		conta.deposita(0.69);
		conta.deposita(0.44);
		conta.deposita(1);
		
		System.out.println(conta.getEstadoConta());
		System.out.println(conta.getSaldo());
	}

}
