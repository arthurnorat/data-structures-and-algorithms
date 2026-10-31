package leetcode;

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnes = 0;
        int maxConsecutiveOnes = 0;

        for (int i = 0;  i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutiveOnes++;
                maxConsecutiveOnes = Math.max(consecutiveOnes, maxConsecutiveOnes);
            } else {
                consecutiveOnes = 0;
            }
        }
        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

        int[] input1 = {1, 1, 0, 1, 1, 1};
        int result1 = solution.findMaxConsecutiveOnes(input1);
        System.out.printf("Test 1 - result: %d%n", result1);

        int[] input2 = {1, 0, 1, 1, 0, 1};
        int result2 = solution.findMaxConsecutiveOnes(input2);
        System.out.printf("Test 2 - result: %d%n", result2);

        int[] input3 = {0, 0, 0};
        int result3 = solution.findMaxConsecutiveOnes(input3);
        System.out.printf("Test 3 - result: %d%n", result3);
    }
}