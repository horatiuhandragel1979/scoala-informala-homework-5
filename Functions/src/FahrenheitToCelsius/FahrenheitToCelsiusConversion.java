package FahrenheitToCelsius;

import java.util.Scanner;

/**
 * write a program that for a given (by the user) body temperature, measured in Fahrenheit degrees, outputs it in Celsius degrees,
 * with the following message: "Your body temperature in Celsius degrees is X", where X is respectively the Celsius degrees.
 * In addition if the measured temperature in Celsius is higher than 37 degrees, the program should warn the user that they are ill,
 * with the following message "You are ill!"
 *
 * @author Horatiu Handragel
 */

public class FahrenheitToCelsiusConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the body temperature in Fahrenheit degrees: ");
        double fahrenheit = sc.nextDouble();
        if (fahrenheitToCelsius(fahrenheit)<=37) {
            System.out.println("Your body temperature in Celsius degrees is: " + fahrenheitToCelsius(fahrenheit));
        } else
            System.out.println("Your body temperature in Celsius degrees is "+fahrenheitToCelsius(fahrenheit) +
                    " grade Celsius" + "\n" +" You are ill !");
    }


    public static double fahrenheitToCelsius(double f){

        return (f-32)*5/9;

    }


}
