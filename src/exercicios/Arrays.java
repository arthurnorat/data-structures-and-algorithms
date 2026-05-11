package exercicios;

public class Arrays {
    public static void main(String[] args) {
        int[] valores = {14, 73, 8, 52, 37};
        int maiorValor = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] >= maiorValor) {
            maiorValor = valores[i];
            }
        }
        System.out.println(maiorValor);
    }
}
