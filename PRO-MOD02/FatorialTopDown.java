import java.util.Scanner;
/**
 * Exercício 02
 */
public class FatorialTopDown {
    private static long[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int entrada = scanner.nextInt();
            System.out.println("fatorial de " + entrada + " é " + calcularFatorialTopDown(entrada));
        }
    }

    public static long calcularFatorialTopDown(int n) {
        memo = new long[n + 1];
        return calcularFatorialHelper(n);
    }

    private static long calcularFatorialHelper(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = n * calcularFatorialHelper(n - 1);
        return memo[n];
    }
}
