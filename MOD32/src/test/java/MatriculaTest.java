import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.douglas.dao.IMatriculaDao;
import br.com.douglas.dao.MatriculaDao;
import br.com.douglas.domain.Matricula;

public class MatriculaTest {

	private IMatriculaDao matriculaDao;

	public MatriculaTest() {
		matriculaDao = new MatriculaDao();
	}

	@Test
	public void cadastrar() {
		Matricula mat = new Matricula();
		mat.setCodigo("A1");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(2000d);
		mat = matriculaDao.cadastrar(mat);
		assertNotNull(mat);
		assertNotNull(mat.getId());
	}
}

