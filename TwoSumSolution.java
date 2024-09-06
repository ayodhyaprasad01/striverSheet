import java.util.HashMap;
import java.util.Arrays;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices if a pair is found
                return new int[] { map.get(complement), i };
            }

            // Add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no pair is found, return an empty array (though it's guaranteed a solution
        // exists)
        return new int[] {};
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        System.out.println("Example 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Output: " + Arrays.toString(result1));

        // Example 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        System.out.println("\nExample 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Output: " + Arrays.toString(result2));

        // Example 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        System.out.println("\nExample 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Output: " + Arrays.toString(result3));
    }
}
