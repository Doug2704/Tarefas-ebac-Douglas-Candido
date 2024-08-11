package com.br.candido.dao;

import java.util.List;

import com.br.candido.dao.generic.IGenericDAO;
import com.br.candido.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
