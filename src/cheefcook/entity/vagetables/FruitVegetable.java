package cheefcook.entity.vagetables;

import cheefcook.entity.Vegetable;

public class FruitVegetable extends Vegetable {

    private final int KEEPING_TIME = 15; //Время хранения в днях

    public FruitVegetable(String name, int weightInGr, double kiloCalories) {
        super(name, weightInGr, kiloCalories);
    }
    public int getKEEPING_TIME() {
        return KEEPING_TIME;
    }

    public enum listOfFruitVegetable {
        TOMATO,
        PEPPER,
        CUCUMBER
    }
}


