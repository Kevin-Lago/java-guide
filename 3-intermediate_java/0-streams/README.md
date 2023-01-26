| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Streams

## Stream API

- The Java Stream API has two kinds of methods.

    - Terminal Operations: returns a result from the stream.

    - Intermediate Operations: returns a stream object.

- Implements map, filter and reduce

- Streams can be created from Collections, Arrays, Files, Regular Expressions and Strings.

- Streams with try/catch

- Doesnt duplicated elements. Perfect for map filter reduce
- A Stream object does not duplicate data.
- A Stream object is an empty Object.
- Creating a Stream object does not create any load on memory or cpu.
- A Stream object instance can not be processed more than once. Either terminal or intermediate operations
- It doesnt make sense to store Streams in a variable. We inline the methods and use a terminal operation all in one go.

## Flatmap

- The flatmap operator deals with multiple relationships between entities.

- One to many

- The flat map operation is defined by a function that takes an object and returns a Stream of other objects

## Map

## Filter

- Create a new Stream of the same type as the previous stream.

## Reduce

## Merging Streams

## Counting Elements

## Functional Interfaces

> A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. Runnable, ActionListener, Comparable are some of the examples of functional interfaces. - [Geeks for Geeks](https://www.geeksforgeeks.org/functional-interfaces-java/)



| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
