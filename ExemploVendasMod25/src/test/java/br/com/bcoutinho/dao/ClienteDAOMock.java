package br.com.bcoutinho.dao;

import java.util.Collection;


import br.com.bcoutinho.domain.Cliente;
import br.com.bcoutinho.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException;

public class ClienteDAOMock implements IClienteDAO {

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public Cliente buscarporCPF(Long cpf) {
//		Cliente cliente = new Cliente();
//		cliente.setCpf(cpf);
//		return cliente;
//	}
//
//	@Override
//	public void excluir(Long cpf) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void alterar(Cliente cliente) {
//		// TODO Auto-generated method stub
//		
//	}
	
	

}