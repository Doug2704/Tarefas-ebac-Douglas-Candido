package test.java.br.com.rpires;

import main.java.br.com.rpires.dao.generic.jdbc.dao.ClienteDAO;
import main.java.br.com.rpires.domin.Cliente;

public class ProgramaTeste {
	public static void main(String args[]) throws Exception {
		ClienteDAO cd = new ClienteDAO();

		Cliente cliente = new Cliente();

		cliente.setNome("Rodrigo Pires");
		cliente.setCpf(101l);
		cliente.setTelefone(83l);
		cliente.setEndereco("rua");
		cliente.setNumero(5l);
		cliente.setCidade("cruz");
		cliente.setEstado("pb");
		cd.cadastrar(cliente);
		cd.buscar(1);
		System.out.println(cd.buscar(1));
	}
}
