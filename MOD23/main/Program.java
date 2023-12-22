import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/***
 * ler do console nome e sexo separados por vírgula, criar a partir dessa lista
 * outra lista usando expressões lambda e separar as mulheres utilizar lambda,
 * if else tarefa_streams
 * 
 * @author Douglas
 *
 */
public class Program {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();

		String[] s = { "Maria,Feminino", "Pedro,Masculino", "Augusto,Masculino", "Joana,Feminino", "Carol,Feminino",
				"Paul,Masculino", };

		for (String pessoa : s) {
			String[] partes = pessoa.split(",");
			if (partes.length >= 2) { // programação defensiva: testar se realmente tem 2 campos
				String nome = partes[0];
				String sexo = partes[1];
				pessoas.add(new Pessoa(nome, sexo));
			}
		}

		System.out.println("Mulheres no grupo:\n");

		pessoas.stream().forEach(pessoa -> {
			if (pessoa.getSexo().equals("Feminino")) {
				System.out.println(pessoa.getNome());
			}
		});

	}
}