import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        //Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        double varDef1;
        System.out.println("Informe um número: ");
        varDef1 = scan.nextDouble();

        if (varDef1 == 0){
            System.out.println("O número é 0");
        } else if (varDef1 > 0){
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        */
        /*
        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        int varDef1, varDef2;


        System.out.println("Informe um número: ");
        varDef2 = scan.nextInt();
        System.out.println("Informe outro número: ");
        varDef1 = scan.nextInt();

        if (varDef1 > varDef2){
            System.out.println("O número " + varDef1 + " é maior do que o número " + varDef2);
        } else if (varDef1 < varDef2){
            System.out.println("O número " + varDef1 + " é menor do que o número " + varDef2);
        } else {
            System.out.println("Os números são iguais");
        }
        */
         //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e
        // "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

        /*
        int optionsCalc;
        double calValue, calFinal;

        System.out.println("Informe 1 para calcular a área do quadrado ou 2 para calcular a área do círculo: ");
        optionsCalc = scan.nextInt();

        if (optionsCalc < 1 || optionsCalc > 2){
            System.out.println("Favor informar uma operação válida!");
        } else if (optionsCalc == 1){
            System.out.println("Favor informar a medida do lado do quadrado");
            calValue = scan.nextDouble();

            calFinal = calValue * calValue;
            System.out.println("A área do quadrado é : " + calFinal);
        } else {
            System.out.println("Favor informar o raio do círculo: ");
            calValue = scan.nextDouble();

            calFinal = calValue * 3.14;
            System.out.println("A área do circulo é : " + calFinal);
        }
        */
        /*
        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        System.out.println("Informe um número para ver sua tabuada: ");
        int varDes1 = scan.nextInt();
        System.out.println("Tabuada: " );
        for (int i = 1; i <= 10; i++){
            System.out.println(varDes1 + " * " + i + " = " + varDes1 * i);
        }
        */
        /*
        //Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        System.out.println("Digite um número");
        int varDes1 = scan.nextInt();

        if (varDes1 % 2 == 0 && varDes1 != 0){
            System.out.println("O número é par!");
        } else if (varDes1 % 2 != 0){
            System.out.println("O número é impar!");
        } else {
            System.out.println("O número é 0!");
        }
        */
        // Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        System.out.println("Informe um número para ver seu fatorial: ");
        int varDes1 = scan.nextInt();
        int fatNumber = 1;
        int operationNumber = varDes1;

        for (int i = 0; i < operationNumber; i++){
            fatNumber = fatNumber * varDes1;
            varDes1--;
        }
        System.out.println("O fatorial do número é: " + fatNumber);
    }
}
