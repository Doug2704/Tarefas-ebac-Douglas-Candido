package br.com.rpires.service;

import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoService implements IContratoService {

	private IContratoDao contratoDao;

	public ContratoService(IContratoDao dao) {
		this.contratoDao = dao;
	}
	

	@Override
	public String salvar() {
		contratoDao.salvar();
		return "Sucesso";
	}

	@Override
	public String buscar() {
		// TODO Auto-generated method stub
		return "Retornado";
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		return "Excluído";
	}

	@Override
	public String atualizar() {
		// TODO Auto-generated method stub
		return "Atualizado";
	}
}
