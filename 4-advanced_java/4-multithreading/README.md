| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Multi-threading

## CPU Basics

- Modern CPUs have multiple [cores](https://en.wikipedia.org/wiki/Multi-core_processor) with which exist up to 2 [threads](https://www.geeksforgeeks.org/what-are-threads-in-computer-processor-or-cpu/).

- Threads are defined at the operating system level.

> In computer science, a thread of execution is the smallest sequence of programmed instructions that can be managed independently by a scheduler, which is typically a part of the operating system. The implementation of threads and processes differs between operating systems. - [Wikipedia](https://en.wikipedia.org/wiki/Thread_(computing))

- An application can be run on several threads. Different threads can be executed at the same time. The JVM, for example, runs on multiple threads.

## Concurrency

> In computer science, concurrency is the ability of different parts or units of a program, algorithm, or problem to be executed out-of-order or in partial order, without affecting the outcome. This allows for parallel execution of the concurrent units, which can significantly improve overall speed of the execution in multi-processor and multi-core systems. In more technical terms, concurrency refers to the decomposability of a program, algorithm, or problem into order-independent or partially-ordered components or units of computation. - [Wikipedia](https://en.wikipedia.org/wiki/Concurrency_(computer_science))

- Concurrency is implemented in Java using the producer / consumer pattern using the wait / notify keywords. ????????

- We can order the read/write operations on multicore CPUs. ?????

- Singleton ????????

## 

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
