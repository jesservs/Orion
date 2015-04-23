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

	private ProjetoDeTesteBean projeto;

	private StringBuilder sql;

	private Session sessao;

	private Transaction transacao;

	public ProjetoDeTestePersistencia() {

	}

	public void novaSessao(Session sessao) {

		this.sessao = sessao;

	}

	@Override
	public void salvar(ProjetoDeTesteBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar Projeto De Teste.");

			this.sessao.save(objeto);

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Salvar Projeto De Teste."
					+ e.getMessage());

		}

	}

	@Override
	public void atualizar(ProjetoDeTesteBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar Projeto De Teste.");

			this.sessao.update(objeto);

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Atualizar Projeto De Teste."
					+ e.getMessage());

		}

	}

	@Override
	public void remover(ProjetoDeTesteBean objeto) throws Exception {

		try {


			this.logger.info("Persistencia: Remover Projeto De Teste.");

			this.sessao.delete(objeto);

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Remover Projeto De Teste."
					+ e.getMessage());


		}

	}

	@Override
	public ProjetoDeTesteBean buscar(ProjetoDeTesteBean objeto, Long id)
			throws Exception {

		try {

			this.logger.info("Persistencia: Buscar Projeto De Teste.");

			this.projeto = (ProjetoDeTesteBean) this.sessao.get(
					ProjetoDeTesteBean.class, id);

			return this.projeto;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Buscar: Projeto De Teste."
					+ e.getMessage());

			return null;

		}

	}

	@Override
	public List<ProjetoDeTesteBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar Projeto De Teste.");

			List<ProjetoDeTesteBean> lista = (List<ProjetoDeTesteBean>) this.sessao
					.createCriteria(ProjetoDeTesteBean.class).list();

			return lista;

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

	public ProjetoDeTesteBean getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoDeTesteBean projeto) {
		this.projeto = projeto;
	}

}
