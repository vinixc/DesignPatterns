package br.com.design.patterns.model;

import java.util.Calendar;

public class RelogioCalendar implements Relogio{

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
