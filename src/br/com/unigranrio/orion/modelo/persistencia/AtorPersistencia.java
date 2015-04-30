package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.usuario.AtorBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class AtorPersistencia implements PadraoInterface<AtorBean>,
		Serializable {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = -6813121635312887948L;

	private AtorBean ator = null;

	private List<AtorBean> atores = null;

	private StringBuilder sql = null;

	private Session sessao = null;

	private Transaction transacao = null;

	public AtorPersistencia() {

	}

	public void novaSessao(Session sessao) {
		
		this.logger.info("Persistencia: Nova Sessao. "+ sessao.toString());

		this.sessao = sessao;

		this.transacao = this.sessao.getTransaction();

	}

	@Override
	public void salvar(AtorBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar. " + objeto.toString());

			this.transacao.begin();

			this.sessao.save(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Salvar." + objeto.toString() + " "
					+ e.getMessage());

		}

	}

	@Override
	public void atualizar(AtorBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar. " + objeto.toString());

			this.transacao.begin();

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Atualizar. " + objeto.toString() + " "
					+ e.getMessage());

		}

	}

	@Override
	public void remover(AtorBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Remover. " + objeto.toString());

			this.transacao.begin();

			this.sessao.delete(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Remover. " + objeto.toString() + " "
					+ e.getMessage());

		}

	}

	@Override
	public AtorBean buscar(AtorBean objeto, Long id) throws Exception {

		try {

			this.logger.info("Persistencia: Buscar. " + objeto.toString());

			this.ator = (AtorBean) this.sessao.get(AtorBean.class, id);

			return this.ator;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Buscar. " + objeto.toString() + " "
					+ e.getMessage());

			return null;

		}

	}

	@Override
	public List<AtorBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar.");

			this.atores = (List<AtorBean>) this.sessao.createCriteria(
					AtorBean.class).list();

			return this.atores;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Listar."
					+ e.getMessage());

			return null;

		}

	}

	public StringBuilder getSql() {
		return sql;
	}

	public void setSql(StringBuilder sql) {
		this.sql = sql;
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

	public AtorBean getAtor() {
		return ator;
	}

	public void setAtor(AtorBean ator) {
		this.ator = ator;
	}

	public List<AtorBean> getAtores() {
		return atores;
	}

	public void setAtores(List<AtorBean> atores) {
		this.atores = atores;
	}

}
