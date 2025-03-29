import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare uma variável do tipo double precoOriginal.
        // Atribua um valor em reais a essa variável, representando o preço original de um produto.
        // Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        // Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 27.98;
        double percentualDesconto = 10;

        double valorTotal = precoOriginal - (precoOriginal * (percentualDesconto / 100));
        System.out.println(valorTotal);

    }
}