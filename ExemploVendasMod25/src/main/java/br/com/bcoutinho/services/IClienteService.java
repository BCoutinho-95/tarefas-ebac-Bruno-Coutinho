package br.com.bcoutinho.services;

import br.com.bcoutinho.domain.Cliente;
import br.com.bcoutinho.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException;

public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarporCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
