package MaxCalculate;

import java.util.Scanner;

/**
 * The programm displays the biggest number
 *
 * @author Horatiu Handragel
 */

public class CalculateMax {

    public static void main(String[] args) {

// introducem de la tastatura cele 3 numere intregi

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar intreg: ");
        int first = sc.nextInt();
        System.out.println("Introduceti al doilea numar intreg: ");
        int second = sc.nextInt();
        System.out.println("Introduceti al treilea numar intreg: ");
        int third = sc.nextInt();

        if (getMax(first, second) > third) {
            System.out.println("Cel mai mare numar este: " + getMax(first, second));
        } else if (getMax(first, second) < third) {
            System.out.println("Cel mai mare numar este: " + third);
        } else
            System.out.println("Toate numerele sunt egale!!!");

    }

    /*
    metoda identifica care este cel mai mare numar dintre doua numere
     */
    public static int getMax(int x, int y) {
        return Math.max(x, y);
        //return x > y ? x : y;

    }


}
