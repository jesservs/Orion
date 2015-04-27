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

import br.com.unigranrio.orion.modelo.sistema.ProjetoDeTesteBean;
import br.com.unigranrio.orion.modelo.usuario.AtorBean;
import br.com.unigranrio.orion.servico.AtorServico;
import br.com.unigranrio.orion.servico.ProjetoDeTesteServico;
import br.com.unigranrio.orion.util.PadraoInterface;

@SessionScoped
@ManagedBean(name = "projetoControle")
public class ProjetoControle implements PadraoInterface<ProjetoDeTesteBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private FacesContext facesContext = FacesContext.getCurrentInstance();

	private Long idParametro;

	private String tipoParametro;

	private String nome;

	private ProjetoDeTesteServico p = new ProjetoDeTesteServico();

	private AtorServico a = new AtorServico();

	private AtorBean ator = new AtorBean();

	private DataModel<AtorBean> atores = new ListDataModel<AtorBean>();

	private ProjetoDeTesteBean projeto = new ProjetoDeTesteBean();

	private DataModel<ProjetoDeTesteBean> projetos = new ListDataModel<ProjetoDeTesteBean>();

	public ProjetoControle() {

	}

	// Parte Pertencente ao ator.

	public String paginaSalvarAtor() {

		try {

			if (this.ator.getIdAtor() == 0 || this.ator.getIdAtor() == null) {

				this.logger.info("Controle: Cadastro Ator.");

				this.ator.setCodigoAtor(this.ator.getIdAtor());

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

			Integer i = 0;

			for (ProjetoDeTesteBean p : this.listar()) {

				i += 1;
				if (this.projeto.getIdProjetoDeTeste() == p
						.getIdProjetoDeTeste()) {
					
					ats.add(p.getEnvolvidos().get(i));
					
				}

			}

			this.atores = new ListDataModel<AtorBean>(ats);

			return this.atores;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Lista Ator.");

			return null;
		}

	}

	public String paginaListarAtores() {

		this.logger.info("Controle: Lista Ator. ");

		this.atores = this.getListaAtores();

		return "/visao/projeto/lista-ator";

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

	public String paginaNovoAtor() {

		this.logger.info("Controle: Novo Ator.");

		this.ator = new AtorBean();

		return "/visao/projeto/formulario-ator";

	}

	// Parte Pertencente ao projeto.

	public DataModel<ProjetoDeTesteBean> getListaProjetos() {

		try {

			this.logger.info("Controle: Lista Projeto De Teste.");

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

	public String paginaListarProjetos() {

		this.logger.info("Controle: Lista Projeto De Teste. ");

		this.projetos = this.getListaProjetos();

		return "/visao/projeto/lista-projeto";

	}

	public String paginaNovoProjeto() {

		this.logger.info("Controle: Novo Projeto De Teste.");

		this.projeto = new ProjetoDeTesteBean();

		return "/visao/projeto/formulario-projeto";

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

}
