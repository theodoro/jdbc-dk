package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost/dbteste","postgres","dbadmin");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
