package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;

import br.com.unigranrio.orion.modelo.sistema.ProjetoDeTesteBean;
import br.com.unigranrio.orion.util.HibernateUtil;
import br.com.unigranrio.orion.util.PadraoInterface;

public class DaoFactory implements Serializable {

	private static final long serialVersionUID = -1945446498579680241L;

	public ProjetoDeTestePersistencia projetoDeTesteDAO() {
		
		ProjetoDeTestePersistencia p = new ProjetoDeTestePersistencia();
		
		p.novaSessao(HibernateUtil.getSessionFactory().openSession());
		
		return p;
	}

}
