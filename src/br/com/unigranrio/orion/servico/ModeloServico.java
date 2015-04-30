package br.com.unigranrio.orion.servico;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.persistencia.ModeloPersistencia;
import br.com.unigranrio.orion.modelo.sistema.ModeloBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class ModeloServico implements PadraoInterface<ModeloBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private ModeloPersistencia m = new ModeloPersistencia();

	@Override
	public void atualizar(ModeloBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Atualizar Modelo.");

		this.m.atualizar(objeto);

	}

	@Override
	public ModeloBean buscar(ModeloBean objeto, Long id) throws Exception {

		this.logger.info("Servico: Persistencia: Buscar Modelo.");

		return this.m.buscar(objeto, id);
	}

	@Override
	public List<ModeloBean> listar() throws Exception {

		this.logger.info("Servico: Persistencia: Listar Modelo.");

		return this.m.listar();
	}

	@Override
	public void remover(ModeloBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Remover Modelo.");

		this.m.remover(objeto);

	}

	@Override
	public void salvar(ModeloBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Salvar Modelo.");

		this.m.salvar(objeto);

	}

	public ModeloPersistencia getM() {
		return m;
	}

	public void setM(ModeloPersistencia m) {
		this.m = m;
	}

}
