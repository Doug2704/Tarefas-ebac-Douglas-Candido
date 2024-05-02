
package main.java.br.com.candido.dao.jpa;

import main.java.br.com.candido.dao.generic.jpa.GenericJpaDB2DAO;
import main.java.br.com.candido.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
