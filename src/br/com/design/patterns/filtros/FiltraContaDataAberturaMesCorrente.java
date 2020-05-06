package br.com.design.patterns.filtros;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.design.patterns.model.ContaBancaria;

public class FiltraContaDataAberturaMesCorrente extends Filtro{
	
	public FiltraContaDataAberturaMesCorrente() {
	}

	public FiltraContaDataAberturaMesCorrente(Filtro filtro) {
		super(filtro);
	}

	@Override
	public Collection<ContaBancaria> filtra(Collection<ContaBancaria> contas) {
		LocalDate data = LocalDate.now();
		
		Set<ContaBancaria> filtrados;
		
		filtrados = contas.stream()
			.filter
				(conta -> conta.getDataAbertura().getMonthValue() == data.getMonthValue() &&
				 conta.getDataAbertura().getYear() == data.getYear())
			.collect
				(Collectors.toSet());
		filtrados.addAll(filtraOProximoFiltro(contas));
		return filtrados;
	}

}
