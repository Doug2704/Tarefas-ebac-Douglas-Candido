/**
 * 
 */
package test.java.br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.java.br.com.rpires.dao.generic.jdbc.dao.IProdutoDAO;
import main.java.br.com.rpires.dao.generic.jdbc.dao.ProdutoDAO;
import main.java.br.com.rpires.domin.Cliente;
import main.java.br.com.rpires.domin.Produto;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoTest {

	private IProdutoDAO produtoDAO = new ProdutoDAO();
	Produto produto = new Produto();
	Produto produto2 = new Produto();
	Produto produtoBD;

	@Before
	public void init() throws Exception {

		produto.setCodigo("10");
		produto.setNome("produto1");
		produto.setPreco(100.00);

		produto2.setCodigo("20");
		produto2.setNome("produto2");
		produto2.setPreco(200.00);
	}

	@Test
	public void cadastrarTest() throws Exception {

		Integer countCad = produtoDAO.cadastrar(produto);
		assertTrue(countCad == 1);
		Produto produtoBD = produtoDAO.buscar("10");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());

	}

	@Test
	public void buscarTest() throws Exception {
		produtoBD = produtoDAO.buscar("10");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		assertEquals(produto.getNome(), produtoBD.getNome());

	}

	@Test
	public void buscarTodosTest() throws Exception {

		Integer countCad2 = produtoDAO.cadastrar(produto2);
		assertTrue(countCad2 == 1);

		List<Produto> list = produtoDAO.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());

	}

	@Test
	public void atualizarTest() throws Exception {
		produtoBD = produtoDAO.buscar("10");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		assertEquals(produto.getPreco(), produtoBD.getPreco());
		produtoBD.setCodigo("11");
		produtoBD.setNome("outro produto");
		produtoBD.setPreco(201.00);

		Integer countUpdate = produtoDAO.atualizar(produtoBD);
		assertTrue(countUpdate == 0);
	}

	/*
	 * @Test public void excluirTest() throws Exception { produtoBD =
	 * produtoDAO.buscar("10"); assertNotNull(produtoBD); Integer countDel =
	 * produtoDAO.excluir(produtoBD); assertTrue(countDel == 1);
	 * 
	 * }
	 */

/*	@Test
	public void excluirTodosTest() throws Exception {
		List<Produto> list = produtoDAO.buscarTodos();
		assertNotNull(list);
		int countDel = 0;
		for (Produto prod : list) {
			produtoDAO.excluir(prod);
			countDel++;
		}
		assertEquals(list.size(), countDel);

		list = produtoDAO.buscarTodos();
		assertEquals(list.size(), 0);
	}*/

}
