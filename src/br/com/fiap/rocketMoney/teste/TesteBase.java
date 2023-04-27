package br.com.fiap.rocketMoney.teste;

import java.sql.SQLException;

import br.com.fiap.rocketMoney.DAO.DicaDAO;
import br.com.fiap.rocketMoney.model.DicaModel;

public class TesteBase {

	public static void main(String[] args) throws SQLException {

		DicaDAO dao = new DicaDAO();

		DicaModel dicaConservador = new DicaModel("4", "Invista", "MEDIO", "MODERADO", "Fixo");
		//DicaModel dicaModerado = new DicaModel();
		//System.out.println(dicaConservador.toString());
		
		//dao.insert(dicaConservador);
		//System.out.println(dao.select());
		System.out.println(dao.selectByDicaId("3"));
		
		
		
		
		
		
	}

}
