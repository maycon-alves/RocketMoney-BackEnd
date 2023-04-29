package br.com.fiap.rocketMoney.model;

//import java.io.Serializable;

import br.com.fiap.rocketMoney.Enums.ModalidadeFormaPagmentoEnum;

public class GastoMensalModel extends GastoModel {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 9L;
	private String idGastoMensal;
	private String dataCompra;
	private String quantidadeParcela;
	private ModalidadeFormaPagmentoEnum modalidade;
	private String idFormaPagamentoUtilizado;

	public GastoMensalModel() {

	}

	public GastoMensalModel(String dataCompra, String quantidadeParcela, String apelidoFormaPagamentoUtilizado,
			ModalidadeFormaPagmentoEnum modalidade) {
		this.dataCompra = dataCompra;
		this.quantidadeParcela = quantidadeParcela;
		this.idFormaPagamentoUtilizado = apelidoFormaPagamentoUtilizado;
		this.modalidade = modalidade;
	}

	public String getIdGastoMensal() {
		return idGastoMensal;
	}

	public void setIdGastoMensal(String idGastoMensal) {
		this.idGastoMensal = idGastoMensal;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getQuantidadeParcela() {
		return quantidadeParcela;
	}

	public void setQuantidadeParcela(String quantidadeParcela) {
		this.quantidadeParcela = quantidadeParcela;
	}

	public String getIdFormaPagamentoUtilizado() {
		return idFormaPagamentoUtilizado;
	}

	public void setIdFormaPagamentoUtilizado(String apelidoFormaPagamentoUtilizado) {
		this.idFormaPagamentoUtilizado = apelidoFormaPagamentoUtilizado;
	}

	public String getModalidade() {
		return modalidade.getDescricaoModalidadeFormaPagamento();
	}

	public void setModalidade(ModalidadeFormaPagmentoEnum modalidade) {
		this.modalidade = modalidade;
	}

	public void setModalidade(String modalidade) {
		switch (modalidade) {
		case "Credito", "CREDITO": {

			this.modalidade = ModalidadeFormaPagmentoEnum.CREDITO;
			break;
		}
		case "Debito", "DEBITO": {

			this.modalidade = ModalidadeFormaPagmentoEnum.DEBITO;
			break;
		}
		case "Dinheiro", "DINHEIRO": {

			this.modalidade = ModalidadeFormaPagmentoEnum.DINHEIRO;
			break;
		}
		case "Pix", "PIX": {

			this.modalidade = ModalidadeFormaPagmentoEnum.PIX;
			break;
		}
		case "DOC": {

			this.modalidade = ModalidadeFormaPagmentoEnum.DOC;
			break;
		}
		case "TED": {

			this.modalidade = ModalidadeFormaPagmentoEnum.TED;
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + modalidade);
		}
	}

	@Override
	public String toString() {
		return "GastoMensal [dataCompra=" + dataCompra + ", quantidadeParcela=" + quantidadeParcela
				+ ", apelidoFormaPagamentoUtilizado=" + idFormaPagamentoUtilizado + ", modalidade=" + modalidade
				+ ", " + super.toString() + "]";
	}

}
