package exercicios;

public class Lampada {
    private boolean ligada = false;

    public void alternarEstado() {
        ligada = !ligada;
    }

    public void exibirEstado() {
       if (ligada) {
           System.out.println("Lâmpada ligada");
       } else {
           System.out.println("Lâmpada desligada");
       }
    }

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.alternarEstado();
        lampada1.exibirEstado();
    }
}