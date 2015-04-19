package br.com.unigranrio.orion.modelo.persistencia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.util.DaoFactory;
import br.com.unigranrio.orion.util.PadraoInterface;

public class PadraoPersistencia extends DaoFactory implements
		PadraoInterface<Object> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = -6813121635312887948L;

	private Object o;

	private StringBuilder sql;

	private Class clazz;

	private Session sessao;

	private Transaction transacao;

	public PadraoPersistencia(Class clazz) {

		this.clazz = clazz;

		this.logger.info("Nova Instancia Persistencia");

		this.sessao = this.getSessionfactory().openSession();

		this.transacao = this.sessao.getTransaction();
	}

	@Override
	public void salvar(Object objeto) throws Exception {

		try {

			this.transacao.begin();

			this.logger.info("Persistencia Salvar");

			this.sessao.save(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Salvar" + e.getMessage());

			this.transacao.rollback();

		}

	}

	@Override
	public void atualizar(Object objeto) throws Exception {

		try {

			this.transacao.begin();

			this.logger.info("Persistencia Atualizar");

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Atualizar" + e.getMessage());

			this.transacao.rollback();

		}

	}

	@Override
	public void remover(Object objeto) throws Exception {

		try {

			this.transacao.begin();

			this.logger.info("Persistencia Remover");

			this.sessao.delete(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Remover" + e.getMessage());

			this.transacao.rollback();

		}

	}

	@Override
	public Object buscar(Object objeto, Long id) throws Exception {

		try {

			this.transacao.begin();

			this.logger.info("Persistencia Buscar");

			this.o = (Object) this.sessao.get(clazz, id);

			this.transacao.commit();

			return this.o;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Buscar" + e.getMessage());

			this.transacao.rollback();

			return null;

		}

	}

	@Override
	public List<Object> listar() throws Exception {

		try {

			this.transacao.begin();

			this.logger.info("Persistencia Listar");

			List<Object> lista = (List<Object>) this.sessao.createCriteria(
					clazz).list();

			this.transacao.commit();

			return lista;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Listar" + e.getMessage());

			this.transacao.rollback();

			return null;

		}

	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	public StringBuilder getSql() {
		return sql;
	}

	public void setSql(StringBuilder sql) {
		this.sql = sql;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Session getSessao() {
		return sessao;
	}

	public void setSessao(Session sessao) {
		this.sessao = sessao;
	}

	public Transaction getTransacao() {
		return transacao;
	}

	public void setTransacao(Transaction transacao) {
		this.transacao = transacao;
	}

}
