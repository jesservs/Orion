package br.com.unigranrio.orion.servico;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.persistencia.TestePersistencia;
import br.com.unigranrio.orion.modelo.sistema.TesteBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class TesteServico implements PadraoInterface<TesteBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private TestePersistencia t = new TestePersistencia();

	public TesteServico() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualizar(TesteBean objeto) throws Exception {

		this.logger.info("Servico: Atualizar " + objeto.toString());

		this.t.atualizar(objeto);

	}

	@Override
	public TesteBean buscar(TesteBean objeto, Long id) throws Exception {

		this.logger.info("Servico: Buscar " + objeto.toString());

		return this.t.buscar(objeto, id);
	}

	@Override
	public List<TesteBean> listar() throws Exception {

		this.logger.info("Servico: Listar");

		return this.t.listar();
	}

	@Override
	public void remover(TesteBean objeto) throws Exception {

		this.logger.info("Servico: Remover " + objeto.toString());

		this.t.remover(objeto);

	}

	@Override
	public void salvar(TesteBean objeto) throws Exception {

		this.logger.info("Servico: Salvar " + objeto.toString());

		this.t.salvar(objeto);

	}

	public TestePersistencia getT() {
		return t;
	}

	public void setT(TestePersistencia t) {
		this.t = t;
	}

}
