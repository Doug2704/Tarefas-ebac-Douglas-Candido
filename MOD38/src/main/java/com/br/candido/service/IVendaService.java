package com.br.candido.service;

import com.br.candido.dao.generic.IGenericDAO;
import com.br.candido.domain.Venda;

public interface IVendaService extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda);

	public void cancelarVenda(Venda venda);

	public Venda consultarComCollection(Long id);

}
