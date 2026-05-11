package exercicios;

public class FiltroNumeros {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 15) {
                break;
            }
            System.out.println(i);
        }
    }
}
