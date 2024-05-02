/**
 * 
 */
package main.java.br.com.candido.dao.jpa;

import main.java.br.com.candido.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.candido.domain.jpa.ProdutoJpa;

/**
 * @author Douglas
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
