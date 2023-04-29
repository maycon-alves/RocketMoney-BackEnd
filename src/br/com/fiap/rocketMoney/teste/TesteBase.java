package br.com.fiap.rocketMoney.teste;

import java.sql.SQLException;

import br.com.fiap.rocketMoney.DAO.DicaDAO;
import br.com.fiap.rocketMoney.DAO.RendaDAO;
import br.com.fiap.rocketMoney.DAO.UsuarioDAO;
import br.com.fiap.rocketMoney.Enums.TipoFaturamentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoPerfilInvestidorEnum;
import br.com.fiap.rocketMoney.Enums.TipoPeriodicidadeRendaEnum;
import br.com.fiap.rocketMoney.Enums.TipoRendaEnum;
import br.com.fiap.rocketMoney.model.DicaModel;
import br.com.fiap.rocketMoney.model.RendaModel;
import br.com.fiap.rocketMoney.model.UsuarioModel;

public class TesteBase {

	public static void main(String[] args) throws SQLException {

		DicaDAO daoDica = new DicaDAO();
		UsuarioDAO daoUsuario = new UsuarioDAO();
		RendaDAO daoRenda = new RendaDAO();

		DicaModel dicaConservador = new DicaModel("4", "Invista", "MEDIO", "MODERADO", "Fixo");
		UsuarioModel usuario = new UsuarioModel("55555555555","michelinha","9874","michelan",TipoPerfilInvestidorEnum.MODERADO,TipoFaturamentoEnum.FIXO_MENSAL);
		RendaModel renda = new RendaModel("1", (float) 5000.00, TipoRendaEnum.ATIVA ,TipoPeriodicidadeRendaEnum.FIXOMENSAL,"trabalho na companhia xpto", usuario);
		RendaModel rendaupdate = new RendaModel("8", (float) 5000.00, TipoRendaEnum.ATIVA ,TipoPeriodicidadeRendaEnum.FIXOMENSAL,"trabalho na companhia xpto", usuario);
		
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
		//daoUsuario.insert(usuario);
		//System.out.println(daoUsuario.selectUsuarioById("55555555555"));
		
/*
 * Testes para clase RendaDAO
 * Por algum motivo quando temos um ID com 2 digitos ele não encontra atualiza ou deleta o registro na base
 */
		
		//daoRenda.insert(rendaupdate);
		//System.out.println(daoRenda.selectRendaById("10"));
		//daoRenda.update(rendaupdate);
		//System.out.println(daoRenda.selectRendaById("10"));
		//daoRenda.delete("10");
		
		
		
	}

}
