package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.TesteBean;
import br.com.unigranrio.orion.modelo.sistema.TesteBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class TestePersistencia implements PadraoInterface<TesteBean>,
		Serializable {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = -6813121635312887948L;

	private TesteBean teste = null;

	private List<TesteBean> testes = null;

	private StringBuilder sql = null;

	private Session sessao = null;

	private Transaction transacao = null;

	public TestePersistencia() {
		// TODO Auto-generated constructor stub
	}

	public void novaSessao(Session sessao) {

		this.logger.info("Persistencia: Nova Sessao Teste.");

		this.sessao = sessao;

		this.transacao = this.sessao.getTransaction();

	}

	@Override
	public void salvar(TesteBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar Teste.");

			this.transacao.begin();

			this.sessao.save(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Salvar Teste." + e.getMessage());

		}

	}

	@Override
	public void atualizar(TesteBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar Teste.");

			this.transacao.begin();

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Atualizar Teste." + e.getMessage());

		}

	}

	@Override
	public void remover(TesteBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Remover Teste.");

			this.transacao.begin();

			this.sessao.delete(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Remover Teste." + objeto.toString()
					+ e.getMessage());

		}

	}

	@Override
	public TesteBean buscar(TesteBean objeto, Long id) throws Exception {

		try {

			this.logger.info("Persistencia: Buscar Teste.");

			this.teste = (TesteBean) this.sessao.get(TesteBean.class, id);

			return this.teste;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Buscar Teste." + e.getMessage());

			return null;

		}

	}

	@Override
	public List<TesteBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar Teste.");

			this.testes = (List<TesteBean>) this.sessao.createCriteria(
					TesteBean.class).list();

			return this.testes;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Listar Teste." + e.getMessage());

			return null;

		}

	}

	public TesteBean getTeste() {
		return teste;
	}

	public void setTeste(TesteBean teste) {
		this.teste = teste;
	}

	public List<TesteBean> getTestes() {
		return testes;
	}

	public void setTestes(List<TesteBean> testes) {
		this.testes = testes;
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
