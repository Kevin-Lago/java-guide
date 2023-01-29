| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Enumerated Types

- Enums are a data type that store predefined variables.

- Enums are useful for data that doesn't change such as:

    - Days

    - Colors

    - Languages

```java
enum Day {
    SUNDAY("sunday", "sun", 0),
    MONDAY("monday", "mon", 1),
    TEUSDAY("teusday", "tue", 2),
    WEDNESDAY("wednesday", "wed", 3),
    THURSDAY("thursday", "thu", 4),
    FRIDAY("friday", "fri", 5),
    SATURDAY("saturday", "sat", 6);

    String dayNameLong;
    String dayNameShort;
    int dayOfTheWeek;

    Day(String dayNameLong, String dayNameShort, int dayOfTheWeek) {
        this.dayNameLong = dayNameLong;
        this.dayNameShort = dayNameShort;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDayNameLong() {
        return dayNameLong;
    }

    public String getDayNameShort() {
        return dayNameShort;
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}
```

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
