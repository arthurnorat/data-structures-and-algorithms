package exercicios;

public class Senha {
    public static void main(String[] args) {
        int tentativas = 0;
        int senhaCorreta = 1234;

        do {
            System.out.println(tentativas);
            tentativas++;
        } while (tentativas != senhaCorreta);
        System.out.println("Acesso liberado após " + tentativas + " tentativas.");
    }
}
