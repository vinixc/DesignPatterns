package br.com.design.patterns.requisicao;

import br.com.design.patterns.enums.FormatoRequisicao;
import br.com.design.patterns.model.ContaBancaria;

public interface ProcessaRequisicao {
	
	String processa(FormatoRequisicao formato, ContaBancaria conta);
	void proximo(ProcessaRequisicao requisicao);
}
