/**
 * 
 */
package test.java.br.com.candido.dao;

import main.java.br.com.candido.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.candido.dao.jpa.IVendaJpaDAO;
import main.java.br.com.candido.domain.jpa.VendaJpa;
import main.java.br.com.candido.exceptions.DAOException;
import main.java.br.com.candido.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Douglas
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
