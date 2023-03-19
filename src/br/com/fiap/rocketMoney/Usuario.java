package br.com.fiap.rocketMoney;

import java.io.Serializable;

import br.com.fiap.rocketMoney.Enums.TipoFaturamentoEnum;
import br.com.fiap.rocketMoney.Enums.TipoPerfilInvestidorEnum;

/**
 * Subclasse abstrata para entidade de usuario
 * 
 * @author Equipe RocketMoney | Maycon Alves
 *
 */
public class Usuario extends Pessoa implements Serializable {
	/**
	 * esta classe e um javabean
	 */
	private static final long serialVersionUID = 2L;
	/**
	 * string de conhecimento do usuario utilizada para autenticacao no momento de
	 * login
	 */
	private String senha;
	/**
	 * string personalizavel pelo usuario utilizada para relacionamento com o
	 * usuario
	 */
	private String apelidoUsuario;
	/**
	 * sinaliza a experiencia do usuario com investimentos ENUM:[conservador;
	 * moderado; experiente;]
	 */
	private TipoPerfilInvestidorEnum tipoPerfilInvestidor;
	/**
	 * sinaliza a frequencia do faturamento do usuario
	 * ENUM:[fixoSemanal;fixoMensal;fixoAnual;variavel;misto;]
	 */
	private TipoFaturamentoEnum tipoFaturamento;

	public Usuario() {

	}

	public Usuario(String cpf, String nome, String senha, String apelidoUsuario,
			TipoPerfilInvestidorEnum tipoPerfilInvestidor, TipoFaturamentoEnum tipoFaturamento) {
		super(cpf, nome);
		this.senha = senha;
		this.apelidoUsuario = apelidoUsuario;
		this.tipoPerfilInvestidor = tipoPerfilInvestidor;
		this.tipoFaturamento = tipoFaturamento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getApelidoUsuario() {
		return apelidoUsuario;
	}

	public void setApelidoUsuario(String apelidoUsuario) {
		this.apelidoUsuario = apelidoUsuario;
	}

	public String getTipoPerfilInvestidor() {
		return tipoPerfilInvestidor.getDescricaoPerfil();
	}

	public void setTipoPerfilInvestidor(TipoPerfilInvestidorEnum tipoPerfilInvestidor) {
		this.tipoPerfilInvestidor = tipoPerfilInvestidor;
	}

	public String getTipoFaturamento() {
		return tipoFaturamento.getDescricaoFaturamento();
	}

	public void setTipoFaturamento(TipoFaturamentoEnum tipoFaturamento) {
		this.tipoFaturamento = tipoFaturamento;
	}

	@Override
	public String toString() {
		return "Usuario [senha=" + senha + ", apelidoUsuario=" + apelidoUsuario + ", tipoPerfilInvestidor="
				+ tipoPerfilInvestidor + ", tipoFaturamento=" + tipoFaturamento + "]";
	}

}
