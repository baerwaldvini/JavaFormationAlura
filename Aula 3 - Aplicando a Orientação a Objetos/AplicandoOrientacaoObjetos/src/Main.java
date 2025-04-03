import scrrenmatch.modelos.Filme;
import scrrenmatch.modelos.Series;
import sreenmatch.calculos.CalculadoraDeTempo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Series serie = new Series();

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

        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemprada(22);
        serie.setMinutosPorEpisodio(50);
        serie.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(serie);
        System.out.println("Duração total de tela dos selecionados: " + calculadoraDeTempo.getTempoTotal());
    }
}