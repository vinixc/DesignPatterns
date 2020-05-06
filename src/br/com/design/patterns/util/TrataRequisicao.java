package br.com.design.patterns.util;

import br.com.design.patterns.model.Requisicao;
import br.com.design.patterns.requisicao.ProcessaNenhumaRequisicao;
import br.com.design.patterns.requisicao.ProcessaRequisicao;
import br.com.design.patterns.requisicao.ProcessaRequisicaoCSV;
import br.com.design.patterns.requisicao.ProcessaRequisicaoPorcento;
import br.com.design.patterns.requisicao.ProcessaRequisicaoXML;

public class TrataRequisicao {
	
	public String processaRequisicao(Requisicao requisicao) {
		
		ProcessaRequisicao r4 = new ProcessaNenhumaRequisicao();
		ProcessaRequisicao r3 = new ProcessaRequisicaoPorcento(r4);
		ProcessaRequisicao r2 = new ProcessaRequisicaoCSV(r3);
		ProcessaRequisicao r1 = new ProcessaRequisicaoXML(r2);
		
		return r1.processa(requisicao.getFormato(), requisicao.getConta());
	}
}
