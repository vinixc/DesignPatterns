package br.com.design.patterns.model;

import java.util.ArrayList;
import java.util.List;

public class HistoricoContrato {
	
	private List<EstadoContrato> estadosSalvos = new ArrayList<>();
	
	public EstadoContrato pega(int index) {
		return estadosSalvos.get(index);
	}
	
	public void adiciona(EstadoContrato estado) {
		estadosSalvos.add(0,estado);
	}

}
