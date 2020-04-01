import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Repository {

    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * This method add a student to the students list
     *
     * @throws InvalidStudentException firstname, lastname, dateOfBirth, gender and ID  cannot be empty  *
     */
    public void addNewStudents() throws InvalidStudentException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = sc.nextLine();
        System.out.println("Enter last name:");
        String lastName = sc.nextLine();
        System.out.println("Enter date of birth:");
        String dateOfBirth = sc.nextLine();
        System.out.println("Enter gender (F/M):");
        String gender = sc.nextLine();
        System.out.println("Enter ID (CNP):");
        String ID = sc.nextLine();

        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new InvalidStudentException("First name and/or last name cannot be empty!");
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(dateOfBirth, dtf);
        if (localDate.getYear() < 1900 && Period.between(LocalDate.ofEpochDay(localDate.getYear()), LocalDate.now()).getYears() < 18) {
            throw new InvalidStudentException("The birth year must be between 1900 and " + (Period.between(LocalDate.ofEpochDay(localDate.getYear()), LocalDate.now()).getYears() - 18));
        }

        if (!gender.contains("f") && !gender.contains("m") && !gender.contains("F") && gender.contains("M")) {
            throw new InvalidStudentException("Gender must be M or F!");
        }

        if (ID.isEmpty() || ID.contains("[a-zA-Z]+")) {
            throw new InvalidStudentException("Id cannot be empty and must contain only numbers!");
        }

        Student student = new Student(firstName, lastName, localDate, gender, ID);

        if (studentList.addAll(Collections.singleton(student))) {
            System.out.println("New student added");
        } else {
            System.out.println("Cannot add this student, is already on list.");
        }
    }

    /**
     * This method delete a student from students list
     *
     * @throws InvalidStudentException ID cannot be empty
     */
    public void removeStudent() throws InvalidStudentException {
        String removeId = null;
        assert false;
        if (removeId.isEmpty() || removeId.contains("[a-zA-Z]+")) {
            throw new InvalidStudentException("Id cannot be empty and must contain only numbers!");
        } else {
            Iterator<Student> iter = studentList.iterator();
            while (iter.hasNext()) {
                Student s = iter.next();
                if (s.getID().equals(removeId))
                    iter.remove();
                else {
                    throw new InputMismatchException("The ID does not exist");
                }
            }
        }
    }

    /**
     * With this method we print the list of students
     */
    public void listStudents() {
        studentList.forEach(System.out::println);
    }

    /**
     * This method finds a student by age
     *
     * @throws InvalidStudentException age cannot be empty
     */
    public void retrieveStudentsByAge() throws InvalidStudentException {
        Integer age = null;
        if (age < 0)
            throw new InvalidStudentException("The age must be a positive number and contain only numbers!");
        else {
            List<Student> studentsAge = new ArrayList<>();
            for (Student s : studentList) {
                int y = Period.between(s.getDateOfBirth(), LocalDate.now()).getYears();
                if (y == age) {
                    studentsAge.add(s);
                }
            }
            System.out.println(studentsAge);
        }
    }

}