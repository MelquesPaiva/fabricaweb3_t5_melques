package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb", "postgres", "flu131722");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException( "Não conectou com o banco!", e);
		}
		
	}
	
}
