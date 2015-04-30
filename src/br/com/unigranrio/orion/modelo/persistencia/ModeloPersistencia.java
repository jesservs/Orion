package br.com.unigranrio.orion.modelo.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.ModeloBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class ModeloPersistencia implements PadraoInterface<ModeloBean>,
		Serializable {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = -6813121635312887948L;

	private ModeloBean modelo = null;

	private List<ModeloBean> modelos = null;

	private StringBuilder sql = null;

	private Session sessao = null;

	private Transaction transacao = null;

	public ModeloPersistencia() {
		// TODO Auto-generated constructor stub
	}

	public void novaSessao(Session sessao) {

		this.logger.info("Persistencia: Nova Sessao Modelo.");

		this.sessao = sessao;

		this.transacao = this.sessao.getTransaction();

	}

	@Override
	public void salvar(ModeloBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Salvar Modelo.");

			this.transacao.begin();

			this.sessao.save(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Salvar Modelo." + e.getMessage());

		}

	}

	@Override
	public void atualizar(ModeloBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Atualizar Modelo.");

			this.transacao.begin();

			this.sessao.update(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Atualizar Modelo."+ e.getMessage());

		}

	}

	@Override
	public void remover(ModeloBean objeto) throws Exception {

		try {

			this.logger.info("Persistencia: Remover Modelo.");

			this.transacao.begin();

			this.sessao.delete(objeto);

			this.transacao.commit();

		} catch (Exception e) {

			e.printStackTrace();

			this.transacao.rollback();

			this.logger.info("Persistencia: Remover Modelo."+e.getMessage());

		}

	}

	@Override
	public ModeloBean buscar(ModeloBean objeto, Long id) throws Exception {

		try {

			this.logger.info("Persistencia: Buscar Modelo.");

			this.modelo = (ModeloBean) this.sessao.get(ModeloBean.class, id);

			return this.modelo;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia Buscar Modelo." + e.getMessage());

			return null;

		}

	}

	@Override
	public List<ModeloBean> listar() throws Exception {

		try {

			this.logger.info("Persistencia: Listar Modelo.");

			this.modelos = (List<ModeloBean>) this.sessao.createCriteria(
					ModeloBean.class).list();

			return this.modelos;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.info("Persistencia: Listar Modelo." + e.getMessage());

			return null;

		}

	}

	public ModeloBean getModelo() {
		return modelo;
	}

	public void setModelo(ModeloBean modelo) {
		this.modelo = modelo;
	}

	public List<ModeloBean> getModelos() {
		return modelos;
	}

	public void setModelos(List<ModeloBean> modelos) {
		this.modelos = modelos;
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
