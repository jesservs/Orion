package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.ArtefatoBean;
import br.com.unigranrio.orion.modelo.sistema.ArtefatoBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class ArtefatoPersistencia implements PadraoInterface<ArtefatoBean>,
		Serializable {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = -6813121635312887948L;

	private ArtefatoBean artefato = null;

	private List<ArtefatoBean> artefatos = null;

	private StringBuilder sql = null;

	private Session sessao = null;

	private Transaction transacao = null;

	public ArtefatoPersistencia() {

	}

	public void novaSessao(Session sessao) {

		this.logger.info("Persistencia: Nova Sessao Artefato.");

		this.sessao = sessao;

		this.transacao = this.sessao.getTransaction();

	}

	@Override
	public void salvar(ArtefatoBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar Artefato.");

			this.transacao.begin();

			this.sessao.save(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Salvar Artefato." + e.getMessage());

		}

	}

	@Override
	public void atualizar(ArtefatoBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar Artefato.");

			this.transacao.begin();

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Atualizar Artefato." + e.getMessage());

		}

	}

	@Override
	public void remover(ArtefatoBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Remover Artefato.");

			this.transacao.begin();

			this.sessao.delete(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Remover Artefato." + e.getMessage());

		}

	}

	@Override
	public ArtefatoBean buscar(ArtefatoBean objeto, Long id) throws Exception {

		try {

			this.logger.info("Persistencia: Buscar Artefato.");

			this.artefato = (ArtefatoBean) this.sessao.get(ArtefatoBean.class,
					id);

			return this.artefato;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Buscar Artefato." + e.getMessage());

			return null;

		}

	}

	@Override
	public List<ArtefatoBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar Artefato.");

			this.artefatos = (List<ArtefatoBean>) this.sessao.createCriteria(
					ArtefatoBean.class).list();

			return this.artefatos;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Listar Artefato." + e.getMessage());

			return null;

		}

	}

	public ArtefatoBean getArtefato() {
		return artefato;
	}

	public void setArtefato(ArtefatoBean artefato) {
		this.artefato = artefato;
	}

	public List<ArtefatoBean> getArtefatos() {
		return artefatos;
	}

	public void setArtefatos(List<ArtefatoBean> artefatos) {
		this.artefatos = artefatos;
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

}
