package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estudo_de_viabilidade", schema = "public")
@SequenceGenerator(name = "sq_estudo_de_viabilidade", sequenceName = "sq_estudo_de_viabilidade", allocationSize = 0, initialValue = 1)
public class EstudoDeViabilidadeBean extends DocumentoBean implements
		Serializable {

	private static final long serialVersionUID = -7739254085248268413L;

	@Column(name="vs_objetivo_do_documento")
	private String objetivoDoDocumento;

	@Column(name="vs_metas")
	private String metas;

	@Column(name="vs_requisito_de_arquitetura")
	private String requisitoDeArquitetura;

	@Column(name="vs_requisitos_de_qualidade")
	private String requisitosdeQualidade;

	@Column(name="vs_confianca")
	private String confianca;

	@Column(name="vs_usabilidade")
	private String usabilidade;

	@Column(name="vs_seguranca")
	private String seguranca;

	public EstudoDeViabilidadeBean() {
		// TODO Auto-generated constructor stub
	}

	public EstudoDeViabilidadeBean(String objetivoDoDocumento, String metas,
			String requisitoDeArquitetura, String requisitosdeQualidade,
			String confianca, String usabilidade, String seguranca) {
		super();
		this.objetivoDoDocumento = objetivoDoDocumento;
		this.metas = metas;
		this.requisitoDeArquitetura = requisitoDeArquitetura;
		this.requisitosdeQualidade = requisitosdeQualidade;
		this.confianca = confianca;
		this.usabilidade = usabilidade;
		this.seguranca = seguranca;
	}

	public EstudoDeViabilidadeBean(Long idDocumento, Long codigoDocumento,
			Long codigoProjeto, Long codigoAtor, String descricao,
			Date dataCriacao, Date dataAtualizacao, String nome, String tipo) {
		super(idDocumento, codigoDocumento, codigoProjeto, codigoAtor,
				descricao, dataCriacao, dataAtualizacao, nome, tipo);
		// TODO Auto-generated constructor stub
	}

	public String getObjetivoDoDocumento() {
		return objetivoDoDocumento;
	}

	public void setObjetivoDoDocumento(String objetivoDoDocumento) {
		this.objetivoDoDocumento = objetivoDoDocumento;
	}

	public String getMetas() {
		return metas;
	}

	public void setMetas(String metas) {
		this.metas = metas;
	}

	public String getRequisitoDeArquitetura() {
		return requisitoDeArquitetura;
	}

	public void setRequisitoDeArquitetura(String requisitoDeArquitetura) {
		this.requisitoDeArquitetura = requisitoDeArquitetura;
	}

	public String getRequisitosdeQualidade() {
		return requisitosdeQualidade;
	}

	public void setRequisitosdeQualidade(String requisitosdeQualidade) {
		this.requisitosdeQualidade = requisitosdeQualidade;
	}

	public String getConfianca() {
		return confianca;
	}

	public void setConfianca(String confianca) {
		this.confianca = confianca;
	}

	public String getUsabilidade() {
		return usabilidade;
	}

	public void setUsabilidade(String usabilidade) {
		this.usabilidade = usabilidade;
	}

	public String getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(String seguranca) {
		this.seguranca = seguranca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((confianca == null) ? 0 : confianca.hashCode());
		result = prime * result + ((metas == null) ? 0 : metas.hashCode());
		result = prime
				* result
				+ ((objetivoDoDocumento == null) ? 0 : objetivoDoDocumento
						.hashCode());
		result = prime
				* result
				+ ((requisitoDeArquitetura == null) ? 0
						: requisitoDeArquitetura.hashCode());
		result = prime
				* result
				+ ((requisitosdeQualidade == null) ? 0 : requisitosdeQualidade
						.hashCode());
		result = prime * result
				+ ((seguranca == null) ? 0 : seguranca.hashCode());
		result = prime * result
				+ ((usabilidade == null) ? 0 : usabilidade.hashCode());
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
		EstudoDeViabilidadeBean other = (EstudoDeViabilidadeBean) obj;
		if (confianca == null) {
			if (other.confianca != null)
				return false;
		} else if (!confianca.equals(other.confianca))
			return false;
		if (metas == null) {
			if (other.metas != null)
				return false;
		} else if (!metas.equals(other.metas))
			return false;
		if (objetivoDoDocumento == null) {
			if (other.objetivoDoDocumento != null)
				return false;
		} else if (!objetivoDoDocumento.equals(other.objetivoDoDocumento))
			return false;
		if (requisitoDeArquitetura == null) {
			if (other.requisitoDeArquitetura != null)
				return false;
		} else if (!requisitoDeArquitetura.equals(other.requisitoDeArquitetura))
			return false;
		if (requisitosdeQualidade == null) {
			if (other.requisitosdeQualidade != null)
				return false;
		} else if (!requisitosdeQualidade.equals(other.requisitosdeQualidade))
			return false;
		if (seguranca == null) {
			if (other.seguranca != null)
				return false;
		} else if (!seguranca.equals(other.seguranca))
			return false;
		if (usabilidade == null) {
			if (other.usabilidade != null)
				return false;
		} else if (!usabilidade.equals(other.usabilidade))
			return false;
		return true;
	}

}
