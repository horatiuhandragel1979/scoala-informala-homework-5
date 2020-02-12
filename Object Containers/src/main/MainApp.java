package main;

import java.util.*;
/**
 * You need to store Persoane in a TreeSet. Define one comparator for age in reverse order.
 * When used when creating the TreeSet, the comparator will sort the persons in the collection by age from highest to lowest.
 *
 * Add Persons to the TreeSet; iterate through the treeset and print the name and the age;
 *
 * You need to store some information about some persons: for one person, you need a list of his/her hobbies;
 *
 * @author Horatiu Handragel
 */
public class MainApp {
    public static void main(String[] args) {

/**
 *  add Person to a treeSet
 */
        SortedSet<Person> personSet = new TreeSet<Person>(new AgeSorted());

        Person p1 = new Person("Liam", 18);
        Person p2 = new Person("Lara", 25);
        Person p3 = new Person("Paul", 38);
        Person p4 = new Person("Tom", 57);

        personSet.add(p2);
        personSet.add(p1);
        personSet.add(p3);
        personSet.add(p4);

        for (Object person :
                personSet) {
            Person p = (Person) person;
            System.out.println("Name " + p.getName() + " age " + p.getAge());
        }
/**
 * create a list of hobbies
 */
//        List<Hobby> hobbyList = new ArrayList<>();
//        hobbyList.add(new Hobby("Climbing", 2, new Address("Bucegi", new Country("Romania", "+4"))));
        Hobby climbing = new Hobby("Climbing", 2, new Address("Carpatilor", new Country("Romania", "+4")));
        Hobby swimming = new Hobby("Swimming", 1, new Address("Adriatic Seea", new Country("Italy", "+39")));
        Hobby walking = new Hobby("Walking", 4, new Address("Rambla", new Country("Spain", "+36")));
        Hobby cycling = new Hobby("Cycling", 1, new Address("Transfagarasan", new Country("Romania", "+4")));

        Map<Hobby, Person> hobbyPersonMap = new HashMap<>();
        hobbyPersonMap.put(climbing, p1);
        hobbyPersonMap.put(swimming, p1);
        hobbyPersonMap.put(cycling, p1);
        hobbyPersonMap.put(swimming, p2);
        hobbyPersonMap.put(walking, p2);

//Set<Hobby> hobbySet = hobbyPersonMap.keySet();
//        for (Hobby key: hobbySet
//             ) {
//            System.out.println(key+ " : " +hobbyPersonMap.get(key));
//        }


        Map<Hobby, Address> addressList = new HashMap<>();
        addressList.put(climbing, new Address("Carpatilor", new Country("Romania", "+4")));
        addressList.put(swimming, new Address("Adriatic Seea", new Country("Italy", "+39")));
        addressList.put(walking, new Address("Rambla", new Country("Spain", "+36")));
        addressList.put(cycling, new Address("Transfagarasan", new Country("Romania", "+4")));

//        Map<Hobby, Person> map = new HashMap<>();
//        map.put(climbing, p1);
//        map.put(cycling, p1);
//        map.put(swiming, p2);
        Set<Hobby> listaHobbies = hobbyPersonMap.keySet();
        for (Object nume : listaHobbies
        ) {
            System.out.println(hobbyPersonMap.get(nume).getName() + " : " +nume +" : "  +addressList.get(nume));
        }


        //        Set<Country> countries = new TreeSet<>();
//        Country c1 = new Country("Romania", "+4");
//        Country c2 = new Country("Italy", "+39");
//        Country c3 = new Country("Spain", "+36");
//        countries.add(c1);
//        countries.add(c2);
//        countries.add(c3);
//


    }


}
