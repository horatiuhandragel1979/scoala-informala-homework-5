package CalculateAverage;

import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 * The program calculate the average of all the numbers in an int[] array.
 * The user must input the length of the array and each number in the array, after which the average is displayed.
 *
 * @author Horatiu Handragel
 */

public class AverageCalculation {

    public static void main(String[] args) {
        inputArray();
    }


    /*
    metoda ne permite sa introducem un sir de lemente
    si calculeaza media aritmetica a acestora
     */
    public static void inputArray() {

        System.out.println("Introdu lungimea sirului:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] arr = new double[n];
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Introdu numarul " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        sc.close();
        for (double v : arr) {
            total = total + v;
        }

        double average = total / arr.length;

        System.out.println("Media aritmetica a sirului este: " + average);

    }

}


