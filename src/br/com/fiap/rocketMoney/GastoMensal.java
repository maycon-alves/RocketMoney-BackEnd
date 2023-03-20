package br.com.fiap.rocketMoney;

import java.io.Serializable;

import br.com.fiap.rocketMoney.Enums.ModalidadeFormaPagmentoEnum;

public class GastoMensal extends Gasto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9L;
	private String dataCompra;
	private String quantidadeParcela;
	private String apelidoFormaPagamentoUtilizado;
	private ModalidadeFormaPagmentoEnum modalidade;

	public GastoMensal() {

	}

	public GastoMensal(String dataCompra, String quantidadeParcela, String apelidoFormaPagamentoUtilizado,
			ModalidadeFormaPagmentoEnum modalidade) {
		this.dataCompra = dataCompra;
		this.quantidadeParcela = quantidadeParcela;
		this.apelidoFormaPagamentoUtilizado = apelidoFormaPagamentoUtilizado;
		this.modalidade = modalidade;
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

	public String getApelidoFormaPagamentoUtilizado() {
		return apelidoFormaPagamentoUtilizado;
	}

	public void setApelidoFormaPagamentoUtilizado(String apelidoFormaPagamentoUtilizado) {
		this.apelidoFormaPagamentoUtilizado = apelidoFormaPagamentoUtilizado;
	}

	public ModalidadeFormaPagmentoEnum getModalidade() {
		return modalidade;
	}

	public void setModalidade(ModalidadeFormaPagmentoEnum modalidade) {
		this.modalidade = modalidade;
	}

	@Override
	public String toString() {
		return "GastoMensal [dataCompra=" + dataCompra + ", quantidadeParcela=" + quantidadeParcela
				+ ", apelidoFormaPagamentoUtilizado=" + apelidoFormaPagamentoUtilizado + ", modalidade=" + modalidade
				+ ", " + super.toString() + "]";
	}

}
