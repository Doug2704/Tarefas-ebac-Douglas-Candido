import java.util.Scanner;

/**
 * Exercício 02
 */
public class FatorialBottomUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int entrada = scanner.nextInt();
            System.out.println("fatorial de " + entrada + " é " + calcularFatorialBottomUp(entrada));
        }
    }

    public static long calcularFatorialBottomUp(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long[] tabela = new long[n + 1];
        tabela[0] = 1;
        tabela[1] = 1;
        for (int i = 2; i <= n; i++) {
            tabela[i] = i * tabela[i - 1];
        }
        return tabela[n];
    }
}
