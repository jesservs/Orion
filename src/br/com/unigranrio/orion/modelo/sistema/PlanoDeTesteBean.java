package br.com.unigranrio.orion.modelo.sistema;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_plano_de_teste", schema = "public")
@SequenceGenerator(name = "sq_plano_de_teste", sequenceName = "sq_plano_de_teste", allocationSize = 0, initialValue = 1)
public class PlanoDeTesteBean extends DocumentoBean implements Serializable {

	private static final long serialVersionUID = -413410900450621402L;

	@Column(name = "vn_codigo_projeto_de_teste")
	private Long codigoProjetoDeTeste;

	@Column(name = "vn_codigo_projeto_de_desenvolvimento")
	private Long codigoProjetoDeDesenvolvimento;

	@Column(name = "vs_nome_do_projeto_de_teste")
	private String nomeDoProjetoDeTeste;

	@Column(name = "vs_nome_do_projeto_de_desenvolvimento")
	private String nomeDoProjetoDeDesenvolvimento;

	@Column(name = "vs_modulo")
	private String modulo;

	@Column(name = "vs_identificacao_do_plano_de_testes")
	private String identificacaoDoPlanoDeTestes;

	@Column(name = "vs_referencias")
	private String referencias;

	@Column(name = "vs_introducao")
	private String introducao;

	@Column(name = "vs_funcionalidades_a_serem_testadas")
	private String funcionalidadesASeremTestadas;

	@Column(name = "vs_riscos_do_processo_de_teste")
	private String riscosDoProcessoDeTeste;

	@Column(name = "vs_funcoes_a_serem_testadas_do_ponto_de_vista_do_usuario")
	private String funcoesASeremTestadasDoPontoDeVistaDoUsuario;

	@Column(name = "vs_funcoes_que_nao_serao_testadas_do_ponto_de_vista_do_usuario")
	private String funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario;

	@Column(name = "vs_abordagem_dos_testes")
	private String abordagemDosTestes;

	@Column(name = "vs_criterios_de_conclusao_dos_testes")
	private String criteriosDeConclusaoDosTestes;

	@Column(name = "vs_criterios_para_interrupcao_e_retomada_dos_testes")
	private String criteriosParaInterrupcaoERetomadaDosTestes;

	@Column(name = "vs_criterios_de_termino_dos_testes")
	private String criteriosDeTerminoDosTestes;

	@Column(name = "vs_riscos_do_projeto")
	private String riscosDoProjeto;

	@Column(name = "vs_documentos_a_serem_entregues")
	private String documentosASeremEntregues;

	@Column(name = "vs_entregas")
	private String entregas;

	@Column(name = "vs_ambiente_de_teste")
	private String ambienteDeTeste;

	@Column(name = "vs_pessoal")
	private String pessoal;

	@Column(name = "vs_responsabilidades")
	private String responsabilidades;

	@Column(name = "vs_cronograma")
	private String cronograma;

	@Column(name = "vs_plano_de_riscos_e_contingencias")
	private String planoDeRiscosEContingencias;

	@Column(name = "vs_aprovacao_dos_testes")
	private String aprovacaoDosTestes;

	@Column(name = "vs_metricas")
	private String metricas;

	@Column(name = "vs_tipos_de_teste_que_serao_aplicados")
	private String tiposDeTesteQueSeraoAplicados;

	public PlanoDeTesteBean() {
		// TODO Auto-generated constructor stub
	}

	public Long getCodigoProjetoDeTeste() {
		return codigoProjetoDeTeste;
	}

	public void setCodigoProjetoDeTeste(Long codigoProjetoDeTeste) {
		this.codigoProjetoDeTeste = codigoProjetoDeTeste;
	}

	public Long getCodigoProjetoDeDesenvolvimento() {
		return codigoProjetoDeDesenvolvimento;
	}

