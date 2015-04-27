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

	private AtorBean ator;

	private List<AtorBean> atores;

	private StringBuilder sql;

	private Session sessao;

	private Transaction transacao;

	public AtorPersistencia() {

	}

	public void novaSessao(Session sessao) {

		this.sessao = sessao;

		this.transacao = this.sessao.getTransaction();

	}

	@Override
	public void salvar(AtorBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar Projeto De Teste.");

			this.transacao.begin();

			this.sessao.save(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Salvar Projeto De Teste."
					+ e.getMessage());

		}

	}

	@Override
	public void atualizar(AtorBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar Projeto De Teste.");

			this.transacao.begin();

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Atualizar Projeto De Teste."
					+ e.getMessage());

		}

	}

	@Override
	public void remover(AtorBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Remover Projeto De Teste.");

			this.transacao.begin();

			this.sessao.delete(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Remover Projeto De Teste."
					+ e.getMessage());

		}

	}

	@Override
	public AtorBean buscar(AtorBean objeto, Long id) throws Exception {

		try {

			this.logger.info("Persistencia: Buscar Projeto De Teste.");

			this.ator = (AtorBean) this.sessao.get(AtorBean.class, id);

			return this.ator;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Buscar: Projeto De Teste."
					+ e.getMessage());

			return null;

		}

	}

	@Override
	public List<AtorBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar Projeto De Teste.");

			this.atores = (List<AtorBean>) this.sessao.createCriteria(
					AtorBean.class).list();

			return this.atores;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Listar Projeto De Teste."
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