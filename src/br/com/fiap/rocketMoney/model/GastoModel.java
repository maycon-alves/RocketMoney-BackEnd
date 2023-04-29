package br.com.fiap.rocketMoney.model;

//import java.io.Serializable;

import br.com.fiap.rocketMoney.Enums.CategoriaGastoEnum;

public abstract class GastoModel{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 7L;
	private String idGasto;
	private Double valorGasto;
	private String descricaoGasto;
	private String dataGasto;
	private String tipoGasto; //[Fixo, Mensal]
	private CategoriaGastoEnum categoriaGasto;
	private UsuarioModel usuario;
	private FormaPagamentoModel formaPgto;
	
	
	public GastoModel() {
		
	}

	public GastoModel(String idGasto, Double valorGasto, String descricaoGasto, CategoriaGastoEnum categoriaGasto, UsuarioModel usuario, FormaPagamentoModel formaPgto) {
		this.idGasto = idGasto;
		this.valorGasto = valorGasto;
		this.descricaoGasto = descricaoGasto;
		this.categoriaGasto = categoriaGasto;
		this.usuario = usuario;
		this.formaPgto = formaPgto;
	}
	
	public String getDataGasto() {
		return dataGasto;
	}

	public void setDataGasto(String dataGasto) {
		this.dataGasto = dataGasto;
	}

	public String getTipoGasto() {
		return tipoGasto;
	}
	
	public void setTipoGasto(String tipoGasto) {
		this.tipoGasto = tipoGasto;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public String getCpfUsuario() {
		return usuario.getCpf();
	}	
	
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public FormaPagamentoModel getFormaPgto() {
		return formaPgto;
	}
	
	public String getIdFormaPgto() {
		return formaPgto.getIdFormaPagamento();
	}

	public void setFormaPgto(FormaPagamentoModel formaPgto) {
		this.formaPgto = formaPgto;
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

//	public CategoriaGastoEnum getCategoriaGasto() {
//		return categoriaGasto;
//	}

	public String getCategoriaGasto() {
		return categoriaGasto.getDescricaoCategoriaGasto();
	}
	
	public void setCategoriaGasto(CategoriaGastoEnum categoriaGasto) {
		this.categoriaGasto = categoriaGasto;
	}
	
	public void setCategoriaGasto(String categoriaGasto) {
		switch (categoriaGasto) {
		case "Alimentação", "ALIMENTACAO": {			
			this.categoriaGasto = CategoriaGastoEnum.ALIMENTACAO;
			break;
		}
		case "Saúde", "Saude", "SAUDE": {			
			this.categoriaGasto = CategoriaGastoEnum.ALIMENTACAO;
			break;
		}
		case "Lazer", "LAZER": {			
			this.categoriaGasto = CategoriaGastoEnum.ALIMENTACAO;
			break;
		}
		case "Impulso", "IMPULSO": {			
			this.categoriaGasto = CategoriaGastoEnum.ALIMENTACAO;
			break;
		}
		case "Despesa_Fixa", "DESPESA_FIXA", "Despesa Fixa": {			
			this.categoriaGasto = CategoriaGastoEnum.ALIMENTACAO;
			break;
		}
		case "Imprevisto", "IMPREVISTO": {			
			this.categoriaGasto = CategoriaGastoEnum.ALIMENTACAO;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + categoriaGasto);
		}
		
		
	}
	
	@Override
	public String toString() {
		return "idGasto=" + idGasto + ", valorGasto=" + valorGasto + ", descricaoGasto=" + descricaoGasto
				+ ", categoriaGasto=" + categoriaGasto;
	}

}
