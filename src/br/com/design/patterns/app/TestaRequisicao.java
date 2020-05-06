package br.com.design.patterns.app;

import br.com.design.patterns.enums.FormatoRequisicao;
import br.com.design.patterns.model.ContaBancaria;
import br.com.design.patterns.model.Requisicao;
import br.com.design.patterns.util.TrataRequisicao;

public class TestaRequisicao {

	public static void main(String[] args) {
		
		TrataRequisicao trataRequest = new TrataRequisicao();
		
		String processo = trataRequest.processaRequisicao(new Requisicao(FormatoRequisicao.XML, new ContaBancaria(500.0, "Vinicius")));
	
		System.out.println(processo);
	}

}
