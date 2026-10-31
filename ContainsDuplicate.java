package leetcode;

// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        // Test 01
        boolean result01 = solution.containsDuplicate(new int[]{1, 2, 3, 1});
        System.out.println(result01);

        // Test 02
        boolean result02 = solution.containsDuplicate(new int[]{1, 2, 3, 4});
        System.out.println(result02);

        // Test 03
        boolean result03 = solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        System.out.println(result03);
    }
}
