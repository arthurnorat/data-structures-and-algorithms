package leetcode;

// Given an integer num, return the number of steps to reduce it to zero.
// In one step, if the current number is even, divide it by 2; otherwise, subtract 1 from it.

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        NumberOfStepsToReduceANumberToZero solution = new NumberOfStepsToReduceANumberToZero();

        int result1 = solution.numberOfSteps(14);
        System.out.printf("Test 1 - result: %d%n", result1);
        // expected: 6

        int result2 = solution.numberOfSteps(8);
        System.out.printf("Test 2 - result: %d%n", result2);
        // expected: 4

        int result3 = solution.numberOfSteps(123);
        System.out.printf("Test 3 - result: %d%n", result3);
        // expected: 12
    }
}
