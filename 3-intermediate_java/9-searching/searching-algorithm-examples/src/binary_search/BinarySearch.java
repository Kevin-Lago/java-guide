package binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        linearBinarySearchArray(intArray, 5);

        recursiveBinarySearch(intArray, 7);
    }

    public static void linearBinarySearchArray(int[] intArray, int target) { // Constant Space Complexity
        int first = 0; // Constant Time
        int last = intArray.length - 1; // Constant Time

        while (first <= last) { // Logarithmic Time
            int midPoint = Math.floorDiv((first + last), 2); // Constant Time

            if (intArray[midPoint] == target) { // Constant Time
                System.out.println("Target " + target + " found at index: " + midPoint);
                return;
            } else if (intArray[midPoint] < target) { // Constant Time
                first = midPoint + 1; // Constant Time
            } else {
                last = midPoint - 1; // Constant Time
            }
        }

        System.out.println("Target " + target + " not found");
    }

    public static void recursiveBinarySearch(int[] intArray, int target) { // Logarithmic Space Complexity - Depends on 'Tail Call Optimization'
        if (intArray.length == 0) { // Constant Time
            System.out.println("Target " + target + " not found");
            return;
        }

        int midPoint = Math.floorDiv(intArray.length, 2); // Constant Time

        if (intArray[midPoint] == target) { // Constant Time
            System.out.println("Target " + target + " found");
        } else {
            if (intArray[midPoint] < target) { // Constant Time
                recursiveBinarySearch(Arrays.copyOfRange(intArray, midPoint + 1, intArray.length), target); // Logarithmic Time
            } else {
                recursiveBinarySearch(Arrays.copyOfRange(intArray, 0, midPoint), target); // Logarithmic Time
            }
        }
    }
}
