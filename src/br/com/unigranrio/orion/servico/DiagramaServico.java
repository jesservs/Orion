package br.com.unigranrio.orion.servico;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.persistencia.DiagramaPersistencia;
import br.com.unigranrio.orion.modelo.sistema.DiagramaBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class DiagramaServico implements PadraoInterface<DiagramaBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private DiagramaPersistencia d = new DiagramaPersistencia();

	@Override
	public void atualizar(DiagramaBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Atualizar Diagrama.");

		this.d.atualizar(objeto);

	}

	@Override
	public DiagramaBean buscar(DiagramaBean objeto, Long id) throws Exception {

		this.logger.info("Servico: Persistencia: Buscar Diagrama.");

		return this.d.buscar(objeto, id);
	}

	@Override
	public List<DiagramaBean> listar() throws Exception {

		this.logger.info("Servico: Persistencia: Listar Diagrama.");

		return this.d.listar();
	}

	@Override
	public void remover(DiagramaBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Remover Diagrama.");

		this.d.remover(objeto);

	}

	@Override
	public void salvar(DiagramaBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Salvar Diagrama.");

		this.d.salvar(objeto);

	}

	public DiagramaPersistencia getD() {
		return d;
	}

	public void setD(DiagramaPersistencia d) {
		this.d = d;
	}

}
