package br.com.unigranrio.orion.modelo.sistema;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_anexo", schema = "public")
@SequenceGenerator(name = "sq_anexo", sequenceName = "sq_anexo", allocationSize = 0, initialValue = 1)
public class AnexoBean {

	@Id
	@GeneratedValue(generator = "sq_anexo", strategy = GenerationType.SEQUENCE)
	@Column(name = "pk_anexo")
	private Long idAnexo;

	@Column(name = "vs_descricao")
	private String descricao;

	@Column(name = "vn_codigo_projeto")
	private Long codigoProjeto;

	@Column(name = "vn_codigo_ator")
	private Long codigoAtor;

	@Column(name = "vn_codigo_anexo")
	private Long codigoAnexo;

	@Column(name = "vs_nome")
	private String nome;

	@Column(name = "vs_caminho")
	private String caminho;

	@Column(name = "vs_extensao")
	private String extensao;

	private Byte[] anexo;

	public AnexoBean() {
		// TODO Auto-generated constructor stub
	}

	public AnexoBean(Long idAnexo, String descricao, Long codigoProjeto,
			Long codigoAtor, Long codigoAnexo, String nome, String caminho,
			String extensao, Byte[] anexo) {
		super();
		this.idAnexo = idAnexo;
		this.descricao = descricao;
		this.codigoProjeto = codigoProjeto;
		this.codigoAtor = codigoAtor;
		this.codigoAnexo = codigoAnexo;
		this.nome = nome;
		this.caminho = caminho;
		this.extensao = extensao;
		this.anexo = anexo;
	}

	public Long getIdAnexo() {
		return idAnexo;
	}

	public void setIdAnexo(Long idAnexo) {
		this.idAnexo = idAnexo;
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

	public Long getCodigoAnexo() {
		return codigoAnexo;
	}

	public void setCodigoAnexo(Long codigoAnexo) {
		this.codigoAnexo = codigoAnexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	public Byte[] getAnexo() {
		return anexo;
	}

	public void setAnexo(Byte[] anexo) {
		this.anexo = anexo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(anexo);
		result = prime * result + ((caminho == null) ? 0 : caminho.hashCode());
		result = prime * result
				+ ((codigoAnexo == null) ? 0 : codigoAnexo.hashCode());
		result = prime * result
				+ ((codigoAtor == null) ? 0 : codigoAtor.hashCode());
		result = prime * result
				+ ((codigoProjeto == null) ? 0 : codigoProjeto.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((extensao == null) ? 0 : extensao.hashCode());
		result = prime * result + ((idAnexo == null) ? 0 : idAnexo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		AnexoBean other = (AnexoBean) obj;
		if (!Arrays.equals(anexo, other.anexo))
			return false;
		if (caminho == null) {
			if (other.caminho != null)
				return false;
		} else if (!caminho.equals(other.caminho))
			return false;
		if (codigoAnexo == null) {
			if (other.codigoAnexo != null)
				return false;
		} else if (!codigoAnexo.equals(other.codigoAnexo))
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
		if (extensao == null) {
			if (other.extensao != null)
				return false;
		} else if (!extensao.equals(other.extensao))
			return false;
		if (idAnexo == null) {
			if (other.idAnexo != null)
				return false;
		} else if (!idAnexo.equals(other.idAnexo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
