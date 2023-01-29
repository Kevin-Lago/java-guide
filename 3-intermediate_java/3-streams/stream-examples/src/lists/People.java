package lists;

import data.Person;

import java.util.ArrayList;
import java.util.List;

public class People {
    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Kevin", 25));
        people.add(new Person("John", 34));
        people.add(new Person("Sarah", 19));
        people.add(new Person("Bob", 54));
        people.add(new Person("Kayla", 32));
        people.add(new Person("Jerry", 50));
        people.add(new Person("Rick", 76));
        people.add(new Person("Beth", 50));
        people.add(new Person("Morty", 15));
        people.add(new Person("Andy", 36));
        people.add(new Person("Emily", 34));
        people.add(new Person("", 20));
        people.add(new Person("gerry", 0));

        return people;
    }
}
