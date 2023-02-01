| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/01-getting_started/01-introduction) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/01-getting_started/03-statements_and_expressions)<img width=1000> |
|:-------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------------------------------------------------------:|

# Data-types and Variables

## Binary Values

> A binary number is a number expressed in the base-2 numeral system or binary numeral system, a method of mathematical expression which uses only two symbols: typically "0" (zero) and "1" (one). - [Wikipedia](https://en.wikipedia.org/wiki/Binary_number)

- Before we continue lets learn how to count in binary.
- Let's use a [Nibble](https://en.wikipedia.org/wiki/Nibble) or four [Bits](https://en.wikipedia.org/wiki/Bit) for an example.

| Binary Value | Base 10 Value |
|:------------:|:-------------:|
|     0000     |       0       |
|     0001     |       1       |
|     0010     |       2       |
|     0011     |       3       |
|     0100     |       4       |
|     0101     |       5       |
|     0110     |       6       |
|     0111     |       7       |
|     1000     |       8       |
|     ...      |      ...      |
|     1111     |      15       |

## Data-types

- Java is a Type-Asserted language. This means that a variable must be assigned a datatype and that datatype can not change during the life of that variable.
- There are two categories of data-types. Primitives and Objects.
- bytes, shorts, ints and longs are primitive number data types.

```java
byte byteMinimumValue = -128;
byte defaultByteValue = 0;
byte byteMaximumValue = 127;
```

- bytes are an 8-bit number. In Java the maximum value of a byte is 127. This is because the first bit value is used to indicate whether the value is positive or negative making it a [signed value](https://en.wikipedia.org/wiki/Signed_number_representations).
- bytes will consume less memory than the larger alternatives.

```java
short shortMinimumValue = -32768;
short defaultShortValue = 0;
short shortMaximumValue = 32767;
```

- shorts are a 16-bit number.

```java
int intMinimumValue = -2147483648;
int intDefaultValue = 0;
int intMaximumValue = 2147483647;
```

- ints are a 32-bit number.

```java
long longMinimumValue = -9223372036854775808;
long defaultLongValue = 0;
long longMaximumValue = 9223372036854775807;
```

- longs are a 64-bit number.

- floats and doubles are primitive number values with a decimal place.

```java
float floatValue1 = 5.7f;
float floatValue2 = 247.963f;
float defaultFloatValue = 0.0f;
```
```java
double doubleValue1 = 8.8d;
double doubleValue2 = 5937.3276d;
double defaultDoubleValue = 0.0d;
```

- booleans are a primitive data type of either a true or false value.

```java
boolean defaultBooleanValue = false;
boolean trueBooleanValue = true;
```

- chars are a single letter.
- Unlike Strings we use single quotation marks for chars.

```java
char a = 'a';
char b = 'b';
char c = 'c';
char defaultCharValue = '\u0000';
```

- Objects are not primitives and make up the rest of the data types.
- Notice how object data types are capitalized while primtive data types are not.

```java
String defaultStringValue = null;
String string = "This is an Object";
Object defaultObjectValue = null;
```

## Variables

- Variables are named bits of computer memory in which you can store a value.
- In Java, variables first need a data type and then a name \<Data-type\> \<Identifier\>
- Let's declare a String variable with an identifier.

```java
String stringVariable;
```

- Declaring a variable only reserves the memory; it doesn't put anything in the memory. For that, we need to assign a value.
- We assign values to our variables using an assignment operator.

```java
String stringVariable = "Any String Value";
```

## Java Keywords

- [Java keywords](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html) are reserved words with built-in functionality.
- These words cannot be used as identifiers / variable names.
- All primitive data types are keywords. byte, short, int, long, float, double, char and boolean.

## Identifiers and Naming Conventions

- Identifiers are developer defined names for Variables, Methods and Classes.
- Identifiers cannot span multiple lines or contain spaces.
- Identifiers can only contain numbers, letters, underscores, dashes and dollar signs.
- Identifiers must start with either a letter, underscore or dollar sign.

```java
int exampleInt_1 = 0;
int exampleInt_2 = 0;
int exampleInt_3 = 0;

long _long$23 = 675;
```

- The first word in an identifier for Variables and Methods should be lowercase.
- The first word in an identifier for Classes should be uppercase.

```java
public class ExampleClassIdentifier {

	private String exampleVariableIdentifier;
	
	private void exampleMethodIdentifier() {}

}
```

- Names should be descriptive.
- Classes and Variables start with nouns.
- Methods start with verbs.

```java
public class Apple {

	private String color = "red";
	private int ageInSeconds = 0;
	
	private void increaseAge() {
		this.ageInSeconds++;
	}

}
```

## Operators

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

- Relational/Comparison Operators: <, <=, >, =>, ==, !=
- Relational/Comparison Operators allow us to compare two values
- Relational/Comparison Operators will equate to either a true or false value

| Operator |              Name               | Function                                          | Example | Result Value |
|:--------:|:-------------------------------:|---------------------------------------------------|:-------:|--------------|
|    <     |       Less-Than Operator        | Returns true if a is less than b                  |  2 < 4  | true         |
|    <=    |  Less-Than-Or-Equals Operator   | Returns true if a is less than or equal to b      | 2 <= 3  | false        |
|    >     |      Greater-Than Operator      | Returns true if a is greater than b               |  3 > 2  | true         |
|    >=    | Greater-Than-Or-Equals Operator | Returns true if a is greater than or equal to b   | 3 >= 3  | true         |
|    ==    |       Does-Equal Operator       | Returns true if a does equal b                    | 3 == 3  | true         |
|    !=    |     Does-Not-Equal Operator     | Returns true if a does not equal b                | 2 != 2  | false        |

- Logical Operators: &&, ||, !
- Logical Operators are used in conjuntion with two Boolean Expressions!
- Due to the way graphs work in these files || will be replaced with OR.

| Operator |              Name               | Function                                          |    Example     | Result Value |
|:--------:|:-------------------------------:|---------------------------------------------------|:--------------:|--------------|
|    &&    |      Logical And Operator       | Returns true if both conditions are true          | 2 < 4 && 4 > 2 | false        |
|    OR    |       Logical Or Operator       | Returns true if either condition is true          | 2 > 3 OR 3 > 2 | true         |
|    !     |      Logical Not Operator       | Returns the opposite of the current boolean value |     !true      | false        |

- Bitwise Operators: &, |, ~, ^, <<, >>, >>>
- Bitwise Operators are used to manipulate the bit values of either an Integer or long Integer.

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/01-getting_started/01-introduction) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/01-getting_started/03-statements_and_expressions) |
|:-------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------------------------------------------------------:|
