package main;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalculatorTestPositive {
    @Test
    public void areAllPositive() {
        Calculator c = new Calculator(1, 2, 3);
        assertTrue(c.areAllPositive());
    }

    @Test
    public void areAllPositiveWithNegative() {
        Calculator c = new Calculator(1, -2, 3);
        assertFalse(c.areAllPositive());
    }

}
