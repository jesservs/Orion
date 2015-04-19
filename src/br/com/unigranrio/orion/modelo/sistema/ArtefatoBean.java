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
@Table(name="tb_artefato", schema="public")
@SequenceGenerator(name = "sq_artefato", sequenceName = "sq_artefato",allocationSize=0,initialValue=1)
public class ArtefatoBean implements Serializable {

	private static final long serialVersionUID = 4370804269580436310L;

	@Id
	@GeneratedValue(generator="sq_artefato", strategy=GenerationType.SEQUENCE)
	@Column(name="pk_artefato")
	private Long idArtefato;

	@Column(name="vn_codigo_artefato")
	private Long codigoArtefato;

	@Column(name="vn_codigo_projeto")
	private Long codigoProjeto;

	@Column(name="vn_codigo_ator")
	private Long codigoAtor;

	@Column(name="vs_descricao")
	private String descricao;

	public ArtefatoBean() {
		// TODO Auto-generated constructor stub
	}

	public ArtefatoBean(Long idArtefato, Long codigoArtefato,
			Long codigoProjeto, Long codigoAtor, String descricao) {
		super();
		this.idArtefato = idArtefato;
		this.codigoArtefato = codigoArtefato;
		this.codigoProjeto = codigoProjeto;
		this.codigoAtor = codigoAtor;
		this.descricao = descricao;
	}

	public Long getIdArtefato() {
		return idArtefato;
	}

	public void setIdArtefato(Long idArtefato) {
		this.idArtefato = idArtefato;
	}

	public Long getCodigoArtefato() {
		return codigoArtefato;
	}

	public void setCodigoArtefato(Long codigoArtefato) {
		this.codigoArtefato = codigoArtefato;
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
				+ ((codigoArtefato == null) ? 0 : codigoArtefato.hashCode());
		result = prime * result
				+ ((codigoAtor == null) ? 0 : codigoAtor.hashCode());
		result = prime * result
				+ ((codigoProjeto == null) ? 0 : codigoProjeto.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((idArtefato == null) ? 0 : idArtefato.hashCode());
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
		ArtefatoBean other = (ArtefatoBean) obj;
		if (codigoArtefato == null) {
			if (other.codigoArtefato != null)
				return false;
		} else if (!codigoArtefato.equals(other.codigoArtefato))
			return false;
		if (codigoAtor == null) {
			if (other.codigoAtor != null)
				return false;
		} else if (!codigoAtor.equals(other.codigoAtor))
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
		if (idArtefato == null) {
			if (other.idArtefato != null)
				return false;
		} else if (!idArtefato.equals(other.idArtefato))
			return false;
		return true;
	}

}
