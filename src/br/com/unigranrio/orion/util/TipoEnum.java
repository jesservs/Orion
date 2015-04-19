package br.com.unigranrio.orion.util;

public enum TipoEnum {

	ATOR("Ator"), 
	MODELO("Modelo"), 
	DIAGRAMA("Diagrama"), 
	TESTE("Teste"), 
	PROJETO_DE_TESTE("Projeto de Teste"), 
	ARTEFATO("Artefato"), 
	DOCUMENTO("Documento"), 
	INDICE("Indice"), 
	HISTORICO("Historico");

	private TipoEnum(String valor) {

		this.valor = valor;

	}

	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
