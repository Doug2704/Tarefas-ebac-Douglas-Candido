import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite o valor primeiro do número: ");
		double num1 = sc.nextInt();
		System.out.print("digite o valor do segundo número: ");
		double num2 = sc.nextInt();
		System.out.print("digite o valor do terceiro número: ");
		double num3 = sc.nextInt();
		System.out.print("digite o valor do quarto número: ");
		double num4 = sc.nextInt();
		double mediaAritmetica = (num1 + num2 + num3 + num4) / 4;
		System.out.println("a média aritmética entre esses números é " + mediaAritmetica);
	}

}
