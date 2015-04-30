package br.com.unigranrio.orion.servico;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.persistencia.AtorPersistencia;
import br.com.unigranrio.orion.modelo.usuario.AtorBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public final class AtorServico implements PadraoInterface<AtorBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private AtorPersistencia a = new AtorPersistencia();

	public AtorServico() {

	}

	@Override
	public void atualizar(AtorBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Atualizar Ator.");

		this.a.atualizar(objeto);

	}

	@Override
	public AtorBean buscar(AtorBean objeto, Long id) throws Exception {

		this.logger.info("Servico: Persistencia: Buscar Ator.");

		return this.a.buscar(objeto, id);
	}

	@Override
	public List<AtorBean> listar() throws Exception {

		this.logger.info("Servico: Persistencia: Listar Ator.");

		return this.a.listar();
	}

	@Override
	public void remover(AtorBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Remover Ator.");

		this.a.remover(objeto);

	}

	@Override
	public void salvar(AtorBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Salvar Ator.");

		this.a.salvar(objeto);

	}

	public void setA(AtorPersistencia a) {
		this.a = a;
	}

	public AtorPersistencia getA() {
		return a;
	}

}
