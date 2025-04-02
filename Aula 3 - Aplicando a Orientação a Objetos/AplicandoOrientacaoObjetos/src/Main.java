//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "Harry Potter e a Pedra Filosofal";
        meuFilme.anoDeLancamento = 2000;
        meuFilme.duracaoEmMinutos = 192;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(9.2);
        meuFilme.avalia(10);
        meuFilme.avalia(8.5);
        meuFilme.avalia(6.8);


        System.out.println(meuFilme.somaNotas);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.mediaAvaliacoes());
    }
}