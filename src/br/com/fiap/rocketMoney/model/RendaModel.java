package br.com.fiap.rocketMoney.model;

import java.io.Serializable;

import br.com.fiap.rocketMoney.Enums.TipoPeriodicidadeRendaEnum;
import br.com.fiap.rocketMoney.Enums.TipoRendaEnum;

public class RendaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;

	private String idRenda;
	private float valorRenda;
	private TipoRendaEnum tipoRenda;
	private TipoPeriodicidadeRendaEnum periodicidadeRenda;
	private String descricaoRenda;
	private UsuarioModel usuario;

	public RendaModel() {

	}


	public RendaModel(String idRenda, float valorRenda, TipoRendaEnum tipoRenda, TipoPeriodicidadeRendaEnum periodicidadeRenda,
			String descricaoRenda, UsuarioModel usuario) {
		super();
		this.idRenda = idRenda;
		this.valorRenda = valorRenda;
		this.tipoRenda = tipoRenda;
		this.periodicidadeRenda = periodicidadeRenda;
		this.descricaoRenda = descricaoRenda;
		this.usuario = usuario;
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

//	public TipoRendaEnum getTipoRenda() {
//		return tipoRenda;
//	}
	
	public String getTipoRenda() {
		return tipoRenda.getDescricaoTipoRenda();
	}

	public void setTipoRenda(TipoRendaEnum tipoRenda) {
		this.tipoRenda = tipoRenda;
	}
	
	public void setTipoRenda(String tipoRenda) {
		switch (tipoRenda) {
		case "ATIVA", "Ativa", "Renda Ativa": {
			this.tipoRenda = TipoRendaEnum.ATIVA;
			break;
		}
		case "PASSIVA", "Passiva", "Renda Passiva": {
			this.tipoRenda = TipoRendaEnum.PASSIVA;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoRenda);
		}
	}

	public String getPeriodicidadeRenda() {
		return periodicidadeRenda.getDescricaoFaturamentoRenda();
	}
	
	public void setPeriodicidadeRenda(TipoPeriodicidadeRendaEnum periodicidadeRenda) {
		this.periodicidadeRenda = periodicidadeRenda;
	}
	
	public void setPeriodicidadeRenda(String periodicidadeRenda) {
		switch (periodicidadeRenda) {
		case "FIXOSEMANAL", "Fixo Semanal", "Fixo_Semanal": {
			this.periodicidadeRenda = TipoPeriodicidadeRendaEnum.FIXOSEMANAL;
			break;
		}
		case "FIXOMENSAL", "Fixo Mensal", "Fixo_Mensal": {
			this.periodicidadeRenda = TipoPeriodicidadeRendaEnum.FIXOMENSAL;
			break;
		}
		case "FIXOANUAL", "Fixo_anual", "Fixo anual": {
			this.periodicidadeRenda = TipoPeriodicidadeRendaEnum.FIXOANUAL;
			break;
		}
		case "VARIAVEL", "variavel", "Variavel": {
			this.periodicidadeRenda = TipoPeriodicidadeRendaEnum.VARIAVEL;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoRenda);
		}
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
