package exercicios;

public class Produto {
    private String nome;
    private int quantidadeEmEstoque;

    Produto (String nome, int quantidadeEmEstoque) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    void entrada (int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    void saida (int quantidade) {
        if (quantidadeEmEstoque - quantidade >= 0) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Produto[nome=" + nome + ", estoque=" + quantidadeEmEstoque + "]";
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 5);
        produto1.entrada(6);
        System.out.println(produto1.toString());
        produto1.saida(3);
        System.out.println(produto1.toString());
        produto1.saida(10);
        System.out.println(produto1.toString());
    }
}
