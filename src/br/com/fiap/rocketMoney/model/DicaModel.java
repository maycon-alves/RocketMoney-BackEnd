package br.com.fiap.rocketMoney.model;

import java.io.Serializable;

public class DicaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;

	private String idDica;
	private String descrcaoDica;
	private String featPrazo;
	private String featPerfilInvestidor;
	private String featTipoFaturamento;

	public DicaModel() {

	}

	public DicaModel(String idDica, String descrcaoDica, String featPrazo, String featPerfilInvestidor,
			String featTipoFaturamento) {
		this.idDica = idDica;
		this.descrcaoDica = descrcaoDica;
		this.featPrazo = featPrazo;
		this.featPerfilInvestidor = featPerfilInvestidor;
		this.featTipoFaturamento = featTipoFaturamento;
	}
	
	public String getIdDica() {
		return idDica;
	}

	public void setIdDica(String idDica) {
		this.idDica = idDica;
	}

	public String getDescrcaoDica() {
		return descrcaoDica;
	}

	public void setDescrcaoDica(String descrcaoDica) {
		this.descrcaoDica = descrcaoDica;
	}

	public String getFeatPrazo() {
		return featPrazo;
	}

	public void setFeatPrazo(String featPrazo) {
		this.featPrazo = featPrazo;
	}

	public String getFeatPerfilInvestidor() {
		return featPerfilInvestidor;
	}

	public void setFeatPerfilInvestidor(String featPerfilInvestidor) {
		this.featPerfilInvestidor = featPerfilInvestidor;
	}

	public String getFeatTipoFaturamento() {
		return featTipoFaturamento;
	}

	public void setFeatTipoFaturamento(String featTipoFaturamento) {
		this.featTipoFaturamento = featTipoFaturamento;
	}

	@Override
	public String toString() {
		return "Dica [idDica=" + idDica + ", descrcaoDica=" + descrcaoDica + ", featPrazo=" + featPrazo
				+ ", featPerfilInvestidor=" + featPerfilInvestidor + ", featTipoFaturamento=" + featTipoFaturamento
				+ "]";
	}

}
