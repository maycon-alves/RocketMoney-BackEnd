package br.com.fiap.rocketMoney;

import java.io.Serializable;

import br.com.fiap.rocketMoney.Enums.CategoriaGastoEnum;

public abstract class Gasto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7L;
	private String idGasto;
	private Double valorGasto;
	private String descricaoGasto;
	private CategoriaGastoEnum categoriaGasto;
	
	public Gasto() {
		
	}

	public Gasto(String idGasto, Double valorGasto, String descricaoGasto, CategoriaGastoEnum categoriaGasto) {
		this.idGasto = idGasto;
		this.valorGasto = valorGasto;
		this.descricaoGasto = descricaoGasto;
		this.categoriaGasto = categoriaGasto;
	}

	public String getIdGasto() {
		return idGasto;
	}

	public void setIdGasto(String idGasto) {
		this.idGasto = idGasto;
	}

	public Double getValorGasto() {
		return valorGasto;
	}

	public void setValorGasto(Double valorGasto) {
		this.valorGasto = valorGasto;
	}

	public String getDescricaoGasto() {
		return descricaoGasto;
	}

	public void setDescricaoGasto(String descricaoGasto) {
		this.descricaoGasto = descricaoGasto;
	}

	public CategoriaGastoEnum getCategoriaGasto() {
		return categoriaGasto;
	}

	public void setCategoriaGasto(CategoriaGastoEnum categoriaGasto) {
		this.categoriaGasto = categoriaGasto;
	}

	@Override
	public String toString() {
		return "idGasto=" + idGasto + ", valorGasto=" + valorGasto + ", descricaoGasto=" + descricaoGasto
				+ ", categoriaGasto=" + categoriaGasto;
	}

}
