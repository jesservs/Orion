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
@Table(name="tb_modelo", schema="public")
@SequenceGenerator(name = "sq_modelo", sequenceName = "sq_modelo",allocationSize=0,initialValue=1)
public class ModeloBean implements Serializable {

	private static final long serialVersionUID = 5736854812638002249L;

	@Id
	@GeneratedValue(generator = "sq_modelo", strategy = GenerationType.SEQUENCE)
	@Column(name = "pk_modelo")
	private Long idModelo;

	@Column(name = "vn_codigo_ator")
	private Long codigoAtor;

	@Column(name = "vn_codigo_projeto")
	private Long codigoProjeto;

	@Column(name = "vn_codigo_modelo")
	private Long codigoModelo;

	@Column(name = "vs_descricao")
	private String descricao;

	public ModeloBean() {
		// TODO Auto-generated constructor stub
	}

	public ModeloBean(Long idModelo, Long codigoAtor, Long codigoProjeto,
			Long codigoModelo, String descricao) {
		super();
		this.idModelo = idModelo;
		this.codigoAtor = codigoAtor;
		this.codigoProjeto = codigoProjeto;
		this.codigoModelo = codigoModelo;
		this.descricao = descricao;
	}

	public Long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Long idModelo) {
		this.idModelo = idModelo;
	}

	public Long getCodigoAtor() {
		return codigoAtor;
	}

	public void setCodigoAtor(Long codigoAtor) {
		this.codigoAtor = codigoAtor;
	}

	public Long getCodigoProjeto() {
		return codigoProjeto;
	}

	public void setCodigoProjeto(Long codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}

	public Long getCodigoModelo() {
		return codigoModelo;
	}

	public void setCodigoModelo(Long codigoModelo) {
		this.codigoModelo = codigoModelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoAtor == null) ? 0 : codigoAtor.hashCode());
		result = prime * result
				+ ((codigoModelo == null) ? 0 : codigoModelo.hashCode());
		result = prime * result
				+ ((codigoProjeto == null) ? 0 : codigoProjeto.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((idModelo == null) ? 0 : idModelo.hashCode());
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
		ModeloBean other = (ModeloBean) obj;
		if (codigoAtor == null) {
			if (other.codigoAtor != null)
				return false;
		} else if (!codigoAtor.equals(other.codigoAtor))
			return false;
		if (codigoModelo == null) {
			if (other.codigoModelo != null)
				return false;
		} else if (!codigoModelo.equals(other.codigoModelo))
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
		if (idModelo == null) {
			if (other.idModelo != null)
				return false;
		} else if (!idModelo.equals(other.idModelo))
			return false;
		return true;
	}

}
