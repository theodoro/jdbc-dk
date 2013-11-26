package br.com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.conexao.Conexao;
import br.com.entidade.Contato;

public class ContatoDAO {
	
	private Connection connection;

	public ContatoDAO() {
		super();
		this.connection = new Conexao().getConnection();
	}
	
	public void adicionar (Contato contato){
		
		String sql = "insert into contatos (nome, email, endereco, datanascimento) values (?,?,?,?)";
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNasc().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
