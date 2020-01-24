package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTestMin {

    @Test
    public void getMin() {
        Calculator c = new Calculator(1, 2, 3);
        int min = c.getMin();
        assertEquals(min, 1);
    }

    @Test
    public void getMinWithNegative() {
        Calculator c = new Calculator(1, -2, 3);
        int min = c.getMin();
        assertEquals(min, -2);
    }

    @Test
    public void getMinWithZero() {
        Calculator c = new Calculator(1, 3, 0);
        int min = c.getMin();
        assertEquals(min, 0);
    }
}