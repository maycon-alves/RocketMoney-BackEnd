package br.com.fiap.rocketMoney.model;

import java.io.Serializable;

import br.com.fiap.rocketMoney.Enums.PeriodoVencimentoEnum;

public class GastoFixoModel extends GastoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8L;

	private String idGastoFixo;
	private String diaLancamento;
	private PeriodoVencimentoEnum periodo;

	public GastoFixoModel() {

	}

	public GastoFixoModel(String idGastoFixo, String diaLancamento, PeriodoVencimentoEnum periodo) {
		this.idGastoFixo = idGastoFixo;
		this.diaLancamento = diaLancamento;
		this.periodo = periodo;
	}
	
	public String getIdGastoFixo() {
		return idGastoFixo;
	}

	public void setIdGastoFixo(String idGastoFixo) {
		this.idGastoFixo = idGastoFixo;
	}

	public String getDiaLancamento() {
		return diaLancamento;
	}

	public void setDiaLancamento(String diaLancamento) {
		this.diaLancamento = diaLancamento;
	}

	public String getPeriodo() {
		return periodo.getDescricaoPeriodoVencimento();
	}

	public void setPeriodo(PeriodoVencimentoEnum periodo) {
		this.periodo = periodo;
	}

	public void setPeriodo(String periodo) {
		switch (periodo) {
		case "Anual", "ANUAL": {

			this.periodo = PeriodoVencimentoEnum.ANUAL;
			break;
		}
		case "Mensal", "MENSAL": {

			this.periodo = PeriodoVencimentoEnum.MENSAL;
			break;
		}
		case "Quinzenal", "QUINZENAL": {

			this.periodo = PeriodoVencimentoEnum.QUINZENAL;
			break;
		}
		case "Semanal", "SEMANAL": {

			this.periodo = PeriodoVencimentoEnum.SEMANAL;
			break;
		}
		case "DIARIA", "Diaria": {

			this.periodo = PeriodoVencimentoEnum.DIARIA;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + periodo);
		}
	}

	@Override
	public String toString() {
		return "GastoFixo [diaLancamento=" + diaLancamento + ", periodo=" + periodo + ", " + super.toString() + "]";
	}

}
