import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.candido.Main;

public class PrintTest {

	@Test
	public void printHelloWorldTest() {
		assertNotNull(Main.helloWorld());
		assertEquals("Hello World!", Main.helloWorld());
	}

}
