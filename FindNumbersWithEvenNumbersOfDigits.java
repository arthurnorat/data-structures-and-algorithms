package leetcode;

// Given an array nums of integers, return how many of them contain an even number of digits.

public class FindNumbersWithEvenNumbersOfDigits {
    public int findNumbers(int[] nums) {
        int numWithEvenDigits = 0;
        for (int num : nums) {
            String numAsString = String.valueOf(num);
            int numOfDigits = numAsString.length();
            if (numOfDigits % 2 == 0) {
                numWithEvenDigits++;
            }
        }
        return numWithEvenDigits;
    }

    public static void main(String[] args) {
        FindNumbersWithEvenNumbersOfDigits solution = new FindNumbersWithEvenNumbersOfDigits();

        int[] input1 = {3, 40, 5};
        int result1 = solution.findNumbers(input1);
        System.out.printf("Test 1 - result: %d%n", result1);

        int[] input2 = {12,345,2,6,7896};
        int result2 = solution.findNumbers(input2);
        System.out.printf("Test 2 - result: %d%n", result2);

        int[] input3 = {555,901,482,1771};
        int result3 = solution.findNumbers(input3);
        System.out.printf("Test 3 - result: %d%n", result3);
    }
}