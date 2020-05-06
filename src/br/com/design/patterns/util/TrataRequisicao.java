package br.com.design.patterns.util;

import br.com.design.patterns.model.Requisicao;
import br.com.design.patterns.requisicao.ProcessaNenhumaRequisicao;
import br.com.design.patterns.requisicao.ProcessaRequisicao;
import br.com.design.patterns.requisicao.ProcessaRequisicaoCSV;
import br.com.design.patterns.requisicao.ProcessaRequisicaoPorcento;
import br.com.design.patterns.requisicao.ProcessaRequisicaoXML;

public class TrataRequisicao {
	
	public String processaRequisicao(Requisicao requisicao) {
		
		ProcessaRequisicao r1 = new ProcessaRequisicaoXML();
		ProcessaRequisicao r2 = new ProcessaRequisicaoCSV();
		ProcessaRequisicao r3 = new ProcessaRequisicaoPorcento();
		ProcessaRequisicao r4 = new ProcessaNenhumaRequisicao();
		
		r1.proximo(r2);
		r2.proximo(r3);
		r3.proximo(r4);
		
		return r1.processa(requisicao.getFormato(), requisicao.getConta());
	}
}
