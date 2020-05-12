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
				notas.pega("do"),    
				notas.pega("doSustenido"),    
	            notas.pega("reSustenido"),    
	            notas.pega("re"),    
	            notas.pega("mi"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    

	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("re"),    
	            notas.pega("re"),

	            notas.pega("do"),    
	            notas.pega("sol"),    
	            notas.pega("fa"),    
	            notas.pega("mi"),    
	            notas.pega("mi"),    
	            notas.pega("mi"),

	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("mi"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    
	            notas.pega("fa")

		);
		
		Piano piano = new Piano();
		piano.toca(musica);
		
	}
}
