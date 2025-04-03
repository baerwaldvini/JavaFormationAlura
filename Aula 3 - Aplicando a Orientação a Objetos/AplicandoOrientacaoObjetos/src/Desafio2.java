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
class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double desconto){
        return preco = preco - (preco * (desconto /100));
    }
}

class Aluno2 {
    private String nome;
    private double notas;
    private int quantidadeNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        quantidadeNotas ++;
    }

    public double calcularMedia () {
        notas = getNotas();
        return notas / quantidadeNotas;
    }
}

class Livro {
    private String titulo, autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exbirDetalhes(){
        System.out.println("\nLivro: " + getTitulo() + " , do autor: " + getAutor());
    }
}
public class Desafio2 {
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setIdade(17);
        idadePessoa.setNome("Vini");
        idadePessoa.maiorIdade();

        Produto produto = new Produto();

        produto.setPreco(30);
        produto.setNome("Lapis de colorir");

        System.out.println("\nO produto " + produto.getNome() + " custa " + produto.getPreco() + " , com desconto fica " + produto.aplicarDesconto(25));

        Aluno2 aluno = new Aluno2();

        aluno.setNome("Vini");
        aluno.setNotas(8.79);
        aluno.setNotas(9);
        aluno.setNotas(5.45);
        aluno.setNotas(6);
        aluno.setNotas(10);
        aluno.setNotas(7.5);

        System.out.println("\nO aluno " + aluno.getNome() + " ficou com a média: " + aluno.calcularMedia());

        Livro livro = new Livro();
        livro.setAutor("JK Rowling");
        livro.setTitulo("HP e a Pedra Filosofal");

        livro.exbirDetalhes();
    }
}
