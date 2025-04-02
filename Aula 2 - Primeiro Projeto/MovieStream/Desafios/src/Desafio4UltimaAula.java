import java.util.Scanner;

public class Desafio4UltimaAula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variáveis do cliente
        System.out.println("***********************");
        System.out.println("Dados Iniciais do Cliente:");
        System.out.print("Nome: ");
        String nameAccountClient = scan.nextLine();

        System.out.print("Saldo Inicial: ");
        double accountBalance = scan.nextDouble();
        scan.nextLine();

        System.out.print("Tipo de Conta: ");
        String typeAccount = scan.nextLine();

        System.out.println("***********************\n\n***********************");
        System.out.println("Dados Iniciais do Cliente: \nNome: " + nameAccountClient + "\nSaldo Inicial: " + accountBalance + "\nTipo de Conta: " + typeAccount);
        System.out.println("***********************\n");

        int typeOperation;
        do {
            System.out.print("\nOperações:\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair\nEscolha uma opção: ");
            typeOperation = scan.nextInt();
            scan.nextLine();  // Consome a nova linha restante após ler o inteiro

            switch (typeOperation) {
                case 1:
                    System.out.println("\nSeu saldo é de: R$" + accountBalance);
                    break;
                case 2:
                    System.out.print("\nInforme o valor para depósito: ");
                    double depositAmount = scan.nextDouble();
                    scan.nextLine();  // Consome a nova linha restante
                    accountBalance += depositAmount;
                    System.out.println("\nO valor de R$" + depositAmount + " foi depositado com sucesso!");
                    break;
                case 3:
                    System.out.print("\nInforme o valor a ser transferido: ");
                    double transferAmount = scan.nextDouble();
                    scan.nextLine();  // Consome a nova linha restante
                    if (transferAmount > accountBalance) {
                        System.out.println("\nO valor informado é maior que o saldo da conta! Favor informar um valor menor que R$" + accountBalance);
                    } else {
                        accountBalance -= transferAmount;
                        System.out.println("\nO valor de R$" + transferAmount + " foi transferido com sucesso!");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar nossos serviços. Até logo!");
                    break;
                default:
                    System.out.println("\nOperação inválida! Por favor, tente novamente.");
                    break;
            }
        } while (typeOperation != 4);

        scan.close();
    }
}
