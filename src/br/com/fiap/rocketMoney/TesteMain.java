package br.com.fiap.rocketMoney;

import javax.swing.JOptionPane;

import br.com.fiap.rocketMoney.Enums.CategoriaGastoEnum;
import br.com.fiap.rocketMoney.Enums.ModalidadeFormaPagmentoEnum;
import br.com.fiap.rocketMoney.Enums.PeriodoVencimentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoFaturamentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoPerfilInvestidorEnum;

public class TesteMain {
	public static void main(String[] args) {

		TipoPerfilInvestidorEnum perfil = TipoPerfilInvestidorEnum.NAO_INFORMADO;
		TipoFaturamentoEnum faturamento = TipoFaturamentoEnum.NAO_INFORMADO;

		String inCpf = JOptionPane.showInputDialog("Por favor informe seu CPF:");
		String inNome = JOptionPane.showInputDialog("Qual seu Nome?");
		String inSenha = JOptionPane.showInputDialog("Escolha uma senha:");
		String inApelido = JOptionPane.showInputDialog("Como você gostaria de ser chamado?");
		String inTipoFaturamento = JOptionPane.showInputDialog(
				"Precisamos saber qual a periodicidade do seu faturamento, digite: \nFS(Fixo Semanal)\nFM(Fixo Mensal)\nFA(Fixo Anual)\nVR(Variavel)\nMT(Misto)\n");
		String inExperiencia = JOptionPane.showInputDialog("Você já tem experiência com investimentos? (S/N)");
		String inPrioridade = JOptionPane.showInputDialog(
				"Oque é mais importante para você?: \nSaber exatamente quanto vai ganhar - (1)\nGanhar o máximo de rendimento mesmo que tenha algum risco - (2)");
		String inQuantidadeTempo = JOptionPane.showInputDialog(
				"Por quanto tempo aceitaria quardar o seu dinheiro sem poder resgatar?: \n De 1 ate 3 anos - (1)\n De 3-5 anos - (2)\n Mais de 5 anos - (3)");

		switch (inTipoFaturamento.toString()) {
		case "FS", "Fs", "fs", "fS":
			faturamento = TipoFaturamentoEnum.FIXO_SEMANAL;
			break;
		case "FM", "Fm", "fm", "fM":
			faturamento = TipoFaturamentoEnum.FIXO_MENSAL;
			break;
		case "FA", "Fa", "fa", "fA":
			faturamento = TipoFaturamentoEnum.FIXO_ANUAL;
			break;
		case "VR", "Vr", "vr", "vR":
			faturamento = TipoFaturamentoEnum.VARIAVEL;
			break;
		case "MT", "Mt", "mt", "mT":
			faturamento = TipoFaturamentoEnum.MISTO;
			break;
		default:
			faturamento = TipoFaturamentoEnum.NAO_INFORMADO;
			break;
		}
		if (inExperiencia.equalsIgnoreCase("s")) {
			String inAssumeRisco = JOptionPane
					.showInputDialog("Tem investimentos em renda variavel de alto risco? (S/N)");
			if (inAssumeRisco.equalsIgnoreCase("s")) {
				perfil = TipoPerfilInvestidorEnum.EXPERIENTE;
			} else {
				if (inAssumeRisco.equalsIgnoreCase("n")
						|| (inPrioridade.equalsIgnoreCase("2") && inQuantidadeTempo.equalsIgnoreCase("2"))) {
					perfil = TipoPerfilInvestidorEnum.MODERADO;
				}
			}
		} else {
			perfil = TipoPerfilInvestidorEnum.CONSERVADOR;

		}

		Usuario user = new Usuario(inCpf, inNome, inSenha, inApelido, perfil, faturamento);

		System.out.println("Olá, " + user.getApelidoUsuario() + " seu cadastro com o CPF - " + user.getCpf()
				+ " foi finalizado com sucesso!");
		System.out.println("Parabéns, seu perfil como invertidor é: " + user.getTipoPerfilInvestidor()
				+ "\nE o seu faturamento é: " + user.getTipoFaturamento());

		System.out.println(user.toString());
		System.out.println("\n#########################################################################\n");

		Gasto g;

		String opt = JOptionPane.showInputDialog(
				"Agora vamos simular o cadastro de um gasto! \nDigite F caso seja um gasto Fixo ou M caso seja apenas esse Mês.");
		if (opt.equalsIgnoreCase("F")) {
			g = new GastoFixo();
		} else {
			g = new GastoMensal();
		}

		g.setIdGasto("021e52cd-a950-4505-a339-726c337ca12e");
		g.setValorGasto(2300.00);
		g.setDescricaoGasto("Aluguel Apartamento");
		g.setCategoriaGasto(CategoriaGastoEnum.DESPESA_FIXA);

		if (g instanceof GastoFixo) {
			((GastoFixo) g).setPeriodo(PeriodoVencimentoEnum.MENSAL);
			((GastoFixo) g).setDiaLancamento(5);
		} else {
			((GastoMensal) g).setApelidoFormaPagamentoUtilizado("cartão roxinho");
			((GastoMensal) g).setDataCompra("10/03/2023");
			((GastoMensal) g).setQuantidadeParcela(opt);
			((GastoMensal) g).setModalidade(ModalidadeFormaPagmentoEnum.CREDITO);
		}
		System.out.println(g.toString());
	}
}