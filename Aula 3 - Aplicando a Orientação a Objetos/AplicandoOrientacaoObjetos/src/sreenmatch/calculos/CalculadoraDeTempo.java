package sreenmatch.calculos;

import scrrenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui (Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
