| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Sorting

## Sorting Algorithms

> In computer science, a sorting algorithm is an algorithm that puts elements of a list into an order. The most frequently used orders are numerical order and lexicographical order, and either ascending or descending. Efficient sorting is important for optimizing the efficiency of other algorithms (such as search and merge algorithms) that require input data to be in sorted lists. Sorting is also often useful for canonicalizing data and for producing human-readable output. - [Wikipedia](https://en.wikipedia.org/wiki/Sorting_algorithm)

- Some problem become easier when the data set we're working with is sorted.

## Simple Sort

## Merge Sort

> In computer science, merge sort (also commonly spelled as mergesort) is an efficient, general-purpose, and comparison-based sorting algorithm. Most implementations produce a stable sort, which means that the order of equal elements is the same in the input and output. Merge sort is a divide-and-conquer algorithm that was invented by John von Neumann in 1945. - [Wikipedia](https://en.wikipedia.org/wiki/Merge_sort)

- Merge sort is a recursive algorithm which splits an array in half, creating "leaves". Then using a merge routine merges the two sorted arrays.

## In-place Merge Sort

## Insertion Sort

> Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time by comparisons. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. - [Wikipedia](https://en.wikipedia.org/wiki/Insertion_sort)

- Given an array of n length. Sort the array, in increasing order, using [pairwise swap](https://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list/).

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  5  |  2  |  4  |  6  |  1  |  3  |

- First we look at the 1<sup>th</sup> index of this array and compare it with the element to its left. In this case 2 is less than 5, so we move 2 left one.

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  2  |  5  |  4  |  6  |  1  |  3  |

- Next we look at the 2<sup>th</sup> index of the array and compare is again with the element to its left. 4 is less than 5, so we move 4 left one.

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  2  |  4  |  5  |  6  |  1  |  3  |

- Next, because 6 is greater than 5, we don't need to move the element. We just continue to the next index.

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  2  |  4  |  5  |  6  |  1  |  3  |

- Next 1 is less than 6 so, we move it left one place.

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  2  |  4  |  5  |  1  |  6  |  3  |

- 1 is also less than 5 so, we move it left one place.

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  2  |  4  |  1  |  5  |  6  |  3  |

- And so on...

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  2  |  1  |  4  |  5  |  6  |  3  |

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  1  |  2  |  4  |  5  |  6  |  3  |

- Finally, we check the final element 3, which is less than 6 so, we move it left one place.

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  1  |  2  |  4  |  5  |  3  |  6  |

- And so on...

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  1  |  2  |  4  |  3  |  5  |  6  |

| Index |  0  |  1  |  2  |  3  |  4  |  5  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  1  |  2  |  3  |  4  |  5  |  6  |

- In this example each step is $\theta$(n).

## Binary Insertion Sort

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
