import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        name = scanner.next();

        System.out.println("Olá, " + name + "! Tudo bem?");
    }
}