	public void setCodigoProjetoDeDesenvolvimento(
			Long codigoProjetoDeDesenvolvimento) {
		this.codigoProjetoDeDesenvolvimento = codigoProjetoDeDesenvolvimento;
	}

	public String getNomeDoProjetoDeTeste() {
		return nomeDoProjetoDeTeste;
	}

	public void setNomeDoProjetoDeTeste(String nomeDoProjetoDeTeste) {
		this.nomeDoProjetoDeTeste = nomeDoProjetoDeTeste;
	}

	public String getNomeDoProjetoDeDesenvolvimento() {
		return nomeDoProjetoDeDesenvolvimento;
	}

	public void setNomeDoProjetoDeDesenvolvimento(
			String nomeDoProjetoDeDesenvolvimento) {
		this.nomeDoProjetoDeDesenvolvimento = nomeDoProjetoDeDesenvolvimento;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getIdentificacaoDoPlanoDeTestes() {
		return identificacaoDoPlanoDeTestes;
	}

	public void setIdentificacaoDoPlanoDeTestes(
			String identificacaoDoPlanoDeTestes) {
		this.identificacaoDoPlanoDeTestes = identificacaoDoPlanoDeTestes;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getIntroducao() {
		return introducao;
	}

	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}

	public String getFuncionalidadesASeremTestadas() {
		return funcionalidadesASeremTestadas;
	}

	public void setFuncionalidadesASeremTestadas(
			String funcionalidadesASeremTestadas) {
		this.funcionalidadesASeremTestadas = funcionalidadesASeremTestadas;
	}

	public String getRiscosDoProcessoDeTeste() {
		return riscosDoProcessoDeTeste;
	}

	public void setRiscosDoProcessoDeTeste(String riscosDoProcessoDeTeste) {
		this.riscosDoProcessoDeTeste = riscosDoProcessoDeTeste;
	}

	public String getFuncoesASeremTestadasDoPontoDeVistaDoUsuario() {
		return funcoesASeremTestadasDoPontoDeVistaDoUsuario;
	}

	public void setFuncoesASeremTestadasDoPontoDeVistaDoUsuario(
			String funcoesASeremTestadasDoPontoDeVistaDoUsuario) {
		this.funcoesASeremTestadasDoPontoDeVistaDoUsuario = funcoesASeremTestadasDoPontoDeVistaDoUsuario;
	}

	public String getFuncoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario() {
		return funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario;
	}

	public void setFuncoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario(
			String funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario) {
		this.funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario = funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario;
	}

	public String getAbordagemDosTestes() {
		return abordagemDosTestes;
	}

	public void setAbordagemDosTestes(String abordagemDosTestes) {
		this.abordagemDosTestes = abordagemDosTestes;
	}

	public String getCriteriosDeConclusaoDosTestes() {
		return criteriosDeConclusaoDosTestes;
	}

	public void setCriteriosDeConclusaoDosTestes(
			String criteriosDeConclusaoDosTestes) {
		this.criteriosDeConclusaoDosTestes = criteriosDeConclusaoDosTestes;
	}

	public String getCriteriosParaInterrupcaoERetomadaDosTestes() {
		return criteriosParaInterrupcaoERetomadaDosTestes;
	}

	public void setCriteriosParaInterrupcaoERetomadaDosTestes(
			String criteriosParaInterrupcaoERetomadaDosTestes) {
		this.criteriosParaInterrupcaoERetomadaDosTestes = criteriosParaInterrupcaoERetomadaDosTestes;
	}

	public String getCriteriosDeTerminoDosTestes() {
		return criteriosDeTerminoDosTestes;
	}

	public void setCriteriosDeTerminoDosTestes(
			String criteriosDeTerminoDosTestes) {
		this.criteriosDeTerminoDosTestes = criteriosDeTerminoDosTestes;
	}

	public String getRiscosDoProjeto() {
		return riscosDoProjeto;
	}

	public void setRiscosDoProjeto(String riscosDoProjeto) {
		this.riscosDoProjeto = riscosDoProjeto;
	}

	public String getDocumentosASeremEntregues() {
		return documentosASeremEntregues;
	}

	public void setDocumentosASeremEntregues(String documentosASeremEntregues) {
		this.documentosASeremEntregues = documentosASeremEntregues;
	}

	public String getEntregas() {
		return entregas;
	}

	public void setEntregas(String entregas) {
		this.entregas = entregas;
	}

	public String getAmbienteDeTeste() {
		return ambienteDeTeste;
	}

	public void setAmbienteDeTeste(String ambienteDeTeste) {
		this.ambienteDeTeste = ambienteDeTeste;
	}

	public String getPessoal() {
		return pessoal;
	}

	public void setPessoal(String pessoal) {
		this.pessoal = pessoal;
	}

	public String getResponsabilidades() {
		return responsabilidades;
	}

	public void setResponsabilidades(String responsabilidades) {
		this.responsabilidades = responsabilidades;
	}

	public String getCronograma() {
		return cronograma;
	}

	public void setCronograma(String cronograma) {
		this.cronograma = cronograma;
	}

	public String getPlanoDeRiscosEContingencias() {
		return planoDeRiscosEContingencias;
	}

	public void setPlanoDeRiscosEContingencias(
			String planoDeRiscosEContingencias) {
		this.planoDeRiscosEContingencias = planoDeRiscosEContingencias;
	}

	public String getAprovacaoDosTestes() {
		return aprovacaoDosTestes;
	}

	public void setAprovacaoDosTestes(String aprovacaoDosTestes) {
		this.aprovacaoDosTestes = aprovacaoDosTestes;
	}

	public String getMetricas() {
		return metricas;
	}

	public void setMetricas(String metricas) {
		this.metricas = metricas;
	}

	public String getTiposDeTesteQueSeraoAplicados() {
		return tiposDeTesteQueSeraoAplicados;
	}

	public void setTiposDeTesteQueSeraoAplicados(
			String tiposDeTesteQueSeraoAplicados) {
		this.tiposDeTesteQueSeraoAplicados = tiposDeTesteQueSeraoAplicados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((abordagemDosTestes == null) ? 0 : abordagemDosTestes
						.hashCode());
		result = prime * result
				+ ((ambienteDeTeste == null) ? 0 : ambienteDeTeste.hashCode());
		result = prime
				* result
				+ ((aprovacaoDosTestes == null) ? 0 : aprovacaoDosTestes
						.hashCode());
		result = prime
				* result
				+ ((codigoProjetoDeDesenvolvimento == null) ? 0
						: codigoProjetoDeDesenvolvimento.hashCode());
		result = prime
				* result
				+ ((codigoProjetoDeTeste == null) ? 0 : codigoProjetoDeTeste
						.hashCode());
		result = prime
				* result
				+ ((criteriosDeConclusaoDosTestes == null) ? 0
						: criteriosDeConclusaoDosTestes.hashCode());
		result = prime
				* result
				+ ((criteriosDeTerminoDosTestes == null) ? 0
						: criteriosDeTerminoDosTestes.hashCode());
		result = prime
				* result
				+ ((criteriosParaInterrupcaoERetomadaDosTestes == null) ? 0
						: criteriosParaInterrupcaoERetomadaDosTestes.hashCode());
		result = prime * result
				+ ((cronograma == null) ? 0 : cronograma.hashCode());
		result = prime
				* result
				+ ((documentosASeremEntregues == null) ? 0
						: documentosASeremEntregues.hashCode());
		result = prime * result
				+ ((entregas == null) ? 0 : entregas.hashCode());
		result = prime
				* result
				+ ((funcionalidadesASeremTestadas == null) ? 0
						: funcionalidadesASeremTestadas.hashCode());
		result = prime
				* result
				+ ((funcoesASeremTestadasDoPontoDeVistaDoUsuario == null) ? 0
						: funcoesASeremTestadasDoPontoDeVistaDoUsuario
								.hashCode());
		result = prime
				* result
				+ ((funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario == null) ? 0
						: funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario
								.hashCode());
		result = prime
				* result
				+ ((identificacaoDoPlanoDeTestes == null) ? 0
						: identificacaoDoPlanoDeTestes.hashCode());
		result = prime * result
				+ ((introducao == null) ? 0 : introducao.hashCode());
		result = prime * result
				+ ((metricas == null) ? 0 : metricas.hashCode());
		result = prime * result + ((modulo == null) ? 0 : modulo.hashCode());
		result = prime
				* result
				+ ((nomeDoProjetoDeDesenvolvimento == null) ? 0
						: nomeDoProjetoDeDesenvolvimento.hashCode());
		result = prime
				* result
				+ ((nomeDoProjetoDeTeste == null) ? 0 : nomeDoProjetoDeTeste
						.hashCode());
		result = prime * result + ((pessoal == null) ? 0 : pessoal.hashCode());
		result = prime
				* result
				+ ((planoDeRiscosEContingencias == null) ? 0
						: planoDeRiscosEContingencias.hashCode());
		result = prime * result
				+ ((referencias == null) ? 0 : referencias.hashCode());
		result = prime
				* result
				+ ((responsabilidades == null) ? 0 : responsabilidades
						.hashCode());
		result = prime
				* result
				+ ((riscosDoProcessoDeTeste == null) ? 0
						: riscosDoProcessoDeTeste.hashCode());
		result = prime * result
				+ ((riscosDoProjeto == null) ? 0 : riscosDoProjeto.hashCode());
		result = prime
				* result
				+ ((tiposDeTesteQueSeraoAplicados == null) ? 0
						: tiposDeTesteQueSeraoAplicados.hashCode());
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
		PlanoDeTesteBean other = (PlanoDeTesteBean) obj;
		if (abordagemDosTestes == null) {
			if (other.abordagemDosTestes != null)
				return false;
		} else if (!abordagemDosTestes.equals(other.abordagemDosTestes))
			return false;
		if (ambienteDeTeste == null) {
			if (other.ambienteDeTeste != null)
				return false;
		} else if (!ambienteDeTeste.equals(other.ambienteDeTeste))
			return false;
		if (aprovacaoDosTestes == null) {
			if (other.aprovacaoDosTestes != null)
				return false;
		} else if (!aprovacaoDosTestes.equals(other.aprovacaoDosTestes))
			return false;
		if (codigoProjetoDeDesenvolvimento == null) {
			if (other.codigoProjetoDeDesenvolvimento != null)
				return false;
		} else if (!codigoProjetoDeDesenvolvimento
				.equals(other.codigoProjetoDeDesenvolvimento))
			return false;
		if (codigoProjetoDeTeste == null) {
			if (other.codigoProjetoDeTeste != null)
				return false;
		} else if (!codigoProjetoDeTeste.equals(other.codigoProjetoDeTeste))
			return false;
		if (criteriosDeConclusaoDosTestes == null) {
			if (other.criteriosDeConclusaoDosTestes != null)
				return false;
		} else if (!criteriosDeConclusaoDosTestes
				.equals(other.criteriosDeConclusaoDosTestes))
			return false;
		if (criteriosDeTerminoDosTestes == null) {
			if (other.criteriosDeTerminoDosTestes != null)
				return false;
		} else if (!criteriosDeTerminoDosTestes
				.equals(other.criteriosDeTerminoDosTestes))
			return false;
		if (criteriosParaInterrupcaoERetomadaDosTestes == null) {
			if (other.criteriosParaInterrupcaoERetomadaDosTestes != null)
				return false;
		} else if (!criteriosParaInterrupcaoERetomadaDosTestes
				.equals(other.criteriosParaInterrupcaoERetomadaDosTestes))
			return false;
		if (cronograma == null) {
			if (other.cronograma != null)
				return false;
		} else if (!cronograma.equals(other.cronograma))
			return false;
		if (documentosASeremEntregues == null) {
			if (other.documentosASeremEntregues != null)
				return false;
		} else if (!documentosASeremEntregues
				.equals(other.documentosASeremEntregues))
			return false;
		if (entregas == null) {
			if (other.entregas != null)
				return false;
		} else if (!entregas.equals(other.entregas))
			return false;
		if (funcionalidadesASeremTestadas == null) {
			if (other.funcionalidadesASeremTestadas != null)
				return false;
		} else if (!funcionalidadesASeremTestadas
				.equals(other.funcionalidadesASeremTestadas))
			return false;
		if (funcoesASeremTestadasDoPontoDeVistaDoUsuario == null) {
			if (other.funcoesASeremTestadasDoPontoDeVistaDoUsuario != null)
				return false;
		} else if (!funcoesASeremTestadasDoPontoDeVistaDoUsuario
				.equals(other.funcoesASeremTestadasDoPontoDeVistaDoUsuario))
			return false;
		if (funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario == null) {
			if (other.funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario != null)
				return false;
		} else if (!funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario
				.equals(other.funcoesQueNaoSeraoTestadasDoPontoDeVistaDoUsuario))
			return false;
		if (identificacaoDoPlanoDeTestes == null) {
			if (other.identificacaoDoPlanoDeTestes != null)
				return false;
		} else if (!identificacaoDoPlanoDeTestes
				.equals(other.identificacaoDoPlanoDeTestes))
			return false;
		if (introducao == null) {
			if (other.introducao != null)
				return false;
		} else if (!introducao.equals(other.introducao))
			return false;
		if (metricas == null) {
			if (other.metricas != null)
				return false;
		} else if (!metricas.equals(other.metricas))
			return false;
		if (modulo == null) {
			if (other.modulo != null)
				return false;
		} else if (!modulo.equals(other.modulo))
			return false;
		if (nomeDoProjetoDeDesenvolvimento == null) {
			if (other.nomeDoProjetoDeDesenvolvimento != null)
				return false;
		} else if (!nomeDoProjetoDeDesenvolvimento
				.equals(other.nomeDoProjetoDeDesenvolvimento))
			return false;
		if (nomeDoProjetoDeTeste == null) {
			if (other.nomeDoProjetoDeTeste != null)
				return false;
		} else if (!nomeDoProjetoDeTeste.equals(other.nomeDoProjetoDeTeste))
			return false;
		if (pessoal == null) {
			if (other.pessoal != null)
				return false;
		} else if (!pessoal.equals(other.pessoal))
			return false;
		if (planoDeRiscosEContingencias == null) {
			if (other.planoDeRiscosEContingencias != null)
				return false;
		} else if (!planoDeRiscosEContingencias
				.equals(other.planoDeRiscosEContingencias))
			return false;
		if (referencias == null) {
			if (other.referencias != null)
				return false;
		} else if (!referencias.equals(other.referencias))
			return false;
		if (responsabilidades == null) {
			if (other.responsabilidades != null)
				return false;
		} else if (!responsabilidades.equals(other.responsabilidades))
			return false;
		if (riscosDoProcessoDeTeste == null) {
			if (other.riscosDoProcessoDeTeste != null)
				return false;
		} else if (!riscosDoProcessoDeTeste
				.equals(other.riscosDoProcessoDeTeste))
			return false;
		if (riscosDoProjeto == null) {
			if (other.riscosDoProjeto != null)
				return false;
		} else if (!riscosDoProjeto.equals(other.riscosDoProjeto))
			return false;
		if (tiposDeTesteQueSeraoAplicados == null) {
			if (other.tiposDeTesteQueSeraoAplicados != null)
				return false;
		} else if (!tiposDeTesteQueSeraoAplicados
				.equals(other.tiposDeTesteQueSeraoAplicados))
			return false;
		return true;
	}

}
