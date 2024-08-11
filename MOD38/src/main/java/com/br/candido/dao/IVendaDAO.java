package com.br.candido.dao;

import com.br.candido.dao.generic.IGenericDAO;
import com.br.candido.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	void finalizarVenda(Venda venda);

	void cancelarVenda(Venda venda);

	Venda consultarComCollection(Long id);

}
