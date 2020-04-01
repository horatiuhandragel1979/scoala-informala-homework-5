import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    @Test
    public void addStudentTest() throws InvalidStudentException {
        Repository r = new Repository();
        r.addNewStudents();
        assertEquals(r.getStudentList().size(), 1);
    }

    @Test
    public void removeStudentTest() throws InvalidStudentException {
        Repository r = new Repository();
        r.addNewStudents();
        r.removeStudent();
        assertEquals(r.getStudentList().size(), 0);
    }


    @Test
    public void retrieveStudentsByAgeTest() throws InvalidStudentException {
        Repository r = new Repository();
        r.addNewStudents();
        r.retrieveStudentsByAge();

        assertEquals(r, 1);
    }
}
