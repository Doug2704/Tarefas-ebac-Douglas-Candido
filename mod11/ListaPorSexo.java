import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * 
 * @author Douglas Candido
 * 
 *         inserir nome e sexo da pessoa e separar em 3 listas diferentes
 *         homens, mulheres e não definidos (para quem não se identifica com
 *         ambos)
 *
 */

public class ListaPorSexo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> homens = new ArrayList<>();
		List<String> mulheres = new ArrayList<>();
		List<String> naoDefinidos = new ArrayList<>();
		int escolha; //para saber se deseja continuar adicionando pessoas (foi preciso ser declarada fora dos laços do e while)
		
		do {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Sexo: (1)Masculino (2)Feminino (3)Outros ");
			int sexo = sc.nextInt();
			switch (sexo) {
			case 1:
				homens.add(nome);
				break;
			case 2:
				mulheres.add(nome);
				break;
			case 3:
				naoDefinidos.add(nome);
				break;
			}
			System.out.print("Deseja continuar? (1) Sim (2)Não ");
			escolha = sc.nextInt();
			while (escolha != 1 && escolha != 2) {
				System.out.println("Opção inválida");
				System.out.print("Deseja continuar? (1) Sim (2)Não ");
				escolha = sc.nextInt();
			}
		} while (escolha != 2);
		
		System.out.println("");
		System.out.print("HOMENS: ");
		System.out.println(homens);
		System.out.print("MULHERES: ");
		System.out.println(mulheres);
		System.out.print("NÃO DEFINIDOS (para quem não se identifica com ambos): ");
		System.out.println(naoDefinidos);
	}

}
