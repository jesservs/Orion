package br.com.unigranrio.orion.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.unigranrio.orion.modelo.usuario.AtorBean;
import br.com.unigranrio.orion.servico.AtorServico;
import br.com.unigranrio.orion.util.PadraoInterface;

@SessionScoped
@ManagedBean(name = "atorControle")
public class AtorControle implements PadraoInterface<AtorBean> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private FacesContext facesContext = FacesContext.getCurrentInstance();

	private Long idParametro;

	private String tipoParametro;

	private AtorBean ator = new AtorBean();

	private AtorServico a = new AtorServico();

	private DataModel<AtorBean> atores = new ListDataModel<AtorBean>();

	public AtorControle() {
		
	}

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
		
			this.atores = new ListDataModel<AtorBean>(this.listar());

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

	@Override
	public List<AtorBean> listar() throws Exception {

		this.logger.info("Controle: Servico: Listar Ator.");

		return this.a.listar();

	}

	@Override
	public void remover(AtorBean objeto) throws Exception {

		this.logger.info("Controle: Servico: Remover Ator.");

		this.a.remover(objeto);

	}

	@Override
	public void salvar(AtorBean objeto) throws Exception {

		this.logger.info("Controle: Servico: Salvar Ator.");

		this.a.salvar(objeto);

	}

	@Override
	public void atualizar(AtorBean objeto) throws Exception {

		this.logger.info("Controle: Servico: Atualizar Ator.");

		this.a.atualizar(objeto);

	}

	@Override
	public AtorBean buscar(AtorBean objeto, Long id) throws Exception {

		this.logger.info("Controle: Servico: Buscar Ator.");

		return this.a.buscar(objeto, id);

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

	public AtorBean getAtor() {
		return ator;
	}

	public void setAtor(AtorBean ator) {
		this.ator = ator;
	}

	public AtorServico getA() {
		return a;
	}

	public void setA(AtorServico a) {
		this.a = a;
	}

	public DataModel<AtorBean> getAtores() {
		return atores;
	}

	public void setAtores(DataModel<AtorBean> atores) {
		this.atores = atores;
	}

}
