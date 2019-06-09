package cheefcook.entity;


import java.util.Objects;

public class Vegetable {
    private String name; // название овоща
    private double kiloCalories; //калорийность продукта на 100 гр
    private int weightInGr;  //масса овоща в салате


    public Vegetable(String name, int weightInGr, double kiloCalories) {
        if ((name != null) && (name.length()) > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name of vegetable can't be empty or not be null");
        }
        if (weightInGr > 0) {
            this.weightInGr = weightInGr;
        } else {
            throw new IllegalArgumentException("Weight can't be <=0");
        }
        if (kiloCalories > 0) {  //рассчет калорийности продукта в салате исходя из нормы закладки в салат
            this.kiloCalories = (kiloCalories * weightInGr) / 100;
        } else {
            throw new IllegalArgumentException("Kilocalories can't be <=0");
        }
    }

    public Vegetable() {
        this.name ="not found";
        this.kiloCalories = 0;
        this.weightInGr = 0;
    }

    public String getName() {
        return name;
    }

    public double getKiloCalories() {
        return kiloCalories;
    }

    public int getWeightInGr() {
        return weightInGr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKiloCalories(double kiloCalories) {
        this.kiloCalories = kiloCalories;
    }

    public void setWeightInGr(int weightInGr) {
        this.weightInGr = weightInGr;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Vegetable vegetable = (Vegetable) object;

        return kiloCalories == vegetable.kiloCalories &&
                weightInGr == vegetable.weightInGr &&
                Objects.equals(name, vegetable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kiloCalories, weightInGr, name);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", kiloCalories=" + kiloCalories +
                ", weightInGr=" + weightInGr +
                '}';
    }
}