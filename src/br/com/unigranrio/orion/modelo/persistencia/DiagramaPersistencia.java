package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.DiagramaBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class DiagramaPersistencia implements PadraoInterface<DiagramaBean>,
		Serializable {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = -6813121635312887948L;

	private DiagramaBean dagrama = null;

	private List<DiagramaBean> diagramas = null;

	private StringBuilder sql = null;

	private Session sessao = null;

	private Transaction transacao = null;

	public DiagramaPersistencia() {
		// TODO Auto-generated constructor stub
	}

	public void novaSessao(Session sessao) {

		this.logger.info("Persistencia: Nova Sessao. " + sessao.toString());

		this.sessao = sessao;

		this.transacao = this.sessao.getTransaction();

	}

	@Override
	public void salvar(DiagramaBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar." + objeto.toString());

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
	public void atualizar(DiagramaBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar." + objeto.toString());

			this.transacao.begin();

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Atualizar." + objeto.toString()
					+ " " + e.getMessage());

		}

	}

	@Override
	public void remover(DiagramaBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Remover. " + objeto.toString());

			this.transacao.begin();

			this.sessao.delete(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Remover. " + objeto.toString()
					+ e.getMessage());

		}

	}

	@Override
	public DiagramaBean buscar(DiagramaBean objeto, Long id) throws Exception {

		try {

			this.logger.info("Persistencia: Buscar. " + objeto.toString());

			this.dagrama = (DiagramaBean) this.sessao.get(DiagramaBean.class,
					id);

			return this.dagrama;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Buscar." + e.getMessage());

			return null;

		}

	}

	@Override
	public List<DiagramaBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar.");

			this.diagramas = (List<DiagramaBean>) this.sessao.createCriteria(
					DiagramaBean.class).list();

			return this.diagramas;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Listar." + e.getMessage());

			return null;

		}

	}

	public DiagramaBean getDagrama() {
		return dagrama;
	}

	public void setDagrama(DiagramaBean dagrama) {
		this.dagrama = dagrama;
	}

	public List<DiagramaBean> getDiagramas() {
		return diagramas;
	}

	public void setDiagramas(List<DiagramaBean> diagramas) {
		this.diagramas = diagramas;
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
