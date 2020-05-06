package br.com.design.patterns.filtros;
import java.util.ArrayList;
import java.util.Collection;

import br.com.design.patterns.model.ContaBancaria;

public abstract class Filtro {
	
	protected Filtro proximoFiltro;
	
	public Filtro() {}
	
	public Filtro(Filtro outroFiltro) {
		this.proximoFiltro = outroFiltro;
	}
	
	public abstract Collection<ContaBancaria> filtra(Collection<ContaBancaria> contas);
	
	protected Collection<ContaBancaria> filtraOProximoFiltro(Collection<ContaBancaria> contas){
		if(proximoFiltro == null) {
			return new ArrayList<ContaBancaria>();
		}
		else {
			return proximoFiltro.filtra(contas);
		}
	}

}
