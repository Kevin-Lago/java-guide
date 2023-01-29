package maps;

import data.Car;
import lists.Cars;

public class StreamsMapExamples {
    public static void main(String[] args) {
        mapCylinderCountsFromCars();
        mapEnginesFromCars();
    }

    public static void mapEnginesFromCars() {
        System.out.println("Mapping engines from cars...");
        Cars.getCars().stream().map(Car::getEngine).forEach(System.out::println);
        System.out.println("========================\n");
    }

    public static void mapCylinderCountsFromCars() {
        System.out.println("Mapping cylinder count from cars...");
        Cars.getCars().stream().map(car -> car.getEngine().getCylinderCount()).forEach(System.out::println);
        System.out.println("========================\n");
    }
}
