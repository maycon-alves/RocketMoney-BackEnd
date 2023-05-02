package br.com.fiap.rocketMoney.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.rocketMoney.factory.ConnectionFactory;
import br.com.fiap.rocketMoney.model.RendaModel;

public class RendaDAO {

	private Connection conexao;

	public RendaDAO() {
		this.conexao = new ConnectionFactory().conectar();
		System.out.println("Conectou!");
	}

	public void insert(RendaModel renda) throws SQLException {
		String sql = "INSERT INTO t_renda (id_renda, vl_renda, cd_tiporenda, cd_periodicidaderenda, ds_descricaorenda, t_user_cd_cpf) VALUES (?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, renda.getIdRenda());
		stmt.setFloat(2, renda.getValorRenda());
		stmt.setString(3, renda.getTipoRenda());
		stmt.setString(4, renda.getPeriodicidadeRenda());
		stmt.setString(5, renda.getDescricaoRenda());
		stmt.setString(6, renda.getCpfUsuario());

		stmt.execute();
		stmt.close();
		
	}
	
	public List<RendaModel> getAll() throws SQLException{
		List<RendaModel> rendas = new ArrayList<RendaModel>();
		String sql = "SELECT * FROM t_renda";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			RendaModel renda = new RendaModel();
			renda.setIdRenda(rs.getString("id_renda"));
			renda.setValorRenda(rs.getFloat("vl_renda"));
			renda.setTipoRenda(rs.getString("cd_tiporenda"));
			renda.setPeriodicidadeRenda(rs.getString("cd_periodicidaderenda"));
			renda.setDescricaoRenda(rs.getString("ds_descricaorenda"));
			rendas.add(renda);
		}
		stmt.close();
		rs.close();
		
		return rendas;
	}
	
	public RendaModel selectRendaById(String id) throws SQLException {
		RendaModel renda = null;
		String sql = "SELECT * FROM t_renda WHERE id_renda=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			renda = new RendaModel();
			renda.setIdRenda(rs.getString("id_renda"));
			renda.setValorRenda(rs.getFloat("vl_renda"));
			renda.setTipoRenda(rs.getString("cd_tiporenda"));
			renda.setPeriodicidadeRenda(rs.getString("cd_periodicidaderenda"));
			renda.setDescricaoRenda(rs.getString("ds_descricaorenda"));
		}
		stmt.close();
		rs.close();
		
		return renda;
		
	}
	
	public void delete(String id) throws SQLException {
		String sql = "DELETE FROM t_renda WHERE id_renda = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		stmt.execute();
		stmt.close();
	}
	
	public void update(RendaModel renda) throws SQLException {
		String sql = "UPDATE t_renda SET vl_renda=?, cd_tiporenda=?, cd_periodicidaderenda=?, ds_descricaorenda=? WHERE id_renda=? AND t_user_cd_cpf = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setFloat(1, renda.getValorRenda());
		stmt.setString(2, renda.getTipoRenda());
		stmt.setString(3, renda.getPeriodicidadeRenda());
		stmt.setString(4, renda.getDescricaoRenda());
		stmt.setString(5, renda.getIdRenda());
		stmt.setString(6, renda.getCpfUsuario());

		stmt.execute();
		stmt.close();
	}

}
