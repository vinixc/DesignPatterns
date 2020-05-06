package br.com.design.patterns.filtros;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.design.patterns.model.ContaBancaria;

public class FiltraContaSaldoMaiorQue500Mil extends Filtro{
	
	public FiltraContaSaldoMaiorQue500Mil() {
	}

	public FiltraContaSaldoMaiorQue500Mil(Filtro filtro) {
		super(filtro);
	}

	@Override
	public Collection<ContaBancaria> filtra(Collection<ContaBancaria> contas) {
		Set<ContaBancaria> filtrados;
		
		filtrados = contas.stream().filter(conta -> conta.getSaldo() > 500000.0).collect(Collectors.toSet());
		filtrados.addAll(filtraOProximoFiltro(contas));
		return filtrados;
	}

}
