package br.com.fiap.rocketMoney.Enums;

/**
 * classe responsavel por armazenar os possiveis valores para o atributo
 * tipoInvestidor
 * 
 * @author Equipe RocketMoney | Maycon Alves
 *
 */
public enum TipoPerfilInvestidorEnum {
	CONSERVADOR("Conservador"), MODERADO("Moderado"), EXPERIENTE("Experiente");

	private String descricaoPerfil;

	/**
	 * Metodo responsavel por inserir a descricao de um determinado valor do Enum
	 * 
	 * @param descricaoPerfil
	 */
	TipoPerfilInvestidorEnum(String descricaoPerfil) {
		this.descricaoPerfil = descricaoPerfil;
	}

	/**
	 * Metodo responsavel por retornar a descricao de um Enum a partir da sua chave
	 * 
	 * @return string
	 */
	public String getDescricaoPerfil() {
		return descricaoPerfil;
	}
}
