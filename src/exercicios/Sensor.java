package exercicios;

public class Sensor {
    private static int totalLeituras = 0;
    private double ultimaLeitura;

    public void registrarLeitura(double valor) {
        ultimaLeitura = valor;
        totalLeituras++;
    }

    static int getTotalLeituras() {
        return totalLeituras;
    }

    public static void main(String[] args) {
        Sensor sensor1 = new Sensor();
        sensor1.registrarLeitura(3.5);
        System.out.println(sensor1.getTotalLeituras());
    }
}
