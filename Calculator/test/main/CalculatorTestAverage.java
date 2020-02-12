package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTestAverage {

    @Test
    public void avr() {
        Calculator c = new Calculator(1, 2, 3);
        double avr = c.getSum() / 3;
        assertEquals(2, avr, 0.001);
    }

    @Test
    public void avrWithNegative() {
        Calculator c = new Calculator(1, -3, 3);
        double avr = c.getSum() / 3;
        assertEquals(0, avr, 0.001);
    }

    @Test
    public void avrWithZero() {
        Calculator c = new Calculator(1, 2, 0);
        double avr = c.getSum() / 3;
        assertEquals(1, avr, 0.001);
    }

}