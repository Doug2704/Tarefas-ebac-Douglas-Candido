package com.example.EBACTestesUnitarios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibRecursivoTest {
    private FibRecursivo fibRecursivo = new FibRecursivo();

    @Test
    public void happyPath_encontrarElemento() {
        int result = fibRecursivo.encontrarElemento(6);
        assertEquals(8, result);
    }

    @Test
    public void Should_Return_1_When_EncontrarElemento_IsEqual_1_or_2() {
        int result = fibRecursivo.encontrarElemento(1);

        assertEquals(1, result);
        result = fibRecursivo.encontrarElemento(2);
        assertEquals(1, result);
    }
    @Test
    public void Should_Return_EncontrarElemento_When_EncontrarElemento_IsEqual_0_Negative() {
        int result = fibRecursivo.encontrarElemento(0);
        assertEquals(0, result);

        result = fibRecursivo.encontrarElemento(-20);
        assertEquals(-20, result);

        result = fibRecursivo.encontrarElemento(-30);
        assertEquals(-30, result);
    }
}
