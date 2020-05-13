package br.com.design.patterns.app;

import java.time.LocalDate;

import br.com.design.patterns.enums.TipoContrato;
import br.com.design.patterns.model.Contrato;
import br.com.design.patterns.model.EstadoContrato;
import br.com.design.patterns.model.HistoricoContrato;

public class ProgramaTestaContrato {
	
	public static void main(String[] args) {
		
		HistoricoContrato historico = new HistoricoContrato();
		
		Contrato c1 = new Contrato(LocalDate.now(), "Vinicius", TipoContrato.NOVO);
		historico.adiciona(c1.salvaEstado());
		
		System.out.println(c1.getTipo());
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		System.out.println(c1.getTipo());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		System.out.println(c1.getTipo());
		
		EstadoContrato estadoAnterior = historico.pega(2);
		System.out.println(estadoAnterior.getContrato().getTipo());
	}

}
