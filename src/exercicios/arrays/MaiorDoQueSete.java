package exercicios.arrays;

public class MaiorDoQueSete {

//    Exercício 3
//    Crie um programa com um array de notas: 6, 9, 4, 7, 8, 3, 10, 5.
//    Conte e imprima quantas notas são maiores que 7.

    public static void main(String[] args) {
        int[] notas = {6, 9, 4, 7, 8, 3, 10, 5};
        int maiorDoQueSete = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 7) {
                maiorDoQueSete++;
            }
        }
        System.out.println(maiorDoQueSete);
    }
}
