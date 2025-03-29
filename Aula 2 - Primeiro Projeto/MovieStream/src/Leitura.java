import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = scan.nextLine();

        System.out.println(filme);
    }
}
