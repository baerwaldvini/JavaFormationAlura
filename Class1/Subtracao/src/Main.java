import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
        Scanner scanner = new Scanner(System.in);

        int number1, number2;

        System.out.println("Informe a sequencia de 2 números para subtrair: ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        int result = number1 - number2;

        System.out.printf("Subtação: " + result);
    }
}