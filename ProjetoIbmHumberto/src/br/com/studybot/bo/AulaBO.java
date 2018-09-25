package br.com.studybot.bo;

import java.util.List;

import br.com.studybot.beans.Aula;
import br.com.studybot.dao.AulaDAO;

/**
 * 
 * @author studyBot
 * @version 1.0
 * @see AlulaBO, Aula
 *
 */
public class AulaBO {
	/**
	 * 
	 * @param objAula
	 * @return
	 * @throws Exception
	 * 
	 *                   Classe responsável por manipular as regras relacionadas ao
	 *                   cadastro de Aula
	 * 
	 */

	public static String cadastroAula(Aula objAula) throws Exception {

		if (objAula.getCodigo() < 1) {
			return " Código invalido";
		}
		if (objAula.getNome().length() < 1) {
			return "Nome invalido";
		}
		if (objAula.getDescricao().length() > 30) {
			return "Descrição deve ter apenas 30 caracter ";
		}

		AulaDAO dao = new AulaDAO();
		dao.adicionar(objAula);
		dao.fechar();
		return null;
	}

	public static List<Aula> consultarPorNome(String n) throws Exception {
		AulaDAO dao = new AulaDAO();
		List<Aula> aula1 = dao.mostrarAula(n);
		dao.fechar();
		return aula1;
	}

}
