import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int randomNum = new Random().nextInt(100);
        System.out.println(randomNum);

        int tentativas = 0, chances = 5, i = 0,numberInserted;

        while(i < chances){
            tentativas++;
            i++;
            System.out.println("Adivinhe o número entre 0 e 100: ");
            numberInserted = scan.nextInt();

            if (numberInserted < 0 || numberInserted > 100){
                System.out.println("Por favor, informe um número inteiro de 0 a 100!");
                break;
            }

            if (numberInserted == randomNum){
                System.out.println("Parabéns, você descobriu o número secreto " + randomNum + " com " + tentativas + " tentativas.");
                break;
            } else if (numberInserted > randomNum) {
                if (tentativas == chances){
                    System.out.println("O jogo acabou, o número era: " + randomNum);
                    break;
                }
                System.out.println("O número é menor! Você ainda tem " + (chances - i) + " tentativas.");
            } else if (numberInserted < randomNum) {
                if (tentativas == chances){
                    System.out.println("O jogo acabou, o número era: " + randomNum);
                    break;
                }
                System.out.println("O número é maior! Você ainda tem " + (chances - i) + " tentativas.");
            }
        }
    }
}