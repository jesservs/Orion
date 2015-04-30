package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.AnexoBean;
import br.com.unigranrio.orion.modelo.sistema.AnexoBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class AnexoPersistencia implements PadraoInterface<AnexoBean>,
		Serializable {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = -6813121635312887948L;

	private AnexoBean anexo = null;

	private List<AnexoBean> anexos = null;

	private StringBuilder sql = null;

	private Session sessao = null;

	private Transaction transacao = null;

	public AnexoPersistencia() {
		// TODO Auto-generated constructor stub
	}

	public void novaSessao(Session sessao) {

		this.logger.info("Persistencia: Nova Sessao Anexo.");

		this.sessao = sessao;

		this.transacao = this.sessao.getTransaction();

	}

	@Override
	public void salvar(AnexoBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar Anexo.");

			this.transacao.begin();

			this.sessao.save(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Salvar Anexo." + e.getMessage());

		}

	}

	@Override
	public void atualizar(AnexoBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar Anexo.");

			this.transacao.begin();

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Atualizar Anexo."+ e.getMessage());

		}

	}

	@Override
	public void remover(AnexoBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Remover Anexo. ");

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
	public AnexoBean buscar(AnexoBean objeto, Long id) throws Exception {

		try {

			this.logger.info("Persistencia: Buscar Anexo.");

			this.anexo = (AnexoBean) this.sessao.get(AnexoBean.class, id);

			return this.anexo;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Buscar Anexo." + e.getMessage());

			return null;

		}

	}

	@Override
	public List<AnexoBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar Anexo.");

			this.anexos = (List<AnexoBean>) this.sessao.createCriteria(
					AnexoBean.class).list();

			return this.anexos;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Listar Anexo." + e.getMessage());

			return null;

		}

	}

	public AnexoBean getAnexo() {
		return anexo;
	}

	public void setAnexo(AnexoBean anexo) {
		this.anexo = anexo;
	}

	public List<AnexoBean> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<AnexoBean> anexos) {
		this.anexos = anexos;
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
