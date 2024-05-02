
package main.java.br.com.candido.dao.jpa;

import main.java.br.com.candido.dao.generic.jpa.GenericJpaDB3DAO;
import main.java.br.com.candido.domain.jpa.ClienteJpa2;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
