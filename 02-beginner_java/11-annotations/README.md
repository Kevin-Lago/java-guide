| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Annotations

> Annotations, a form of metadata, provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate. - [Oracle Docs](https://docs.oracle.com/javase/tutorial/java/annotations/)

- Examples of annotations can be found [here](https://github.com/Kevin-Lago/java-vanilla-annotations). I recommend using breakpoints and exploring the debugger.

- Annotations are useful for providing additional logic to our code. Some examples include:

    - Information for the compiler

    - Compile-time or deployment-time processing

    - Runtime processing

- Annotations can be used on Classes, Interfaces, Enumerated Types, Records, Fields, Methods, Parameters, Constructors, Other Annotations, Packages, and Modules.

```java
public @interface ExampleAnnotation {

}
```

- An annotation, at its most basic, is created using an access modifier, the @interface type and an identifier.

```java
@Target(ElementType.METHOD)
public @interface ExampleMethodAnnotation {

}
```

- We use the [@Target](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Target.html) annotation to define where the annotation is meant to be used.

```java
@Retention(RetentionPolicy.CLASS)
public @interface ClassRetentionAnnotation {
    String value() default "Discarded at Runtime";
}
```

- Finally we use the [@Retention](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Retention.html) annotation to define when an annotation can be discarded.

- By default an annotation will inherit a retention policy of RetentionPolicy.CLASS.

- There are 5 categories of annotations: - [Geeks for Geeks](https://www.geeksforgeeks.org/annotations-in-java/)

    - Marker Annotations

    - Single Value Annotations

    - Full/Multi-Value Annotations

    - Type Annotations

    - Repeating Annotations

- Marker Annotations are used to simply provide high level information to either the user or compiler.

- Java comes with many built-in Annotations! 

## Marker Annotations

- Lets look at an example of a Marker Annotation.
- Here we're defining an annotation ```MarkerAnnotation``` which will persist through runtime.
- As the name suggests we can use Marker Annotations to mark elements for extra logic or simply to indicate information.

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MarkerAnnotation {}
```

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

- [@Deprecated](https://docs.oracle.com/javase/8/docs/api/java/lang/Deprecated.html)

    - Indicates that the annotated element is deprecated.
    - Throws a warning if the annotated element is used.

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {}
```

- [@SafeVarargs](https://docs.oracle.com/javase/8/docs/api/java/lang/SafeVarargs.html)

    - Indicates that the annotated elements do not perform potentially unsafe operations on its varargs parameter.

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SafeVarargs {}
```

- [@FunctionalInterface](https://docs.oracle.com/javase/8/docs/api/java/lang/FunctionalInterface.html)

    - Indicates that the annotated element is intended to be a [Functional Interface](https://www.geeksforgeeks.org/functional-interfaces-java/)
    - Throws a warning if the element does not satisfy the requirements of a Functional Interface

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FunctionalInterface {}
```

- [@Inherited](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Inherited.html)

    - Indicates that the annotated element is automatically inherited.

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

---

## Single Value Annotations

---

## Full/Multi-Value Annotations

--- 

## Type Annotations

---

## Repeating Annotations

---

- Single-Value Annotations store a single value. 

- Here are some examples of built-in Single-Value Annotations:

- [@Value]()

    - 


| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
