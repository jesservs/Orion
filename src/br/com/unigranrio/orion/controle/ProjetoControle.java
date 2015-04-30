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

	private ProjetoDeTesteServico p = new ProjetoDeTesteServico();

	private ProjetoDeTesteBean projeto = new ProjetoDeTesteBean();

	private DataModel<ProjetoDeTesteBean> projetos = new ListDataModel<ProjetoDeTesteBean>();

	public ProjetoControle() {

	}

	public DataModel<ProjetoDeTesteBean> getListaProjetos() {

		try {

			this.logger.info("Controle: Lista Projeto De Teste.");

			Long i = null;

			for (ProjetoDeTesteBean p : listar()) {

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
	
	public DataModel<AtorBean> getListaAtoresNoProjeto() {

		try {

			this.logger.info("Controle: Lista Atores No Projeto.");

			List<AtorBean> ats = null;
			
			DataModel<AtorBean> atores;

			Long i = null;

			for (ProjetoDeTesteBean p : this.listar()) {

				i += 1;

				if (this.projeto.getIdProjetoDeTeste() == p
						.getIdProjetoDeTeste()) {

				}

			}

			this.projeto.setQuantidadeAtor(i);

			atores = new ListDataModel<AtorBean>(ats);

			return atores;

		} catch (Exception e) {

			e.printStackTrace();

			this.logger.error("Controle: Lista Ator.");

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

		this.logger.info("Controle: Servico: Remover Projeto De Teste.");

		this.p.remover(objeto);

	}

	@Override
	public void salvar(ProjetoDeTesteBean objeto) throws Exception {

		this.logger.info("Controle: Servico: Salvar Projeto De Teste.");

		this.p.salvar(objeto);

	}

	@Override
	public void atualizar(ProjetoDeTesteBean objeto) throws Exception {

		this.logger.info("Controle: Servico: Atualizar Projeto De Teste.");

		this.p.atualizar(objeto);

	}

	@Override
	public ProjetoDeTesteBean buscar(ProjetoDeTesteBean objeto, Long id)
			throws Exception {

		this.logger.info("Controle: Servico: Buscar Projeto De Teste.");

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

	public Long getQuantidadeProjeto() {
		return quantidadeProjeto;
	}

	public void setQuantidadeProjeto(Long quantidadeProjeto) {
		this.quantidadeProjeto = quantidadeProjeto;
	}

}
