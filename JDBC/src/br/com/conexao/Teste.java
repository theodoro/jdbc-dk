package br.com.conexao;


import java.sql.SQLException;
import java.util.Calendar;

import br.com.dao.ContatoDAO;
import br.com.entidade.Contato;

public class Teste {
	
	public static void main(String[] args) throws SQLException{
		
		Contato novoContato = new Contato();
		
		novoContato.setNome("Bruno Theodoro de Aquino");
		novoContato.setEmail("bruno@gmail.com");
		novoContato.setEndereco("Av Tirantes, Maringá PR");
		novoContato.setDataNasc(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		dao.adicionar(novoContato);
		
		System.out.println("Gravado com Sucesso!");
		
	}

}
