package com.br.candido.service;

import java.util.List;

import javax.inject.Inject;

import com.br.candido.dao.IClienteDAO;
import com.br.candido.domain.Cliente;
import com.br.candido.exceptions.DAOException;
import com.br.candido.exceptions.MaisDeUmRegistroException;
import com.br.candido.exceptions.TableException;
import com.br.candido.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	private IClienteDAO clienteDAO;

	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
