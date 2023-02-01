| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/01-getting_started/03-statements_and_expressions) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/01-getting_started/05-debugging)<img width=1000> |
|:-----------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------------------:|

# Loops and Logic

## Program Flow

- Like a list of instructions code is read from left to right, top to bottom.

    - Go forward 2 steps
    - Turn left 90 degrees
    - Go backwards 5 steps
    - Turn right 180 degrees

- We can control flow using methods, loops and logic.

    - Go forward 2 steps
    - Repeat the first instruction 3 times
    - Turn left 90 degrees
    - Go backwards 5 steps
    - If we're facing north go back to step one
    - Turn right 180 degrees

## Boolean Expressions

- Helps us make decisions
- Allows us to control the flow of a program
- Used for testing conditions
    - Relational
    - Conditional

```java
boolean theSunIsHot = true;
boolean iceMelts = true;
boolean applesAreAVegetable = false;
boolean blueIsRed = false;
```

## If Statements

- An if statement will run a block of code if a condition is met.
- The condition will be checked inside the if's parentheses. ()
- The block of code that will be run resides within the curly brackets. {}

```java
if (condition) {
	// execute this code if condition is true
}
```

```java
if (5 > 2) {
	System.out.print("This will be printed to the console");
}
```

```java
if (5 < 2) {
	System.out.print("This will not be printed to the console");
}
```

## If, Else Statements

- The else statement will run a block of code for every condition that isn't true.

```java
if (condition) {
	// execute this code if condition is true
} else {
	// execute this code if condition is false
}
```

```java
if ((5 * 4) > 10) {
	System.out.print("This will be printed to the console");
} else {
	System.out.print("This will not be printed to the console");
}
```

```java
if (5 < (2 / 2)) {
	System.out.print("This will not be printed to the console");
} else {
	System.out.print("This will be printed to the console");
}
```

## If, Else If, Else Statements

- The else if statement allows us to check for other conditions

```java
if (condition) {
	// execute this code if condition is true
} else if (anotherCondition) {
	// execute this code if anotherCondition is true
} else {
	// execute this code if no conditions are true
}
```

```java
if ((5 * 8) >= (5 * 8)) {
	System.out.print("This will be printed to the console");
} else if (anotherCondition) {
	System.out.print("This will not be printed to the console");
} else {
	System.out.print("This will not be printed to the console");
}
```

```java
if (8 <= 2) {
	System.out.print("This will not be printed to the console");
} else if (8 >= 2) {
	System.out.print("This will be printed to the console");
} else {
	System.out.print("This will not be printed to the console");
}
```

```java
if (8 <= 2) {
	System.out.print("This will not be printed to the console");
} else if (8 >= 48) {
	System.out.print("This will not be printed to the console");
} else {
	System.out.print("This will be printed to the console");
}
```

- We can have multiple else if statements.

```java
if (8 <= 2) {
	System.out.print("This will not be printed to the console");
} else if (8 >= 48) {
	System.out.print("This will not be printed to the console");
} else if (8 <= 2) {
	System.out.print("This will not be printed to the console");
} else if (8 == 8) {
	System.out.print("This will be printed to the console");
} else {
	System.out.print("This will not be printed to the console");
}
```

## Switch Statements

- Switch statements allow us to compare an expression to several different values

```java
switch (expression) {
	case value1:
		// execute this code if expression == value1
		break;
	case value2:
		// execute this code if expression == value2
		break;
	default:
		// executre this code if not match was found
		break;
}
```

```java
int x;

switch(x = 4) {
	case 1:
		System.out.println("This will be printed to the console if x = 1");
		break;
	case 2:
		System.out.println("This will be printed to the console if x = 2");
		break;
	case 3:
		System.out.println("This will be printed to the console if x = 3");
		break;
	case 4:
		System.out.println("This will be printed to the console if x = 4");
		break;
	default:
		System.out.println("This will be printed to the console if x does not equal either 1, 2, 3 or 4");
}
```

## For Loops

- Loops allow us to repeat a block of code.
- We can use for loops

```java
for (initialization; termination condition; increment) {
	// Repeat this block of code
}
```

```java
// This writes "Hello, World!" 5 times to the terminal
for (int i = 0; i < 5; i++) {
	System.out.println("Hello, World!");
}
```

- Here's a diagram of the for loop above

[//]: # (<img src="ForLoopFlowChart.png" />)

- We can use while loops

```java
while(condition) {
	// Repeat this block of code
}
```

```java
// This writes "Hello, World! to the console 5 times
int i = 0;

while (i < 5) {
	System.out.println("Hello, World!");
	i++;
}
```

- We can also use do while loops

```java
do {
	// Repeat this block of code
} while (condition);
```

```java
// This writes "Hello, World! to the console 5 times
int i = 0;

do {
	System.out.println("Hello, World!");
	i++;
} while (i < 5);
```

- There are also enhanced for loops which will be covered in lesson 6 - Arrays

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/01-getting_started/03-statements_and_expressions) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/01-getting_started/05-debugging) |
|:-----------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------------------:|
