import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
/***
 * 
 * @author Douglas
 *
 */
public class ExemploReflection {
	@Tabela(nome = "ExemploTabela")
	private String exemploCampo;

	public static void main(String[] args) {
		Class<?> clazz = ExemploReflection.class;// class é uma palavra reservada, por isso está sendo usada clazz
		Field field = null;

		try {
			field = clazz.getDeclaredField("exemploCampo");
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		Tabela tabelaAnnotation = field.getAnnotation(Tabela.class);
		String nomeDaTabela = tabelaAnnotation.nome();
		System.out.println("Nome da tabela em tempo de execução: " + nomeDaTabela);

	}
}
