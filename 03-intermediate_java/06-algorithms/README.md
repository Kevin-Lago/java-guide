| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Algorithms

## History

> The word algorithm is derived from the Latin translation, Algoritmi de numero Indorum, of the 9th-century Persian mathematician [Muhammad ibn Musa al-Khwarizmi](https://en.wikipedia.org/wiki/Muhammad_ibn_Musa_al-Khwarizmi)'s arithmetic treatise “Al-Khwarizmi Concerning the Hindu Art of Reckoning” - [Wikipedia](https://en.wikipedia.org/wiki/Algorithm)

- Algorithms have existed for forever. 

- Algorithms are a well-defined set of steps that take one or more values as an input and produce one or more values as an output in a finite amount of time. 

## Algorithmic Thinking

- Break down your problems.

- define the set of steps for getting an output from a given input.

## Computability Theory

> Computability theory, also known as recursion theory, is a branch of mathematical logic, computer science, and the theory of computation that originated in the 1930s with the study of computable functions and Turing degrees. The field has since expanded to include the study of generalized computability and definability. In these areas, computability theory overlaps with proof theory and effective descriptive set theory. - [Wikipedia](https://en.wikipedia.org/wiki/Computability_theory)

- [Models of Computation](https://en.wikipedia.org/wiki/Model_of_computation) can be categorized into three categories.
  - Sequential Models
  - Functional Models
  - Concurrent Models
- Models of Computation specify what operations an algorithm can do and their cost in respect to time and memory space for each operation.

> A random-access machine (RAM) is an abstract computational-machine model identical to a multiple-register counter machine with the addition of indirect addressing. At the discretion of instruction from its finite state machine's TABLE, the machine derives a "target" register's address either (i) directly from the instruction itself, or (ii) indirectly from the contents (e.g. number, label) of the "pointer" register specified in the instruction. - [Wikipedia](https://en.wikipedia.org/wiki/Random-access_machine)

- RAM is organized by 'words'. We can access these words with an address.
- An algorithm can load words, do computations and store those words each in O(1) time.

> In theoretical computer science, the word RAM (word random-access machine) model is a model of computation in which a random-access machine does bitwise operations on a word of w bits. Michael Fredman and Dan Willard created it in 1990 to simulate programming languages like C. - [Wikipedia](https://en.wikipedia.org/wiki/Word_RAM)

- A word is w bits, at least log of the size of memory.

> In theoretical computer science a pointer machine is an "atomistic" abstract computational machine model akin to the random-access machine. A pointer algorithm is an algorithm restricted to the pointer machine model. - [Wikipedia](https://en.wikipedia.org/wiki/Pointer_machine)

- In a Pointer Machine we have dynamically allocated objects, and Objects have a constant number of fields.
- A field can be either a word, pointer or null.
- An example data structure using this model would be the LinkedList, which could contain a value (word), pointer to the next node and a pointer to the previous node. Using this model we can create, update or destroy a node making it dynamic memory allocation.

## Computational Complexity Theory

> In theoretical computer science and mathematics, computational complexity theory focuses on classifying computational problems according to their resource usage, and relating these classes to each other. A computational problem is a task solved by a computer. A computation problem is solvable by mechanical application of mathematical steps, such as an algorithm. - [Wikipedia](https://en.wikipedia.org/wiki/Computational_complexity_theory)

- Algorithms can be categorized using the Computational Complexity Theory.
- With the [Analysis of Algorithms](https://en.wikipedia.org/wiki/Analysis_of_algorithms) we can define the worst case scenario for how long an algorithm will take to run.

> In computational complexity theory, asymptotic computational complexity is the usage of asymptotic analysis for the estimation of computational complexity of algorithms and computational problems, commonly associated with the usage of the big O notation. - [Wikipedia](https://en.wikipedia.org/wiki/Asymptotic_computational_complexity)

## Time Complexity

> In computer science, the time complexity is the computational complexity that describes the amount of computer time it takes to run an algorithm. - [Wikipedia](https://en.wikipedia.org/wiki/Time_complexity)

- Big O notation represents the [Worst-case Complexity](https://en.wikipedia.org/wiki/Worst-case_complexity) of an algorithm.

- Constant Time: O(1)
- Logarithmic Time: O(log n) or O(ln n)
- Linear Time: O(n)
- Quasilinear Time: O(n log n)
- Quadratic Time: O(n<sup>2</sup>)

![Polynomial Time Complexity Graph](./polynomial_time_complexity_graph_dark.svg#gh-dark-mode-only)
![Polynomial Time Complexity Graph](./polynomial_time_complexity_graph_light.svg#gh-light-mode-only)

- Factorial or Combinatorial Time: O(n!)
- Exponential Time: O(2<sup>n</sup>)

- We use Theta $\theta$ to represent the [Average-case Complexity](https://en.wikipedia.org/wiki/Average-case_complexity) of an algorithm.

## Space Complexity

> The space Complexity of an algorithm is the total space taken by the algorithm with respect to the input size. Space complexity includes both Auxiliary space and space used by input. - [Geeks for Geeks](https://www.geeksforgeeks.org/g-fact-86/)

- Space Complexity is a measure of how much storage is needed for an algorithm to run.

## Correctness

- Must return a value
- Must complete execution in a finite amount of time
- Must output the same result everytime for a given input set
- There are two types of correctness;
    - Partial Correctness
    - Total Correctness

## Calculating Space and Time Complexity



## Rabbit in the Hole

## The Fibonacci Series

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
