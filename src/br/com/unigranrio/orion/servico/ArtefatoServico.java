package br.com.unigranrio.orion.servico;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.persistencia.ArtefatoPersistencia;
import br.com.unigranrio.orion.modelo.sistema.ArtefatoBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class ArtefatoServico implements PadraoInterface<ArtefatoBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private ArtefatoPersistencia a = new ArtefatoPersistencia();

	public ArtefatoServico() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualizar(ArtefatoBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Atualizar Artefato.");

		this.a.atualizar(objeto);

	}

	@Override
	public ArtefatoBean buscar(ArtefatoBean objeto, Long id) throws Exception {

		this.logger.info("Servico: Persistencia: Buscar Artefato.");

		return this.a.buscar(objeto, id);
	}

	@Override
	public List<ArtefatoBean> listar() throws Exception {

		this.logger.info("Servico: Persistencia: Listar Artefato.");

		return this.a.listar();
	}

	@Override
	public void remover(ArtefatoBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Remover  Artefato." + objeto.toString());

		this.a.remover(objeto);

	}

	@Override
	public void salvar(ArtefatoBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Salvar Artefato" + objeto.toString());

		this.a.salvar(objeto);

	}

	public ArtefatoPersistencia getA() {
		return a;
	}

	public void setA(ArtefatoPersistencia a) {
		this.a = a;
	}

}
