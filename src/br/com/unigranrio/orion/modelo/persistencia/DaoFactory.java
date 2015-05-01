package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.AnexoBean;
import br.com.unigranrio.orion.modelo.sistema.ArtefatoBean;
import br.com.unigranrio.orion.modelo.sistema.DiagramaBean;
import br.com.unigranrio.orion.modelo.sistema.DocumentoBean;
import br.com.unigranrio.orion.modelo.sistema.ModeloBean;
import br.com.unigranrio.orion.modelo.sistema.ProjetoDeTesteBean;
import br.com.unigranrio.orion.modelo.sistema.TesteBean;
import br.com.unigranrio.orion.modelo.usuario.AtorBean;
import br.com.unigranrio.orion.util.HibernateUtil;
import br.com.unigranrio.orion.util.PadraoInterface;



public class DaoFactory implements Serializable {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

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

	public static PadraoInterface<AnexoBean> anexoeDAO() {

		AnexoPersistencia a = new AnexoPersistencia();

		a.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return a;
	}

	public static PadraoInterface<ArtefatoBean> artefatoDAO() {

		ArtefatoPersistencia a = new ArtefatoPersistencia();

		a.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return a;
	}

	public static PadraoInterface<DiagramaBean> diagramaDAO() {

		DiagramaPersistencia d = new DiagramaPersistencia();

		d.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return d;
	}

	public static PadraoInterface<ModeloBean> modeloDAO() {

		ModeloPersistencia m = new ModeloPersistencia();

		m.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return m;
	}

	public static PadraoInterface<TesteBean> testeDAO() {

		TestePersistencia t = new TestePersistencia();

		t.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return t;
	}

}
