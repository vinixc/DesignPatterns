package br.com.design.patterns.app;

import java.io.IOException;
import java.util.Calendar;

import br.com.design.patterns.model.GoogleMaps;
import br.com.design.patterns.model.Mapa;
import br.com.design.patterns.model.Relogio;
import br.com.design.patterns.model.RelogioCalendar;

public class ProgramaBridgesAndAdapters {
	
	public static void main(String[] args) throws IOException {
		
		//regra de negocio
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");
		
		
		
		Relogio relogio = new RelogioCalendar();
		
		Calendar hoje = relogio.hoje();
		
		System.out.println(hoje);
	}

}
