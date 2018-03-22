package com.lab2.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorServiceTest {
    private final int A = 10;
    private final int B = 20;
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testSum() {
        final int EXPECTED = 30;

        int result = calculatorService.sum(A, B);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void testIncorrectSum() {
        final int INCORRECT_SUM = 100;

        int result = calculatorService.sum(A, B);
        assertNotEquals(INCORRECT_SUM, result);
    }

    @Test
    public void testSub() {
        final int EXPECTED = -10;

        int result = calculatorService.sub(A, B);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void testIncorrectSub() {
        final int INCORRECT_SUB = -100;

        int result = calculatorService.sub(A, B);
        assertNotEquals(INCORRECT_SUB, result);
    }
}
