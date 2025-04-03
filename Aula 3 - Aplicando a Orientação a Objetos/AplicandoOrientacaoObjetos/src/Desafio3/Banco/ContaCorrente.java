package Desafio3.Banco;

public class ContaCorrente extends ContaBancaria{
    public void cobrarTarifaMensal(int tarifa){
        setSaldoConta(getSaldoConta() - tarifa);
    }
}
