//package br.com.fiap.rocketMoney;
//
//import java.io.Serializable;
//
//import br.com.fiap.rocketMoney.Enums.CategoriaGastoEnum;
//import br.com.fiap.rocketMoney.Enums.PeriodoVencimentoEnum;
//
//public class GastoFixo extends Gasto implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 8L;
//
//	private int diaLancamento;
//	private PeriodoVencimentoEnum periodo;
//
//	public GastoFixo() {
//
//	}
//	
//	public GastoFixo(int diaLancamento, PeriodoVencimentoEnum periodo) {
//		this.diaLancamento = diaLancamento;
//		this.periodo = periodo;
//	}
//
//	public int getDiaLancamento() {
//		return diaLancamento;
//	}
//
//	public void setDiaLancamento(int diaLancamento) {
//		this.diaLancamento = diaLancamento;
//	}
//
//	public PeriodoVencimentoEnum getPeriodo() {
//		return periodo;
//	}
//
//	public void setPeriodo(PeriodoVencimentoEnum periodo) {
//		this.periodo = periodo;
//	}
//
//	@Override
//	public String toString() {
//		return "GastoFixo [diaLancamento=" + diaLancamento + ", periodo=" + periodo + ", " + super.toString() + "]";
//	}
//	
//
//}
