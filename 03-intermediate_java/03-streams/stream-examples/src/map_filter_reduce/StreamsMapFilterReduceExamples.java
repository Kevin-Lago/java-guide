package map_filter_reduce;

import data.Person;
import lists.People;

public class StreamsMapFilterReduceExamples {
    public static void main(String[] args) {
        countEmptyNames();
        countNames();
    }

    public static void countEmptyNames() {
        System.out.println("Counting empty names...");
        long count = People.getPeople().stream()
                .map(Person::getName)
                .filter(String::isEmpty)
                .count();
        System.out.println(count);
        System.out.println("========================\n");
    }

    public static void countNames() {
        System.out.println("Counting empty names...");
        long count = People.getPeople().stream()
                .map(Person::getName)
                .filter(name -> !name.isEmpty())
                .count();
        System.out.println(count);
        System.out.println("========================\n");
    }

    public static void averageAge() {
//        People.getPeople().stream().map(person -> person.getAge()).filter(age -> age > 20).average();
    }
}
