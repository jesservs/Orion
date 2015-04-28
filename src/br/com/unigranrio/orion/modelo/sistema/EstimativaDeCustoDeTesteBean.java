package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estimativa_de_custo_de_teste", schema = "public")
@SequenceGenerator(name = "sq_estimativa_de_custo_de_teste", sequenceName = "sq_estimativa_de_custo_de_teste", allocationSize = 0, initialValue = 1)
public final class EstimativaDeCustoDeTesteBean extends DocumentoBean implements
		Serializable {

	private static final long serialVersionUID = 5532740176155885987L;

	@Column(name = "vs_estrutura_de_teste")
	private String estruturaDeTeste;

	@Column(name = "vs_teste_informal")
	private Double testeInformal;

	@Column(name = "vs_teste_manual")
	private Double testeManual;

	@Column(name = "vs_teste_automatizado")
	private Double testeAutomatizado;

	@Column(name = "vs_total_do_custo_da_qualidade")
	private Double totalDoCustoDaQualidade;

	@Column(name = "vs_retorno_do_investimento")
	private String retornoDoInvestimento;

	public EstimativaDeCustoDeTesteBean() {
		// TODO Auto-generated constructor stub
	}

	public EstimativaDeCustoDeTesteBean(Long idDocumento, Long codigoDocumento,
			Long codigoProjeto, Long codigoAtor, String descricao,
			Date dataCriacao, Date dataAtualizacao, String nome, String tipo,
			String propostoPor, String aprovadoPor,
			String situacaoDaDistribuicao, String listaDeDistribuicao) {
		super(idDocumento, codigoDocumento, codigoProjeto, codigoAtor,
				descricao, dataCriacao, dataAtualizacao, nome, tipo,
				propostoPor, aprovadoPor, situacaoDaDistribuicao,
				listaDeDistribuicao);
		// TODO Auto-generated constructor stub
	}

	public EstimativaDeCustoDeTesteBean(String estruturaDeTeste,
			Double testeInformal, Double testeManual, Double testeAutomatizado,
			Double totalDoCustoDaQualidade, String retornoDoInvestimento) {
		super();
		this.estruturaDeTeste = estruturaDeTeste;
		this.testeInformal = testeInformal;
		this.testeManual = testeManual;
		this.testeAutomatizado = testeAutomatizado;
		this.totalDoCustoDaQualidade = totalDoCustoDaQualidade;
		this.retornoDoInvestimento = retornoDoInvestimento;
	}

	public String getEstruturaDeTeste() {
		return estruturaDeTeste;
	}

	public void setEstruturaDeTeste(String estruturaDeTeste) {
		this.estruturaDeTeste = estruturaDeTeste;
	}

	public Double getTesteInformal() {
		return testeInformal;
	}

	public void setTesteInformal(Double testeInformal) {
		this.testeInformal = testeInformal;
	}

	public Double getTesteManual() {
		return testeManual;
	}

	public void setTesteManual(Double testeManual) {
		this.testeManual = testeManual;
	}

	public Double getTesteAutomatizado() {
		return testeAutomatizado;
	}

	public void setTesteAutomatizado(Double testeAutomatizado) {
		this.testeAutomatizado = testeAutomatizado;
	}

	public Double getTotalDoCustoDaQualidade() {
		return totalDoCustoDaQualidade;
	}

	public void setTotalDoCustoDaQualidade(Double totalDoCustoDaQualidade) {
		this.totalDoCustoDaQualidade = totalDoCustoDaQualidade;
	}

	public String getRetornoDoInvestimento() {
		return retornoDoInvestimento;
	}

	public void setRetornoDoInvestimento(String retornoDoInvestimento) {
		this.retornoDoInvestimento = retornoDoInvestimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((estruturaDeTeste == null) ? 0 : estruturaDeTeste.hashCode());
		result = prime
				* result
				+ ((retornoDoInvestimento == null) ? 0 : retornoDoInvestimento
						.hashCode());
		result = prime
				* result
				+ ((testeAutomatizado == null) ? 0 : testeAutomatizado
						.hashCode());
		result = prime * result
				+ ((testeInformal == null) ? 0 : testeInformal.hashCode());
		result = prime * result
				+ ((testeManual == null) ? 0 : testeManual.hashCode());
		result = prime
				* result
				+ ((totalDoCustoDaQualidade == null) ? 0
						: totalDoCustoDaQualidade.hashCode());
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
		EstimativaDeCustoDeTesteBean other = (EstimativaDeCustoDeTesteBean) obj;
		if (estruturaDeTeste == null) {
			if (other.estruturaDeTeste != null)
				return false;
		} else if (!estruturaDeTeste.equals(other.estruturaDeTeste))
			return false;
		if (retornoDoInvestimento == null) {
			if (other.retornoDoInvestimento != null)
				return false;
		} else if (!retornoDoInvestimento.equals(other.retornoDoInvestimento))
			return false;
		if (testeAutomatizado == null) {
			if (other.testeAutomatizado != null)
				return false;
		} else if (!testeAutomatizado.equals(other.testeAutomatizado))
			return false;
		if (testeInformal == null) {
			if (other.testeInformal != null)
				return false;
		} else if (!testeInformal.equals(other.testeInformal))
			return false;
		if (testeManual == null) {
			if (other.testeManual != null)
				return false;
		} else if (!testeManual.equals(other.testeManual))
			return false;
		if (totalDoCustoDaQualidade == null) {
			if (other.totalDoCustoDaQualidade != null)
				return false;
		} else if (!totalDoCustoDaQualidade
				.equals(other.totalDoCustoDaQualidade))
			return false;
		return true;
	}

}
