package br.com.fiap.rocketMoney.teste;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.rocketMoney.DAO.DicaDAO;
import br.com.fiap.rocketMoney.DAO.FormaPagamentoDAO;
import br.com.fiap.rocketMoney.DAO.GastoDAO;
import br.com.fiap.rocketMoney.DAO.MetaDAO;
import br.com.fiap.rocketMoney.DAO.RendaDAO;
import br.com.fiap.rocketMoney.DAO.UsuarioDAO;
import br.com.fiap.rocketMoney.DAO.GastoDAO;
import br.com.fiap.rocketMoney.Enums.CategoriaGastoEnum;
import br.com.fiap.rocketMoney.Enums.ModalidadeFormaPagmentoEnum;
import br.com.fiap.rocketMoney.Enums.PeriodoVencimentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoFaturamentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoPerfilInvestidorEnum;
import br.com.fiap.rocketMoney.Enums.TipoPeriodicidadeRendaEnum;
import br.com.fiap.rocketMoney.Enums.TipoRendaEnum;
import br.com.fiap.rocketMoney.model.DicaModel;
import br.com.fiap.rocketMoney.model.FormaPagamentoModel;
import br.com.fiap.rocketMoney.model.GastoFixoModel;
import br.com.fiap.rocketMoney.model.GastoMensalModel;
import br.com.fiap.rocketMoney.model.GastoModel;
import br.com.fiap.rocketMoney.model.MetaModel;
import br.com.fiap.rocketMoney.model.RendaModel;
import br.com.fiap.rocketMoney.model.UsuarioModel;

public class TesteBase {

	public static void main(String[] args) throws SQLException {

		//inicializando os objetos para conectar com o banco
		DicaDAO daoDica = new DicaDAO();
		UsuarioDAO daoUsuario = new UsuarioDAO();
		RendaDAO daoRenda = new RendaDAO();
		MetaDAO daoMeta = new MetaDAO();
		FormaPagamentoDAO daoFormaPagamento = new FormaPagamentoDAO();
		GastoDAO daoGasto = new GastoDAO();

		//setando valores para os construtores
		DicaModel dicaConservador = new DicaModel("4", "Invista", "MEDIO", "MODERADO", "Fixo");
		UsuarioModel usuario = new UsuarioModel("55555555555","michelinha","9874","michelan",TipoPerfilInvestidorEnum.MODERADO,TipoFaturamentoEnum.FIXO_MENSAL);
		RendaModel renda = new RendaModel("1", (float) 5000.00, TipoRendaEnum.ATIVA ,TipoPeriodicidadeRendaEnum.FIXOMENSAL,"trabalho na companhia xpto", usuario);
		RendaModel rendaupdate = new RendaModel("8", (float) 5000.00, TipoRendaEnum.ATIVA ,TipoPeriodicidadeRendaEnum.FIXOMENSAL,"trabalho na companhia xpto", usuario);
		MetaModel meta = new MetaModel ("meta-04", (float) 10000.50, (float) 1000.00, "30/04/2024", "comprar um novo celular", "Curto", usuario);
		FormaPagamentoModel formaPgto = new FormaPagamentoModel("008","amarelinho","credito/debito","15","5");

		
		GastoModel g;

		String opt = JOptionPane.showInputDialog("Agora vamos simular o cadastro de um gasto! \nDigite F caso seja um gasto Fixo ou M caso seja apenas esse Mês.");
		if (opt.equalsIgnoreCase("F")) {
			g = new GastoFixoModel();
		} else {
			g = new GastoMensalModel();
		}


		
/*
 * caso queira insegir um gasto mensal	
 * EX_1	
 */
//		g.setIdGasto("21");
//		g.setValorGasto(800.00);
//		g.setDescricaoGasto("convenio medico");
//		g.setDataGasto("28/04/2023");
//		g.setTipoGasto("Mensal");
//		g.setCategoriaGasto(CategoriaGastoEnum.SAUDE);
//		g.setUsuario(usuario);
//		g.setFormaPgto(formaPgto);
/*
 * caso queira insegir um gasto mensal	
 * EX_2	
 */
//		g.setIdGasto("20");
//		g.setValorGasto(122.00);
//		g.setDescricaoGasto("Pizza");
//		g.setDataGasto("28/04/2023");
//		g.setTipoGasto("Mensal");
//		g.setCategoriaGasto(CategoriaGastoEnum.ALIMENTACAO);
//		g.setUsuario(usuario);
//		g.setFormaPgto(formaPgto);

		if (g instanceof GastoFixoModel) {
			((GastoFixoModel) g).setIdGastoFixo("f3");
			((GastoFixoModel) g).setDiaLancamento("5");
			((GastoFixoModel) g).setPeriodo(PeriodoVencimentoEnum.MENSAL);
		} else {
			((GastoMensalModel) g).setIdGastoMensal("m4");
			((GastoMensalModel) g).setDataCompra("28/04/2023");
			((GastoMensalModel) g).setQuantidadeParcela(null);
			((GastoMensalModel) g).setModalidade(ModalidadeFormaPagmentoEnum.CREDITO);
			((GastoMensalModel) g).setIdFormaPagamentoUtilizado("cartão roxinho");
		}
		//System.out.println(g.toString());	
		
/*
 * Testes para clase DicaDAO
 */
		//dao.insert(dicaConservador);
		System.out.println(daoDica.getAll());
		//System.out.println(daoDica.selectByDicaId("3"));

/*
 * Testes para clase UsuarioDAO
 */
		//System.out.println(daoUsuario.getAll());
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

/*
 * Testes para clase MetaDAO
 */
	
		//daoMeta.insert(meta);
		//System.out.println(daoMeta.getAll());

/*
 * Testes para clase FormaPagamentoDAO
 */
		
//		System.out.println(daoFormaPagamento.getAll());
//		daoFormaPagamento.insert(formaPgto);
//		System.out.println(daoFormaPagamento.selectFormaPagamentoById(formaPgto.getIdFormaPagamento()));
		
/*
 * teste para clase GastoDAO 
 * 
 */
		//daoGasto.insert(g);
		//System.out.println(daoGasto.getAll());
		//System.out.println(daoGasto.selectGastoById("21"));
		//daoGasto.delete(daoGasto.selectGastoById("21"));
		//System.out.println(daoGasto.getAll());
		
	}

}

