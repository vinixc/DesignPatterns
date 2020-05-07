package br.com.design.patterns.pt1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/vinicius",
					"vinicius", "123");
			
			return c;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
