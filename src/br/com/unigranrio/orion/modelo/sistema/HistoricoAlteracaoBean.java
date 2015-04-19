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
@Table(name = "tb_historico_alteracao", schema = "public")
@SequenceGenerator(name = "sq_historico_alteracao", sequenceName = "sq_historico_alteracao", allocationSize = 0, initialValue = 1)
public final class HistoricoAlteracaoBean implements Serializable {

	private static final long serialVersionUID = -1519853891679283921L;

	@Id
	@GeneratedValue(generator = "sq_historico_alteracao", strategy = GenerationType.SEQUENCE)
	@Column(name = "pk_historico_alteracao")
	private Long idHistoricoAlteracao;

	@Column(name = "vs_descricao")
	private String descricao;

	@Column(name = "vs_nome")
	private String nome;

	@Column(name = "vs_matricula")
	private String matricula;

	@Column(name = "vs_login")
	private String login;

	@Column(name = "vs_operacao")
	private String operacao;

	@Column(name = "vd_data")
	private Date data;

	public HistoricoAlteracaoBean() {
		// TODO Auto-generated constructor stub
	}

	public HistoricoAlteracaoBean(Long idHistoricoAlteracao, String descricao,
			String nome, String matricula, String login, String operacao,
			Date data) {
		super();
		this.idHistoricoAlteracao = idHistoricoAlteracao;
		this.descricao = descricao;
		this.nome = nome;
		this.matricula = matricula;
		this.login = login;
		this.operacao = operacao;
		this.data = data;
	}

	public Long getIdHistoricoAlteracao() {
		return idHistoricoAlteracao;
	}

	public void setIdHistoricoAlteracao(Long idHistoricoAlteracao) {
		this.idHistoricoAlteracao = idHistoricoAlteracao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime
				* result
				+ ((idHistoricoAlteracao == null) ? 0 : idHistoricoAlteracao
						.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((operacao == null) ? 0 : operacao.hashCode());
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
		HistoricoAlteracaoBean other = (HistoricoAlteracaoBean) obj;
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
		if (idHistoricoAlteracao == null) {
			if (other.idHistoricoAlteracao != null)
				return false;
		} else if (!idHistoricoAlteracao.equals(other.idHistoricoAlteracao))
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
		if (operacao == null) {
			if (other.operacao != null)
				return false;
		} else if (!operacao.equals(other.operacao))
			return false;
		return true;
	}

}
