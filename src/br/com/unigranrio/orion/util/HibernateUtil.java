package br.com.unigranrio.orion.util;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.slf4j.Logger;

import br.com.unigranrio.orion.modelo.persistencia.DaoFactory;
import br.com.unigranrio.orion.modelo.sistema.ProjetoDeTesteBean;

public class HibernateUtil implements Serializable {

	private static final long serialVersionUID = -8842742445773664613L;

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try {

			AnnotationConfiguration cfg = new AnnotationConfiguration();

			cfg.configure("hibernate.cfg.xml");

			return cfg.buildSessionFactory();

		} catch (Exception e) {

			e.printStackTrace();

			return null;

		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
