package com.br.candido.service;

import java.util.List;

import com.br.candido.domain.Cliente;
import com.br.candido.exceptions.DAOException;
import com.br.candido.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
