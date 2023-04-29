package br.com.fiap.rocketMoney.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import br.com.fiap.rocketMoney.factory.ConnectionFactory;
import br.com.fiap.rocketMoney.model.UsuarioModel;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
		System.out.println("Conectou!");
	}

	// Inserção de um usuario
	public void insert(UsuarioModel usuario) throws SQLException {
		String sql = "INSERT INTO t_user (cd_cpf, nm_nome, cd_senha, nm_apelidousuario, cd_perfilinvestidor, cd_tipofaturamento) VALUES(?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, usuario.getCpf());
		stmt.setString(2, usuario.getNome());
		stmt.setString(3, usuario.getSenha());
		stmt.setString(4, usuario.getApelidoUsuario());
		stmt.setString(5, usuario.getTipoPerfilInvestidor());
		stmt.setString(6, usuario.getTipoFaturamento());

		stmt.execute();
		stmt.close();

	}

	public List<UsuarioModel> select() throws SQLException {
		List<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();
		String sql = "SELECT * FROM t_user";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			UsuarioModel usuario = new UsuarioModel();
			usuario.setCpf(rs.getString("cd_cpf"));
			usuario.setNome(rs.getString("nm_nome"));
			usuario.setSenha(rs.getString("cd_senha"));
			usuario.setApelidoUsuario(rs.getString("nm_apelidousuario"));
			usuario.setTipoPerfilInvestidor(rs.getString("cd_perfilinvestidor"));
			usuario.setTipoFaturamento(rs.getString("cd_tipofaturamento"));

			usuarios.add(usuario);
		}
		stmt.close();
		rs.close();

		return usuarios;
	}

	public UsuarioModel selectUsuarioById(String cpf) throws SQLException {
		UsuarioModel usuario = null;
		String sql = "SELECT * FROM t_user WHERE cd_cpf = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, cpf);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			usuario = new UsuarioModel();
			usuario.setCpf(rs.getString("cd_cpf"));
			usuario.setNome(rs.getString("nm_nome"));
			usuario.setSenha(rs.getString("cd_senha"));
			usuario.setApelidoUsuario(rs.getString("nm_apelidousuario"));
			usuario.setTipoPerfilInvestidor(rs.getString("cd_perfilinvestidor"));
			usuario.setTipoFaturamento(rs.getString("cd_tipofaturamento"));

		}
		stmt.close();
		rs.close();

		return usuario;
	}

	public void delete(String cpf) throws SQLException {
		String sql = "DELETE FROM t_user WHERE cd_cpf = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, cpf);
		stmt.execute();
		stmt.close();
	}

	public void update(UsuarioModel usuario) throws SQLException {
		String sql = "UPDATE t_user SET nm_nome=?, cd_senha=?, nm_apelidousuario=?, cd_perfilinvestidor=?, cd_tipofaturamento=? WHERE cd_cpf=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getSenha());
		stmt.setString(3, usuario.getApelidoUsuario());
		stmt.setString(4, usuario.getTipoPerfilInvestidor());
		stmt.setString(5, usuario.getTipoFaturamento());
		stmt.setString(6, usuario.getCpf());

		stmt.execute();
		stmt.close();
	}

}
