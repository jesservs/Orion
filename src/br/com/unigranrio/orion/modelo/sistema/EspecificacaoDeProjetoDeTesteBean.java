package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_especificacao_de_projeto_de_teste", schema = "public")
@SequenceGenerator(name = "sq_especificacao_de_projeto_de_teste", sequenceName = "sq_especificacao_de_projeto_de_teste", allocationSize = 0, initialValue = 1)
public class EspecificacaoDeProjetoDeTesteBean extends DocumentoBean implements
		Serializable {

	private static final long serialVersionUID = 8925117017916663571L;

	@Column(name="vs_identificador_da_suite_de_teste")
	private String identificadorDaSuiteDeTeste;


	@Column(name="vs_funcionalidades_a_serem_testadas")
	private String funcionalidadesaseremtestadas;


	@Column(name="vs_abordagem")
	private String abordagem;


	@Column(name="vs_procedimento")
	private String procedimento;


	@Column(name="vs_caso_de_teste")
	private String casodeteste;


	@Column(name="vs_criterios_de_sucesso_e_falha")
	private String criteriosdesucessoefalha;

	public EspecificacaoDeProjetoDeTesteBean() {
		// TODO Auto-generated constructor stub
	}

	public EspecificacaoDeProjetoDeTesteBean(Long idDocumento,
			Long codigoDocumento, Long codigoProjeto, Long codigoAtor,
			String descricao, Date dataCriacao, Date dataAtualizacao,
			String nome, String tipo) {
		super(idDocumento, codigoDocumento, codigoProjeto, codigoAtor,
				descricao, dataCriacao, dataAtualizacao, nome, tipo);
		// TODO Auto-generated constructor stub
	}

	public EspecificacaoDeProjetoDeTesteBean(
			String identificadorDaSuiteDeTeste,
			String funcionalidadesaseremtestadas, String abordagem,
			String procedimento, String casodeteste,
			String criteriosdesucessoefalha) {
		super();
		this.identificadorDaSuiteDeTeste = identificadorDaSuiteDeTeste;
		this.funcionalidadesaseremtestadas = funcionalidadesaseremtestadas;
		this.abordagem = abordagem;
		this.procedimento = procedimento;
		this.casodeteste = casodeteste;
		this.criteriosdesucessoefalha = criteriosdesucessoefalha;
	}

	public void setIdentificadorDaSuiteDeTeste(
			String identificadorDaSuiteDeTeste) {
		this.identificadorDaSuiteDeTeste = identificadorDaSuiteDeTeste;
	}

	public String getFuncionalidadesaseremtestadas() {
		return funcionalidadesaseremtestadas;
	}

	public void setFuncionalidadesaseremtestadas(
			String funcionalidadesaseremtestadas) {
		this.funcionalidadesaseremtestadas = funcionalidadesaseremtestadas;
	}

	public String getAbordagem() {
		return abordagem;
	}

	public void setAbordagem(String abordagem) {
		this.abordagem = abordagem;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getCasodeteste() {
		return casodeteste;
	}

	public void setCasodeteste(String casodeteste) {
		this.casodeteste = casodeteste;
	}

	public String getCriteriosdesucessoefalha() {
		return criteriosdesucessoefalha;
	}

	public void setCriteriosdesucessoefalha(String criteriosdesucessoefalha) {
		this.criteriosdesucessoefalha = criteriosdesucessoefalha;
	}

	public String getIdentificadorDaSuiteDeTeste() {
		return identificadorDaSuiteDeTeste;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abordagem == null) ? 0 : abordagem.hashCode());
		result = prime * result
				+ ((casodeteste == null) ? 0 : casodeteste.hashCode());
		result = prime
				* result
				+ ((criteriosdesucessoefalha == null) ? 0
						: criteriosdesucessoefalha.hashCode());
		result = prime
				* result
				+ ((funcionalidadesaseremtestadas == null) ? 0
						: funcionalidadesaseremtestadas.hashCode());
		result = prime
				* result
				+ ((identificadorDaSuiteDeTeste == null) ? 0
						: identificadorDaSuiteDeTeste.hashCode());
		result = prime * result
				+ ((procedimento == null) ? 0 : procedimento.hashCode());
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
		EspecificacaoDeProjetoDeTesteBean other = (EspecificacaoDeProjetoDeTesteBean) obj;
		if (abordagem == null) {
			if (other.abordagem != null)
				return false;
		} else if (!abordagem.equals(other.abordagem))
			return false;
		if (casodeteste == null) {
			if (other.casodeteste != null)
				return false;
		} else if (!casodeteste.equals(other.casodeteste))
			return false;
		if (criteriosdesucessoefalha == null) {
			if (other.criteriosdesucessoefalha != null)
				return false;
		} else if (!criteriosdesucessoefalha
				.equals(other.criteriosdesucessoefalha))
			return false;
		if (funcionalidadesaseremtestadas == null) {
			if (other.funcionalidadesaseremtestadas != null)
				return false;
		} else if (!funcionalidadesaseremtestadas
				.equals(other.funcionalidadesaseremtestadas))
			return false;
		if (identificadorDaSuiteDeTeste == null) {
			if (other.identificadorDaSuiteDeTeste != null)
				return false;
		} else if (!identificadorDaSuiteDeTeste
				.equals(other.identificadorDaSuiteDeTeste))
			return false;
		if (procedimento == null) {
			if (other.procedimento != null)
				return false;
		} else if (!procedimento.equals(other.procedimento))
			return false;
		return true;
	}

}
