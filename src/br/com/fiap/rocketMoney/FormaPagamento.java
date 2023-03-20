package br.com.fiap.rocketMoney;

import java.io.Serializable;
import java.util.Date;

public class FormaPagamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6L;
	private String idFormaPagamento;
	private String apelidoFormaPagamento;
	private String tipoFormaPagmento;
	private Date dataVencimentoFatura;
	private Date dataAberturaFatura;
	
	public FormaPagamento() {
		
	}
	
	public FormaPagamento(String idFormaPagamento, String apelidoFormaPagamento, String tipoFormaPagmento,
			Date dataVencimentoFatura, Date dataAberturaFatura) {
		this.idFormaPagamento = idFormaPagamento;
		this.apelidoFormaPagamento = apelidoFormaPagamento;
		this.tipoFormaPagmento = tipoFormaPagmento;
		this.dataVencimentoFatura = dataVencimentoFatura;
		this.dataAberturaFatura = dataAberturaFatura;
	}

	public String getIdFormaPagamento() {
		return idFormaPagamento;
	}
	public void setIdFormaPagamento(String idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}
	public String getApelidoFormaPagamento() {
		return apelidoFormaPagamento;
	}
	public void setApelidoFormaPagamento(String apelidoFormaPagamento) {
		this.apelidoFormaPagamento = apelidoFormaPagamento;
	}
	public String getTipoFormaPagmento() {
		return tipoFormaPagmento;
	}
	public void setTipoFormaPagmento(String tipoFormaPagmento) {
		this.tipoFormaPagmento = tipoFormaPagmento;
	}
	public Date getDataVencimentoFatura() {
		return dataVencimentoFatura;
	}
	public void setDataVencimentoFatura(Date dataVencimentoFatura) {
		this.dataVencimentoFatura = dataVencimentoFatura;
	}
	public Date getDataAberturaFatura() {
		return dataAberturaFatura;
	}
	public void setDataAberturaFatura(Date dataAberturaFatura) {
		this.dataAberturaFatura = dataAberturaFatura;
	}
	
	
	
	
}
