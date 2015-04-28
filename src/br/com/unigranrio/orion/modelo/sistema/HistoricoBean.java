package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_historico", schema="public")
@SequenceGenerator(name = "sq_historico", sequenceName = "sq_historico",allocationSize=0,initialValue=1)
public final class HistoricoBean implements Serializable {

	private static final long serialVersionUID = -7334248233148528902L;

	@Id
	@GeneratedValue(generator="sq_historico", strategy=GenerationType.SEQUENCE)
	@Column(name="pk_historico")
	private Long idHistorico;

	@Column(name = "vn_codigo_documento")
	private Long codigoDocumento;

	@Column(name = "vn_codigo_historico")
	private Long codigoHistorico;

	@Column(name = "vs_descricao")
	private String descricao;

	@Column(name = "vd_data")
	private Date data;

	@Column(name = "vd_versao")
	private Double versao;

	@Column(name = "vs_descricao_historico")
	private String descricaoHistorico;

	@Column(name = "vs_autor")
	private String autor;

	@Column(name = "vs_revisor")
	private String revisor;

	public HistoricoBean() {
		// TODO Auto-generated constructor stub
	}

	public HistoricoBean(Long idHistorico, Long codigoDocumento,
			Long codigoHistorico, String descricao, Date data, Double versao,
			String descricaoHistorico, String autor, String revisor) {
		super();
		this.idHistorico = idHistorico;
		this.codigoDocumento = codigoDocumento;
		this.codigoHistorico = codigoHistorico;
		this.descricao = descricao;
		this.data = data;
		this.versao = versao;
		this.descricaoHistorico = descricaoHistorico;
		this.autor = autor;
		this.revisor = revisor;
	}

	public Long getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(Long idHistorico) {
		this.idHistorico = idHistorico;
	}

	public Long getCodigoDocumento() {
		return codigoDocumento;
	}

	public void setCodigoDocumento(Long codigoDocumento) {
		this.codigoDocumento = codigoDocumento;
	}

	public Long getCodigoHistorico() {
		return codigoHistorico;
	}

	public void setCodigoHistorico(Long codigoHistorico) {
		this.codigoHistorico = codigoHistorico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getVersao() {
		return versao;
	}

	public void setVersao(Double versao) {
		this.versao = versao;
	}

	public String getDescricaoHistorico() {
		return descricaoHistorico;
	}

	public void setDescricaoHistorico(String descricaoHistorico) {
		this.descricaoHistorico = descricaoHistorico;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getRevisor() {
		return revisor;
	}

	public void setRevisor(String revisor) {
		this.revisor = revisor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result
				+ ((codigoDocumento == null) ? 0 : codigoDocumento.hashCode());
		result = prime * result
				+ ((codigoHistorico == null) ? 0 : codigoHistorico.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime
				* result
				+ ((descricaoHistorico == null) ? 0 : descricaoHistorico
						.hashCode());
		result = prime * result
				+ ((idHistorico == null) ? 0 : idHistorico.hashCode());
		result = prime * result + ((revisor == null) ? 0 : revisor.hashCode());
		result = prime * result + ((versao == null) ? 0 : versao.hashCode());
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
		HistoricoBean other = (HistoricoBean) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (codigoDocumento == null) {
			if (other.codigoDocumento != null)
				return false;
		} else if (!codigoDocumento.equals(other.codigoDocumento))
			return false;
		if (codigoHistorico == null) {
			if (other.codigoHistorico != null)
				return false;
		} else if (!codigoHistorico.equals(other.codigoHistorico))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (descricaoHistorico == null) {
			if (other.descricaoHistorico != null)
				return false;
		} else if (!descricaoHistorico.equals(other.descricaoHistorico))
			return false;
		if (idHistorico == null) {
			if (other.idHistorico != null)
				return false;
		} else if (!idHistorico.equals(other.idHistorico))
			return false;
		if (revisor == null) {
			if (other.revisor != null)
				return false;
		} else if (!revisor.equals(other.revisor))
			return false;
		if (versao == null) {
			if (other.versao != null)
				return false;
		} else if (!versao.equals(other.versao))
			return false;
		return true;
	}

}
