package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.jdbc.ConexaoFactory;

public class TesteConexao {
	public static void main(String[] args) {
		
		ConexaoFactory.getConnection();
	}

}
