package main;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTestIsAEven {

    @Test
    public void isAEven() {
        Calculator c = new Calculator(2, 1, 4);
        Assert.assertEquals(true, c.isAEven());
    }

    @Test
    public void isAEvenWithNegative() {
        Calculator c = new Calculator(-1, 1, 4);
        Assert.assertEquals(false, c.isAEven());
    }

    @Test
    public void isAEvenWithNull() {
        Calculator c = new Calculator(null, 1, 4);
        Assert.assertEquals(false, c.isAEven());
    }
}
