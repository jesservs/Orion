package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.unigranrio.orion.modelo.usuario.AtorBean;

@Entity
@Table(name = "tb_projeto_de_teste", schema = "public")
@SequenceGenerator(name = "sq_projeto_de_teste", sequenceName = "sq_projeto_de_teste", allocationSize = 0, initialValue = 1)
public final class ProjetoDeTesteBean implements Serializable {

	private static final long serialVersionUID = -2247482439597915794L;

	@Id
	@GeneratedValue(generator = "sq_projeto_de_teste", strategy = GenerationType.SEQUENCE)
	@Column(name = "pk_projeto_de_teste")
	private Long idProjetoDeTeste;

	@Column(name = "vn_codigo_projeto_de_teste")
	private Long codigoProjetoDeTeste;

	@Column(name = "vn_codigo_ator")
	private Long codigoAtor;

	@Column(name = "vs_descricao")
	private String descricao;

	@Temporal(TemporalType.DATE)
	@Column(name = "vd_data_criacao")
	private Date dataCriacao;

	@Temporal(TemporalType.DATE)
	@Column(name = "vd_data_atualizacao")
	private Date dataAtualizacao;

	@Column(name = "vs_fase")
	private String fase;

	@Column(name = "vs_sub_fase")
	private String subfase;

	@Column(name = "vs_criador")
	private String criador;

	@OneToMany
	private List<AtorBean> atores;

	@Column(name = "vs_sistema")
	private String sistema;

	@Column(name = "vs_cliente")
	private String cliente;

	@Column(name = "vs_modulos")
	private String modulos;

	@Column(name = "vs_nome_do_projeto")
	private String nomeDoProjeto;

	@Column(name = "vs_versao_do_projeto")
	private Double versaoDoProjeto;

	@Column(name = "vn_quantidade_documento")
	private Long quantidadeDocumento;

	@Column(name = "vn_quantidade_ator")
	private Long quantidadeAtor;

	@Column(name = "vn_quantidade_diagrama")
	private Long quantidadeDiagrama;

	@Column(name = "vn_quantidade_artefato")
	private Long quantidadeArtefato;

	@Column(name = "vn_quantidade_modelo")
	private Long quantidadeModelo;

	@Column(name = "vn_quantidade_teste")
	private Long quantidadeTeste;

	@Column(name = "vn_quantidade_anexo")
	private Long quantidadeAnexo;

	public ProjetoDeTesteBean() {
		// TODO Auto-generated constructor stub
	}

	public ProjetoDeTesteBean(Long idProjetoDeTeste, Long codigoProjetoDeTeste,
			Long codigoAtor, String descricao, Date dataCriacao,
			Date dataAtualizacao, String fase, String subfase, String criador,
			List<AtorBean> atores, String sistema, String cliente,
			String modulos, String nomeDoProjeto, Double versaoDoProjeto,
			Long quantidadeDocumento, Long quantidadeAtor,
			Long quantidadeDiagrama, Long quantidadeArtefato,
			Long quantidadeModelo, Long quantidadeTeste, Long quantidadeAnexo) {
		super();
		this.idProjetoDeTeste = idProjetoDeTeste;
		this.codigoProjetoDeTeste = codigoProjetoDeTeste;
		this.codigoAtor = codigoAtor;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
		this.fase = fase;
		this.subfase = subfase;
		this.criador = criador;
		this.atores = atores;
		this.sistema = sistema;
		this.cliente = cliente;
		this.modulos = modulos;
		this.nomeDoProjeto = nomeDoProjeto;
		this.versaoDoProjeto = versaoDoProjeto;
		this.quantidadeDocumento = quantidadeDocumento;
		this.quantidadeAtor = quantidadeAtor;
		this.quantidadeDiagrama = quantidadeDiagrama;
		this.quantidadeArtefato = quantidadeArtefato;
		this.quantidadeModelo = quantidadeModelo;
		this.quantidadeTeste = quantidadeTeste;
		this.quantidadeAnexo = quantidadeAnexo;
	}

	public String getSubfase() {
		return subfase;
	}

	public void setSubfase(String subfase) {
		this.subfase = subfase;
	}

	public List<AtorBean> getAtores() {
		return atores;
	}

