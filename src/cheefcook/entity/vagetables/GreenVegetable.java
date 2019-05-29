package cheefcook.entity.vagetables;

import cheefcook.entity.Vegetable;

public class GreenVegetable extends Vegetable {
    final private int KEEPING_TIME = 10;

    public GreenVegetable(String name,double kiloCalories) {

        super(name,kiloCalories);
    }
    public GreenVegetable(){

    }

    public int getKeepingTime() {
        return KEEPING_TIME;
    }

   public enum listOfGreenVegetable {
        PARSLEY,   //петрушка
        LETTUCE,  //Салат
        ARAGULA  //Руккола
   }
}
