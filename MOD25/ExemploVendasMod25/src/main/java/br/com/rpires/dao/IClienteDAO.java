/**
 * 
 */
package br.com.rpires.dao;

import java.util.Collection;

import br.com.rpires.dao.generic.IGenericDAO;
import br.com.rpires.domain.Cliente;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long> {
	ClienteDAO clienteDAO = new ClienteDAO();
	Cliente cliente = new Cliente();

	@Override
	default Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	default void excluir(Long valor) {
		

	}

	@Override
	default void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub

	}

	@Override
	default Cliente consultar(Long valor) {
		// TODO Auto-generated method stub
		return cliente; //toString;
	}

	@Override
	default Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
