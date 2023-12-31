package br.com.rpires;

import br.com.rpires.dao.ContratoDao;
import br.com.rpires.dao.IContratoDao;
import br.com.rpires.dao.mocks.ContratoDaoMock;
import br.com.rpires.service.ContratoService;
import br.com.rpires.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author rodrigo.pires
 */
public class ContratoServiceTest {

	@Test
	// passou
	public void salvarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}

	@Test
	// passou
	public void buscarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Retornado", retorno);
	}

	@Test
	// passou
	public void excluirTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Excluído", retorno);
	}

	@Test
	// passou
	public void atualizarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Atualizado", retorno);
	}
	// TODO
	// Criados métodos de buscar, excluir e atualizar
	// -------------------------------------------------------------------------
	// Os próximos métodos deverão ser testados apenas quando integrar banco de 
	// dados                                                                     

	/*
	 * @Test(expected = UnsupportedOperationException.class) public void
	 * esperadoErroNoSalvarComBancoDeDadosTest() { IContratoDao dao = new
	 * ContratoDao(); IContratoService service = new ContratoService(dao); String
	 * retorno = service.salvar(); Assert.assertEquals("Sucesso", retorno); }
	 * 
	 * @Test(expected = UnsupportedOperationException.class) public void
	 * esperadoErroNoBuscarComBancoDeDadosTest() { IContratoDao dao = new
	 * ContratoDao(); IContratoService service = new ContratoService(dao); String
	 * retorno = service.buscar(); Assert.assertEquals("Retornado", retorno); }
	 * 
	 * @Test(expected = UnsupportedOperationException.class) public void
	 * esperadoErroNoExcluirComBancoDeDadosTest() { IContratoDao dao = new
	 * ContratoDao(); IContratoService service = new ContratoService(dao); String
	 * retorno = service.excluir(); Assert.assertEquals("Excluído", retorno); }
	 * 
	 * @Test(expected = UnsupportedOperationException.class) public void
	 * esperadoErroNoAtualizarComBancoDeDadosTest() { IContratoDao dao = new
	 * ContratoDao(); IContratoService service = new ContratoService(dao); String
	 * retorno = service.atualizar(); Assert.assertEquals("Atualizado", retorno); }
	 */

}
