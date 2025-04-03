package Desafio3.Animal;

public class main {
    public static void main(String[] args) {
        Gato mia = new Gato();

        mia.setTipoAnimal("Gato");
        mia.setNomeAnimal("Mia");
        mia.arranhoSofa();
        mia.emitirSom();

        Gato lia = new Gato();
        lia.setTipoAnimal("Gato");
        lia.setNomeAnimal("Mia");
        lia.arranhoSofa();
        lia.emitirSom();

        Cachorro arcanjo = new Cachorro();
        arcanjo.setTipoAnimal("Cachorro");
        arcanjo.setNomeAnimal("Arcanjo");
        arcanjo.abanarRabo();
        arcanjo.emitirSom();
    }
}
