import java.util.Scanner;

public class Desafio4UltimaAula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // CLient Variables
        String nameAccontClient;
        double accountBalance;
        String typeAccount;

        // Operations Variables
        int typeOperation;
        double newValueOperation;

        System.out.println("***********************");
        System.out.println("Dados Iniciais do Cliente: \nNome:");
        nameAccontClient = scan.nextLine();
        System.out.println("Saldo Inicial:");
        accountBalance = scan.nextDouble();
        scan.nextLine();
        System.out.println("Tipo de Conta: ");
        typeAccount = scan.nextLine();
        System.out.println("***********************\n\n***********************");

        System.out.println("Dados Iniciais do Cliente: \nNome:" + nameAccontClient + "\nSaldo Inicial: " + accountBalance + "\nTipo de Conta: " + typeAccount ) ;
        System.out.print("\n Operações: " + "\n 1- Consultar saldos \n 2- Receber valor \n 3- Transferir valor \n 4- Sair\n***********************\n" );
        typeOperation = scan.nextInt();
        scan.nextLine();

        do {
            System.out.print("\n Operações: " + "\n 1- Consultar saldos \n 2- Receber valor \n 3- Transferir valor \n 4- Sair\n***********************\n" );
            typeOperation = scan.nextInt();
            scan.nextLine();
            switch (typeOperation){
                case 1:
                    System.out.println("\nSeu saldo é de: " + accountBalance);
                    break;
                case 2:
                    System.out.println("\nInforme o valor para depósito: ");
                    newValueOperation = scan.nextDouble();
                    accountBalance += newValueOperation;
                    System.out.println("\nO valor de " + newValueOperation + " foi depositado!");
                    newValueOperation = 0;
                    break;
                case 3:
                    System.out.println("\nInforme o valor a ser transferido: ");
                    newValueOperation = scan.nextDouble();
                    if (newValueOperation > accountBalance){
                        System.out.println("\nO valor informado é maior que o saldo da conta! Favor informar um saldo menor que " + accountBalance);
                        break;
                    } else {
                        accountBalance -= newValueOperation;
                        System.out.println("\nO valor de " + newValueOperation + " foi transferido!");
                        break;
                    }
                case 4:
                    break;
                default:
                    System.out.println("\nOperação inválida!");
                    break;
            }
        } while (typeOperation !=4);
        }
    }

