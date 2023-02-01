package streams_from_arrays;

import data.Person;
import lists.People;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsToArrayExamples {
    public static void main(String[] args) {
        arraysStream();
    }

    public static void arraysStream() {
        Person[] people = People.getPeople().stream().toArray(Person[]::new);
        Arrays.stream(people).forEach(System.out::println);
        Stream.of(people).forEach(System.out::println);
    }
}
