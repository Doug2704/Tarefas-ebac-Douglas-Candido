package com.br.candido.service;

import java.util.List;

import com.br.candido.domain.Produto;
import com.br.candido.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
