/**
 * 
 */
package test.java.br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.java.br.com.rpires.dao.generic.jdbc.dao.ClienteDAO;
import main.java.br.com.rpires.dao.generic.jdbc.dao.IClienteDAO;
import main.java.br.com.rpires.domin.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteTest {

	private IClienteDAO clienteDAO;

	@Before
	public void init() throws Exception {

	}

	@Test
	public void cadastrarTest() throws Exception {
		clienteDAO = new ClienteDAO();

		Cliente cliente = new Cliente();
		cliente.setNome("Rodrigo Pires");
		cliente.setCpf(101l);
		cliente.setTelefone(83l);
		cliente.setEndereco("rua");
		cliente.setNumero(5l);
		cliente.setCidade("cruz");
		cliente.setEstado("pb");
		Integer countCad = clienteDAO.cadastrar(cliente);
		assertTrue(countCad == 1);

		Cliente clienteBD = clienteDAO.buscar(1);
		assertNotNull(clienteBD);

		assertEquals(cliente.getNome(), clienteBD.getNome());

		Integer countDel = clienteDAO.excluir(clienteBD);
		assertTrue(countDel == 1);
	}

	@Test
	public void buscarTest() throws Exception {
		clienteDAO = new ClienteDAO();

		Cliente cliente = clienteDAO.buscar(1);
		assertNotNull(cliente);
		
		/*
		 * cliente.setNome("Rodrigo"); Integer countCad = clienteDAO.cadastrar(cliente);
		 * assertTrue(countCad == 1);
		 */

		Cliente clienteBD = clienteDAO.buscar(1);
		assertNotNull(clienteBD);

		assertEquals(cliente.getNome(), clienteBD.getNome());

		Integer countDel = clienteDAO.excluir(clienteBD);
		assertTrue(countDel == 1);
	}

	@Test
	public void excluirTest() throws Exception {
		clienteDAO = new ClienteDAO();

		Cliente cliente = new Cliente();

		cliente.setNome("Rodrigo Pires");
		Integer countCad = clienteDAO.cadastrar(cliente);
		assertTrue(countCad == 1);

		Cliente clienteBD = clienteDAO.buscar(1);
		assertNotNull(clienteBD);

		assertEquals(cliente.getNome(), clienteBD.getNome());

		Integer countDel = clienteDAO.excluir(clienteBD);
		assertTrue(countDel == 1);
	}

	@Test
	public void buscarTodosTest() throws Exception {
		clienteDAO = new ClienteDAO();

		Cliente cliente = new Cliente();

		cliente.setNome("Rodrigo Pires");
		Integer countCad = clienteDAO.cadastrar(cliente);
		assertTrue(countCad == 1);

		Cliente clientes = new Cliente();

		clientes.setNome("Teste");
		Integer countCad2 = clienteDAO.cadastrar(clientes);
		assertTrue(countCad2 == 1);

		List<Cliente> list = clienteDAO.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());

		int countDel = 0;
		for (Cliente cli : list) {
			clienteDAO.excluir(cli);
			countDel++;
		}
		assertEquals(list.size(), countDel);

		list = clienteDAO.buscarTodos();
		assertEquals(list.size(), 0);

	}

	@Test
	public void atualizarTest() throws Exception {
		clienteDAO = new ClienteDAO();

		Cliente cliente = new Cliente();

		cliente.setNome("Rodrigo Pires");
		Integer countCad = clienteDAO.cadastrar(cliente);
		assertTrue(countCad == 1);

		Cliente clienteBD = clienteDAO.buscar(1);
		assertNotNull(clienteBD);

		assertEquals(cliente.getNome(), clienteBD.getNome());

		clienteBD.setNome("Outro nome");
		Integer countUpdate = clienteDAO.atualizar(clienteBD);
		assertTrue(countUpdate == 1);

		Cliente clienteBD1 = clienteDAO.buscar(1);
		assertNull(clienteBD1);

		Cliente clienteBD2 = clienteDAO.buscar(1);
		assertNotNull(clienteBD2);
		assertEquals(clienteBD.getId(), clienteBD2.getId());

		assertEquals(clienteBD.getNome(), clienteBD2.getNome());

		List<Cliente> list = clienteDAO.buscarTodos();
		for (Cliente cli : list) {
			clienteDAO.excluir(cli);
		}
	}
}
