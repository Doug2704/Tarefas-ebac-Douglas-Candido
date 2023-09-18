import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// Tarefa do módulo 10

		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do Aluno: ");
		String aluno = sc.next();

		System.out.print("Nota do primeiro bimestre: ");
		double nota1 = sc.nextInt();
		System.out.print("Nota do segundo bimestre: ");
		double nota2 = sc.nextInt();
		System.out.print("Nota do terceiro bimestre: ");
		double nota3 = sc.nextInt();
		System.out.print("Nota do quarto bimestre: ");
		double nota4 = sc.nextInt();

		double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		if (mediaAluno >= 0 && mediaAluno < 5) {
			System.out.println("O aluno " + aluno + " está reprovado");
		} else if (mediaAluno >= 5 && mediaAluno < 7) {
			System.out.println("O aluno " + aluno + " está em recuperação");
		} else if (mediaAluno >= 7 && mediaAluno <= 10) {
			System.out.println("O aluno " + aluno + " está aprovado");
		}

	}
}
