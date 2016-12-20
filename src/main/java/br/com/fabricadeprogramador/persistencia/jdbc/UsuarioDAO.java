package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.entidade.Usuario;

public class UsuarioDAO {

	Connection con = ConexaoFactory.getConnection();

	public void cadastra(Usuario usu) {
		String sql = "INSERT INTO usuario (nome,login,senha) VALUES (?,?,?)";
		try (PreparedStatement preparador = con.prepareStatement(sql)){

			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			//executando o comando sql no banco
			preparador.execute();

			//System.out.println("Cadastrado com sucesso!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	public void alterar(Usuario usu) {
		String sql = "UPDATE usuario SET nome=?, login=?, senha=md5(?) WHERE id=?";
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());

			preparador.execute();

			//
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}

	}

	public void excluir(Usuario usu) {
		String sql = "DELETE FROM usuario WHERE id=?";
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setInt(1, usu.getId());
			preparador.execute();

			//System.out.println("Excluído com Sucesso!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	public void salvar(Usuario usu) {
		if (usu.getId() != null && usu.getId() > 0) {

		}
	}
}
