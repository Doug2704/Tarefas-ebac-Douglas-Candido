/**
 * 
 */
package main.java.br.com.candido.dao.jpa;

import main.java.br.com.candido.dao.generic.jpa.IGenericJapDAO;
import main.java.br.com.candido.domain.jpa.Persistente;

/**
 * @author Douglas
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
