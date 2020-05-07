package br.com.design.patterns.pt1;

import java.sql.Connection;
import java.sql.SQLException;


public class Programa {

	public static void main(String[] args) throws SQLException {
		
		Connection c = new ConnectionFactory().getConnection();
		
		
	}

}
