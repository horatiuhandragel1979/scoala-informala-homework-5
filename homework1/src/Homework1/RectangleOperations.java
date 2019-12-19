package Homework1;

import java.util.Scanner;

/**
 * Input the dimensions of a rectangle(Length, Width) and display area and perimeter.
 * Produce an error message if the length or width are negative.
 *
 * @author Horatiu Handragel
 */
public class RectangleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = 0;
        double perimeter = 0;
        System.out.println("Introduceti lungimea dreptunghiului: ");
        double length = sc.nextDouble();
        System.out.println("Introduceti latimea dreptunghiului: ");
        double width = sc.nextDouble();

        /**
         * condition thet checks if the numbers entered are negative
         */

        if (length < 0 || width < 0) {
            System.out.println("Introduceti doar numere pozitive!!!");
            return;
        }

        /**
         * calculate the area of the rectangle
         */

        area = length * width;
        System.out.println("Aria dreptunghiului este: " + area);

        /**
         * calculate the perimeter of the rectangle
         */

        perimeter = 2 * (length + width);
        System.out.println("Perimetrul dreptunghiului este: " + perimeter);
    }
}
