import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0, nota = 0;

        System.out.println("Qual a quantidade de notas para o filme?");
        int quantidadeNotas = scan.nextInt();

        for (int i = 1; i <=quantidadeNotas; i++){
            System.out.println("Diga a nota " + i + " para o filme:");
            nota = scan.nextDouble();

            mediaAvaliacao += nota;;
        }
        System.out.println("A media de avaliação do filme é: " + (mediaAvaliacao / quantidadeNotas));
    }
}
