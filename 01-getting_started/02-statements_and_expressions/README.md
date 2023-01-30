| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Statements and Expressions

## Writing Clean Code

- Writing clean code is vital when working with others or your future self. (Returning to old projects)

- Writing code cleanly and with style are two different things. Here's an example of two different styles of clean code:

```java
// Clean code
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
}
```

```java
// Clean code different style
public class HelloWorld 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello, World!");
	}
}
```

- Messy code can be hard to follow. Not impossible, but the seconds or minutes it takes to understand code will add up.

```java
public class MessyCode { public static void main(String[] args) {
int[] grades = {2, 98, 58, 83, 95, 36, 36, 78, 37, 86, 85, 87, 98, 100, 38};
    int min = 100;int max = 0;
 int sum = 0;
    int mean = 0;
        double variance = 0;
    double standardDeviation = 0;
        for (int grade : grades) { if (grade > max) max = grade;
if (grade < min) min = grade;
    sum += grade; }mean = (sum / grades.length);

for (int grade : grades) {
    variance += Math.pow(num - mean, 2);
}
 variance = Math.sqrt(variance / grades.length);
standardDeviation = Math.sqrt(variance); }}
```

- Clean code is easier to maintain and understand.

```java
public class CleanCode {
    public static void main(String[] args) {
        int[] grades = {2, 98, 58, 83, 95, 36, 36, 78, 37, 86, 85, 87, 98, 100, 38};
        int min = 100; int max = 0; int sum = 0; int mean = 0;
        double variance = 0; double standardDeviation = 0;

        for (int grade : grades) {
            if (grade > max) max = grade;
            if (grade < min) min = grade;
            sum += grade;
        }

        mean = (sum / grades.length);

		for (int num : a) {
            variance += Math.pow(num - mean, 2);
        }

        standardDeviation = Math.sqrt(variance / a.length);

        System.out.printf("%.1f %n", standardDeviation);
    }
}
```

## Comments

- Comments are ignored lines or sections of code. They're useful for communicating things that aren't intuitive. They're also great for adding 'ToDos'!

```java
// This is a single line comment in Java
```

```java
/*
 * This is a multi-line / block comment in Java
 * Useful for documentation
 * */
```

- In popular IDEs like Intellij comments with the key word 'todo' will be highlighted.

```java
public class HelloWorld {
	// ToDo: Take and store user input in a String variable
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
}
```

## Java Keywords

- [Java keywords](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html) are reserved words with built-in functionality.

- These words cannot be used as identifiers / variable names.

- All primitive data types are keywords.

- Here are all the primitive data type keywords:

| Keyword |
|:-------:|
 |  byte   | 
|  short  |
|   int   |
|  long   |
|  float  |
| double  |
|  char   | 
| boolean |

## Identifiers and Naming Convention

## Expressions

- “An expression is a construct made up of variables, operators, and method invocations, which are constructed according to the syntax of the language, that evaluates to a single value.” - Oracle Java Docs

- Basically some code that equates to a single value.

```java
int a = 5
```

## Statements

- A Statement is like a full sentence.

- We can turn an Expression into an Expression Statement using a ```;``` like so:

```java
int intVariable = 5;
```

- We can also use Control Flow Statements which will be covered in [Loops and Logic]()

- Control Flow Statement examples:
	- if
	- else if
	- else
	- for
	- while

## Assignment Operators

- Assignment Operator: =, +=, -=, *=, /=, %=

- Assignment Operators asign a value to a Variable
	
| Operator |           Name           | Function                                          |    Example    | Result       |
|:--------:|:------------------------:|---------------------------------------------------|:-------------:|--------------|
|    =     |     Equals Operator      | Assigns a value to a Variable                     |   int x = 2   | 2            |
|    +=    |   Plus-Equals Operator   | Adds a value to a Variables original value        |    x += 6     | 8            |
|    -=    |  Minus-Equals Operator   | Subtracts a value from a Variables original value |    x -= 2     | 6            |
|    *=    | Multiply-Equals Operator | Multiplies a value to a Variables original value  |    x *= 2     | 12           |
|    /=    |  Divide-Equals Operator  | Divides a value from a Variables original value   |    x /= 4     | 3            |
|    %=    | Modulus-Equals Operator  | Returns the remainder of a Variables value        |    x %= 2     | 1            |

## Arithmetic Operators

- Arithmetic Operators: +, -, *, /, %, ++, --

- Arithmetic Operators allow us to do basic math

| Operator |           Name           | Function                                     | Example       | Result       |
|:--------:|:------------------------:|----------------------------------------------|---------------|--------------|
|    +     |    Addition Operator     | Adds two values                              | int x = 2 + 2 | 4            |
|    -     |   Subtraction Operator   | Subtracts two values                         | x = x - 2     | 2            |
|    *     | Multiplication Operator  | Multiplies two values                        | x = x * 3     | 6            |
|    /     |    Division Operator     | Divides two values                           | x = x / 2     | 3            |
|    %     |     Modulus Operator     | Divides two values and returns the remainder | x = x % 2     | 1            |
|    ++    |    Increment Operator    | Adds 1 to a value                            | x++           | 2            |
|    --    |    Decrement Operator    | Subtracts 1 from a value                     | x--           | 1            |

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
