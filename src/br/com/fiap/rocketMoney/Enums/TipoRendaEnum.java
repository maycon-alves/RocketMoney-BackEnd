package br.com.fiap.rocketMoney.Enums;

/**
 * classe responsavel por armazenar os possiveis valores para o atributo
 * tipoRenda
 * 
 * @author Equipe RocketMoney | Maycon Alves
 *
 */
public enum TipoRendaEnum {
	ATIVA("Ativa"), PASSIVA("Passiva");

	private String DescricaoTipoRenda;

	/**
	 * Metodo responsavel por inserir a descricao de um determinado valor do Enum
	 * 
	 * @param descricaoFaturamento
	 */
	TipoRendaEnum(String descricaoTipoRenda) {
		this.DescricaoTipoRenda = descricaoTipoRenda;
	}

	/**
	 * Metodo responsavel por retornar a descricao de um Enum a partir da sua chave
	 * 
	 * @return string
	 */
	public String getDescricaoTipoRenda() {
		return this.DescricaoTipoRenda;
	}
}
