package Desafio3.Carro;

public class ModeloCarro {
    private String carName;
    private int carPriceYear1,carPriceYear2,carPriceYear3;

    public int getCarPriceYear3() {
        return carPriceYear3;
    }

    public void setCarPriceYear3(int carPriceYear3) {
        this.carPriceYear3 = carPriceYear3;
    }

    public int getCarPriceYear2() {
        return carPriceYear2;
    }

    public void setCarPriceYear2(int carPriceYear2) {
        this.carPriceYear2 = carPriceYear2;
    }

    public int getCarPriceYear1() {
        return carPriceYear1;
    }

    public void setCarPriceYear1(int carPriceYear1) {
        this.carPriceYear1 = carPriceYear1;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void minMax (int value1, int value2, int value3){
        int min = Math.min(value1,value2);
        min = Math.min(min, value3);
        System.out.println("O carro é o " + getCarName() + " e seu menor valor foi " + min);;
    }
}

