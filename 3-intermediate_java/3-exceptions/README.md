| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Exceptions

## Handling Exceptions

> An Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred. - [Geeks for Geeks](https://www.geeksforgeeks.org/exceptions-in-java/)

- To handle an exception in Java we need to use the ```try``` and ```catch``` Java Keywords.

```java
public class Main {
    public static void main(String[] args) {
        try {
            int anInteger = Integer.parseInt("string");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

- In the example above we're trying to parse the string "string" to an int using the Integer class's parseInt method.

- The above example will only catch a NumberFormatException. If a different exception is thrown it will still crash the program.

- We can avoid code duplication and stack multiple exception types using the ```|``` with the catch statement like so:

```java
public class Main {
    public static void main(String[] args) {
        try {
            int anInteger = Integer.parseInt("string");
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

- If we need to handle different exceptions differently we can stack multiple exception types with more catch statements like so:

```java
public class Main {
    public static void main(String[] args) {
        try {
            int anInteger = Integer.parseInt("string");
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
        } catch (NullPointerException e) {
            System.out.println("Null value given");
        }
    }
}
```

## Types of Exceptions

- There are two kinds of exceptions, Checked and Unchecked.

- Checked or Handled exceptions are wrapped by a try statement and caught with a catch statement.

- Unchecked or Unhandled exceptions are not wrapped by a try statement/caught by a catch statement and generally crash a program.

- Java comes with many built-in exceptions! Some examples include:

  - IOException
  - NullPointerException
  - ArithmeticException
  - NumberFormatException

## Call Stack

- A thrown exception will run up the Call Stack! For example:

```java
public class CallStackException {
  public static void main(String[] args) {
    try {
      System.out.println(doMath(2, 0));
    } catch (ArithmeticException e) {
      System.out.println("Can not divide by zero");
    }
  }

  public static int doMath(int a, int b) {
    return divideNumbers(a, b);
  }

  public static int divideNumbers(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
```

- The thrown exception will be taken up to the highest level of the call stack. In this example that is the main method.

## Finally

- The ```finally``` statement will always run whether an exception in thrown or not.

```java
public class FinallyStatement {
    public static void main(String[] args) {
        System.out.println(divideInt(4, 2));
        System.out.println(divideInt(2, 0));
    }

    public static int divideInt(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return Integer.MAX_VALUE;
        } finally {
            return 0;
        }
    }
}
```

- In this example line 3 will return 2 as expected, But line 4 will return 0. The finally blocks return statement will overwrite whatever was returned by the try or catch blocks.

- Finally statements are useful for closing connections to databases or files/streams. For example:

```java
public class FinallyStatement {
    public static void main(String[] args) {
        System.out.println(openTxtFile("./text.txt"));
    }

    public static String openTxtFile(String filepath) {
        BufferedReader br = null;

        try {
            File file = new File(filepath);
            br = new BufferedReader(new FileReader(file));
            
            return br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
            return "";
        } finally {
            try {
                br.close();
            } catch (IOException | NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
```

## Throwables

- There are two types of Throwables. Exceptions and Errors.

- It's generally avoided to catch Errors.

## Custom Exceptions

- We can create our own custom exceptions with added functionality like posting an error/exception message to an API. Slack, Discord or Teams are likely candidates for a feature like this.

- Depending on the structure of our application/applications we can also send information like the application that threw the error/exception, the time it was thrown and possibly even a [UID](https://en.wikipedia.org/wiki/Unique_identifier) of the process that threw that error/exception.

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
