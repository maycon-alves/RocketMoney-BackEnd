package br.com.fiap.rocketMoney.model;

import java.io.Serializable;

public class MetaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private String idMeta;
	private float valorMeta;
	private float valorAtual;
	private String dataLimite;
	private String descricaoObjetivo;
	private String descricaoPrazo;
	private String dataRegistroMeta;
	private UsuarioModel usuario;
	
	public String getDataRegistroMeta() {
		return dataRegistroMeta;
	}

	public void setDataRegistroMeta(String dataRegistroMeta) {
		this.dataRegistroMeta = dataRegistroMeta;
	}

	public MetaModel() {

	}

	public MetaModel(String idMeta, float valorMeta, float valorAtual, String dataLimite, String descricaoObjetivo,
			String descricaoPrazo, UsuarioModel usuario) {
		this.idMeta = idMeta;
		this.valorMeta = valorMeta;
		this.valorAtual = valorAtual;
		this.dataLimite = dataLimite;
		this.descricaoObjetivo = descricaoObjetivo;
		this.descricaoPrazo = descricaoPrazo;
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

	public String getDataLimite() {
		return dataLimite;
	}

	public void setDataLimite(String dataLimite) {
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

	@Override
	public String toString() {
		return "Meta [idMeta=" + idMeta + ", valorMeta=" + valorMeta + ", valorAtual=" + valorAtual + ", dataLimite="
				+ dataLimite + ", descricaoObjetivo=" + descricaoObjetivo + ", descricaoPrazo=" + descricaoPrazo + "]";
	}

}
