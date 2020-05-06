package br.com.design.patterns.requisicao;

import br.com.design.patterns.enums.FormatoRequisicao;
import br.com.design.patterns.model.ContaBancaria;

public class ProcessaRequisicaoXML implements ProcessaRequisicao{

	private ProcessaRequisicao proxima;

	@Override
	public String processa(FormatoRequisicao formato, ContaBancaria conta) {
		if(formato.equals(FormatoRequisicao.XML)) {
			return conta.toXml();
		}
		
		return proxima.processa(formato, conta);
	}

	@Override
	public void proximo(ProcessaRequisicao proxima) {
		this.setProxima(proxima);
	}

	public void setProxima(ProcessaRequisicao proxima) {
		this.proxima = proxima;
	}
	public ProcessaRequisicao getProxima() {
		return proxima;
	}
}
