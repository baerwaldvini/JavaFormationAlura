package scrrenmatch.modelos;

import sreenmatch.calculos.Classificado;

public class Episodio implements Classificado {
    private int numero;
    private String nome;
    private Series serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100){
            return 4;
        } else return 2;
    }
}
