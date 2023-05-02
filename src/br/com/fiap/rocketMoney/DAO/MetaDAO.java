package br.com.fiap.rocketMoney.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.rocketMoney.factory.ConnectionFactory;
import br.com.fiap.rocketMoney.model.MetaModel;

public class MetaDAO {

	private Connection conexao;
	
	public MetaDAO() {
		this.conexao = new ConnectionFactory().conectar();
		System.out.println("Conectou!");
	}
	
	public void insert(MetaModel meta) throws SQLException {
		String sql = "INSERT INTO t_meta (id_meta, vl_meta, vl_valoratual, dt_datalimite, ds_descricaometa, ds_prazo, dt_registrometa, t_user_cd_cpf) VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, meta.getIdMeta());
		stmt.setFloat(2, meta.getValorMeta());
		stmt.setFloat(3, meta.getValorAtual());
		stmt.setString(4, meta.getDataLimite());
		stmt.setString(5, meta.getDescricaoObjetivo());
		stmt.setString(6, meta.getDescricaoPrazo());
		stmt.setString(7, meta.getDataRegistroMeta());
		stmt.setString(8, meta.getCpfUsuario());
		
		stmt.execute();
		stmt.close();		
	}
	
	public List<MetaModel> getAll() throws SQLException{
		List<MetaModel> metas = new ArrayList<MetaModel>();
		String sql = "SELECT * FROM t_meta";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			MetaModel meta = new MetaModel();
			meta.setIdMeta(rs.getString("id_meta"));
			meta.setValorMeta(rs.getFloat("vl_meta"));
			meta.setValorAtual(rs.getFloat("vl_valoratual"));
			meta.setDataLimite(rs.getString("dt_datalimite"));
			meta.setDescricaoObjetivo(rs.getString("ds_descricaometa"));
			meta.setDescricaoPrazo(rs.getString("ds_prazo"));
			meta.setDataRegistroMeta(rs.getString("dt_registrometa"));
			
			metas.add(meta);
		}
		stmt.close();
		rs.close();
		return metas;
	}
	
	public MetaModel selectMetaById(String id) throws SQLException {
		MetaModel meta = null;
		String sql = "SELECT * FROM t_meta WHERE id_meta=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			meta = new MetaModel();
			meta.setIdMeta(rs.getString("id_meta"));
			meta.setValorMeta(rs.getFloat("vl_meta"));
			meta.setValorAtual(rs.getFloat("vl_valoratual"));
			meta.setDataLimite(rs.getString("dt_datalimite"));
			meta.setDescricaoObjetivo(rs.getString("ds_descricaometa"));
			meta.setDescricaoPrazo(rs.getString("ds_prazo"));
			meta.setDataRegistroMeta(rs.getString("dt_registrometa"));
		}
		stmt.close();
		rs.close();
		return meta;
	}
	
	public void delete(String id) throws SQLException{
		String sql = "DELETE FROM t_meta WHERE id_meta=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		stmt.execute();
		stmt.close();
	}
	
	public void update(MetaModel meta) throws SQLException {
		String sql = "UPDATE t_meta\r\n"
				+ "SET vl_meta=?,\r\n"
				+"	   vl_valoratual=?"
				+ "    dt_datalimite=?,\r\n"
				+ "    ds_descricaometa=?,\r\n"
				+ "    ds_prazo=?,\r\n"
				+ "    dt_registrometa=?\r\n"
				+ "    t_user_cd_cpf=?,\r\n"
				+ "WHERE id_met=?;";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setFloat(1, meta.getValorMeta());
		stmt.setFloat(2, meta.getValorAtual());
		stmt.setString(3, meta.getDataLimite());
		stmt.setString(4, meta.getDescricaoObjetivo());
		stmt.setString(5, meta.getDescricaoPrazo());
		stmt.setString(6, meta.getDataRegistroMeta());
		stmt.setString(7, meta.getCpfUsuario());
		stmt.setString(8, meta.getIdMeta());
		
		stmt.execute();
		stmt.close();		
	}
	
}
