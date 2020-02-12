package main;

import java.util.Comparator;

public class AgeSorted implements Comparator<Person> {
    /**
     *  comparator for age in reverse order
     * @param person
     * @param t1
     * @return
     */
    @Override
    public int compare(Person person, Person t1) {
        return t1.getAge() - person.getAge();
    }
}
