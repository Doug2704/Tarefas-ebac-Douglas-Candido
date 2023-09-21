import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * V 2.0
 * 
 * @author Douglas Candido
 * 
 *         inserir nome e sexo da pessoa e separar em grupos masculino, feminino
 *         e outro(para não optantes). remoção da opção "deseja continuar",
 *         agora o usuário pode digitar 0 para parar o loop. Correção de bugs.
 */

public class ListaPorSexo2 {
	// difinidos como "statics" para que possam ser usados nos métodos
	// "inserirPessoas()" e "main()"
	static Scanner sc = new Scanner(System.in);
	static List<String> masculino = new ArrayList<>();
	static List<String> feminino = new ArrayList<>();
	static List<String> outro = new ArrayList<>();
	static String nome;
	static int sexo = 0;

	public static void inserirPessoas() {
		// método encapsulado fora do main()
		do {
			System.out.println("Digite seu nome ou (0) para cancelar\n");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			if (nome.equals("0")) {
				break;
			}
			System.out.print("Sexo: (1)Masculino (2)Feminino (3) prefiro não responder ");
			sexo = sc.nextInt();
			sc.nextLine(); // consumir quebra de linha (estava ocasionando erro na próxima leitura da
							// entrada do usuário)
			switch (sexo) {
			case 0:
				nome = "0";
				break;
			case 1:
				masculino.add(nome);
				break;
			case 2:
				feminino.add(nome);
				break;
			case 3:
				outro.add(nome);
				break;
			default:
				System.out.println("Opção inválida");
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Sexo: (1)Masculino (2)Feminino (3) prefiro não responder ");
				sexo = sc.nextInt();
				break;
			}

		} while (!nome.equals("0"));

	}

	public static void main(String[] args) {
		inserirPessoas();
		System.out.println("(1) consultar grupos (2) voltar a inserir pessoas");
		int escolha = sc.nextInt();
		sc.nextLine();
		if (escolha == 1) {
			sc.close(); //fecha o scanner e sai do laço de repetição
		} else if (escolha == 2) {
			inserirPessoas();
			System.out.println("(1) consultar grupos (2) voltar a inserir pessoas");
			escolha = sc.nextInt();
		} else {
			System.out.println("opção inválida");
			System.out.println("(1) consultar grupos (2) voltar a inserir pessoas");
			escolha = sc.nextInt();
			sc.nextLine();
		}
		System.out.print("\nGRUPO MASCULINO: ");
		System.out.println(masculino);
		System.out.print("GRUPO FEMININO: ");
		System.out.println(feminino);
		System.out.print("OUTRO: ");
		System.out.println(outro);

	}
}