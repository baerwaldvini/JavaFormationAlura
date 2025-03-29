import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        double celsius;

        System.out.println("Informe a temperatura em celsius: ");
        celsius = scan.nextDouble();

        int fahreneit = (int) (celsius * 1.8) + 32;
        System.out.println("A temperatura em FH está: " + fahreneit + " | ela em Célsius é: " + (int) celsius);
    }
}