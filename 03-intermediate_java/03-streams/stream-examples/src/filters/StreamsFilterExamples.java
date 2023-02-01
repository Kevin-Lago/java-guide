package filters;

import lists.Cars;
import lists.People;

public class StreamsFilterExamples {
    public static void main(String[] args) {
        filterPeopleByAge(20);
        filterPeopleByContainsString("a");
        filterCarsByCylinderCount(4);
    }

    public static void filterCarsByCylinderCount(int cylinderCount) {
        System.out.println("Filtering cars by cylinder count...");
        Cars.getCars().stream().filter(car -> car.getEngine().getCylinderCount() > cylinderCount).forEach(System.out::println);
        System.out.println("========================\n");
    }

    public static void filterPeopleByContainsString(String string) {
        System.out.println("Filtering people by substring in name...");
        People.getPeople().stream().filter(person -> person.getName().toLowerCase().contains(string.toLowerCase())).forEach(System.out::println);
        System.out.println("========================\n");
    }

    public static void filterPeopleByAge(int age) {
        System.out.println("Filtering people by age...");
        People.getPeople().stream().filter(person -> person.getAge() > age).forEach(System.out::println);
        System.out.println("========================\n");
    }
}
