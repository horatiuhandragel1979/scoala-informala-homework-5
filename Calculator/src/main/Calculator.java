package main;

public class Calculator {

    public Integer a, b, c;

    public Calculator(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * this method checks which is the largest number
     *
     * @return
     */
    public Integer getMax() {
        if (a == null) {
            a = Integer.MIN_VALUE;
        }
        if (b == null) {
            b = Integer.MIN_VALUE;
        }
        if (c == null) {
            c = Integer.MIN_VALUE;
        }
        return Math.max(a, Math.max(b, c));
    }

    /**
     * this method checks which is the smallest number
     *
     * @return
     */

    public int getMin() {

        return Math.min(a, Math.min(b, c));
    }

    /**
     * this method calculates the sum of three integers
     *
     * @return
     */

    public int getSum() {
        Integer sum = a + b + c;

        return sum;
    }

    /**
     * this method calculates the average of three integers
     *
     * @return
     */

    public double avr() {
        double avr = getSum() / 3;

        return avr;
    }

    /**
     * this method checks if the numbers are positive
     *
     * @return
     */

    public Boolean areAllPositive() {
        if (a < 0 && b > 0 && c > 0) {
//            System.out.println("This" + a + "is a negative number");
            return false;
        } else if (a > 0 && b < 0 && c > 0) {
//            System.out.println("This" + b + "is a negative number");
            return false;
        } else if (a > 0 && b > 0 && c < 0) {
//            System.out.println("This" + c + "is a negative number");
            return false;
        } else

            return true;
    }

    /**
     * this method checks if a number is even
     *
     * @return
     */

    public Boolean isAEven() {
        if (a == null) {
            return Boolean.FALSE;
        }
        return a % 2 == 0;

    }

}
