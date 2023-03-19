package br.com.fiap.rocketMoney.Enums;


/**
 * classe responsavel por armazenar os possiveis valores para o atributo periodoVencimento
 * @author Equipe RocketMoney
 *
 */
public enum PeriodoVencimentoEnum {
	DIARIA ("Diária"), 
	SEMANAL ("Semanal"),
	QUINZENAL ("Quinzenal"),
	MENSAL ("Mensal"),
	ANUAL ("Anual");
	
	private String descricaoPeriodoVencimento;
	
	/**
	 * Metodo responsavel por inserir a descricao de um determinado valor do Enum
	 * @param descricaoFaturamento
	 */
	PeriodoVencimentoEnum (String descricaoPeriodoVencimento){
		this.descricaoPeriodoVencimento = descricaoPeriodoVencimento;
	}
	
	/**
	 * Metodo responsavel por retornar a descricao de um Enum a partir da sua chave
	 * @return string
	 */
	public String getDescricaoPeriodoVencimento() {
		return descricaoPeriodoVencimento;
	}

}
