package br.com.fiap.rocketMoney;

import javax.swing.JOptionPane;

import br.com.fiap.rocketMoney.Enums.CategoriaGastoEnum;
import br.com.fiap.rocketMoney.Enums.ModalidadeFormaPagmentoEnum;
import br.com.fiap.rocketMoney.Enums.PeriodoVencimentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoFaturamentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoPerfilInvestidorEnum;

public class TesteMain {
	public static void main(String[] args) {

		Usuario user = new Usuario("12345678910", "maycon", "paodequeijo123", "mykemaster",
				TipoPerfilInvestidorEnum.CONSERVADOR, TipoFaturamentoEnum.FIXOMENSAL);
		System.out.println("Olá, " + user.getApelidoUsuario() + " seu cadastro com o CPF - " + user.getCpf()
				+ " foi finalizado com sucesso!");
		System.out.println("Parabéns, seu perfil como invertidor é: " + user.getTipoPerfilInvestidor()
				+ "\nE o seu faturamento é: " + user.getTipoFaturamento());

		System.out.println("\n#########################################################################\n");


		Gasto g;
		
		String opt = JOptionPane.showInputDialog("Digite F caso seja um gasto Fixo ou M caso seja apenas esse Mês.");
		if (opt.equalsIgnoreCase("F")){
			//System.out.println(opt.toString());
			g = new GastoFixo();
		}else {
			g = new GastoMensal();
		}
		
		g.setIdGasto("021e52cd-a950-4505-a339-726c337ca12e");
		g.setValorGasto(2300.00);
		g.setDescricaoGasto("Aluguel Apartamento");
		g.setCategoriaGasto(CategoriaGastoEnum.DESPESA_FIXA);
		
		if (g instanceof GastoFixo) {
			((GastoFixo)g).setPeriodo(PeriodoVencimentoEnum.MENSAL);
			((GastoFixo) g).setDiaLancamento(5);
		}else {
			((GastoMensal)g).setApelidoFormaPagamentoUtilizado("cartão roxinho");
			((GastoMensal)g).setDataCompra("10/03/2023");
			((GastoMensal)g).setQuantidadeParcela(opt);
			((GastoMensal)g).setModalidade(ModalidadeFormaPagmentoEnum.CREDITO);
		}
		System.out.println(g.toString());
		System.out.println(opt);
	}
}