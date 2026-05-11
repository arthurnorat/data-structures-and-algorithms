package exercicios;

public class Caixa {
    private static int totalVendas = 0;
    private double saldoCaixa;

    Caixa(double saldoInicial) {
        saldoCaixa = saldoInicial;
    }

    void registrarVendas(double valor) {
        if (valor <= 0.00) {
            System.out.println("Venda inválida");
            return;
        } else {
            saldoCaixa += valor;
            totalVendas++;
        }
    }

    static int getTotalVendas() {
        return totalVendas;
    }

    @Override
    public String toString() {
        return "Caixa[saldo=" + saldoCaixa + ", totalVendas=" + totalVendas + "]";
    }

    public static void main(String[] args) {
        Caixa caixa1 = new Caixa(1000.00);

        int rodada = 1;
        while (rodada <= 5) {
            if (rodada == 1) {
                caixa1.registrarVendas(100.00);
            } else if (rodada == 2) {
                caixa1.registrarVendas(-30.00);
            } else if (rodada == 3) {
                caixa1.registrarVendas(-100.00);
            } else if (rodada == 4) {
                caixa1.registrarVendas(200.00);
            } else {
                caixa1.registrarVendas(300.00);
            }
            rodada++;
        }
        System.out.println(caixa1.toString());
    }
}
