package exercicios;

public class Funcionario {
    private String name;
    private double salario;

    Funcionario (String name, double salario) {
        this.name = name;
        this.salario = salario;
    }

    String getName () {
        return name;
    }

    double getSalario() {
        return salario;
    }

    void setSalario (double novoSalario) {
        if (novoSalario > 0) {
            salario = novoSalario;
            System.out.println("Seu salário agora é R$ " + salario);
        } else {
            System.out.println("Novo salário menor do que zero");
        }
    }

    @Override
    public String toString() {
        return "Funcionário: " + name + " | Salário: " + salario;
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Arthur", 1000.00);
        funcionario1.setSalario(-100.00);
        funcionario1.setSalario(500.00);
        System.out.println(funcionario1.toString());
    }
}
