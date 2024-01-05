/**
 * 
 */
package br.com.rpires;

import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rpires.dao.ClienteDAO;
import br.com.rpires.dao.IClienteDAO;
import br.com.rpires.domain.Cliente;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteDAOTest {

	private IClienteDAO clienteDao;

	private Cliente cliente;

	public ClienteDAOTest() {
		clienteDao = new ClienteDAO();
	}

	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		clienteDao.cadastrar(cliente);
	}

	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
		System.out.println("pesquisarCliente");
		System.out.println(cliente);
	}

	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setCpf(56565656565L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
		System.out.println("salvarCliente"); 
		System.out.println(cliente);
	}

	@Test
	public void excluirCliente() {
		Assert.assertEquals("Rodrigo", cliente.getNome()); // verifica se é o mesmo nome antes de excluir
		cliente = null;
		Assert.assertEquals(null, cliente);
		System.out.println("excluirCliente");
		System.out.println(cliente); // deve retornar nulo
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Rodrigo Pires");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Rodrigo Pires", cliente.getNome());
		System.out.println("alterarCliente");
	}

	@Test
	public void buscarTodos() {
		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
		System.out.println("buscarTodos");
		System.out.println(list);

	}
}
