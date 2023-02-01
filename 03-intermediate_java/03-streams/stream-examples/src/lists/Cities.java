package lists;

import data.City;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static List<City> getCities() {
        List<City> cities = new ArrayList<>();

        cities.add(new City("New York", People.getPeople().stream().limit(4).toList()));
        cities.add(new City("Atlanta", People.getPeople().stream().skip(4).limit(4).toList()));
        cities.add(new City("San Diego", People.getPeople().stream().skip(8).limit(5).toList()));

        return cities;
    }
}
