class ContaBancaria {
       private int numeroConta;
       private double saldo;
       public String titular;

        public double getSaldo() {
            return saldo;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }

class IdadePessoa {
        private int idade;
        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void maiorIdade(){
            if (idade >= 18){
                System.out.println("\nÉ MAIOR DE IDADE!");
            } else {
                System.out.println("\nÉ MENOR DE IDADE!");
            }
        }
    }
public class Desafio2 {
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setIdade(17);
        idadePessoa.setNome("Vini");
        idadePessoa.maiorIdade();
    }
}
