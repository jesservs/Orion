package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;

import br.com.unigranrio.orion.util.HibernateUtil;

public class DaoFactory implements Serializable {

	private static final long serialVersionUID = -1945446498579680241L;

	public static ProjetoDeTestePersistencia projetoDeTesteDAO() {

		ProjetoDeTestePersistencia p = new ProjetoDeTestePersistencia();

		p.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return p;
	}
	
	public static DocumentoPersistencia documentoDAO() {

		DocumentoPersistencia d = new DocumentoPersistencia();

		d.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return d;
	}
	
	public static AtorPersistencia atorDAO() {

		AtorPersistencia a = new AtorPersistencia();

		a.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return a;
	}
	
	public static AnexoPersistencia anexoeDAO() {

		AnexoPersistencia a = new AnexoPersistencia();

		a.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return a;
	}
	
	public static ArtefatoPersistencia artefatoDAO() {

		ArtefatoPersistencia a = new ArtefatoPersistencia();

		a.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return a;
	}
	
	public static DiagramaPersistencia diagramaDAO() {

		DiagramaPersistencia d = new DiagramaPersistencia();

		d.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return d;
	}
	
	public static ModeloPersistencia modeloDAO() {

		ModeloPersistencia m = new ModeloPersistencia();

		m.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return m;
	}
	
	public static TestePersistencia testeDAO() {

		TestePersistencia t = new TestePersistencia();

		t.novaSessao(HibernateUtil.getSessionfactory().openSession());

		return t;
	}
	

}
