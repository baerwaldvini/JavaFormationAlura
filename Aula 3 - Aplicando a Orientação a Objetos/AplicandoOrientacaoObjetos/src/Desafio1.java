import java.time.Year;

class Pessoa {
    String olaMundo(){
        return "Olá Mundo!";
    }
}

class Calculadora {
    int doubleNumber(int number){
        return number * 2;
    }
}

class Musica {
    String titulo;
    String artista;
    int anoLancamento,numAvaliacoes;
    double avaliacao;

    void calculaNota(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaNotas (){
        return avaliacao / numAvaliacoes;
    }

    void exibirFicha(){
        System.out.println("\nMusica: " + titulo + "\nArtista: " + artista + "\nLançada em: " + anoLancamento);
        System.out.println("Média das notas: " + mediaNotas());
    }
}

class Carro {
    String modelo, cor;
    int ano;

    int idade(){
        return (Year.now().getValue() - ano);
    }

    void fichaTecnica (){
        System.out.println("\nCarro: " + modelo + "\nCor: " + cor + "\nIdade: " + idade() + " anos");
    }
}

class Aluno {
    String nome;
    int idade;

    void ficha(){
        System.out.println("\nNome: " + nome + "\nIdade: " + idade);
    }
}
public class Desafio1 {
    public static void main(String[] args) {
        Pessoa vPessoa = new Pessoa();
        System.out.println(vPessoa.olaMundo());

        Calculadora calc = new Calculadora();
        System.out.println(calc.doubleNumber(5));

        Musica musica = new Musica();
        musica.titulo = "Enter Sandman";
        musica.artista = "Metallica";
        musica.anoLancamento = 1993;

        musica.calculaNota(9.9);
        musica.calculaNota(10);
        musica.calculaNota(10);

        musica.exibirFicha();

        Carro carro = new Carro();

        carro.cor = "Vermelho";
        carro.modelo = "Sandero";
        carro.ano = 2012;
        carro.fichaTecnica();

        Aluno aluno = new Aluno();
        aluno.idade = 26;
        aluno.nome = "Vini";

        aluno.ficha();

    }
}
