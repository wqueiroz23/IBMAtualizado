package br.com.studybot.bo;
import br.com.studybot.beans.Disciplina;
import br.com.studybot.dao.DisciplinaDAO;

/**
 * 
 * @author studyBot
 * @version 1.0
 * @see DisciplinaBO, Disciplina
 *
 */

public class DisciplinaBO {
	
	/**
	 * 
	 * @param objDisciplina
	 * @return
	 * @throws Exception
	 */
	
	/*
	 * Classe responsável por manipular as regras relacionadas
	 * ao cadastro de disciplina
	 * 
	 * Código da disciplina permitido > 1 (getCodigo)
	 * Nome disciplina deve ter no máximo 30 caracteres (getNome)
	 * Descrição disciplina deve ter no máximo 40 caracteres 
	 */
	
	
	public static String tipoDisciplina(Disciplina objDisciplina) throws Exception{
		
		
		if(objDisciplina.getCodigo() <1) {
			return "Código invalido, digite novamente";
			
		}
		
		if(objDisciplina.getNome().length() > 30) {
			return "Digite até 30 caracteres no nome da disciplina ";
		}
		
		if(objDisciplina.getDescricao().length() > 40) {
			return "Digite até 40 caracteres na descrição ";
			
		}
		
		DisciplinaDAO dao = new DisciplinaDAO();
		dao.adicionar(objDisciplina);
		dao.fechar();
				
		
		return "Disciplina registrada com sucesso";
	}

}

