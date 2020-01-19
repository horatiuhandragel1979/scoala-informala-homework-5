package Homework1;

import java.util.Scanner;

/**
 * Check if a number is palindrome
 *
 * @author Horatiu Handragel
 */
public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, sum = 0, temp;
        System.out.println("Introduceti un numar pentru a verifica daca este palindrom");
        int n = sc.nextInt();
        temp = n;

        /**
         * condition that checks if the number entered is palindrome
         */

        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Numarul este palindrom");
        else
            System.out.println("Numarul nu este palindrom");

    }
}
