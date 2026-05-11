package exercicios;

public class Calculadora {
    private static int totalDeOperacoes = 0;

    int somar(int a, int b) {
        totalDeOperacoes++;
        return a + b;
    }

    double somar(double a, double b) {
        totalDeOperacoes++;
        return a + b;
    }

    static void exibirTotalOperacoes(){
        System.out.println(totalDeOperacoes);
    }

    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        calculadora1.somar(2, 3);
        calculadora1.somar(4.2, 3.5);
        Calculadora.exibirTotalOperacoes();
    }
}
