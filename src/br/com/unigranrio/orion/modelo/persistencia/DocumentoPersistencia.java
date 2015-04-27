package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.DocumentoBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class DocumentoPersistencia implements PadraoInterface<DocumentoBean>,
		Serializable {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = -6813121635312887948L;

	private DocumentoBean documento;

	private List<DocumentoBean> documentos;

	private StringBuilder sql;

	private Session sessao;

	private Transaction transacao;

	public DocumentoPersistencia() {

	}

	public void novaSessao(Session sessao) {

		this.sessao = sessao;

		this.transacao = this.sessao.getTransaction();

	}

	@Override
	public void salvar(DocumentoBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar Documento.");

			this.transacao.begin();

			this.sessao.save(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger
					.info("Persistencia: Salvar Documento." + e.getMessage());

		}

	}

	@Override
	public void atualizar(DocumentoBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar Documento.");

			this.transacao.begin();

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Atualizar Documento."
					+ e.getMessage());

		}

	}

	@Override
	public void remover(DocumentoBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Remover Documento.");

			this.transacao.begin();

			this.sessao.delete(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Remover Documento."
					+ e.getMessage());

		}

	}

	@Override
	public DocumentoBean buscar(DocumentoBean objeto, Long id) throws Exception {

		try {

			this.logger.info("Persistencia: Buscar Documento.");

			this.documento = (DocumentoBean) this.sessao.get(
					DocumentoBean.class, id);

			return this.documento;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger
					.info("Persistencia Buscar: Documento." + e.getMessage());

			return null;

		}

	}

	@Override
	public List<DocumentoBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar Documento.");

			this.documentos = (List<DocumentoBean>) this.sessao.createCriteria(
					DocumentoBean.class).list();

			return this.documentos;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger
					.info("Persistencia: Listar Documento." + e.getMessage());

			return null;

		}

	}

	public DocumentoBean getDocumento() {
		return documento;
	}

	public void setDocumento(DocumentoBean documento) {
		this.documento = documento;
	}

	public List<DocumentoBean> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<DocumentoBean> documentos) {
		this.documentos = documentos;
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
