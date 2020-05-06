package br.com.design.patterns.requisicao;

import br.com.design.patterns.enums.FormatoRequisicao;
import br.com.design.patterns.model.ContaBancaria;

public class ProcessaNenhumaRequisicao implements ProcessaRequisicao{

	@Override
	public String processa(FormatoRequisicao formato, ContaBancaria conta) {
		return "ERROR : Nenhuma requisicao encontrada.";
	}

	@Override
	public void proximo(ProcessaRequisicao proxima) {
	}
}
