package br.com.design.patterns.app;


import java.util.Arrays;
import java.util.List;

import br.com.design.patterns.musica.Nota;
import br.com.design.patterns.musica.Piano;
import br.com.design.patterns.util.NotasMusicais;

public class ProgramaNotasMusicas {
	
	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> musica = Arrays.asList(
				notas.pega("mi"), //E
				notas.pega("si"), //B
				notas.pega("sol"),//G
				notas.pega("re"), //D
				notas.pega("la"), //A 
				notas.pega("mi"),  //E
				
				notas.pega("mi"), //E
				notas.pega("si"), //B
				notas.pega("sol"),//G
				notas.pega("re"), //D
				notas.pega("la"), //A 
				notas.pega("mi") //E

		);
		
		Piano piano = new Piano();
		piano.toca(musica);
		
	}
}
