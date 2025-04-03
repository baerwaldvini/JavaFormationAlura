package scrrenmatch.modelos;

public class Series extends  Titulo{
    private int temporadas;
    private int episodiosPorTemprada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getEpisodiosPorTemprada() {
        return episodiosPorTemprada;
    }

    public void setEpisodiosPorTemprada(int episodiosPorTemprada) {
        this.episodiosPorTemprada = episodiosPorTemprada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemprada * minutosPorEpisodio;
    }
}
