package com.example.EBACTestesUnitarios;

/**
 * @author Douglas Candido
 * <p>
 * Classe que representa uma calculadora com as 4 operações básicas
 */
public class Calculator {

    /**
     * @param a número inteiro
     * @param b número inteiro
     * @return soma entre os dois parâmetros
     * @throws IllegalArgumentException se algum valor for nulo
     */
    public int somar(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Os valores não podem ser nulos");
        }
        return a + b;
    }

    /**
     * @param a número inteiro
     * @param b número inteiro
     * @return resultado ao subtrair 'b' de 'a'
     * @throws IllegalArgumentException se algum valor for nulo
     */
    public int subtrair(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Os valores não podem ser nulos");
        }
        return a - b;
    }

    /**
     * @param a número inteiro
     * @param b número inteiro
     * @return resultado ao dividir 'a' por 'b'
     * @throws IllegalArgumentException se algum valor for nulo
     * @throws ArithmeticException      se 'b' for 0, pois não se pode dividir por 0
     */
    public int dividir(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Os valores não podem ser nulos");
        }
        if (b == 0) {
            throw new ArithmeticException("Não se pode dividir por zero");
        }
        return a / b;
    }

    /**
     * @param a número inteiro
     * @param b número inteiro
     * @return resultado ao multiplicar 'a' por 'b'
     * @throws IllegalArgumentException se algum valor for nulo
     */
    public int multiplicar(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Os valores não podem ser nulos");
        }
        return a * b;
    }
}
