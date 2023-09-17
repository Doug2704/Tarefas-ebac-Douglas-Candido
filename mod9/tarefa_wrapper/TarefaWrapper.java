import java.util.Scanner;

public class TarefaWrapper {

	public static void main(String[] args) {
		// converter tipo primitivo numérico em wrapper e fazer o casting

		Scanner sc = new Scanner(System.in);
		System.out.print("digite um número inteiro: ");
		long numLong = sc.nextLong();
		int numInteiro = (int) numLong; // fazer casting de um long para int
		Integer integer = Integer.valueOf(numInteiro); // convertendo para classe Wrapper Integer
		System.out.println("Integer: " + integer);
		
	}

}
