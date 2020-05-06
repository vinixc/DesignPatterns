package br.com.design.patterns.model;

import br.com.design.patterns.model.conta.ContaNegativa;
import br.com.design.patterns.model.conta.ContaPositiva;

public abstract class EstadoConta {
	
	protected abstract void saca(ContaBancaria conta, double valor);
	protected abstract void deposita(ContaBancaria conta, double valor);
	
	protected void podeFicarPositiva(ContaBancaria conta) {
		if(conta.getSaldo() >= 0)
			conta.setEstadoConta(new ContaPositiva());
		else podeFicarNegativa(conta);
	}
	
	protected void podeFicarNegativa(ContaBancaria conta) {
		if(conta.getSaldo() < 0)
			conta.setEstadoConta(new ContaNegativa());
		else podeFicarPositiva(conta);
	}
}
