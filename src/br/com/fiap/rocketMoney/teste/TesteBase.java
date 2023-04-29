package br.com.fiap.rocketMoney.teste;

import java.sql.SQLException;

import br.com.fiap.rocketMoney.DAO.DicaDAO;
import br.com.fiap.rocketMoney.DAO.UsuarioDAO;
import br.com.fiap.rocketMoney.Enums.TipoFaturamentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoPerfilInvestidorEnum;
import br.com.fiap.rocketMoney.model.DicaModel;
import br.com.fiap.rocketMoney.model.UsuarioModel;

public class TesteBase {

	public static void main(String[] args) throws SQLException {

		DicaDAO daoDica = new DicaDAO();
		UsuarioDAO daoUsuario = new UsuarioDAO();

		DicaModel dicaConservador = new DicaModel("4", "Invista", "MEDIO", "MODERADO", "Fixo");
		UsuarioModel usuario = new UsuarioModel("55555555555","michelinha","9874","michelan",TipoPerfilInvestidorEnum.MODERADO,TipoFaturamentoEnum.FIXO_MENSAL);

/*
 * Testes para clase DicaDAO
 */
		//dao.insert(dicaConservador);
		//System.out.println(dao.select());
		//System.out.println(daoDica.selectByDicaId("3"));
	

/*
 * Testes para clase UsuarioDAO
 */
		//System.out.println(daoUsuario.select());
		daoUsuario.insert(usuario);
		System.out.println(daoUsuario.selectUsuarioById("55555555555"));
		
		
		
		
		
	}

}
