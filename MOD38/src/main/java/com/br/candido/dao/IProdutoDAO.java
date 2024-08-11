package com.br.candido.dao;

import java.util.List;

import com.br.candido.dao.generic.IGenericDAO;
import com.br.candido.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
