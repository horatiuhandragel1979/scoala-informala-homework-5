package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTestSum {

    @Test
    public void getSum() {
        Calculator c = new Calculator(1, 2, 3);
        int sum = c.getSum();
        assertEquals(sum, 6);
    }

    @Test
    public void getSumWithNegative() {
        Calculator c = new Calculator(-1, 2, 3);
        int sum = c.getSum();
        assertEquals(sum, 4);
    }

    @Test
    public void getSumWithZero() {
        Calculator c = new Calculator(1, 0, 3);
        int sum = c.getSum();
        assertEquals(sum, 4);
    }
}