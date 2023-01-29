package data;

public class Car {
    private String model;
    private String color;
    private String brand;
    private int year;
    private Engine engine;

    public Car(String model, String color, String brand, int year, Engine engine) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine.toString() +
                '}';
    }
}
