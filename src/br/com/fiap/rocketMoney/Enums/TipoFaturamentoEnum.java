package br.com.fiap.rocketMoney.Enums;

/**
 * classe responsavel por armazenar os possiveis valores para o atributo
 * Faturamento
 * 
 * @author Equipe RocketMoney | Maycon Alves
 *
 */
public enum TipoFaturamentoEnum {
	FIXO_SEMANAL("Fixo Semanal"), FIXO_MENSAL("Fixo Mensal"), FIXO_ANUAL("Fixo Anual"), VARIAVEL("Variavel"),
	MISTO("Misto"), NAO_INFORMADO("Nao Informado");

	private String descricaoFaturamento;

	/**
	 * Metodo responsavel por inserir a descricao de um determinado valor do Enum
	 * 
	 * @param descricaoFaturamento
	 */
	private TipoFaturamentoEnum(String descricaoFaturamento) {
		this.descricaoFaturamento = descricaoFaturamento;
	}

	/**
	 * Metodo responsavel por retornar a descricao de um Enum a partir da sua chave
	 * 
	 * @return string
	 */
	public String getDescricaoFaturamento() {
		return descricaoFaturamento;
	}
}
