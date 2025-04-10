package projetoFinalMusicas;

import projetoFinalMusicas.audio.Audio;

public class Musica {
    public static void main(String[] args) {
        Audio audio = new Audio();

        audio.likedMusic(true);
        audio.likedMusic(false);
        System.out.println(audio.likes());

        audio.setClassificacao(5);
        audio.setClassificacao(3);

        audio.setTitulo("Enter Sandman");
        audio.setTitulo("Enter Sandman");
        audio.setTitulo("Bark at to the Moon    ");

        System.out.println("A musica " + audio.getTitulo() + " foi tocada " + audio.getTotalReproducoes() + " vezes.");
        System.out.println(audio.mediaClassificacao());
    }
}
