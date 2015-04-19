package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;
import java.util.List;

import br.com.unigranrio.orion.modelo.usuario.AtorBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_teste", schema="public")
@SequenceGenerator(name = "sq_teste", sequenceName = "sq_teste",allocationSize=0,initialValue=1)
public class TesteBean implements Serializable {

	private static final long serialVersionUID = 4440835096427640504L;

	@Id
	@GeneratedValue(generator="sq_teste", strategy=GenerationType.SEQUENCE)
	@Column(name="pk_teste")
	private Long idTeste;

	@Column(name="vn_codigo_ator")
	private Long codigoAtor;

	@Column(name="vn_codigo_teste")
	private Long codigoTeste;

	@OneToMany
	private List<AtorBean> atores;

	@Column(name="vs_descricao")
	private String descricao;

	@Column(name="vs_tipo")
	private String tipo;

	@Column(name="vs_situacao")
	private String situacao;

	@Column(name="vs_ferramenta")
	private String ferramenta;

	@Column(name="vs_validacao")
	private String validacao;

	@Column(name="vs_verificacao")
	private String verificacao;

	@Column(name="vs_resultado")
	private String resultado;

	@Column(name="vs_defeito")
	private String defeito;

	@Column(name="vs_especificacao")
	private String especificacao;

	@Column(name="vs_sugestao")
	private String sugestao;

	@Column(name="vs_requisito")
	private String requisito;

	@Column(name="vs_tecnica")
	private String tecnica;

	@Column(name="vs_abordagem")
	private String abordagem;

	@Column(name="vn_codigo_projeto")
	private Long codigoProjeto;

	public TesteBean() {
		// TODO Auto-generated constructor stub
	}

	public TesteBean(Long idTeste, Long codigoAtor, Long codigoTeste,
			List<AtorBean> atores, String descricao, String tipo,
			String situacao, String ferramenta, String validacao,
			String verificacao, String resultado, String defeito,
			String especificacao, String sugestao, String requisito,
			String tecnica, String abordagem, Long codigoProjeto) {
		super();
		this.idTeste = idTeste;
		this.codigoAtor = codigoAtor;
		this.codigoTeste = codigoTeste;
		this.atores = atores;
		this.descricao = descricao;
		this.tipo = tipo;
		this.situacao = situacao;
		this.ferramenta = ferramenta;
		this.validacao = validacao;
		this.verificacao = verificacao;
		this.resultado = resultado;
		this.defeito = defeito;
		this.especificacao = especificacao;
		this.sugestao = sugestao;
		this.requisito = requisito;
		this.tecnica = tecnica;
		this.abordagem = abordagem;
		this.codigoProjeto = codigoProjeto;
	}

	public Long getIdTeste() {
		return idTeste;
	}

	public void setIdTeste(Long idTeste) {
		this.idTeste = idTeste;
	}

	public Long getCodigoAtor() {
		return codigoAtor;
	}

	public void setCodigoAtor(Long codigoAtor) {
		this.codigoAtor = codigoAtor;
	}

	public Long getCodigoTeste() {
		return codigoTeste;
	}

	public void setCodigoTeste(Long codigoTeste) {
		this.codigoTeste = codigoTeste;
	}

	public List<AtorBean> getAtores() {
		return atores;
	}

	public void setAtores(List<AtorBean> atores) {
		this.atores = atores;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getFerramenta() {
		return ferramenta;
	}

	public void setFerramenta(String ferramenta) {
		this.ferramenta = ferramenta;
	}

	public String getValidacao() {
		return validacao;
	}

	public void setValidacao(String validacao) {
		this.validacao = validacao;
	}

	public String getVerificacao() {
		return verificacao;
	}

	public void setVerificacao(String verificacao) {
		this.verificacao = verificacao;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getDefeito() {
		return defeito;
	}

	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public String getSugestao() {
		return sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}

	public String getRequisito() {
		return requisito;
	}

	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getAbordagem() {
		return abordagem;
	}

	public void setAbordagem(String abordagem) {
		this.abordagem = abordagem;
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
				+ ((abordagem == null) ? 0 : abordagem.hashCode());
		result = prime * result + ((atores == null) ? 0 : atores.hashCode());
		result = prime * result
				+ ((codigoAtor == null) ? 0 : codigoAtor.hashCode());
		result = prime * result
				+ ((codigoProjeto == null) ? 0 : codigoProjeto.hashCode());
		result = prime * result
				+ ((codigoTeste == null) ? 0 : codigoTeste.hashCode());
		result = prime * result + ((defeito == null) ? 0 : defeito.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((especificacao == null) ? 0 : especificacao.hashCode());
		result = prime * result
				+ ((ferramenta == null) ? 0 : ferramenta.hashCode());
		result = prime * result + ((idTeste == null) ? 0 : idTeste.hashCode());
		result = prime * result
				+ ((requisito == null) ? 0 : requisito.hashCode());
		result = prime * result
				+ ((resultado == null) ? 0 : resultado.hashCode());
		result = prime * result
				+ ((situacao == null) ? 0 : situacao.hashCode());
		result = prime * result
				+ ((sugestao == null) ? 0 : sugestao.hashCode());
		result = prime * result + ((tecnica == null) ? 0 : tecnica.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result
				+ ((validacao == null) ? 0 : validacao.hashCode());
		result = prime * result
				+ ((verificacao == null) ? 0 : verificacao.hashCode());
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
		TesteBean other = (TesteBean) obj;
		if (abordagem == null) {
			if (other.abordagem != null)
				return false;
		} else if (!abordagem.equals(other.abordagem))
			return false;
		if (atores == null) {
			if (other.atores != null)
				return false;
		} else if (!atores.equals(other.atores))
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
		if (codigoTeste == null) {
			if (other.codigoTeste != null)
				return false;
		} else if (!codigoTeste.equals(other.codigoTeste))
			return false;
		if (defeito == null) {
			if (other.defeito != null)
				return false;
		} else if (!defeito.equals(other.defeito))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (especificacao == null) {
			if (other.especificacao != null)
				return false;
		} else if (!especificacao.equals(other.especificacao))
			return false;
		if (ferramenta == null) {
			if (other.ferramenta != null)
				return false;
		} else if (!ferramenta.equals(other.ferramenta))
			return false;
		if (idTeste == null) {
			if (other.idTeste != null)
				return false;
		} else if (!idTeste.equals(other.idTeste))
			return false;
		if (requisito == null) {
			if (other.requisito != null)
				return false;
		} else if (!requisito.equals(other.requisito))
			return false;
		if (resultado == null) {
			if (other.resultado != null)
				return false;
		} else if (!resultado.equals(other.resultado))
			return false;
		if (situacao == null) {
			if (other.situacao != null)
				return false;
		} else if (!situacao.equals(other.situacao))
			return false;
		if (sugestao == null) {
			if (other.sugestao != null)
				return false;
		} else if (!sugestao.equals(other.sugestao))
			return false;
		if (tecnica == null) {
			if (other.tecnica != null)
				return false;
		} else if (!tecnica.equals(other.tecnica))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (validacao == null) {
			if (other.validacao != null)
				return false;
		} else if (!validacao.equals(other.validacao))
			return false;
		if (verificacao == null) {
			if (other.verificacao != null)
				return false;
		} else if (!verificacao.equals(other.verificacao))
			return false;
		return true;
	}

}
