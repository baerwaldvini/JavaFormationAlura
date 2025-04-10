package projetoFinalMusicas.audio;

public class Audio {
    private String titulo;
    private int duracao,totalReproducoes,curtidas,classificacao,contClassificacao;
    private boolean curtiu;

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        totalReproducoes ++;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = this.classificacao + classificacao;
        contClassificacao ++;
    }

    // processamento da classificacao
    public int mediaClassificacao(){
        if (getClassificacao() / contClassificacao > 5){
            return 5;
        } else return getClassificacao() / contClassificacao;
    }

    // processamento da classificacao

    // processamento do total de reproduções


    // processamento da classificacao

    // retorno das curtidas
    public void likedMusic(boolean like){
        if (like == true){
            curtidas ++;
        }
    }

    public int likes (){
        return curtidas;
    }
    // retorno das curtidas

}
