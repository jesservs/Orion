package br.com.unigranrio.orion.util;

import java.util.List;

public interface PadraoInterface<T> {

	public void atualizar(T objeto) throws Exception;

	public T buscar(T objeto, Long id) throws Exception;

	public List<T> listar() throws Exception;

	public void remover(T objeto) throws Exception;

	public void salvar(T objeto) throws Exception;
}
