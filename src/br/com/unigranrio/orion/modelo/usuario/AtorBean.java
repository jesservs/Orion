package br.com.unigranrio.orion.modelo.usuario;

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
@Table(name = "tb_ator", schema = "public")
@SequenceGenerator(name = "sq_ator", sequenceName = "sq_ator", allocationSize = 0, initialValue = 1)
public final class AtorBean implements Serializable {

	private static final long serialVersionUID = -7844282849736164711L;

	@Id
	@GeneratedValue(generator = "sq_ator", strategy = GenerationType.SEQUENCE)
	@Column(name = "pk_ator")
	private Long idAtor;

	@Column(name = "vs_descricao")
	private String descricao;

	@Column(name = "vn_codigo_ator")
	private Long codigoAtor;

	@Column(name = "vn_codigo_projeto")
	private Long codigoProjeto;

	@Column(name = "vs_nome")
	private String nome;

	@Column(name = "vs_login")
	private String login;

	@Column(name = "vs_senha")
	private String senha;

	@Column(name = "vs_cargo")
	private String cargo;

	@Column(name = "vs_matricula")
	private String matricula;

	@Column(name = "vs_email")
	private String email;

	@Column(name = "vb_administrador")
	private Boolean administrador;

	@Column(name = "vs_situacao")
	private String situacao;

	@Column(name = "vd_data_de_criacao")
	private Date dataDeCriacao;

	public AtorBean() {
		// TODO Auto-generated constructor stub
	}

	public AtorBean(Long idAtor, String descricao, Long codigoAtor,
			Long codigoProjeto, String nome, String login, String senha,
			String cargo, String matricula, String email,
			Boolean administrador, String situacao, Date dataDeCriacao) {
		super();
		this.idAtor = idAtor;
		this.descricao = descricao;
		this.codigoAtor = codigoAtor;
		this.codigoProjeto = codigoProjeto;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
		this.matricula = matricula;
		this.email = email;
		this.administrador = administrador;
		this.situacao = situacao;
		this.dataDeCriacao = dataDeCriacao;
	}

	public Long getIdAtor() {
		return idAtor;
	}

	public void setIdAtor(Long idAtor) {
		this.idAtor = idAtor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getCodigoAtor() {
		return codigoAtor;
	}

	public void setCodigoAtor(Long codigoAtor) {
		this.codigoAtor = codigoAtor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Boolean administrador) {
		this.administrador = administrador;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public Long getCodigoProjeto() {
		return codigoProjeto;
	}

	public void setCodigoProjeto(Long codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((administrador == null) ? 0 : administrador.hashCode());
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result
				+ ((codigoAtor == null) ? 0 : codigoAtor.hashCode());
		result = prime * result
				+ ((codigoProjeto == null) ? 0 : codigoProjeto.hashCode());
		result = prime * result
				+ ((dataDeCriacao == null) ? 0 : dataDeCriacao.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((idAtor == null) ? 0 : idAtor.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result
				+ ((situacao == null) ? 0 : situacao.hashCode());
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
		AtorBean other = (AtorBean) obj;
		if (administrador == null) {
			if (other.administrador != null)
				return false;
		} else if (!administrador.equals(other.administrador))
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
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
		if (dataDeCriacao == null) {
			if (other.dataDeCriacao != null)
				return false;
		} else if (!dataDeCriacao.equals(other.dataDeCriacao))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idAtor == null) {
			if (other.idAtor != null)
				return false;
		} else if (!idAtor.equals(other.idAtor))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (situacao == null) {
			if (other.situacao != null)
				return false;
		} else if (!situacao.equals(other.situacao))
			return false;
		return true;
	}

}
