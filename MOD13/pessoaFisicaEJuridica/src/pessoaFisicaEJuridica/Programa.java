package pessoaFisicaEJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/***
 * 
 * @author Douglas Candido
 *
 */
public class Programa {
	static List<String> pessoasFisicas = new ArrayList<>();
	static List<String> pessoasJuridicas = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int cadastro;

		do {
			System.out.println("O que deseja cadastrar? (1) Pessoa Física (2) Pessoa Jurídica (0) Sair");
			cadastro = sc.nextInt();
			sc.nextLine();

			if (cadastro == 1) {
				cadastrarPessoaFisica();
			} else if (cadastro == 2) {
				cadastrarPessoaJuridica();
			} else if (cadastro != 0) {
				System.out.println("Opção Inválida");
			}
		} while (cadastro != 0);

		System.out.println("Pessoas físicas: " + pessoasFisicas);
		System.out.println("Pessoas Jurídicas: " + pessoasJuridicas);
	}

	public static void cadastrarPessoaFisica() {
		System.out.println("Insira os dados do Funcionário: ");
		System.out.print("Nome: ");
		String nomePf = sc.nextLine();

		if (nomePf.equals("0")) {
			return;
		}

		System.out.print("CPF: ");
		String cpf = sc.nextLine();

		System.out.print("Salário: ");
		double salario = sc.nextDouble();
		sc.nextLine(); // Consumir a nova linha pendente

		String dadosPessoaFisica = "Nome: " + nomePf + ", CPF: " + cpf + ", Salário: " + salario;
		pessoasFisicas.add(dadosPessoaFisica);
	}

	public static void cadastrarPessoaJuridica() {
		System.out.println("Insira os dados do Prestador de Serviço: ");
		System.out.print("Nome: ");
		String nomePj = sc.nextLine();

		if (nomePj.equals("0")) {
			return;
		}

		System.out.print("CNPJ: ");
		String cnpj = sc.nextLine();

		System.out.print("Comissão: ");
		double comissao = sc.nextDouble();
		sc.nextLine(); // Consumir a nova linha pendente

		String dadosPessoaJuridica = "NOME: " + nomePj + " - CNPJ: " + cnpj + " - COMISSÃO: " + comissao;
		pessoasJuridicas.add(dadosPessoaJuridica);
	}
}
