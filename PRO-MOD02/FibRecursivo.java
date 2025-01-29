/**
 * Classe para cálculo de complexidade de tempo usando algoritmo recursivo
 */
public class FibRecursivo {
    public static int encontrarElemento(int n) {
        if (n <= 1) {
            return n;
        }
        return encontrarElemento(n - 1) + encontrarElemento(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Elemento " + n + ": " + encontrarElemento(n));
    }
}
