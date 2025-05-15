package br.com.bcoutinho;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.bcoutinho.dao.ClienteDAOMock;
import br.com.bcoutinho.dao.IClienteDAO;
import br.com.bcoutinho.domain.Cliente;
import br.com.bcoutinho.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException;
import br.com.bcoutinho.services.ClienteService;
import br.com.bcoutinho.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public  ClienteServiceTest() {
		IClienteDAO dao = new ClienteDAOMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Bruno");
		cliente.setCidade("Juiz de Fora");
		cliente.setEnd("End");
		cliente.setEstado("MG");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
		
	}
	
	
	@Test
	public void pesquisarCliente() {
		/*Cliente cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Leonardo");
		cliente.setCidade("Juiz de Fora");
		cliente.setEnd("End");
		cliente.setEstado("MG");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
		clienteService.salvar(cliente);*/
		
		Cliente clienteConsultado = clienteService.buscarporCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);	
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.salvar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		 clienteService.excluir(cliente.getCpf());
		
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Leonardo Coutinho");
		 clienteService.alterar(cliente);
		 
		 Assert.assertEquals("Leonardo Coutinho", cliente.getNome());
		
	}
	
	
	
	
}