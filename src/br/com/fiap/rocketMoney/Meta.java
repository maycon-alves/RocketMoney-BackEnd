package br.com.fiap.rocketMoney;

import java.io.Serializable;
import java.util.Date;

public class Meta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private String idMeta;
	private float valorMeta;
	private float valorAtual;
	private Date dataLimite;
	private String descricaoObjetivo;
	private String descricaoPrazo;
	
	public Meta() {
		
	}
	public Meta(String idMeta, float valorMeta, float valorAtual, Date dataLimite, String descricaoObjetivo,
			String descricaoPrazo) {
		this.idMeta = idMeta;
		this.valorMeta = valorMeta;
		this.valorAtual = valorAtual;
		this.dataLimite = dataLimite;
		this.descricaoObjetivo = descricaoObjetivo;
		this.descricaoPrazo = descricaoPrazo;
	}
	
	public String getIdMeta() {
		return idMeta;
	}
	public void setIdMeta(String idMeta) {
		this.idMeta = idMeta;
	}
	public float getValorMeta() {
		return valorMeta;
	}
	public void setValorMeta(float valorMeta) {
		this.valorMeta = valorMeta;
	}
	public float getValorAtual() {
		return valorAtual;
	}
	public void setValorAtual(float valorAtual) {
		this.valorAtual = valorAtual;
	}
	public Date getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}
	public String getDescricaoObjetivo() {
		return descricaoObjetivo;
	}
	public void setDescricaoObjetivo(String descricaoObjetivo) {
		this.descricaoObjetivo = descricaoObjetivo;
	}
	public String getDescricaoPrazo() {
		return descricaoPrazo;
	}
	public void setDescricaoPrazo(String descricaoPrazo) {
		this.descricaoPrazo = descricaoPrazo;
	}
	
}
