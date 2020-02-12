package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTestMax {

    @Test
    public void getMax() {
        Calculator c = new Calculator(1, 2, 3);
        int max = c.getMax();
        assertEquals(max, 3);
    }

    @Test
    public void getMaxWithNegative() {
        Calculator c = new Calculator(1, 2, -3);
        int max = c.getMax();
        assertEquals(max, 2);
    }

    @Test
    public void getMaxWithNull() {
        Calculator c = new Calculator(1, 2, null);
        int max = c.getMax();
        assertEquals(max, 2);
    }


}