package data;

import java.util.List;

public class City {
    private String name;
    private List<Person> people;

    public City(String name, List<Person> people) {
        this.name = name;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public String toString() {
        return name + people.toString();
    }
}
