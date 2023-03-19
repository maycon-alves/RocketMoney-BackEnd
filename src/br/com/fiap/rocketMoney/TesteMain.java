package br.com.fiap.rocketMoney;

import br.com.fiap.rocketMoney.Enums.CategoriaGastoEnum;
import br.com.fiap.rocketMoney.Enums.PeriodoVencimentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoFaturamentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoPerfilInvestidorEnum;

public class TesteMain {
	public static void main(String[] args) {
		
		
		Usuario user = new Usuario(
				"12345678910",
				"maycon",
				"paodequeijo123",
				"mykemaster",
				TipoPerfilInvestidorEnum.CONSERVADOR,
				TipoFaturamentoEnum.FIXOMENSAL);
		System.out.println("Olá, " + user.getApelidoUsuario() + " seu cadastro com o CPF - " + user.getCpf() + " foi finalizado com sucesso!");
		System.out.println("Parabéns, seu perfil como invertidor é: " + user.getTipoPerfilInvestidor() +"\nE o seu faturamento é: "+ user.getTipoFaturamento());
	
		System.out.println("\n#########################################################################\n");
		GastoFixo gasto = new GastoFixo(
				"021e52cd-a950-4505-a339-726c337ca12e",
				2300.00,
				"Aluguel Apartamento",
				CategoriaGastoEnum.DESPESAFIXA,
				5,
				PeriodoVencimentoEnum.MENSAL);
		System.out.println("Você cadastrou com sucesso o seu gasto com "+gasto.getDescricaoGasto()+" no valor de: " + gasto.getValorGasto()+" "+gasto.getPeriodo());
	
	}
}
