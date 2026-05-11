package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    // =======================
    // Solução para o LeetCode
    // =======================
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

    // ==================================
    // Main method para testar localmente
    // ==================================
    public static void main(String[] args) {
        FizzBuzz solucao = new FizzBuzz(); // Estou criando uma instância da classe FizzBuzz.

        // Teste 1
        System.out.println("Teste n = 3 - " + solucao.fizzBuzz(3));

        // Teste 2
        System.out.println("Teste n = 5 - " + solucao.fizzBuzz(5));

        // Teste 3
        System.out.println("Teste n = 15 - " + solucao.fizzBuzz(15));

        // Teste 4
        System.out.println(("Teste n = 30 - " + solucao.fizzBuzz(30)));
    }
}
