package br.com.unigranrio.orion.modelo.sistema;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_glossario", schema = "public")
@SequenceGenerator(name = "sq_glossario", sequenceName = "sq_glossario", allocationSize = 0, initialValue = 1)
public final class GlossarioBean extends DocumentoBean {

	private static final long serialVersionUID = 3501007977230225013L;

	@Column(name = "vs_tabela_de_conteudo")
	private String tabelaDeConteudo;

	@Column(name = "vs_resumo")
	private String resumo;

	@Column(name = "vs_objetivos_do_documento")
	private String objetivosDoDocumento;

	@Column(name = "vs_documentos_necessarios_e_referencias")
	private String documentosNecessariosEReferencias;

	@Column(name = "vs_glossario")
	private String glossario;

	@Column(name = "vs_secao1")
	private String secao1;

	public GlossarioBean() {
		// TODO Auto-generated constructor stub
	}

	public GlossarioBean(Long idDocumento, Long codigoDocumento,
			Long codigoProjeto, Long codigoAtor, String descricao,
			Date dataCriacao, Date dataAtualizacao, String nome, String tipo,
			String propostoPor, String aprovadoPor,
			String situacaoDaDistribuicao, String listaDeDistribuicao) {
		super(idDocumento, codigoDocumento, codigoProjeto, codigoAtor,
				descricao, dataCriacao, dataAtualizacao, nome, tipo,
				propostoPor, aprovadoPor, situacaoDaDistribuicao,
				listaDeDistribuicao);
		// TODO Auto-generated constructor stub
	}

	public GlossarioBean(String tabelaDeConteudo, String resumo,
			String objetivosDoDocumento,
			String documentosNecessariosEReferencias, String glossario,
			String secao1) {
		super();
		this.tabelaDeConteudo = tabelaDeConteudo;
		this.resumo = resumo;
		this.objetivosDoDocumento = objetivosDoDocumento;
		this.documentosNecessariosEReferencias = documentosNecessariosEReferencias;
		this.glossario = glossario;
		this.secao1 = secao1;
	}

	public String getTabelaDeConteudo() {
		return tabelaDeConteudo;
	}

	public void setTabelaDeConteudo(String tabelaDeConteudo) {
		this.tabelaDeConteudo = tabelaDeConteudo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getObjetivosDoDocumento() {
		return objetivosDoDocumento;
	}

	public void setObjetivosDoDocumento(String objetivosDoDocumento) {
		this.objetivosDoDocumento = objetivosDoDocumento;
	}

	public String getDocumentosNecessariosEReferencias() {
		return documentosNecessariosEReferencias;
	}

	public void setDocumentosNecessariosEReferencias(
			String documentosNecessariosEReferencias) {
		this.documentosNecessariosEReferencias = documentosNecessariosEReferencias;
	}

	public String getGlossario() {
		return glossario;
	}

	public void setGlossario(String glossario) {
		this.glossario = glossario;
	}

	public String getSecao1() {
		return secao1;
	}

	public void setSecao1(String secao1) {
		this.secao1 = secao1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((documentosNecessariosEReferencias == null) ? 0
						: documentosNecessariosEReferencias.hashCode());
		result = prime * result
				+ ((glossario == null) ? 0 : glossario.hashCode());
		result = prime
				* result
				+ ((objetivosDoDocumento == null) ? 0 : objetivosDoDocumento
						.hashCode());
		result = prime * result + ((resumo == null) ? 0 : resumo.hashCode());
		result = prime * result + ((secao1 == null) ? 0 : secao1.hashCode());
		result = prime
				* result
				+ ((tabelaDeConteudo == null) ? 0 : tabelaDeConteudo.hashCode());
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
		GlossarioBean other = (GlossarioBean) obj;
		if (documentosNecessariosEReferencias == null) {
			if (other.documentosNecessariosEReferencias != null)
				return false;
		} else if (!documentosNecessariosEReferencias
				.equals(other.documentosNecessariosEReferencias))
			return false;
		if (glossario == null) {
			if (other.glossario != null)
				return false;
		} else if (!glossario.equals(other.glossario))
			return false;
		if (objetivosDoDocumento == null) {
			if (other.objetivosDoDocumento != null)
				return false;
		} else if (!objetivosDoDocumento.equals(other.objetivosDoDocumento))
			return false;
		if (resumo == null) {
			if (other.resumo != null)
				return false;
		} else if (!resumo.equals(other.resumo))
			return false;
		if (secao1 == null) {
			if (other.secao1 != null)
				return false;
		} else if (!secao1.equals(other.secao1))
			return false;
		if (tabelaDeConteudo == null) {
			if (other.tabelaDeConteudo != null)
				return false;
		} else if (!tabelaDeConteudo.equals(other.tabelaDeConteudo))
			return false;
		return true;
	}

}
