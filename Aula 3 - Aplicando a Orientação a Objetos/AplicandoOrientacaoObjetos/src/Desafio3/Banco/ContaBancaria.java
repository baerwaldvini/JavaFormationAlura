package Desafio3.Banco;

public class ContaBancaria {

    private double saldoConta;

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void depositar(double valor){
        saldoConta = getSaldoConta() + valor;
        System.out.println("O saldo de " + valor + " foi depositado.");
    }

    public void sacar(double valor){
        if (valor > getSaldoConta()){
            System.out.println("\nOperação não permitida, informe uma valor de saque menor que " + getSaldoConta());
        } else {
            saldoConta = getSaldoConta() - valor;
            System.out.println("Saque de " + valor + " realizado");
        }
    }
    public void consultarSaldo(){
        System.out.println("\nSeu saldo é de " + getSaldoConta());
    }
}