	public void setAtores(List<AtorBean> atores) {
		this.atores = atores;
	}

	public void setCriador(String criador) {
		this.criador = criador;
	}

	public Long getIdProjetoDeTeste() {
		return idProjetoDeTeste;
	}

	public void setIdProjetoDeTeste(Long idProjetoDeTeste) {
		this.idProjetoDeTeste = idProjetoDeTeste;
	}

	public Long getCodigoProjetoDeTeste() {
		return codigoProjetoDeTeste;
	}

	public void setCodigoProjetoDeTeste(Long codigoProjetoDeTeste) {
		this.codigoProjetoDeTeste = codigoProjetoDeTeste;
	}

	public Long getCodigoAtor() {
		return codigoAtor;
	}

	public void setCodigoAtor(Long codigoAtor) {
		this.codigoAtor = codigoAtor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getModulos() {
		return modulos;
	}

	public void setModulos(String modulos) {
		this.modulos = modulos;
	}

	public String getNomeDoProjeto() {
		return nomeDoProjeto;
	}

	public void setNomeDoProjeto(String nomeDoProjeto) {
		this.nomeDoProjeto = nomeDoProjeto;
	}

	public Double getVersaoDoProjeto() {
		return versaoDoProjeto;
	}

	public void setVersaoDoProjeto(Double versaoDoProjeto) {
		this.versaoDoProjeto = versaoDoProjeto;
	}

	public Long getQuantidadeDocumento() {
		return quantidadeDocumento;
	}

	public void setQuantidadeDocumento(Long quantidadeDocumento) {
		this.quantidadeDocumento = quantidadeDocumento;
	}

	public Long getQuantidadeAtor() {
		return quantidadeAtor;
	}

	public void setQuantidadeAtor(Long quantidadeAtor) {
		this.quantidadeAtor = quantidadeAtor;
	}

	public Long getQuantidadeDiagrama() {
		return quantidadeDiagrama;
	}

	public void setQuantidadeDiagrama(Long quantidadeDiagrama) {
		this.quantidadeDiagrama = quantidadeDiagrama;
	}

	public Long getQuantidadeArtefato() {
		return quantidadeArtefato;
	}

	public void setQuantidadeArtefato(Long quantidadeArtefato) {
		this.quantidadeArtefato = quantidadeArtefato;
	}

	public Long getQuantidadeModelo() {
		return quantidadeModelo;
	}

	public void setQuantidadeModelo(Long quantidadeModelo) {
		this.quantidadeModelo = quantidadeModelo;
	}

	public Long getQuantidadeTeste() {
		return quantidadeTeste;
	}

	public void setQuantidadeTeste(Long quantidadeTeste) {
		this.quantidadeTeste = quantidadeTeste;
	}

	public Long getQuantidadeAnexo() {
		return quantidadeAnexo;
	}

	public void setQuantidadeAnexo(Long quantidadeAnexo) {
		this.quantidadeAnexo = quantidadeAnexo;
	}

	public String getCriador() {
		return criador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atores == null) ? 0 : atores.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result
				+ ((codigoAtor == null) ? 0 : codigoAtor.hashCode());
		result = prime
				* result
				+ ((codigoProjetoDeTeste == null) ? 0 : codigoProjetoDeTeste
						.hashCode());
		result = prime * result + ((criador == null) ? 0 : criador.hashCode());
		result = prime * result
				+ ((dataAtualizacao == null) ? 0 : dataAtualizacao.hashCode());
		result = prime * result
				+ ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((fase == null) ? 0 : fase.hashCode());
		result = prime
				* result
				+ ((idProjetoDeTeste == null) ? 0 : idProjetoDeTeste.hashCode());
		result = prime * result + ((modulos == null) ? 0 : modulos.hashCode());
		result = prime * result
				+ ((nomeDoProjeto == null) ? 0 : nomeDoProjeto.hashCode());
		result = prime * result
				+ ((quantidadeAnexo == null) ? 0 : quantidadeAnexo.hashCode());
		result = prime
				* result
				+ ((quantidadeArtefato == null) ? 0 : quantidadeArtefato
						.hashCode());
		result = prime * result
				+ ((quantidadeAtor == null) ? 0 : quantidadeAtor.hashCode());
		result = prime
				* result
				+ ((quantidadeDiagrama == null) ? 0 : quantidadeDiagrama
						.hashCode());
		result = prime
				* result
				+ ((quantidadeDocumento == null) ? 0 : quantidadeDocumento
						.hashCode());
		result = prime
				* result
				+ ((quantidadeModelo == null) ? 0 : quantidadeModelo.hashCode());
		result = prime * result
				+ ((quantidadeTeste == null) ? 0 : quantidadeTeste.hashCode());
		result = prime * result + ((sistema == null) ? 0 : sistema.hashCode());
		result = prime * result + ((subfase == null) ? 0 : subfase.hashCode());
		result = prime * result
				+ ((versaoDoProjeto == null) ? 0 : versaoDoProjeto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjetoDeTesteBean other = (ProjetoDeTesteBean) obj;
		if (atores == null) {
			if (other.atores != null)
				return false;
		} else if (!atores.equals(other.atores))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (codigoAtor == null) {
			if (other.codigoAtor != null)
				return false;
		} else if (!codigoAtor.equals(other.codigoAtor))
			return false;
		if (codigoProjetoDeTeste == null) {
			if (other.codigoProjetoDeTeste != null)
				return false;
		} else if (!codigoProjetoDeTeste.equals(other.codigoProjetoDeTeste))
			return false;
		if (criador == null) {
			if (other.criador != null)
				return false;
		} else if (!criador.equals(other.criador))
			return false;
		if (dataAtualizacao == null) {
			if (other.dataAtualizacao != null)
				return false;
		} else if (!dataAtualizacao.equals(other.dataAtualizacao))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (fase == null) {
			if (other.fase != null)
				return false;
		} else if (!fase.equals(other.fase))
			return false;
		if (idProjetoDeTeste == null) {
			if (other.idProjetoDeTeste != null)
				return false;
		} else if (!idProjetoDeTeste.equals(other.idProjetoDeTeste))
			return false;
		if (modulos == null) {
			if (other.modulos != null)
				return false;
		} else if (!modulos.equals(other.modulos))
			return false;
		if (nomeDoProjeto == null) {
			if (other.nomeDoProjeto != null)
				return false;
		} else if (!nomeDoProjeto.equals(other.nomeDoProjeto))
			return false;
		if (quantidadeAnexo == null) {
			if (other.quantidadeAnexo != null)
				return false;
		} else if (!quantidadeAnexo.equals(other.quantidadeAnexo))
			return false;
		if (quantidadeArtefato == null) {
			if (other.quantidadeArtefato != null)
				return false;
		} else if (!quantidadeArtefato.equals(other.quantidadeArtefato))
			return false;
		if (quantidadeAtor == null) {
			if (other.quantidadeAtor != null)
				return false;
		} else if (!quantidadeAtor.equals(other.quantidadeAtor))
			return false;
		if (quantidadeDiagrama == null) {
			if (other.quantidadeDiagrama != null)
				return false;
		} else if (!quantidadeDiagrama.equals(other.quantidadeDiagrama))
			return false;
		if (quantidadeDocumento == null) {
			if (other.quantidadeDocumento != null)
				return false;
		} else if (!quantidadeDocumento.equals(other.quantidadeDocumento))
			return false;
		if (quantidadeModelo == null) {
			if (other.quantidadeModelo != null)
				return false;
		} else if (!quantidadeModelo.equals(other.quantidadeModelo))
			return false;
		if (quantidadeTeste == null) {
			if (other.quantidadeTeste != null)
				return false;
		} else if (!quantidadeTeste.equals(other.quantidadeTeste))
			return false;
		if (sistema == null) {
			if (other.sistema != null)
				return false;
		} else if (!sistema.equals(other.sistema))
			return false;
		if (subfase == null) {
			if (other.subfase != null)
				return false;
		} else if (!subfase.equals(other.subfase))
			return false;
		if (versaoDoProjeto == null) {
			if (other.versaoDoProjeto != null)
				return false;
		} else if (!versaoDoProjeto.equals(other.versaoDoProjeto))
			return false;
		return true;
	}

	

}