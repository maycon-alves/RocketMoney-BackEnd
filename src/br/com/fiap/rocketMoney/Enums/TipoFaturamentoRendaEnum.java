package br.com.fiap.rocketMoney.Enums;

/**
 * classe responsavel por armazenar os possiveis valores para o atributo
 * Faturamento da Renda
 * 
 * @author Equipe RocketMoney | Maycon Alves
 *
 */
public enum TipoFaturamentoRendaEnum {
	FIXOSEMANAL("Fixo Semanal"), FIXOMENSAL("Fixo Mensal"), FIXOANUAL("Fixo Anual"), VARIAVEL("Variavel");

	private String descricaoFaturamentoRenda;

	/**
	 * Metodo responsavel por inserir a descricao de um determinado valor do Enum
	 * 
	 * @param descricaoFaturamento
	 */
	private TipoFaturamentoRendaEnum(String descricaoFaturamentoRenda) {
		this.descricaoFaturamentoRenda = descricaoFaturamentoRenda;
	}

	/**
	 * Metodo responsavel por retornar a descricao de um Enum a partir da sua chave
	 * 
	 * @return string
	 */
	public String getDescricaoFaturamentoRenda() {
		return descricaoFaturamentoRenda;
	}
}
