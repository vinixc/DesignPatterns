package br.com.design.patterns.model;

import br.com.design.patterns.util.Impressora;

public interface Expressao {
	
	int avalia();
	void aceita(Impressora impressora);

}
