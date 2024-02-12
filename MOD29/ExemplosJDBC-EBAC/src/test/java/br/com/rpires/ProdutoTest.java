/**
 * 
 */
package test.java.br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.br.com.rpires.dao.generic.jdbc.dao.IProdutoDAO;
import main.java.br.com.rpires.dao.generic.jdbc.dao.ProdutoDAO;
import main.java.br.com.rpires.domin.Produto;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoTest { 

	private IProdutoDAO produtoDAO;

	@Test
	public void cadastrarTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		Produto produto = new Produto();

		produto.setCodigo("10");
		produto.setNome("Rodrigo Pires");
		produto.setPreco(100.00);
		Integer countCad = produtoDAO.cadastrar(produto);
		assertTrue(countCad == 1);
		Produto produtoBD = produtoDAO.buscar("10");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());

		Integer countDel = produtoDAO.excluir(produtoBD);
		assertTrue(countDel == 1);
	}

	@Test
	public void buscarTest() throws Exception {
		
	}

	@Test
	public void excluirTest() throws Exception {
		
	}

	@Test
	public void buscarTodosTest() throws Exception {
	

	}

	@Test
	public void atualizarTest() throws Exception {
	
		}
	}
