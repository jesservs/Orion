package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_diagrama", schema="public")
@SequenceGenerator(name = "sq_diagrama", sequenceName = "sq_diagrama",allocationSize=0,initialValue=1)
public class DiagramaBean implements Serializable {

	private static final long serialVersionUID = -6600787593928931136L;

	@Id
	@GeneratedValue(generator="sq_diagrama", strategy=GenerationType.SEQUENCE)
	@Column(name="pk_diagrama")
	private Long idDiagrama;

	@Column(name="vn_codigo_diagrama")
	private Long codigoDiagrama;

	@Column(name="vs_descricao")
	private String descricao;

	@Column(name="vn_codigo_projeto")
	private Long codigoProjeto;

	@Column(name="vn_codigo_ator")
	private Long codigoAtor;

	public DiagramaBean() {
		// TODO Auto-generated constructor stub
	}

	public DiagramaBean(Long idDiagrama, Long codigoDiagrama, String descricao,
			Long codigoProjeto, Long codigoAtor) {
		super();
		this.idDiagrama = idDiagrama;
		this.codigoDiagrama = codigoDiagrama;
		this.descricao = descricao;
		this.codigoProjeto = codigoProjeto;
		this.codigoAtor = codigoAtor;
	}

	public Long getIdDiagrama() {
		return idDiagrama;
	}

	public void setIdDiagrama(Long idDiagrama) {
		this.idDiagrama = idDiagrama;
	}

	public Long getCodigoDiagrama() {
		return codigoDiagrama;
	}

	public void setCodigoDiagrama(Long codigoDiagrama) {
		this.codigoDiagrama = codigoDiagrama;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getCodigoProjeto() {
		return codigoProjeto;
	}

	public void setCodigoProjeto(Long codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}

	public Long getCodigoAtor() {
		return codigoAtor;
	}

	public void setCodigoAtor(Long codigoAtor) {
		this.codigoAtor = codigoAtor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoAtor == null) ? 0 : codigoAtor.hashCode());
		result = prime * result
				+ ((codigoDiagrama == null) ? 0 : codigoDiagrama.hashCode());
		result = prime * result
				+ ((codigoProjeto == null) ? 0 : codigoProjeto.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((idDiagrama == null) ? 0 : idDiagrama.hashCode());
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
		DiagramaBean other = (DiagramaBean) obj;
		if (codigoAtor == null) {
			if (other.codigoAtor != null)
				return false;
		} else if (!codigoAtor.equals(other.codigoAtor))
			return false;
		if (codigoDiagrama == null) {
			if (other.codigoDiagrama != null)
				return false;
		} else if (!codigoDiagrama.equals(other.codigoDiagrama))
			return false;
		if (codigoProjeto == null) {
			if (other.codigoProjeto != null)
				return false;
		} else if (!codigoProjeto.equals(other.codigoProjeto))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idDiagrama == null) {
			if (other.idDiagrama != null)
				return false;
		} else if (!idDiagrama.equals(other.idDiagrama))
			return false;
		return true;
	}

}
