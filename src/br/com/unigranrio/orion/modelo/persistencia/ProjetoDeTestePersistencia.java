package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.ProjetoDeTesteBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class ProjetoDeTestePersistencia implements
		PadraoInterface<ProjetoDeTesteBean>, Serializable {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = -6813121635312887948L;

	private ProjetoDeTesteBean projeto = null;

	private List<ProjetoDeTesteBean> projetos = null;

	private StringBuilder sql = null;

	private Session sessao = null;

	private Transaction transacao = null;

	public ProjetoDeTestePersistencia() {

	}

	public void novaSessao(Session sessao) {

		this.logger.info("Persistencia: Nova Sessao. " + sessao.toString());

		this.sessao = sessao;

		this.transacao = this.sessao.getTransaction();

	}

	@Override
	public void salvar(ProjetoDeTesteBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar. " + objeto.toString());

			this.transacao.begin();

			this.sessao.save(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Salvar. " + objeto.toString() + " "
					+ e.getMessage());

		}

	}

	@Override
	public void atualizar(ProjetoDeTesteBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar. " + objeto.toString());

			this.transacao.begin();

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Atualizar. " + objeto.toString()
					+ " " + e.getMessage());

		}

	}

	@Override
	public void remover(ProjetoDeTesteBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Remover. " + objeto.toString());

			this.transacao.begin();

			this.sessao.delete(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Remover. " + objeto.toString()
					+ " " + e.getMessage());

		}

	}

	@Override
	public ProjetoDeTesteBean buscar(ProjetoDeTesteBean objeto, Long id)
			throws Exception {

		try {

			this.logger.info("Persistencia: Buscar." + objeto.toString());

			this.projeto = (ProjetoDeTesteBean) this.sessao.get(
					ProjetoDeTesteBean.class, id);

			return this.projeto;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Buscar. " + objeto.toString() + " "
					+ e.getMessage());

			return null;

		}

	}

	@Override
	public List<ProjetoDeTesteBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar. ");

			this.projetos = this.sessao
					.createCriteria(ProjetoDeTesteBean.class).list();

			return this.projetos;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Listar ." + e.getMessage());

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

	public ProjetoDeTesteBean getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoDeTesteBean projeto) {
		this.projeto = projeto;
	}

	public List<ProjetoDeTesteBean> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<ProjetoDeTesteBean> projetos) {
		this.projetos = projetos;
	}


}
