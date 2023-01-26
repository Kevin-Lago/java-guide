package lists;

import data.Car;
import data.Engine;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        Engine engine1 = new Engine(2.5f, 4, "Gas I4", "172 @ 6000", 179);
        Car car1 = new Car("Rav4", "Black", "Toyota", 2010, engine1);

        Engine engine2 = new Engine(3.7f, 6, "Gas V6", "280 @ 4250", 305);
        Car car2 = new Car("Mustang", "Red w/ White Stripes", "Ford", 2014, engine2);

        Engine engine3 = new Engine(2.4f, 4, "Gas I4", "161 @ 4400", 180);
        Car car3 = new Car("CRV LX", "Grey", "Honda", 2010, engine3);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        return cars;
    }
}
