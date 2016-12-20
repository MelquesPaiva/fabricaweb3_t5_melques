package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		//testCadastrar();
		//testAlterar();
		testExcluir();
	}

	private static void testExcluir() {
		UsuarioDAO usuario = new UsuarioDAO();
		Usuario usuExcluir = new Usuario();
		
		usuExcluir.setId(3);
		
		usuario.excluir(usuExcluir);
		System.out.println("Excluído com Sucesso!!");
	}

	private static void testAlterar() {
		UsuarioDAO usuario = new UsuarioDAO();
		Usuario usuAlt = new Usuario();
		
		usuAlt.setId(1);
		usuAlt.setNome("Maria");
		usuAlt.setLogin("MAR");
		usuAlt.setSenha("123");
		
		usuario.alterar(usuAlt);
		
		System.out.println("Alterado com Sucesso!!");
	}

	private static void testCadastrar() {
		Usuario usuCad = new Usuario();
		usuCad.setNome("Melques");
		usuCad.setLogin("MelquesPaiva");
		usuCad.setSenha("12345");
		UsuarioDAO usu = new UsuarioDAO();
		usu.cadastra(usuCad);
	}

}
