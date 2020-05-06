package br.com.design.patterns.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.design.patterns.filtros.FiltraContaDataAberturaMesCorrente;
import br.com.design.patterns.filtros.FiltraContaSaldoMaiorQue500Mil;
import br.com.design.patterns.filtros.FiltraContaSaldoMenorQueCem;
import br.com.design.patterns.filtros.Filtro;
import br.com.design.patterns.model.ContaBancaria;

public class TestaFiltro {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		List<ContaBancaria> contas = new ArrayList<>();
		contas.add(new ContaBancaria(40.0, LocalDate.now().of(2020, 5, 2), "Vinicius"));
		contas.add(new ContaBancaria(500010.0, LocalDate.now().of(2020, 1, 2), "Vinicius"));
		contas.add(new ContaBancaria(99.0, LocalDate.now().of(2020, 1, 2), "Vinicius"));
		
		Filtro filtro = 
				new FiltraContaSaldoMenorQueCem(
						new FiltraContaSaldoMaiorQue500Mil(
								new FiltraContaDataAberturaMesCorrente()));
		
		Collection<ContaBancaria> filtrados = filtro.filtra(contas);
		
		filtrados.stream().forEach(System.out::println);
		
	}

}
