package Homework1;

import java.util.Scanner;

/**
 * The programm displays the biggest number
 *
 * @author Horatiu Handragel
 */
public class BiggestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti primul numar intreg : ");
        int first = scan.nextInt();
        System.out.println("Introduceti cel de-al doilea numar intreg : ");
        int second = scan.nextInt();
        System.out.println("Introduceti cel de-al treilea numar intreg: ");
        int third = scan.nextInt();

        /**
         * conditions to find the largest number
         */
        if (first > second && first > third) {
            System.out.println("Cel mai mare numar introdus este: " + first);
        }                       //conditie pentru numere crescatoare

        else if (second > first && second > third) {

            System.out.println("Cel mai mare numar introdus este: " + second);
        } else if (third > first && third > second) {
            System.out.println("Cel mai mare numar introdus este: " + third);

        } else if (first == second && first == third && second == third) {
            System.out.println("Toate numerele introduse sunt egale");
        }
    }


}
