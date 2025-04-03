package Desafio3.Animal;

public class Animal {

    private String tipoAnimal;

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    private String nomeAnimal;

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void emitirSom(){
        System.out.println("Animal Emite Som!");
    }
}
