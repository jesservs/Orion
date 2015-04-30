package br.com.unigranrio.orion.servico;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.persistencia.DocumentoPersistencia;
import br.com.unigranrio.orion.modelo.sistema.DocumentoBean;
import br.com.unigranrio.orion.modelo.usuario.AtorBean;
import br.com.unigranrio.orion.util.PadraoInterface;

public class DocumentoServico implements PadraoInterface<DocumentoBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private DocumentoPersistencia d = new DocumentoPersistencia();

	public DocumentoServico() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualizar(DocumentoBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Atualizar Documento.");

		this.d.atualizar(objeto);

	}

	@Override
	public DocumentoBean buscar(DocumentoBean objeto, Long id) throws Exception {

		this.logger.info("Servico: Persistencia: Buscar Documento.");

		return this.d.buscar(objeto, id);
	}

	@Override
	public List<DocumentoBean> listar() throws Exception {

		this.logger.info("Servico: Persistencia: Listar Documento.");

		return this.d.listar();
	}

	@Override
	public void remover(DocumentoBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Remover Documento.");

		this.d.remover(objeto);

	}

	@Override
	public void salvar(DocumentoBean objeto) throws Exception {

		this.logger.info("Servico: Persistencia: Salvar Documento.");

		this.d.salvar(objeto);

	}

	public DocumentoPersistencia getD() {
		return d;
	}

	public void setD(DocumentoPersistencia d) {
		this.d = d;
	}

}
