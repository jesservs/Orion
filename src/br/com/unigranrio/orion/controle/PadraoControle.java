package br.com.unigranrio.orion.controle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.sistema.DocumentoBean;
import br.com.unigranrio.orion.modelo.sistema.ProjetoDeTesteBean;
import br.com.unigranrio.orion.modelo.sistema.TesteBean;
import br.com.unigranrio.orion.modelo.usuario.AtorBean;
import br.com.unigranrio.orion.servico.PadraoServico;
import br.com.unigranrio.orion.util.PadraoInterface;

@Named(value = "padraoControle")
@SessionScoped
public class PadraoControle implements PadraoInterface<Object> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private Long idParametro;

	private String login;

	private String senha;

	private String tipoParametro;

	private ProjetoDeTesteBean projeto = new ProjetoDeTesteBean();

	private DataModel<ProjetoDeTesteBean> projetos = new ListDataModel<ProjetoDeTesteBean>();

	private DocumentoBean documento = new DocumentoBean();

	private DataModel<DocumentoBean> documentos = new ListDataModel<DocumentoBean>();

	private TesteBean teste = new TesteBean();

	private DataModel<TesteBean> testes = new ListDataModel<TesteBean>();

	private AtorBean ator = new AtorBean();

	private DataModel<AtorBean> atores = new ListDataModel<AtorBean>();

	private FacesContext facesContext = FacesContext.getCurrentInstance();

	private ProjetoDeTesteBean projetoDeTeste = new ProjetoDeTesteBean();

	@Inject
	private PadraoServico p = new PadraoServico();

	public PadraoControle() {
		// TODO Auto-generated constructor stub
	}

	public PadraoControle(Logger logger, Long idParametro, String login,
			String senha, String tipoParametro, ProjetoDeTesteBean projeto,
			DataModel<ProjetoDeTesteBean> projetos, DocumentoBean documento,
			DataModel<DocumentoBean> documentos, TesteBean teste,
			DataModel<TesteBean> testes, AtorBean ator,
			DataModel<AtorBean> atores, FacesContext facesContext,
			ProjetoDeTesteBean projetoDeTeste, PadraoServico p) {
		super();
		this.logger = logger;
		this.idParametro = idParametro;
		this.login = login;
		this.senha = senha;
		this.tipoParametro = tipoParametro;
		this.projeto = projeto;
		this.projetos = projetos;
		this.documento = documento;
		this.documentos = documentos;
		this.teste = teste;
		this.testes = testes;
		this.ator = ator;
		this.atores = atores;
		this.facesContext = facesContext;
		this.projetoDeTeste = projetoDeTeste;
		this.p = p;
	}

	public String paginaNovoProjeto() {

		this.logger.info("Controle Novo Projeto ");

		this.projeto = new ProjetoDeTesteBean();

		return "/visao/projeto/formulario/formulario-projeto";

	}

	public String paginaAtualizarProjeto() {

		this.logger.info("Controle Atualização Projeto ");

		this.projeto = this.projetos.getRowData();

		return "/visao/projeto/formulario/formulario-projeto";

	}

	public String paginaSalvarProjeto() {

		try {

			if (this.projeto.getIdProjetoDeTeste() != null) {

				this.logger.info("Controle Projeto Atualizado ");

				this.p.atualizar(this.projeto);

			} else {

				this.logger.info("Controle Projeto Cadastrado");

				this.p.salvar(this.projeto);

			}

			return "/visao/projeto/formulario/formulario-projeto";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle Atualização ou Cadastro Projeto ");

			return null;

		}

	}

	public String paginaExcluirProjeto() {

		try {

			this.logger.info("Controle Projeto Excluido ");

			this.projeto = this.projetos.getRowData();

			this.p.remover(this.projeto);

			return "/visao/projeto/lista/lista-projeto";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle Projeto Excluido ");

			return null;
		}

	}

	public String paginaBuscarProjeto() {

		try {

			this.logger.info("Controle Busca Por Projeto ");

			this.projeto = (ProjetoDeTesteBean) this.p.buscar(this.projeto,
					this.idParametro);

			return "/visao/projeto/lista/lista-projeto";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle Busca Por Projeto ");

			return null;

		}

	}

	public String paginaListarProjetos() {

		this.logger.info("Controle Lista de Projetos ");

		this.projetos = this.getListaProjetos();

		return "/visao/projeto/lista/lista-projeto";

	}

	public String paginaNovoAtor() {

		this.logger.info("Controle Novo Ator");

		this.ator = new AtorBean();

		return "/visao/projeto/formulario/formulario-ator";

	}

	public String paginaAtualizarAtor() {

		this.logger.info("Controle Atualização Ator ");

		this.ator = this.atores.getRowData();

		return "/visao/projeto/formulario/formulario-ator";

	}

	public String paginaSalvarAtor() {

		try {

			if (this.ator.getIdAtor() != null) {

				this.logger.info("Controle Ator Atualizado ");

				this.p.atualizar(this.ator);

			} else {

				this.logger.info("Controle Ator Cadastrado");

				this.p.salvar(this.ator);

			}

			return "/visao/projeto/formulario/formulario-ator";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle Atualização ou Cadastro Ator ");

			return null;

		}

	}

	public String paginaExcluirAtor() {

		try {

			this.logger.info("Controle Ator Excluido ");

			this.ator = this.atores.getRowData();

			this.p.remover(this.ator);

			return "/visao/projeto/lista/lista-ator";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle Ator Excluido ");

			return null;
		}

	}

	public String paginaBuscarAtor() {

		try {

			this.logger.info("Controle Busca Por Ator ");

			this.ator = (AtorBean) this.p.buscar(this.ator, this.idParametro);

			return "/visao/projeto/lista/lista-ator";

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle Busca Por Ator ");

			return null;

		}

	}

	public String paginaListarAtores() {

		this.logger.info("Controle Lista de Atores ");

		this.atores = this.getListaAtores();

		return "/visao/projeto/lista/lista-ator";

	}

	public String paginaEntrar() {

		this.logger.info("Novo Login no Sistema ");

		return "/visao/projeto/home-projeto";

	}

	public String paginaSair() {

		this.logger.info("Nova Saida no Sistema ");

		return "/WEB-INF/index";

	}

	public DataModel<AtorBean> getListaAtores() {

		try {

			this.logger.info("");

			List<AtorBean> ls = new ArrayList<AtorBean>();

			for (Object o : p.listar()) {

				if (o instanceof AtorBean) {

					ls.add((AtorBean) o);

				}

			}

			return new ListDataModel<AtorBean>(ls);

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("");

			return null;
		}

	}

	public DataModel<ProjetoDeTesteBean> getListaProjetos() {

		try {

			this.logger.info("");

			List<ProjetoDeTesteBean> ls = new ArrayList<ProjetoDeTesteBean>();

			Iterator<Object> itr = this.p.listar().iterator();

			while (itr.hasNext()) {

				Object o = itr.next();

				if (o instanceof ProjetoDeTesteBean) {

					this.projeto = (ProjetoDeTesteBean) o;

					ls.add(this.projeto);

				}

			}

			this.projetos = new ListDataModel<ProjetoDeTesteBean>(ls);

			return this.projetos;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("");

			return null;
		}

	}

	@Override
	public void salvar(Object objeto) throws Exception {

		this.logger.info("Controle Salvar");

		this.p.salvar(objeto);

	}

	@Override
	public void atualizar(Object objeto) throws Exception {

		this.logger.info("Controle Atualizar");

		this.p.atualizar(objeto);

	}

	@Override
	public void remover(Object objeto) throws Exception {

		this.logger.info("Controle Remover");

		this.p.remover(objeto);

	}

	@Override
	public Object buscar(Object objeto, Long id) throws Exception {

		this.logger.info("Controle Buscar");

		return this.p.buscar(objeto, id);

	}

	@Override
	public List<Object> listar() throws Exception {

		this.logger.info("Controle Listar");

		return this.p.listar();

	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public Long getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(Long idParametro) {
		this.idParametro = idParametro;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public DataModel<AtorBean> getAtores() {
		return atores;
	}

	public void setAtores(DataModel<AtorBean> atores) {
		this.atores = atores;
	}

	public String getTipoParametro() {
		return tipoParametro;
	}

	public void setTipoParametro(String tipoParametro) {
		this.tipoParametro = tipoParametro;
	}

	public FacesContext getFacesContext() {
		return facesContext;
	}

	public void setFacesContext(FacesContext facesContext) {
		this.facesContext = facesContext;
	}

	public ProjetoDeTesteBean getProjetoDeTeste() {
		return projetoDeTeste;
	}

	public void setProjetoDeTeste(ProjetoDeTesteBean projetoDeTeste) {
		this.projetoDeTeste = projetoDeTeste;
	}

	public AtorBean getAtor() {
		return ator;
	}

	public void setAtor(AtorBean ator) {
		this.ator = ator;
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

	public TesteBean getTeste() {
		return teste;
	}

	public void setTeste(TesteBean teste) {
		this.teste = teste;
	}

	public DataModel<TesteBean> getTestes() {
		return testes;
	}

	public void setTestes(DataModel<TesteBean> testes) {
		this.testes = testes;
	}

	public PadraoServico getP() {
		return p;
	}

	public void setP(PadraoServico p) {
		this.p = p;
	}

}
