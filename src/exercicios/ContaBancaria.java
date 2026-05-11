package exercicios;

public class ContaBancaria {

    private String titular;
    private double saldo;
    private static int totalContas;

    ContaBancaria(String titular, double saldo) {
        this.titular = titular;

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }

        totalContas++;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido");
        }
    }

    static int getTotalContas() {
        return totalContas;
    }

    @Override
    public String toString(){
        return "Conta[titular=" + titular + ", saldo=" + saldo + "]";
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Arthur", 2000.00);
        conta1.depositar(500.00);
        System.out.println(conta1.toString());

        ContaBancaria conta2 = new ContaBancaria("Kamila", 3000.00);
        conta2.sacar(4000.00);
        System.out.println(conta2.toString());

        System.out.println(ContaBancaria.getTotalContas());
    }
}
