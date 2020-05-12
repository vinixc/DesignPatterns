package br.com.design.patterns.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.design.patterns.musica.Do;
import br.com.design.patterns.musica.DoSustenido;
import br.com.design.patterns.musica.Fa;
import br.com.design.patterns.musica.La;
import br.com.design.patterns.musica.Mi;
import br.com.design.patterns.musica.Nota;
import br.com.design.patterns.musica.Re;
import br.com.design.patterns.musica.ReSustenido;
import br.com.design.patterns.musica.Si;
import br.com.design.patterns.musica.Sol;

public class NotasMusicais {
	// Re = D, Mi = E, Fa = F, Sol = G, La = A, Si = B

	private static Map<String, Nota> notas =
			new HashMap<String, Nota>();
	
    private static List<Class<? extends Nota>> clazzes;
	
	static {
		clazzes = Arrays.asList(
                Do.class, Re.class, Mi.class, Fa.class, 
                Sol.class, La.class, Si.class, DoSustenido.class,
                ReSustenido.class);
	}
	
	public Nota pega(String nome) {
        try {
            if(!notas.containsKey(nome)) {
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().toLowerCase().equals(nome.toLowerCase())) {
                        notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

