//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class targetsum {
    public static List<List<Integer>> threeSum(int[] nums, int targetSum) {
        // Sort the array to easily find triplets
        Arrays.sort(nums);

        List<List<Integer>> triplets = new ArrayList<>();
        // Iterate through the array, considering each element as the potential first element of the triplet
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Pointer for the second element of the triplet
            int right = nums.length - 1; // Pointer for the third element of the triplet

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == targetSum) {
                    // Found a triplet that sums up to the target sum
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    triplets.add(triplet);

                    // Move the pointers to find other triplets
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    // If the current sum is less than the target, move the left pointer to increase the sum
                    left++;
                } else {
// If the current sum is greater than the target, move the right pointer to decrease the sum
                    right--;
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int targetSum = 6;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<List<Integer>> result = threeSum(nums, targetSum);

        // Print the result
        System.out.println(result);
    }
}

//time complexity:O(n^2)
//space complexity:O(n)


