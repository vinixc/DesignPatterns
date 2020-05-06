package br.com.design.patterns.requisicao;

import br.com.design.patterns.enums.FormatoRequisicao;
import br.com.design.patterns.model.ContaBancaria;

public class ProcessaRequisicaoCSV implements ProcessaRequisicao{

	private ProcessaRequisicao proxima;

	public ProcessaRequisicaoCSV(ProcessaRequisicao proxima) {
		this.proxima = proxima;
	}

	@Override
	public String processa(FormatoRequisicao formato, ContaBancaria conta) {
		if(formato.equals(FormatoRequisicao.CSV)) {
			
			return conta.getSaldo() + ";" + conta.getNome();
		}
		
		return proxima.processa(formato, conta);
	}

	@Override
	public void proximo(ProcessaRequisicao proxima) {
		this.setProxima(proxima);
	}

	public ProcessaRequisicao getProxima() {
		return proxima;
	}

	public void setProxima(ProcessaRequisicao proxima) {
		this.proxima = proxima;
	}
}
