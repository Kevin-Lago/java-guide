package linear_search;

import java.lang.reflect.Field;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {0, 0, 0, 1, 0, 0, 0, 0};
        linearSearchArray(intArray);
    }

    public static void linearSearchArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) { // Linear Time
            if (intArray[i] == 1) { // Constant Time
                System.out.println("Found on bit at position: " + i);
                return;
            }
        }
        System.out.println("No on bit was found");
    }
}
