package br.com.unigranrio.orion.util;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaoFactory implements Serializable {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static final long serialVersionUID = -8842742445773664613L;
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure();
			return cfg.buildSessionFactory();
		} catch (Throwable e) {
			System.out
					.println("Criação inicial do objeto SessionFactory falhou. Erro: "
							+ e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}


}
