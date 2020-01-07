package DataValidation;

import java.io.PrintStream;
import java.util.Scanner;

/** The program asks the user what time it is, by printing on the console "What time is it?".
 * Then the user must enter two numbers – one for hours and one for minutes.
 * If the input data represents a valid time, the program must output the message " The time is hh:mm now.",
 * where hh respectively means the hours, and mm – the minutes.
 * If the entered hours or minutes are not valid, the program must print the message " Incorrect time!"
 *
 * @author Horatiu Handragel
 */

public class InputDataValidation {
    public static void main(String[] args) {
        System.out.println("What time is it?");

        timeInput();
    }

    /*
    introducem de la tastatura ora si minutele
     */

    public static PrintStream timeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti ora: ");
        int hour = sc.nextInt();
        System.out.println("Introduceti minutele:");
        int minutes = sc.nextInt();

        return System.out.printf("The time is: %d:%d%n", hour, minutes);

    }




}
