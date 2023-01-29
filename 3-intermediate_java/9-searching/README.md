| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Searching

## Simple Search / Sequential Search / Linear Search

> Sequential Search: In this, the list or array is traversed sequentially and every element is checked. For example: [Linear Search](https://www.geeksforgeeks.org/linear-search/). - [Geeks for Geeks](https://www.geeksforgeeks.org/searching-algorithms/)

- A Simple Search / Sequential Search / Linear Search is a search algorithm were each element starting from the 0<sup>th</sup> index in a list is checked.
- Simple Search has a O(n) time complexity.
- Find the 'on' bit or 1 in this byte or array of integers.

| Index |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |
|:-----:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
| Value |  0  |  0  |  0  |  1  |  0  |  0  |  0  |  0  |

```java
public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {0, 0, 0, 1, 0, 0, 0, 0};
        linearSearchArray(intArray);
    }

    public static void linearSearchArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1) {
                System.out.println("Found on bit at position: " + i);
                return;
            }
        }
        System.out.println("No on bit was found");
    }
}
```

## Binary Search

> Interval Search: These algorithms are specifically designed for searching in sorted data-structures. These type of searching algorithms are much more efficient than Linear Search as they repeatedly target the center of the search structure and divide the search space in half. For Example: [Binary Search](https://www.geeksforgeeks.org/binary-search/). - [Geeks for Geeks](https://www.geeksforgeeks.org/searching-algorithms/)

- Binary Search is a search algorithm were the middle element of an array is checked first. Then depending on the target search value half of the array is 'discarded' and the process repeats. If the target search value is higher than the middle value then the first half of the list is discarded. Otherwise, the last half of the list is discarded.
- Binary Search requires a list to be sorted.
- Binary Search has a time complexity of O(log n)

## Peak Finding

- Given a one-dimensional array, find a peak if it exists. If no element exists on one side, Just check the other side.

  1. A peak is defined as an element being greater than or equal to the element to its right and left.
  2. A peak is defined as an element being greater than the element to its right and left.
  3. Now find the highest peak if it exists given these two definitions of a peak.

- Given a two-dimensional array, find a peak if it exists. If no elements exist on one or two sides just check the other two or three sides.

  1. A peak is defined as an element being greater than or equal to the element to its right, left, bottom and top.
  2. A peak is defined as an element being greater than the element to its right, left, bottom and top.
  3. Now find the highest peak if it exists given these two definitions of a peak.

## greedy ascent algorithm

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
