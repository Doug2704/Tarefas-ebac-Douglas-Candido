import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * 
 * @author Douglas
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Carro> listaCarro = new ArrayList<>();
		
		int opcao;
		String marca;
		String modelo;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a marca do carro (1) Toyota (2) Honda (3) Fiat ou (0)SAIR: ");
		do {
			opcao = sc.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("NENHUM CARRO CADASTRADO");
				break;
			case 1:
				sc.nextLine();
				do {
					System.out.print("Marca: Toyota | Modelo: ");
					marca = "TOYOTA";
					modelo = sc.nextLine();
					Toyota toyota = new Toyota(marca, modelo);
					if (!modelo.equals("0")) {
						listaCarro.add(toyota);
					}

				} while (!modelo.equals("0"));
				break;
			case 2:
				sc.nextLine();
				do {
					System.out.print("Marca: Honda | Modelo: ");
					marca = "HONDA ";
					modelo = sc.nextLine();
					Honda honda = new Honda(marca, modelo);
					if (!modelo.equals("0")) {
						listaCarro.add(honda);
					}
				} while (!modelo.equals("0"));
				break;
			case 3:
				sc.nextLine();
				do {
					System.out.print("Marca: Fiat | Modelo: ");
					marca = "FIAT  ";
					modelo = sc.nextLine();
					Fiat fiat = new Fiat(marca, modelo);
					if (!modelo.equals("0")) {
						listaCarro.add(fiat);
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
				System.out.print("\nDeseja adicionar modelos a uma outra marca? (1) Sim (2) Não ");
				int adicionar = sc.nextInt();
				if (adicionar == 1) {
					System.out.print("\nDigite a marca do carro (1) Toyota (2) Honda (3) Fiat ou (0)SAIR: ");
				} else if (adicionar == 2) {
					System.out.println("------------------------");
					System.out.println("CARROS CADASTRADOS:");
					System.out.println("------------------------");
					System.out.println("MARCA  | MODELO");
					System.out.println("------------------------");
					opcao = 0;
				}
			}
		} while (opcao != 0);

		sc.close();

		if (listaCarro != null) {
			for (Carro carro : listaCarro) {
				System.out.println(carro);
			}
			System.out.println("------------------------");
		} else {
			System.out.println("erro");
		}

	}

}
