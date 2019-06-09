package cheefcook.entity.vagetables;

import cheefcook.entity.Vegetable;

public class GreenVegetable extends Vegetable {
    private final int KEEPING_TIME = 20; //Время хранения в днях

    public GreenVegetable(String name, int weightInGr, double kiloCalories) {
        super(name,weightInGr,kiloCalories);
    }

    public int getKeepingTime() {
        return KEEPING_TIME;
    }

    public enum listOfGreenVegetable {
        PARSLEY,
        LETTUCE,
        ARAGULA
    }
}