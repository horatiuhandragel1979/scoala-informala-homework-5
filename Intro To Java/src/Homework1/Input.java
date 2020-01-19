package Homework1;

import java.util.Scanner;

/**
 * Input 2 values:  start  and  finish, then display the numbers from start to finish.
 *
 * @author Horatiu Handragel
 */
public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti primul numar intreg : ");
        int start = scan.nextInt();
        System.out.println("Introduceti cel de-al doilea : ");
        int end = scan.nextInt();

        /**
         * condition for increasing numbers
         * condition of displaying the numbers between start and end
         */
        if (start < end)                        //conditie pentru numere crescatoare
            for (int i = start; i <= end; i++) {
                System.out.println(i + "");
            }
        /**
         * condition for decreasing numbers
         */
        else if (start > end)                   //conditie pentru numere descrescatoare
            for (int i = start; i >= end; i--) {
                System.out.println(i + "");
            }


    }
}
