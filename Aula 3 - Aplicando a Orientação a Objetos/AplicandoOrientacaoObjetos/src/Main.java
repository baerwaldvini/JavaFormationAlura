import scrrenmatch.modelos.Filme;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Harry Potter e a Pedra Filosofal");
        meuFilme.setAnoDeLancamento(2000);
        meuFilme.setDuracaoEmMinutos(192);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(9.2);
        meuFilme.avalia(10);
        meuFilme.avalia(8.5);
        meuFilme.avalia(6.8);


        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Media das avaliações: " + meuFilme.mediaAvaliacoes());
    }
}