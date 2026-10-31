package leetcode;

// Given an array of integers nums and an integer target,
// return the indices of the two numbers such that they add up to target.
// Each input has exactly one solution, and the same element cannot be used twice.
// The answer can be returned in any order.

import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Test 01
        int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Test 1: [" + result1[0] + ", " + result1[1] + "]");

        // Test 02
        int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "]");

        // Test 03
        int[] result3 = solution.twoSum(new int[]{3, 3}, 6);
        System.out.println("Test 3: [" + result3[0] + ", " + result3[1] + "]");



    }
}
