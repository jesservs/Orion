package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_caso_de_teste", schema = "public")
@SequenceGenerator(name = "sq_caso_de_teste", sequenceName = "sq_caso_de_teste", allocationSize = 0, initialValue = 1)
public class CasoDeTesteBean extends DocumentoBean implements Serializable {

	private static final long serialVersionUID = -4148218159585020651L;

	@Column(name = "vs_pre_condicoes")
	private String preCondicoes;

	@Column(name = "vs_pos_condicoes")
	private String posCondicoes;

	@Column(name = "vs_detalhamento")
	private String detalhamento;

	@Column(name = "vs_massa_de_entrada_saida")
	private String massaDeEntradaSaida;

	@Column(name = "vs_criterios_especiais")
	private String criteriosEspeciais;

	@Column(name = "vs_ambiente")
	private String ambiente;

	@Column(name = "vs_implementacao")
	private String implementacao;

	@Column(name = "vs_iteracao")
	private String iteracao;

	@Column(name = "vs_inter_dependencias")
	private String interDependencias;

	public CasoDeTesteBean() {
		// TODO Auto-generated constructor stub
	}

	public CasoDeTesteBean(String preCondicoes, String posCondicoes,
			String detalhamento, String massaDeEntradaSaida,
			String criteriosEspeciais, String ambiente, String implementacao,
			String iteracao, String interDependencias) {
		super();
		this.preCondicoes = preCondicoes;
		this.posCondicoes = posCondicoes;
		this.detalhamento = detalhamento;
		this.massaDeEntradaSaida = massaDeEntradaSaida;
		this.criteriosEspeciais = criteriosEspeciais;
		this.ambiente = ambiente;
		this.implementacao = implementacao;
		this.iteracao = iteracao;
		this.interDependencias = interDependencias;
	}

	public CasoDeTesteBean(Long idDocumento, Long codigoDocumento,
			Long codigoProjeto, Long codigoAtor, String descricao,
			Date dataCriacao, Date dataAtualizacao, String nome, String tipo) {
		super(idDocumento, codigoDocumento, codigoProjeto, codigoAtor,
				descricao, dataCriacao, dataAtualizacao, nome, tipo);
		// TODO Auto-generated constructor stub
	}

	public String getPreCondicoes() {
		return preCondicoes;
	}

	public void setPreCondicoes(String preCondicoes) {
		this.preCondicoes = preCondicoes;
	}

	public String getPosCondicoes() {
		return posCondicoes;
	}

	public void setPosCondicoes(String posCondicoes) {
		this.posCondicoes = posCondicoes;
	}

	public String getDetalhamento() {
		return detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}

	public String getMassaDeEntradaSaida() {
		return massaDeEntradaSaida;
	}

	public void setMassaDeEntradaSaida(String massaDeEntradaSaida) {
		this.massaDeEntradaSaida = massaDeEntradaSaida;
	}

	public String getCriteriosEspeciais() {
		return criteriosEspeciais;
	}

	public void setCriteriosEspeciais(String criteriosEspeciais) {
		this.criteriosEspeciais = criteriosEspeciais;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getImplementacao() {
		return implementacao;
	}

	public void setImplementacao(String implementacao) {
		this.implementacao = implementacao;
	}

	public String getIteracao() {
		return iteracao;
	}

	public void setIteracao(String iteracao) {
		this.iteracao = iteracao;
	}

	public String getInterDependencias() {
		return interDependencias;
	}

	public void setInterDependencias(String interDependencias) {
		this.interDependencias = interDependencias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((ambiente == null) ? 0 : ambiente.hashCode());
		result = prime
				* result
				+ ((criteriosEspeciais == null) ? 0 : criteriosEspeciais
						.hashCode());
		result = prime * result
				+ ((detalhamento == null) ? 0 : detalhamento.hashCode());
		result = prime * result
				+ ((implementacao == null) ? 0 : implementacao.hashCode());
		result = prime
				* result
				+ ((interDependencias == null) ? 0 : interDependencias
						.hashCode());
		result = prime * result
				+ ((iteracao == null) ? 0 : iteracao.hashCode());
		result = prime
				* result
				+ ((massaDeEntradaSaida == null) ? 0 : massaDeEntradaSaida
						.hashCode());
		result = prime * result
				+ ((posCondicoes == null) ? 0 : posCondicoes.hashCode());
		result = prime * result
				+ ((preCondicoes == null) ? 0 : preCondicoes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CasoDeTesteBean other = (CasoDeTesteBean) obj;
		if (ambiente == null) {
			if (other.ambiente != null)
				return false;
		} else if (!ambiente.equals(other.ambiente))
			return false;
		if (criteriosEspeciais == null) {
			if (other.criteriosEspeciais != null)
				return false;
		} else if (!criteriosEspeciais.equals(other.criteriosEspeciais))
			return false;
		if (detalhamento == null) {
			if (other.detalhamento != null)
				return false;
		} else if (!detalhamento.equals(other.detalhamento))
			return false;
		if (implementacao == null) {
			if (other.implementacao != null)
				return false;
		} else if (!implementacao.equals(other.implementacao))
			return false;
		if (interDependencias == null) {
			if (other.interDependencias != null)
				return false;
		} else if (!interDependencias.equals(other.interDependencias))
			return false;
		if (iteracao == null) {
			if (other.iteracao != null)
				return false;
		} else if (!iteracao.equals(other.iteracao))
			return false;
		if (massaDeEntradaSaida == null) {
			if (other.massaDeEntradaSaida != null)
				return false;
		} else if (!massaDeEntradaSaida.equals(other.massaDeEntradaSaida))
			return false;
		if (posCondicoes == null) {
			if (other.posCondicoes != null)
				return false;
		} else if (!posCondicoes.equals(other.posCondicoes))
			return false;
		if (preCondicoes == null) {
			if (other.preCondicoes != null)
				return false;
		} else if (!preCondicoes.equals(other.preCondicoes))
			return false;
		return true;
	}

}
