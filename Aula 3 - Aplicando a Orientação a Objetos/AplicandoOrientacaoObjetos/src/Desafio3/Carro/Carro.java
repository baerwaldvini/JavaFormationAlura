package Desafio3.Carro;

public class Carro {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();

        carro.setCarName("Sandero");
        carro.setCarPriceYear1(20000);
        carro.setCarPriceYear2(25465);
        carro.setCarPriceYear3(32500);

        carro.minMax(carro.getCarPriceYear1(), carro.getCarPriceYear2(), carro.getCarPriceYear3());
    }
}

