package br.com.unigranrio.orion.servico;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.persistencia.ProjetoDeTestePersistencia;
import br.com.unigranrio.orion.modelo.sistema.ProjetoDeTesteBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public final class ProjetoDeTesteServico implements
		PadraoInterface<ProjetoDeTesteBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private ProjetoDeTestePersistencia p = new ProjetoDeTestePersistencia();

	public ProjetoDeTesteServico() {

	}

	@Override
	public void atualizar(ProjetoDeTesteBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Atualizar Projeto de Teste.");

		this.p.atualizar(objeto);

	}

	@Override
	public ProjetoDeTesteBean buscar(ProjetoDeTesteBean objeto, Long id)
			throws Exception {

		this.logger.info("Servico: Persistencia: Buscar Projeto de Teste.");

		return this.p.buscar(objeto, id);
	}

	@Override
	public List<ProjetoDeTesteBean> listar() throws Exception {

		this.logger.info("Servico: Persistencia: Listar Projeto de Teste.");

		return this.p.listar();
	}

	@Override
	public void remover(ProjetoDeTesteBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Remover Projeto de Teste.");

		this.p.remover(objeto);

	}

	@Override
	public void salvar(ProjetoDeTesteBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Salvar Projeto de Teste.");

		this.p.salvar(objeto);

	}

	public void setP(ProjetoDeTestePersistencia p) {
		this.p = p;
	}

	public ProjetoDeTestePersistencia getP() {
		return p;
	}

}
