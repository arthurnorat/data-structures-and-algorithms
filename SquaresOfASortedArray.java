package leetcode;

// Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int pos = nums.length - 1; pos >= 0 ; pos--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SquaresOfASortedArray solution = new SquaresOfASortedArray();

        int[] input1 = {-4, -1, 0, 3, 10};
        int[] result1 = solution.sortedSquares(input1);
        System.out.printf("Test 1 - result: %s%n", Arrays.toString(result1));

        int[] input2 = {-7, -3, 2, 3, 11};
        int[] result2 = solution.sortedSquares(input2);
        System.out.printf("Test 2 - result: %s%n", Arrays.toString(result2));

        int[] input3 = {-5, -3, -2, -1};
        int[] result3 = solution.sortedSquares(input3);
        System.out.printf("Test 3 - result: %s%n", Arrays.toString(result3));
    }
}
