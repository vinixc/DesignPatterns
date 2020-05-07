package br.com.design.patterns.util;

import java.util.HashMap;
import java.util.Map;

import br.com.design.patterns.musica.Do;
import br.com.design.patterns.musica.Fa;
import br.com.design.patterns.musica.La;
import br.com.design.patterns.musica.Mi;
import br.com.design.patterns.musica.Nota;
import br.com.design.patterns.musica.Re;
import br.com.design.patterns.musica.Si;
import br.com.design.patterns.musica.Sol;

public class NotasMusicais {
	
	private static Map<String, Nota> notas =
			new HashMap<String, Nota>();
	
	static {
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());
	}
	
	public Nota pega(String nome) {
		return notas.get(nome);
	}
	

}
