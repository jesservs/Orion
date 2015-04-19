package br.com.unigranrio.orion.servico;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.persistencia.PadraoPersistencia;
import br.com.unigranrio.orion.util.PadraoInterface;

public final class PadraoServico implements PadraoInterface<Object> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private Object t;

	private PadraoPersistencia p = new PadraoPersistencia(
			this.t.getClass());

	@Override
	public void salvar(Object objeto) throws Exception {

		this.logger.info("Servico Salvar "+ objeto.toString());
		
		this.p.salvar(objeto);

	}

	@Override
	public void atualizar(Object objeto) throws Exception {
		
		this.logger.info("Servico Atualizar "+ objeto.toString());

		this.p.atualizar(objeto);

	}

	@Override
	public void remover(Object objeto) throws Exception {

		this.logger.info("Servico Remover "+ objeto.toString());
		
		this.p.remover(objeto);

	}

	@Override
	public Object buscar(Object objeto, Long id) throws Exception {

		this.logger.info("Servico Buscar "+ objeto.toString());
		
		return this.p.buscar(objeto, id);
	}

	@Override
	public List<Object> listar() throws Exception {

		this.logger.info("Servico Listar");
		
		return this.p.listar();
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public Object getT() {
		return t;
	}

	public void setT(Object t) {
		this.t = t;
	}

	public PadraoPersistencia getP() {
		return p;
	}

	public void setP(PadraoPersistencia p) {
		this.p = p;
	}

}
