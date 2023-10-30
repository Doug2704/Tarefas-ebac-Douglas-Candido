import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Carro> listaDeCarros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String opcao;

		do {
			System.out.print("Digite a marca do carro ou 'sair' para encerrar: ");
			opcao = scanner.nextLine();

			if (!opcao.equalsIgnoreCase("sair")) {
				Carro carro = new Carro<>(opcao);
				listaDeCarros.add(carro);
			}
		} while (!opcao.equalsIgnoreCase("sair"));

		System.out.println("\nLista de carros criados:\n");
		for (Carro carro : listaDeCarros) {
			System.out.println(carro);
		}
	}
}