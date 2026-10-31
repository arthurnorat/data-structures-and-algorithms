package leetcode;

// Given an integer n, return a string array answer (1-indexed) where:
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5,
// answer[i] == "Fizz" if i is divisible by 3,
// answer[i] == "Buzz" if i is divisible by 5,
// answer[i] == i (as a string) if none of the above conditions are true.

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            }else if (i % 5 ==0){
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FizzBuzz solution = new FizzBuzz();

        // Test 1
        System.out.println("Test n = 3 - " + solution.fizzBuzz(3));

        // Test 2
        System.out.println("Test n = 5 - " + solution.fizzBuzz(5));

        // Test 3
        System.out.println("Test n = 15 - " + solution.fizzBuzz(15));

        // Test 4
        System.out.println(("Test n = 30 - " + solution.fizzBuzz(30)));
    }
}
