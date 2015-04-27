package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_classificacao_de_impacto", schema = "public")
@SequenceGenerator(name = "sq_classificacao_de_impacto", sequenceName = "sq_classificacao_de_impacto", allocationSize = 0, initialValue = 1)
public class ClassificacaoDeImpacto extends DocumentoBean implements
		Serializable {

	private static final long serialVersionUID = 8121822138403126696L;

	@Column(name="vs_instabilidade")
	private String instabilidade;

	@Column(name="vs_integridade_seguranca")
	private String integridadeSeguranca;

	@Column(name="vs_desempenho")
	private String desempenho;

	@Column(name="vs_manutencao")
	private String manutencao;

	@Column(name="vs_utilidade")
	private String utilidade;

	@Column(name="vs_migracao")
	private String migracao;

	@Column(name="vs_documentacao")
	private String documentacao;

	@Column(name="vs_usabilidade")
	private String usabilidade;

	@Column(name="vs_padroes")
	private String padroes;

	@Column(name="vs_confiabilidade")
	private String confiabilidade;

	@Column(name="vs_acessibilidade")
	private String acessibilidade;

	@Column(name="vs_capacidade")
	private String capacidade;

	public ClassificacaoDeImpacto() {
		// TODO Auto-generated constructor stub
	}

	public ClassificacaoDeImpacto(String instabilidade,
			String integridadeSeguranca, String desempenho, String manutencao,
			String utilidade, String migracao, String documentacao,
			String usabilidade, String padroes, String confiabilidade,
			String acessibilidade, String capacidade) {
		super();
		this.instabilidade = instabilidade;
		this.integridadeSeguranca = integridadeSeguranca;
		this.desempenho = desempenho;
		this.manutencao = manutencao;
		this.utilidade = utilidade;
		this.migracao = migracao;
		this.documentacao = documentacao;
		this.usabilidade = usabilidade;
		this.padroes = padroes;
		this.confiabilidade = confiabilidade;
		this.acessibilidade = acessibilidade;
		this.capacidade = capacidade;
	}

	public ClassificacaoDeImpacto(Long idDocumento, Long codigoDocumento,
			Long codigoProjeto, Long codigoAtor, String descricao,
			Date dataCriacao, Date dataAtualizacao, String nome, String tipo) {
		super(idDocumento, codigoDocumento, codigoProjeto, codigoAtor,
				descricao, dataCriacao, dataAtualizacao, nome, tipo);
		// TODO Auto-generated constructor stub
	}

	public String getInstabilidade() {
		return instabilidade;
	}

	public void setInstabilidade(String instabilidade) {
		this.instabilidade = instabilidade;
	}

	public String getIntegridadeSeguranca() {
		return integridadeSeguranca;
	}

	public void setIntegridadeSeguranca(String integridadeSeguranca) {
		this.integridadeSeguranca = integridadeSeguranca;
	}

	public String getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(String desempenho) {
		this.desempenho = desempenho;
	}

	public String getManutencao() {
		return manutencao;
	}

	public void setManutencao(String manutencao) {
		this.manutencao = manutencao;
	}

	public String getUtilidade() {
		return utilidade;
	}

	public void setUtilidade(String utilidade) {
		this.utilidade = utilidade;
	}

	public String getMigracao() {
		return migracao;
	}

	public void setMigracao(String migracao) {
		this.migracao = migracao;
	}

	public String getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(String documentacao) {
		this.documentacao = documentacao;
	}

	public String getUsabilidade() {
		return usabilidade;
	}

	public void setUsabilidade(String usabilidade) {
		this.usabilidade = usabilidade;
	}

	public String getPadroes() {
		return padroes;
	}

	public void setPadroes(String padroes) {
		this.padroes = padroes;
	}

	public String getConfiabilidade() {
		return confiabilidade;
	}

	public void setConfiabilidade(String confiabilidade) {
		this.confiabilidade = confiabilidade;
	}

	public String getAcessibilidade() {
		return acessibilidade;
	}

	public void setAcessibilidade(String acessibilidade) {
		this.acessibilidade = acessibilidade;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((acessibilidade == null) ? 0 : acessibilidade.hashCode());
		result = prime * result
				+ ((capacidade == null) ? 0 : capacidade.hashCode());
		result = prime * result
				+ ((confiabilidade == null) ? 0 : confiabilidade.hashCode());
		result = prime * result
				+ ((desempenho == null) ? 0 : desempenho.hashCode());
		result = prime * result
				+ ((documentacao == null) ? 0 : documentacao.hashCode());
		result = prime * result
				+ ((instabilidade == null) ? 0 : instabilidade.hashCode());
		result = prime
				* result
				+ ((integridadeSeguranca == null) ? 0 : integridadeSeguranca
						.hashCode());
		result = prime * result
				+ ((manutencao == null) ? 0 : manutencao.hashCode());
		result = prime * result
				+ ((migracao == null) ? 0 : migracao.hashCode());
		result = prime * result + ((padroes == null) ? 0 : padroes.hashCode());
		result = prime * result
				+ ((usabilidade == null) ? 0 : usabilidade.hashCode());
		result = prime * result
				+ ((utilidade == null) ? 0 : utilidade.hashCode());
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
		ClassificacaoDeImpacto other = (ClassificacaoDeImpacto) obj;
		if (acessibilidade == null) {
			if (other.acessibilidade != null)
				return false;
		} else if (!acessibilidade.equals(other.acessibilidade))
			return false;
		if (capacidade == null) {
			if (other.capacidade != null)
				return false;
		} else if (!capacidade.equals(other.capacidade))
			return false;
		if (confiabilidade == null) {
			if (other.confiabilidade != null)
				return false;
		} else if (!confiabilidade.equals(other.confiabilidade))
			return false;
		if (desempenho == null) {
			if (other.desempenho != null)
				return false;
		} else if (!desempenho.equals(other.desempenho))
			return false;
		if (documentacao == null) {
			if (other.documentacao != null)
				return false;
		} else if (!documentacao.equals(other.documentacao))
			return false;
		if (instabilidade == null) {
			if (other.instabilidade != null)
				return false;
		} else if (!instabilidade.equals(other.instabilidade))
			return false;
		if (integridadeSeguranca == null) {
			if (other.integridadeSeguranca != null)
				return false;
		} else if (!integridadeSeguranca.equals(other.integridadeSeguranca))
			return false;
		if (manutencao == null) {
			if (other.manutencao != null)
				return false;
		} else if (!manutencao.equals(other.manutencao))
			return false;
		if (migracao == null) {
			if (other.migracao != null)
				return false;
		} else if (!migracao.equals(other.migracao))
			return false;
		if (padroes == null) {
			if (other.padroes != null)
				return false;
		} else if (!padroes.equals(other.padroes))
			return false;
		if (usabilidade == null) {
			if (other.usabilidade != null)
				return false;
		} else if (!usabilidade.equals(other.usabilidade))
			return false;
		if (utilidade == null) {
			if (other.utilidade != null)
				return false;
		} else if (!utilidade.equals(other.utilidade))
			return false;
		return true;
	}

}
