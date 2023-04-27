package br.com.fiap.rocketMoney.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.rocketMoney.factory.ConnectionFactory;
import br.com.fiap.rocketMoney.model.DicaModel;

public class DicaDAO {

	private Connection conexao;

	public DicaDAO() {
		this.conexao = new ConnectionFactory().conectar();
		System.out.println("Conectou!");
	}

	// Inserção de uma dica
	public void insert(DicaModel dica) throws SQLException {
		String sql = "INSERT INTO t_dica (id_dica, ds_dica, ds_featprazo, ds_featperfilinvestidor, ds_feattipofaturamento) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, dica.getIdDica());
		stmt.setString(2, dica.getDescrcaoDica());
		stmt.setString(3, dica.getFeatPrazo());
		stmt.setString(4, dica.getFeatPerfilInvestidor());
		stmt.setString(5, dica.getFeatTipoFaturamento());

		stmt.execute();
		stmt.close();
	}

	// Seleciona todas as dicas da tabela de dica
	public List<DicaModel> select() throws SQLException {

		List<DicaModel> dicas = new ArrayList<DicaModel>();
		String sql = "SELECT * FROM t_dica";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			DicaModel dica = new DicaModel();
			dica.setIdDica(rs.getString("id_dica"));
			dica.setDescrcaoDica(rs.getString("ds_dica"));
			dica.setFeatPrazo(rs.getString("ds_featprazo"));
			dica.setFeatPerfilInvestidor(rs.getString("ds_featperfilinvestidor"));
			dica.setFeatTipoFaturamento(rs.getString("ds_feattipofaturamento"));

			dicas.add(dica);
		}

		stmt.close();
		rs.close();
		return dicas;
	}

	// Seleção de uma dica por um determinado Id
	public DicaModel selectByDicaId(String id) throws SQLException {
		DicaModel dica = null;
		String sql = "SELECT * FROM t_dica WHERE id_dica=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			dica = new DicaModel();
			dica.setIdDica(rs.getString("id_dica"));
			dica.setDescrcaoDica(rs.getString("ds_dica"));
			dica.setFeatPrazo(rs.getString("ds_featprazo"));
			dica.setFeatPerfilInvestidor(rs.getString("ds_featperfilinvestidor"));
			dica.setFeatTipoFaturamento(rs.getString("ds_feattipofaturamento"));
		}

		rs.close();
		stmt.close();
		return dica;
	}

	// Deleção de uma dica
	public void delete(String id_dica) throws SQLException {
		String sql = "DELETE FROM t_dica WHERE id_dica = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, id_dica);
		stmt.execute();
		stmt.close();
	}

	// Alteração de uma dica
	public void update(DicaModel dica) throws SQLException {
		String sql = "UPDATE t_dica SET ds_dica = ?, ds_featprazo = ?, ds_featperfilinvestidor = ?, ds_feattipofaturamento = ? WHERE id_dica = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, dica.getDescrcaoDica());
		stmt.setString(2, dica.getFeatPrazo());
		stmt.setString(3, dica.getFeatPerfilInvestidor());
		stmt.setString(4, dica.getFeatTipoFaturamento());
		stmt.setString(5, dica.getIdDica());

		stmt.execute();
		stmt.close();
	}

}
