package com.example.EBACTestesUnitarios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void happyPath_Somar() {
        int result = calculator.somar(6, 2);
        assertEquals(8, result);
    }

    @Test
    public void happyPath_subtrair() {
        int result = calculator.subtrair(6, 2);
        assertEquals(4, result);
    }

    @Test
    public void happyPath_dividir() {
        int result = calculator.dividir(6, 2);
        assertEquals(3, result);
    }

    @Test
    public void happyPath_multiplicar() {
        int result = calculator.multiplicar(6, 2);
        assertEquals(12, result);
    }

    @Test
    public void Should_ThrowException_When_NullInput_Somar() {
        try {
            calculator.somar(null, 3);
        } catch (IllegalArgumentException e) {
            assertEquals("Os valores não podem ser nulos", e.getMessage());
        }
    }

    @Test
    public void Should_ThrowException_When_NullInput_Subtrair() {
        try {
            calculator.subtrair(null, 3);
        } catch (IllegalArgumentException e) {
            assertEquals("Os valores não podem ser nulos", e.getMessage());
        }
    }

    @Test
    public void Should_ThrowException_When_NullInput_Dividir() {
        try {
            calculator.dividir(null, 3);
        } catch (IllegalArgumentException e) {
            assertEquals("Os valores não podem ser nulos", e.getMessage());
        }
    }

    @Test
    public void Should_ThrowException_When_NullInput_Multiplicar() {
        try {
            calculator.multiplicar(null, null);
        } catch (IllegalArgumentException e) {
            assertEquals("Os valores não podem ser nulos", e.getMessage());
        }
    }

    @Test
    public void Should_ThrowException_When_Divide_By_Zero() {
        try {
            calculator.dividir(3, 0);
        } catch (ArithmeticException e) {
            assertEquals("Não se pode dividir por zero", e.getMessage());
        }
    }
}
