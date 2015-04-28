package br.com.unigranrio.orion.util;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.slf4j.Logger;

public class HibernateUtil implements Serializable {

	private static final long serialVersionUID = -8842742445773664613L;

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try {

			AnnotationConfiguration cfg = new AnnotationConfiguration();

			cfg.configure();

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
