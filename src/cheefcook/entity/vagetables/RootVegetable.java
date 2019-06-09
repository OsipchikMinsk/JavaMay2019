package cheefcook.entity.vagetables;

import cheefcook.entity.Vegetable;

public class RootVegetable extends Vegetable {

    private final int KEEPING_TIME = 180; //Время хранения в днях

    public RootVegetable(String name, int weightInGr, double kiloCalories) {
        super(name, weightInGr, kiloCalories);
    }
    public enum listOfRootVegetable {
        POTATOES,
        CARROT,
        ONION
    }
    public int getKEEPING_TIME() {
        return KEEPING_TIME;
    }
}