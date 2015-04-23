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
import br.com.unigranrio.orion.servico.ProjetoDeTesteServico;
import br.com.unigranrio.orion.util.PadraoInterface;

@SessionScoped
@ManagedBean(name = "padraoControle")
public class PadraoControle implements PadraoInterface<ProjetoDeTesteBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private FacesContext facesContext = FacesContext.getCurrentInstance();

	private Long idParametro;

	private String tipoParametro;

	private String nome;

	private ProjetoDeTesteServico p = new ProjetoDeTesteServico();

	private ProjetoDeTesteBean projeto = new ProjetoDeTesteBean();

	private DataModel<ProjetoDeTesteBean> projetos = new ListDataModel<ProjetoDeTesteBean>();

	public PadraoControle() {

	}

	public DataModel<ProjetoDeTesteBean> getListaProjetos() {

		try {

			this.logger.info("");

			this.projetos = new ListDataModel<ProjetoDeTesteBean>(this.listar());

			return this.projetos;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("");

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

			this.logger.error("Controle: Atualização ou Cadastro Projeto De Teste.");

			return "/visao/projeto/formulario-projeto";

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

}
