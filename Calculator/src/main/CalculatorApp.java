package main;

/**
 * Implement Calculator class that has 3 Integer fields a,b and c with the following methods:
 * <p>
 * getMax (returns max value from a, b and c)
 * getMin  (returns max value from a, b and c)
 * getSum  (returns sum a, b and c)
 * getAvg (returns average of a, b and c)
 * areAllPositive (returns true if a,b and c are all positive numbers and false otherwise)
 * isAEven (returns true if a is even and false otherwise)
 * getters and setters
 * constructor with and without parameters
 * <p>
 * Implement at least 3 unit tests for each method (except for getters, setters and constructors).
 *
 * @author Horatiu Handragel
 */

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator(1, 2, 3);
        System.out.println(calc.getMax());
        System.out.println(calc.getMin());
        System.out.println(calc.getSum());
        System.out.println(calc.avr());
        System.out.println(calc.areAllPositive());
        System.out.println(calc.isAEven());
    }


}
