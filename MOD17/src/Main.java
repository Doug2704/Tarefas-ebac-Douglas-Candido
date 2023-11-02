import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*método main você vai implementar uma List do tipo Carro
 *  e ir instanciando 1 objeto de cada marca que você fez,
 *  e em seguida irá adicionar esses carros nessa lista e printar no console o resultado, tudo bem?
 */
public class Main {

	public static void main(String[] args) {

		List<Toyota> listaToyota = new ArrayList<>();
		List<Honda> listaHonda = new ArrayList<>();
		List<Fiat> listaFiat = new ArrayList<>();
		int opcao;
		String marca;
		String modelo;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a marca do carro (1) Toyota (2) Honda (3) Fiat ou (0)SAIR: ");
		do {
			opcao = sc.nextInt();
			switch (opcao) {
			case 0:
				
				break;
			case 1:
				sc.nextLine();
				do {

					System.out.print("Marca: Toyota | Modelo: ");
					marca = "Toyota ";
					modelo = sc.nextLine();
					Toyota toyota = new Toyota(marca, modelo);
					if (!modelo.equals("0")) {
						listaToyota.add(toyota);
					}

				} while (!modelo.equals("0"));
				break;
			case 2:
				sc.nextLine();
				do {

					System.out.print("Marca: Honda | Modelo: ");
					marca = "Honda ";
					modelo = sc.nextLine();
					Honda honda = new Honda(marca, modelo);
					if (!modelo.equals("0")) {
						listaHonda.add(honda);
					}

				} while (!modelo.equals("0"));
				break;
			case 3:
				sc.nextLine();
				do {

					System.out.print("Marca: Fiat | Modelo: ");
					marca = "Fiat ";
					modelo = sc.nextLine();
					Fiat fiat = new Fiat(marca, modelo);
					if (!modelo.equals("0")) {
						listaFiat.add(fiat);
					}

				} while (!modelo.equals("0"));
				break;
			default:
				System.out.println("Opção inválida");
				System.out.print("Digite a marca do carro (1) Toyota (2) Honda (3) Fiat ou (0)SAIR: ");
				opcao = sc.nextInt();
				break;
			}
			if (opcao != 0) {
				System.out.println("Deseja adicionar modelos a outra marca? (1) Sim (2) Não");
				int adicionar = sc.nextInt();
				if (adicionar == 1) {
					System.out.print("Digite a marca do carro (1) Toyota (2) Honda (3) Fiat ou (0)SAIR: ");
				} else if (adicionar == 2) {
					System.out.println("Carros Cadastrados: \n");
					opcao = 0;
				}
			}
		} while (opcao != 0);

		System.out.print("CARROS DA TOYOTA: ");
		if (!listaToyota.isEmpty()) {
			System.out.println(listaToyota);
		} else {
			System.out.println("[nenhum cadastrado]");
		}
		System.out.print("CARROS DA HONDA: ");
		if (!listaHonda.isEmpty()) {
			System.out.println(listaHonda);
		} else {
			System.out.println("[nenhum cadastrado]");
		}
		System.out.print("CARROS DA FIAT: ");
		if (!listaFiat.isEmpty()) {
			System.out.println(listaFiat);
		} else {
			System.out.println("[nenhum cadastrado]");

		}
	}
}