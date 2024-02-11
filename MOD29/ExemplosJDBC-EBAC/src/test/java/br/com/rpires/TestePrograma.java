package test.java.br.com.rpires;

import java.util.Scanner;
import main.java.br.com.rpires.dao.generic.jdbc.dao.ClienteDAO;
import main.java.br.com.rpires.domin.Cliente;

public class TestePrograma {
	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Digite o código do cliente:");
			String codigo = scanner.nextLine();

			Cliente cliente = clienteDAO.buscar(codigo);
			if (cliente != null) {
				System.out.println("Nome do cliente encontrado: " + cliente.getNome());
			} else {
				System.out.println("Cliente com código '" + codigo + "' não encontrado.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
