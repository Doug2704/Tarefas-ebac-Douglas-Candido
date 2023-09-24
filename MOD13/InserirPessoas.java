
public class InserirPessoas {
	private static void inserirPessoas() {
		do {
			System.out.println("Digite seu nome ou (0) para cancelar\n");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			if (nome.equals("0")) {
				break;
			}
			System.out.print("Sexo: (1)Masculino (2)Feminino (3) prefiro não responder ");
			sexo = sc.nextInt();
			sc.nextLine();
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

}
