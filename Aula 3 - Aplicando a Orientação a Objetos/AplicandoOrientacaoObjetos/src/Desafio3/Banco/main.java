package Desafio3.Banco;

public class main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setSaldoConta(2000);
        conta.depositar(200);
        conta.sacar(300);
        conta.cobrarTarifaMensal(5);
        conta.sacar(5000);
        conta.consultarSaldo();
    }
}
