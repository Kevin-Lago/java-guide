| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Annotations

> Annotations, a form of metadata, provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate. - [Oracle Docs](https://docs.oracle.com/javase/tutorial/java/annotations/)

- Annotations are useful for providing additional logic to our code. Some examples include:

    - Information for the compiler

    - Compile-time or deployment-time processing

    - Runtime processing

- Annotations can be used on Classes, Constructors, Methods, Arguments, Variables ect...

- There are 5 categories of annotations: - [Geeks for Geeks](https://www.geeksforgeeks.org/annotations-in-java/)

    - Marker Annotations

    - Single Value Annotations

    - Full/Multi-Value Annotations

    - Type Annotations

    - Repeating Annotations

- Marker Annotations are used to simply provide high level information to either the user or compiler.

- Java comes with many built-in Annotations! 

- Here are some examples of built-in Marker Annotations:

- [@Override](https://docs.oracle.com/javase/7/docs/api/java/lang/Override.html)
    
    - Indicates that the annotated method is being overridden from its parent class.

    - Throws a warning if the annotated method is not overridding a method.

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Override {}
```

- [@Documented](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Documented.html)

    - Indicates that the annotated annotation is to be documented by javadoc and similar tools.

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Documented {}
```

- [@Deprecated](https://docs.oracle.com/javase/8/docs/api/java/lang/Deprecated.html) Java version <8 ?????????

    - Indicates that the annotated method is deprecated.

    - Throws a warning if the annotated method is used.

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {}
```

- @SafeVarargs ????????

    -

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SafeVarargs {}
```

- [@FunctionalInterface](https://docs.oracle.com/javase/8/docs/api/java/lang/FunctionalInterface.html)

    - Indicates that the annotated class, enum or annotation is intended to be a [Functional Interface](https://www.geeksforgeeks.org/functional-interfaces-java/)

    - Throws a warning if the annotated class, enum or annotation does not satisfy the requirements of a Functional Interface

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FunctionalInterface {}
```

- [@Inherited](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Inherited.html)

    - ??????????

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Inherited {}
```

- [@Native](https://docs.oracle.com/javase/10/docs/api/java/lang/annotation/Native.html)

    - ?????????

```java
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface Native {}
```

-   [@InjectedProfile]()

    - ???????

```java
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@interface InjectedProfile {}
```

- We can also create our own custom Annotations! Lets look at an example of a Marker Annotation.

- Here we're defining an annotation ```MarkerAnnotation``` which will be used during runtime and ????

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MarkerAnnotation {}
```

- Single-Value Annotations store a single value. 

- Here are some examples of built-in Single-Value Annotations:

- [@Value]()

    - 


| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
