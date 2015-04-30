package br.com.unigranrio.orion.servico;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.persistencia.AnexoPersistencia;
import br.com.unigranrio.orion.modelo.sistema.AnexoBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class AnexoServico implements PadraoInterface<AnexoBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private AnexoPersistencia a = new AnexoPersistencia();

	public AnexoServico() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualizar(AnexoBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Atualizar Anexo.");

		this.a.atualizar(objeto);

	}

	@Override
	public AnexoBean buscar(AnexoBean objeto, Long id) throws Exception {

		this.logger.info("Servico: Persistencia: Buscar Anexo.");

		return this.a.buscar(objeto, id);
	}

	@Override
	public List<AnexoBean> listar() throws Exception {

		this.logger.info("Servico: Persistencia: Listar Anexo.");

		return this.a.listar();
	}

	@Override
	public void remover(AnexoBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Remover Anexo.");

		this.a.remover(objeto);

	}

	@Override
	public void salvar(AnexoBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Salvar Anexo.");

		this.a.salvar(objeto);

	}

	public AnexoPersistencia getA() {
		return a;
	}

	public void setA(AnexoPersistencia a) {
		this.a = a;
	}

}
