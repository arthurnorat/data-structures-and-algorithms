package exercicios;

public class Retangulo {
    private double largura;
    private double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString(){
        return "Retangulo[largura=" + largura + ", altura=" + altura + ", area=" + calcularArea() + "]";
    }

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(3.15, 5.42);
        System.out.println(retangulo1.toString());

        Retangulo retangulo2 = new Retangulo(7.85, 6.12);
        System.out.println(retangulo2.toString());
    }
}
