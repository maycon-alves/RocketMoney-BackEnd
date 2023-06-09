package br.com.fiap.rocketMoney.Enums;

/**
 * classe responsavel por armazenar os possiveis valores para o atributo
 * formaPagamento
 * 
 * @author Equipe RocketMoney | Maycon Alves
 *
 */
public enum ModalidadeFormaPagmentoEnum {

	CREDITO("Credito"), DEBITO("Debito"), DINHEIRO("Dinheiro"), PIX("Pix"), TED("TED"), DOC("DOC");

	private String descricaoModalidadeFormaPagamento;

	/**
	 * Metodo responsavel por inserir a descricao de um determinado valor do Enum
	 * 
	 * @param descricaoFaturamento
	 */
	private ModalidadeFormaPagmentoEnum(String descricaoModalidadeFormaPagamento) {
		this.descricaoModalidadeFormaPagamento = descricaoModalidadeFormaPagamento;
	}

	/**
	 * Metodo responsavel por retornar a descricao de um Enum a partir da sua chave
	 * 
	 * @return string
	 */
	public String getDescricaoModalidadeFormaPagamento() {
		return descricaoModalidadeFormaPagamento;
	}
	
	// TODO implementar metodo toString para retornar a lista de opções para o cliente no front

}
