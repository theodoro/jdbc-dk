package br.com.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste {
	
	public static void main(String[] args) throws SQLException{
		
		Connection connection = new Conexao().getConnection();
		System.out.println("Conectado ao banco Postgres!");
		
		connection.close();
	}

}
