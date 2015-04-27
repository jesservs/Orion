package br.com.unigranrio.orion.controle;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.DocumentoBean;
import br.com.unigranrio.orion.modelo.sistema.ProjetoDeTesteBean;
import br.com.unigranrio.orion.modelo.usuario.AtorBean;
import br.com.unigranrio.orion.servico.AtorServico;
import br.com.unigranrio.orion.servico.DocumentoServico;
import br.com.unigranrio.orion.servico.ProjetoDeTesteServico;
import br.com.unigranrio.orion.util.PadraoInterface;

@SessionScoped
@ManagedBean(name = "projetoControle")
public class ProjetoControle implements PadraoInterface<ProjetoDeTesteBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private FacesContext facesContext = FacesContext.getCurrentInstance();

	private Long idParametro;

	private String tipoParametro;

	private Long quantidadeProjeto;
	
	private String nome;

	private ProjetoDeTesteServico p = new ProjetoDeTesteServico();

	private AtorServico a = new AtorServico();

	private DocumentoServico d = new DocumentoServico();

	private AtorBean ator = new AtorBean();

	private ProjetoDeTesteBean projeto = new ProjetoDeTesteBean();

	private DocumentoBean documento = new DocumentoBean();

	private DataModel<DocumentoBean> documentos = new ListDataModel<DocumentoBean>();

	private DataModel<AtorBean> atores = new ListDataModel<AtorBean>();

	private DataModel<ProjetoDeTesteBean> projetos = new ListDataModel<ProjetoDeTesteBean>();

	public ProjetoControle() {
		
	}

	// Parte Pertencente ao Documento.
	public String paginaSalvarDocumento() {

		try {

			if (this.documento.getIdDocumento() == 0 || this.documento.getIdDocumento() == null) {

				this.logger.info("Controle: Cadastro Documento.");

				this.documento.setCodigoAtor(this.ator.getIdAtor());

				this.documento.setCodigoDocumento(this.documento
						.getIdDocumento());

				this.documento.setDataCriacao(new Date());

				this.documento.setDataAtualizacao(new Date());

				this.documento.setCodigoProjeto(this.projeto
						.getCodigoProjetoDeTeste());

				this.d.salvar(this.documento);

				this.documento = new DocumentoBean();

				return "/visao/projeto/lista-projeto";

			} else {

				this.logger.info("Controle: Atualização Documento.");

				this.documento.setDataAtualizacao(new Date());

				this.d.atualizar(this.documento);

				this.documento = new DocumentoBean();

				return "/visao/projeto/lista-documento";

			}

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Atualização ou Cadastro Documento.");

			return "/visao/projeto/lista-ator";

		}

	}

	public DataModel<DocumentoBean> getListaDocumentos() {

		try {

			this.logger.info("Controle: Lista Documento.");

			List<DocumentoBean> dts = null;

			Long i = null;

			for (ProjetoDeTesteBean p : this.listar()) {

				i += 1;

				if (this.projeto.getIdProjetoDeTeste() == p
						.getIdProjetoDeTeste()) {

					dts.add(p.getDocumentos().get(i.intValue()));

				}

			}

			this.projeto.setQuantidadeDocumento(i);

			this.documentos = new ListDataModel<DocumentoBean>(dts);

			return this.documentos;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Lista Documento.");

			return null;
		}

	}

	public String paginaAtualizarDocumento() {

		this.logger.info("Controle: Atualização Documento.");

		this.documento = this.documentos.getRowData();

		return "/visao/projeto/formulario-documento";

	}

	public String paginaBuscarDocumento() {

		try {

			this.logger.info("Controle: Busca Por Documento.");

			this.documento = (DocumentoBean) this.d.buscar(this.documento,
					this.idParametro);

			return "/visao/projeto/lista-documento";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Busca Por documento.");

			return "/visao/projeto/lista-documento";

		}

	}

	public String paginaExcluirDocumento() {

		try {

			this.logger.info("Controle: Excluido Documento.");

			this.documento = this.documentos.getRowData();

			this.d.remover(this.documento);

			return "/visao/projeto/lista-documento";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Excluido Documento. ");

			return "/visao/projeto/lista-documento";
		}

	}

	// Parte Pertencente ao ator.
	public String paginaSalvarAtor() {

		try {

			if (this.ator.getIdAtor() == 0 || this.ator.getIdAtor() == null) {

				this.logger.info("Controle: Cadastro Ator.");

				this.ator.setCodigoAtor(this.ator.getIdAtor());

				this.ator.setCodigoProjeto(this.projeto
						.getCodigoProjetoDeTeste());

				this.a.salvar(this.ator);

				this.ator = new AtorBean();

				return "/visao/projeto/lista-projeto";

			} else {

				this.logger.info("Controle: Atualização Ator.");

				this.a.atualizar(this.ator);

				this.ator = new AtorBean();

				return "/visao/projeto/lista-ator";

			}

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Atualização ou Cadastro Ator.");

			return "/visao/projeto/lista-ator";

		}

	}

	public DataModel<AtorBean> getListaAtores() {

		try {

			this.logger.info("Controle: Lista Ator.");

			List<AtorBean> ats = null;

			Long i = null;

			for (ProjetoDeTesteBean p : this.listar()) {

				i += 1;

				if (this.projeto.getIdProjetoDeTeste() == p
						.getIdProjetoDeTeste()) {

					ats.add(p.getEnvolvidos().get(i.intValue()));

				}

			}

			this.projeto.setQuantidadeAtor(i);

			this.atores = new ListDataModel<AtorBean>(ats);

			return this.atores;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Lista Ator.");

			return null;
		}

	}

	public String paginaAtualizarAtor() {

		this.logger.info("Controle: Atualização Ator.");

		this.ator = this.atores.getRowData();

		return "/visao/projeto/formulario-ator";

	}

	public String paginaBuscarAtor() {

		try {

			this.logger.info("Controle: Busca Por Ator.");

			this.ator = (AtorBean) this.a.buscar(this.ator, this.idParametro);

			return "/visao/projeto/lista-ator";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Busca Por Ator.");

			return "/visao/projeto/lista-ator";

		}

	}

	public String paginaExcluirAtor() {

		try {

			this.logger.info("Controle: Excluido Ator.");

			this.ator = this.atores.getRowData();

			this.a.remover(this.ator);

			return "/visao/projeto/lista-ator";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Excluido Ator. ");

			return "/visao/projeto/lista-ator";
		}

	}

	// Parte Pertencente ao projeto.
	public DataModel<ProjetoDeTesteBean> getListaProjetos() {

		try {

			this.logger.info("Controle: Lista Projeto De Teste.");
			
			Long i = null;
			
			for(ProjetoDeTesteBean p: listar()){
				
				i += 1;
				
			}
			
			this.quantidadeProjeto = i;

			this.projetos = new ListDataModel<ProjetoDeTesteBean>(this.listar());

			return this.projetos;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Lista Projeto De Teste.");

			return null;
		}

	}

	public String paginaAtualizarProjeto() {

		this.logger.info("Controle: Atualização Projeto De Teste.");

		this.projeto = this.projetos.getRowData();

		return "/visao/projeto/formulario-projeto";

	}

	public String paginaBuscarProjeto() {

		try {

			this.logger.info("Controle: Busca Por Projeto De Teste.");

			this.projeto = (ProjetoDeTesteBean) this.buscar(this.projeto,
					this.idParametro);

			return "/visao/projeto/lista-projeto";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Busca Por Projeto De Teste.");

			return "/visao/projeto/lista-projeto";

		}

	}

	public String paginaExcluirProjeto() {

		try {

			this.logger.info("Controle: Excluido Projeto De Teste.");

			this.projeto = this.projetos.getRowData();

			this.remover(this.projeto);

			return "/visao/projeto/lista-projeto";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Excluido Projeto De Teste. ");

			return "/visao/projeto/lista-projeto";
		}

	}

	public String paginaSalvarProjeto() {

		try {

			if (this.projeto.getIdProjetoDeTeste() == 0
					|| this.projeto.getIdProjetoDeTeste() == null) {

				this.logger.info("Controle: Cadastro Projeto De Teste.");

				this.projeto.setDataCriacao(new Date());

				this.projeto.setDataAtualizacao(new Date());

				this.projeto.setCodigoAtor(this.ator.getCodigoAtor());

				this.projeto.setCodigoProjetoDeTeste(this.projeto
						.getIdProjetoDeTeste());

				this.salvar(this.projeto);

				this.projeto = new ProjetoDeTesteBean();

				return "/visao/projeto/lista-projeto";

			} else {

				this.logger.info("Controle: Atualização Projeto De Teste.");

				this.projeto.setDataAtualizacao(new Date());

				this.atualizar(this.projeto);

				this.projeto = new ProjetoDeTesteBean();

				return "/visao/projeto/lista-projeto";

			}

		} catch (Exception e) {

			e.printStackTrace();

			this.logger
					.error("Controle: Atualização ou Cadastro Projeto De Teste.");

			return "/visao/projeto/lista-projeto";

		}

	}

	@Override
	public List<ProjetoDeTesteBean> listar() throws Exception {

		this.logger.info("Controle: Listar Projeto De Teste.");

		return this.p.listar();

	}

	@Override
	public void remover(ProjetoDeTesteBean objeto) throws Exception {

		this.logger.info("Controle: Remover Projeto De Teste.");

		this.p.remover(objeto);

	}

	@Override
	public void salvar(ProjetoDeTesteBean objeto) throws Exception {

		this.logger.info("Controle: Salvar Projeto De Teste.");

		this.p.salvar(objeto);

	}

	@Override
	public void atualizar(ProjetoDeTesteBean objeto) throws Exception {

		this.logger.info("Controle: Atualizar Projeto De Teste.");

		this.p.atualizar(objeto);

	}

	@Override
	public ProjetoDeTesteBean buscar(ProjetoDeTesteBean objeto, Long id)
			throws Exception {

		this.logger.info("Controle: Buscar Projeto De Teste.");

		return this.p.buscar(objeto, id);

	}

	public FacesContext getFacesContext() {
		return facesContext;
	}

	public void setFacesContext(FacesContext facesContext) {
		this.facesContext = facesContext;
	}

	public Long getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(Long idParametro) {
		this.idParametro = idParametro;
	}

	public String getTipoParametro() {
		return tipoParametro;
	}

	public void setTipoParametro(String tipoParametro) {
		this.tipoParametro = tipoParametro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ProjetoDeTesteServico getP() {
		return p;
	}

	public void setP(ProjetoDeTesteServico p) {
		this.p = p;
	}

	public ProjetoDeTesteBean getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoDeTesteBean projeto) {
		this.projeto = projeto;
	}

	public DataModel<ProjetoDeTesteBean> getProjetos() {
		return projetos;
	}

	public void setProjetos(DataModel<ProjetoDeTesteBean> projetos) {
		this.projetos = projetos;
	}

	public AtorBean getAtor() {
		return ator;
	}

	public void setAtor(AtorBean ator) {
		this.ator = ator;
	}

	public DataModel<AtorBean> getAtores() {
		return atores;
	}

	public void setAtores(DataModel<AtorBean> atores) {
		this.atores = atores;
	}

	public AtorServico getA() {
		return a;
	}

	public void setA(AtorServico a) {
		this.a = a;
	}

	public Long getQuantidadeProjeto() {
		return quantidadeProjeto;
	}

	public void setQuantidadeProjeto(Long quantidadeProjeto) {
		this.quantidadeProjeto = quantidadeProjeto;
	}

	public DocumentoServico getD() {
		return d;
	}

	public void setD(DocumentoServico d) {
		this.d = d;
	}

	public DocumentoBean getDocumento() {
		return documento;
	}

	public void setDocumento(DocumentoBean documento) {
		this.documento = documento;
	}

	public DataModel<DocumentoBean> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(DataModel<DocumentoBean> documentos) {
		this.documentos = documentos;
	}

}
