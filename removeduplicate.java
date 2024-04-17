//Write a program to remove duplicate values from an array and returns an array of unique values. int[] removeDuplicates(int[]values)
//Ex:
//values = [2, 4, 6, 2, 8, 10, 4, 12, 14, 6]
//result = [2, 4, 6, 8, 10, 12, 14]
import java.util.*;
public class removeduplicate {
    public static int[] removeDuplicates(int[] values) {
        // Sort the array to bring duplicates together
        Arrays.sort(values);

        // Count the number of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] != values[i + 1]) {
                uniqueCount++;
            }
        }
        uniqueCount++; // count for the last element

        // Create a new array to store the unique elements
        int[] result = new int[uniqueCount];
        int index = 0;
        result[index++] = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] != values[i - 1]) {
                result[index++] = values[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] values = {2, 4, 6, 2, 8, 10, 4, 12, 14, 6};
        int[] result = removeDuplicates(values);
        System.out.println(Arrays.toString(result));
    }

}


//time complexity:O(logn)
//space complexity:O(n)

