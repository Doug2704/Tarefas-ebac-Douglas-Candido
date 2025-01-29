import java.util.Scanner;

/**
 * Exercício 1
 */
public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int entrada = scanner.nextInt();
            System.out.println("fatorial de " + entrada + " é " + calcular(entrada));
        }
    }

    public static long calcular(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcular(n - 1);
    }
}
