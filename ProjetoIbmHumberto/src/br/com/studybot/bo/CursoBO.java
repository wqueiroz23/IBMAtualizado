package br.com.studybot.bo;


import br.com.studybot.beans.Curso;
import br.com.studybot.dao.CursoDAO;

/**
 * 
 * @author studyBot
 * @version 1.0
 * @see CursBO, Curso
 *
 */

public class CursoBO {
	
	
	/**
	 * 
	 * @param objCurso
	 * @return
	 * @throws Exception
	 *
	 * Classe responsável por manipular as regras relacionadas
	 * ao cadastro de curso
	 * 
	 * Código do curso permitido > que 1 (getCodigo)
	 * Nome do curso deve ter no máximo 30 caracteres (getNome)
	 * Descrição deve ter no máximo 40 caracteres  (getDescricao)
	 * valor do curso deve ser no mínimo 150 (getValor)
	 * 
	 * 
	 */


	public static String tipoCurso(Curso objCurso) throws Exception{

		if(objCurso.getCodigo() < 1) {
			return "Codigo invalido";
		}

		if(objCurso.getCodigo() == objCurso.getCodigo()) {

		}

		if(objCurso.getNome().length() > 30) {
			return "Nome do curso excedeu o número de caracter";
		}

		if(objCurso.getDescricao().length() > 40) {
			return "Informe a descrição do curso"; 
		}

		if(objCurso.getValor() < 150) {

			return "Valor invalido";
		}

		CursoDAO dao = new CursoDAO();
		dao.adicionar(objCurso);
		dao.fechar();
		return "Gravado com sucesso";
	}

}
