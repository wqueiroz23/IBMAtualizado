package br.com.studyboot.bo;
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
	 * Classe responsavel por manipular as regras relacionadas
	 * ao cadastro de disciplina
	 * 
	 * Codigo da disciplina permitido > 1 (getCodigo)
	 * Nome disciplina deve ter no maximo 30 caracteres (getNome)
	 * Descri��o disciplina deve ter no maximo 40 caracteres 
	 */
	
	
	public static String tipoDisciplina(Disciplina objDisciplina) throws Exception{
		
		
		if(objDisciplina.getCodigo() <1) {
			return "Codigo invalido, digite novamente";
			
		}
		
		if(objDisciplina.getNome().length() > 30) {
			return "Digite at� 30 caracteres no nome da disciplina ";
		}
		
		if(objDisciplina.getDescricao().length() > 40) {
			return "Digite at� 40 caracteres na descri��o ";
			
		}
		
		DisciplinaDAO dao = new DisciplinaDAO();
		dao.adicionar(objDisciplina);
		dao.fechar();
				
		
		return "Disciplina registrada com sucesso";
	}

}

