package com.br.candido.service;

import java.util.List;

import javax.inject.Inject;

import com.br.candido.dao.IProdutoDAO;
import com.br.candido.domain.Produto;
import com.br.candido.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
