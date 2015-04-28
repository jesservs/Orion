package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_especificacao_de_caso_de_teste", schema = "public")
@SequenceGenerator(name = "sq_especificacao_de_caso_de_teste", sequenceName = "sq_especificacao_de_caso_de_teste", allocationSize = 0, initialValue = 1)
public final class EspecificacaoDeCasoDeTesteBean extends DocumentoBean
		implements Serializable {

	private static final long serialVersionUID = -8674001692748176398L;

	@Column(name = "vs_identificador_do_caso_de_teste")
	private String identificadorDoCasoDeTeste;

	@Column(name = "vs_itens_de_Teste")
	private String itensDeTeste;

	@Column(name = "vs_descricao_especificacao_das_entradas")
	private String descricaoEspecificacaoDasEntradas;

	private Map<Long, String> especificacaoDasEntradas;

	@Column(name = "vs_caso_de_teste")
	private String casoDeTeste;

	@Column(name = "vs_especificacao_de_saida")
	private String especificacaoDeSaida;

	@Column(name = "vs_necessidades_de_ambiente")
	private String necessidadesDeAmbiente;

	@Column(name = "vs_procedimentos_especiais_necessarios")
	private String procedimentosEspeciaisNecessarios;

	public EspecificacaoDeCasoDeTesteBean() {
		// TODO Auto-generated constructor stub
	}

	public EspecificacaoDeCasoDeTesteBean(Long idDocumento,
			Long codigoDocumento, Long codigoProjeto, Long codigoAtor,
			String descricao, Date dataCriacao, Date dataAtualizacao,
			String nome, String tipo, String propostoPor, String aprovadoPor,
			String situacaoDaDistribuicao, String listaDeDistribuicao) {
		super(idDocumento, codigoDocumento, codigoProjeto, codigoAtor,
				descricao, dataCriacao, dataAtualizacao, nome, tipo,
				propostoPor, aprovadoPor, situacaoDaDistribuicao,
				listaDeDistribuicao);
		// TODO Auto-generated constructor stub
	}

	public EspecificacaoDeCasoDeTesteBean(String identificadorDoCasoDeTeste,
			String itensDeTeste, String descricaoEspecificacaoDasEntradas,
			Map<Long, String> especificacaoDasEntradas, String casoDeTeste,
			String especificacaoDeSaida, String necessidadesDeAmbiente,
			String procedimentosEspeciaisNecessarios) {
		super();
		this.identificadorDoCasoDeTeste = identificadorDoCasoDeTeste;
		this.itensDeTeste = itensDeTeste;
		this.descricaoEspecificacaoDasEntradas = descricaoEspecificacaoDasEntradas;
		this.especificacaoDasEntradas = especificacaoDasEntradas;
		this.casoDeTeste = casoDeTeste;
		this.especificacaoDeSaida = especificacaoDeSaida;
		this.necessidadesDeAmbiente = necessidadesDeAmbiente;
		this.procedimentosEspeciaisNecessarios = procedimentosEspeciaisNecessarios;
	}

	public String getIdentificadorDoCasoDeTeste() {
		return identificadorDoCasoDeTeste;
	}

	public void setIdentificadorDoCasoDeTeste(String identificadorDoCasoDeTeste) {
		this.identificadorDoCasoDeTeste = identificadorDoCasoDeTeste;
	}

	public String getItensDeTeste() {
		return itensDeTeste;
	}

	public void setItensDeTeste(String itensDeTeste) {
		this.itensDeTeste = itensDeTeste;
	}

	public String getDescricaoEspecificacaoDasEntradas() {
		return descricaoEspecificacaoDasEntradas;
	}

	public void setDescricaoEspecificacaoDasEntradas(
			String descricaoEspecificacaoDasEntradas) {
		this.descricaoEspecificacaoDasEntradas = descricaoEspecificacaoDasEntradas;
	}

	public Map<Long, String> getEspecificacaoDasEntradas() {
		return especificacaoDasEntradas;
	}

	public void setEspecificacaoDasEntradas(
			Map<Long, String> especificacaoDasEntradas) {
		this.especificacaoDasEntradas = especificacaoDasEntradas;
	}

	public String getCasoDeTeste() {
		return casoDeTeste;
	}

	public void setCasoDeTeste(String casoDeTeste) {
		this.casoDeTeste = casoDeTeste;
	}

	public String getEspecificacaoDeSaida() {
		return especificacaoDeSaida;
	}

	public void setEspecificacaoDeSaida(String especificacaoDeSaida) {
		this.especificacaoDeSaida = especificacaoDeSaida;
	}

	public String getNecessidadesDeAmbiente() {
		return necessidadesDeAmbiente;
	}

	public void setNecessidadesDeAmbiente(String necessidadesDeAmbiente) {
		this.necessidadesDeAmbiente = necessidadesDeAmbiente;
	}

	public String getProcedimentosEspeciaisNecessarios() {
		return procedimentosEspeciaisNecessarios;
	}

	public void setProcedimentosEspeciaisNecessarios(
			String procedimentosEspeciaisNecessarios) {
		this.procedimentosEspeciaisNecessarios = procedimentosEspeciaisNecessarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((casoDeTeste == null) ? 0 : casoDeTeste.hashCode());
		result = prime
				* result
				+ ((descricaoEspecificacaoDasEntradas == null) ? 0
						: descricaoEspecificacaoDasEntradas.hashCode());
		result = prime
				* result
				+ ((especificacaoDasEntradas == null) ? 0
						: especificacaoDasEntradas.hashCode());
		result = prime
				* result
				+ ((especificacaoDeSaida == null) ? 0 : especificacaoDeSaida
						.hashCode());
		result = prime
				* result
				+ ((identificadorDoCasoDeTeste == null) ? 0
						: identificadorDoCasoDeTeste.hashCode());
		result = prime * result
				+ ((itensDeTeste == null) ? 0 : itensDeTeste.hashCode());
		result = prime
				* result
				+ ((necessidadesDeAmbiente == null) ? 0
						: necessidadesDeAmbiente.hashCode());
		result = prime
				* result
				+ ((procedimentosEspeciaisNecessarios == null) ? 0
						: procedimentosEspeciaisNecessarios.hashCode());
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
		EspecificacaoDeCasoDeTesteBean other = (EspecificacaoDeCasoDeTesteBean) obj;
		if (casoDeTeste == null) {
			if (other.casoDeTeste != null)
				return false;
		} else if (!casoDeTeste.equals(other.casoDeTeste))
			return false;
		if (descricaoEspecificacaoDasEntradas == null) {
			if (other.descricaoEspecificacaoDasEntradas != null)
				return false;
		} else if (!descricaoEspecificacaoDasEntradas
				.equals(other.descricaoEspecificacaoDasEntradas))
			return false;
		if (especificacaoDasEntradas == null) {
			if (other.especificacaoDasEntradas != null)
				return false;
		} else if (!especificacaoDasEntradas
				.equals(other.especificacaoDasEntradas))
			return false;
		if (especificacaoDeSaida == null) {
			if (other.especificacaoDeSaida != null)
				return false;
		} else if (!especificacaoDeSaida.equals(other.especificacaoDeSaida))
			return false;
		if (identificadorDoCasoDeTeste == null) {
			if (other.identificadorDoCasoDeTeste != null)
				return false;
		} else if (!identificadorDoCasoDeTeste
				.equals(other.identificadorDoCasoDeTeste))
			return false;
		if (itensDeTeste == null) {
			if (other.itensDeTeste != null)
				return false;
		} else if (!itensDeTeste.equals(other.itensDeTeste))
			return false;
		if (necessidadesDeAmbiente == null) {
			if (other.necessidadesDeAmbiente != null)
				return false;
		} else if (!necessidadesDeAmbiente.equals(other.necessidadesDeAmbiente))
			return false;
		if (procedimentosEspeciaisNecessarios == null) {
			if (other.procedimentosEspeciaisNecessarios != null)
				return false;
		} else if (!procedimentosEspeciaisNecessarios
				.equals(other.procedimentosEspeciaisNecessarios))
			return false;
		return true;
	}

}
