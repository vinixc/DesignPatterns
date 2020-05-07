package br.com.design.patterns.pt1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			Connection c;
			
			String tipoBanco = System.getenv("tipoBanco");

            if("mysql".equals(tipoBanco)) {
                c = 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
            }
            else {
                c = 
                    DriverManager.getConnection("jdbc:postgresql://localhost:5432/vinicius", "vinicius", "123");
            }

			
			return c;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
