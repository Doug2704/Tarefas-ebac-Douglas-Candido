package com.example.EBACTestesUnitarios;

/**
 * @author Douglas Candido
 * Classe que representa a sequência de Fibonacci com algoritmo recursivo
 */
public class FibRecursivo {
    /**
     * @param n
     * @return o número que ocupa a posicção n na sequência de Fibonacci
     */
    public static int encontrarElemento(int n) {
        if (n <= 1) {
            return n;
        }
        return encontrarElemento(n - 1) + encontrarElemento(n - 2);
    }

}