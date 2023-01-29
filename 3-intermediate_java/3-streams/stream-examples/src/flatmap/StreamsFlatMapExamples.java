package flatmap;

import lists.Cities;

public class StreamsFlatMapExamples {
    public static void main(String[] args) {
        countPeopleFromCities();
        print();
    }

    public static void countPeopleFromCities() {
        System.out.println(Cities.getCities().stream().flatMap(city -> city.getPeople().stream()).count());
    }

    public static void print() {
        Cities.getCities().stream().flatMap(city -> city.getPeople().stream()).forEach(System.out::println);
    }
}
