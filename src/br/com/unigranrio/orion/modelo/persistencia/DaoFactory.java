package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;

import br.com.unigranrio.orion.modelo.sistema.DocumentoBean;
import br.com.unigranrio.orion.modelo.sistema.ProjetoDeTesteBean;
import br.com.unigranrio.orion.modelo.usuario.AtorBean;
import br.com.unigranrio.orion.util.HibernateUtil;
import br.com.unigranrio.orion.util.PadraoInterface;

public class DaoFactory implements Serializable {

	private static final long serialVersionUID = -1945446498579680241L;

	public static PadraoInterface<ProjetoDeTesteBean> projetoDeTesteDAO() {

		ProjetoDeTestePersistencia p = new ProjetoDeTestePersistencia();

		p.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return p;
	}
	
	public static PadraoInterface<DocumentoBean> documentoDAO() {

		DocumentoPersistencia d = new DocumentoPersistencia();

		d.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return d;
	}
	
	public static PadraoInterface<AtorBean> atorDAO() {

		AtorPersistencia a = new AtorPersistencia();

		a.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return a;
	}


}
