package br.com.design.patterns.filtros;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.design.patterns.model.ContaBancaria;

public class FiltraContaSaldoMenorQueCem extends Filtro{
	
	public FiltraContaSaldoMenorQueCem() {
	}
	
	public FiltraContaSaldoMenorQueCem(Filtro filtro) {
		super(filtro);
	}

	@Override
	public Collection<ContaBancaria> filtra(Collection<ContaBancaria> contas) {
		Set<ContaBancaria> filtrados;
		
		filtrados = contas.stream().filter(conta -> conta.getSaldo() < 100.0).collect(Collectors.toSet());
		filtrados.addAll(filtraOProximoFiltro(contas));
		return filtrados;
	}
}
