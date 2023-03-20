package br.com.fiap.rocketMoney;

import java.io.Serializable;

import br.com.fiap.rocketMoney.Enums.TipoFaturamentoRendaEnum;
import br.com.fiap.rocketMoney.Enums.TipoRendaEnum;

public class Renda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;

	private String idRenda;
	private float valorRenda;
	private TipoRendaEnum tipoRenda;
	private TipoFaturamentoRendaEnum periodicidadeRenda;
	private String descricaoRenda;

	public Renda() {

	}

	public Renda(String idRenda, float valorRenda, TipoRendaEnum tipoRenda, TipoFaturamentoRendaEnum periodicidadeRenda,
			String descricaoRenda) {
		super();
		this.idRenda = idRenda;
		this.valorRenda = valorRenda;
		this.tipoRenda = tipoRenda;
		this.periodicidadeRenda = periodicidadeRenda;
		this.descricaoRenda = descricaoRenda;
	}

	public String getIdRenda() {
		return idRenda;
	}

	public void setIdRenda(String idRenda) {
		this.idRenda = idRenda;
	}

	public float getValorRenda() {
		return valorRenda;
	}

	public void setValorRenda(float valorRenda) {
		this.valorRenda = valorRenda;
	}

	public TipoRendaEnum getTipoRenda() {
		return tipoRenda;
	}

	public void setTipoRenda(TipoRendaEnum tipoRenda) {
		this.tipoRenda = tipoRenda;
	}

	public TipoFaturamentoRendaEnum getPeriodicidadeRenda() {
		return periodicidadeRenda;
	}

	public void setPeriodicidadeRenda(TipoFaturamentoRendaEnum periodicidadeRenda) {
		this.periodicidadeRenda = periodicidadeRenda;
	}

	public String getDescricaoRenda() {
		return descricaoRenda;
	}

	public void setDescricaoRenda(String descricaoRenda) {
		this.descricaoRenda = descricaoRenda;
	}

	@Override
	public String toString() {
		return "Renda [idRenda=" + idRenda + ", valorRenda=" + valorRenda + ", tipoRenda=" + tipoRenda
				+ ", periodicidadeRenda=" + periodicidadeRenda + ", descricaoRenda=" + descricaoRenda + "]";
	}

}
