package br.com.design.patterns.app;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.design.patterns.factory.ConnectionFactory;


public class ProgramaFactory {

	public static void main(String[] args) throws SQLException {
		
		Connection c = new ConnectionFactory().getConnection();
		
		
	}

}
