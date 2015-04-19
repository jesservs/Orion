package br.com.unigranrio.orion.util;

import java.util.List;

public interface PadraoInterface<Object> {

	public void salvar(Object objeto) throws Exception;
	
	public void atualizar(Object objeto) throws Exception;
	
	public void remover(Object objeto) throws Exception;
	
	public Object buscar(Object objeto, Long id) throws Exception;
	
	public List<Object> listar() throws Exception;
}
