package cheefcook.service.implementations;


import cheefcook.entity.Vegetable;
import cheefcook.entity.vagetables.FruitVegetable;
import cheefcook.entity.vagetables.GreenVegetable;
import cheefcook.entity.vagetables.RootVegetable;
import cheefcook.service.interfaces.CookingService;

import java.util.ArrayList;
import java.util.List;

import static cheefcook.service.interfaces.ParsingFileService.*;


public class CookingServiceImpl implements CookingService {

    @Override
    public ArrayList<Vegetable> prepareSalad(List<String> products) {
        ArrayList<Vegetable> salad = new ArrayList<>();
        for (String prod : products) {
            String[] prodLine = prod.split("\\s+");
            if((prod!=null)&&(prodLine.length>1)){
                if (Integer.parseInt(prodLine[1])>0){
                    String name = prodLine[0].toUpperCase();
                    int weightOfProduct = Integer.parseInt(prodLine[1]);
                    Vegetable vegetable = new Vegetable();
                    switch (name) {
                        case "TOMATO":
                            vegetable = new FruitVegetable(FruitVegetable.listOfFruitVegetable.TOMATO.name(), weightOfProduct,
                                    getKIloCaloriesFromData(FruitVegetable.listOfFruitVegetable.TOMATO.name()));
                            break;
                        case "PEPPER":
                            vegetable = new FruitVegetable(FruitVegetable.listOfFruitVegetable.PEPPER.name(), weightOfProduct,
                                    getKIloCaloriesFromData(FruitVegetable.listOfFruitVegetable.PEPPER.name()));
                            break;
                        case "CUCUMBER":
                            vegetable = new FruitVegetable(FruitVegetable.listOfFruitVegetable.CUCUMBER.name(), weightOfProduct,
                                    getKIloCaloriesFromData(FruitVegetable.listOfFruitVegetable.CUCUMBER.name()));
                            break;
                        case "PARSLEY":
                            vegetable = new GreenVegetable(GreenVegetable.listOfGreenVegetable.PARSLEY.name(), weightOfProduct,
                                    getKIloCaloriesFromData(GreenVegetable.listOfGreenVegetable.PARSLEY.name()));
                            break;
                        case "LETTUCE":
                            vegetable = new GreenVegetable(GreenVegetable.listOfGreenVegetable.LETTUCE.name(), weightOfProduct,
                                    getKIloCaloriesFromData(GreenVegetable.listOfGreenVegetable.LETTUCE.name()));
                            break;
                        case "ARAGULA":
                            vegetable = new GreenVegetable(GreenVegetable.listOfGreenVegetable.ARAGULA.name(), weightOfProduct,
                                    getKIloCaloriesFromData(GreenVegetable.listOfGreenVegetable.ARAGULA.name()));
                            break;
                        case "POTATOES":
                            vegetable = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(), weightOfProduct,
                                    getKIloCaloriesFromData(RootVegetable.listOfRootVegetable.POTATOES.name()));
                            break;
                        case "CARROT":
                            vegetable = new RootVegetable(RootVegetable.listOfRootVegetable.CARROT.name(), weightOfProduct,
                                    getKIloCaloriesFromData(RootVegetable.listOfRootVegetable.CARROT.name()));
                            break;
                        case "ONION":
                            vegetable = new RootVegetable(RootVegetable.listOfRootVegetable.ONION.name(), weightOfProduct,
                                    getKIloCaloriesFromData(RootVegetable.listOfRootVegetable.ONION.name()));
                            break;
                        default:
                            break;
                    }
                    salad.add(vegetable);
                }
            }
        }
        return salad;
    }
    private double getKIloCaloriesFromData(String product) {
        return (double) kilocaloriesDataOfProducts.get(product);

    }
}
