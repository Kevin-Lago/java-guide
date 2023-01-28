| [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) <img width=1000/> | [Home](https://github.com/Kevin-Lago/java-guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)<img width=1000> |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|

# Searching

## Simple Search / Sequential Search / Linear Search

- Simple Search is a search algorithm were each element starting from the 0<sup>th</sup> index in a list is checked.

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

- Binary Search is a search algorithm were the middle element of an array is checked first. ??????

- Binary Search requires a list to be sorted.

- Binary Search has a time complexity of O(log n)

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/java-guide/tree/main/src/) | <img width=1000/> [Home](https://github.com/Kevin-Lago/java-guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/) |
|:---------------------------------------------------------------------------------------------|:------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------:|
