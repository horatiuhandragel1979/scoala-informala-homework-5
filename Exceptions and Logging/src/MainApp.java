import java.util.Scanner;

/**
 * Create a student repository which supports:
 * - add student
 * exceptions when validating conditions mentioned bellow
 * - delete student (by ID)
 * exceptions: ID is empty, student does not exist
 * - retrieve all students with Age X (for each student the age must be calculated, not stored in a field).
 * exceptions: age is not a number, age is negative
 * - (optional) list students order by Last Name or Birth Date
 * exceptions: any input is empty
 * These methods must validate inputs and throw exceptions if necessary.
 */


public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Repository repository = new Repository();
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose your action: ");
            System.out.println("0 - to exit\n" +
                    "1 - to list students\n" +
                    "2 - to add student\n" +
                    "3 - to delete an existing student by ID\n" +
                    "4 - retrieve all students with Age X \n" +
                    "5 - list of available actions");

            System.out.println("Enter an action: ");
            int action = sc.nextInt();
            sc.nextLine();
            try {
                switch (action) {

                    case 0:
                        System.out.println("\nExit from menu");
                        exit = true;
                        break;
                    case 1:
                        repository.listStudents();
                        break;
                    case 2:
                        repository.addNewStudents();
                        break;
                    case 3:
                        repository.removeStudent();
                        break;

                    case 4:
                        repository.retrieveStudentsByAge();
                        break;
                    case 5:
                        System.out.println(action);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + action);
                }
            } catch (InvalidStudentException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
