public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaNotas;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia (double nota){
        somaNotas += nota;
        totalAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return somaNotas / totalAvaliacoes;
    }
}
