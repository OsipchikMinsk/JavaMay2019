package cheefcook.tests;

import cheefcook.entity.Salad;
import cheefcook.entity.Vegetable;
import cheefcook.entity.vagetables.FruitVegetable;
import cheefcook.entity.vagetables.GreenVegetable;
import cheefcook.entity.vagetables.RootVegetable;
import cheefcook.service.LoggerService;
import cheefcook.service.implementations.ParsingFileServiceImpl;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import cheefcook.service.implementations.CalculatingServiceImpl;
import java.util.*;

public class CalculatingServiceTest {
    private static final Logger log = LoggerService.getLog();

    CalculatingServiceImpl calculatingService = new CalculatingServiceImpl();
    ParsingFileServiceImpl parsingFileService = new ParsingFileServiceImpl();

    @Test
    void printTestLogger (){
        parsingFileService.testPrint();
    }

    @Test
    void calculateProductKiloCaloriesFromSalad() {
        ArrayList<Vegetable> salad = new ArrayList<>();
        Vegetable tomato = new FruitVegetable(FruitVegetable.listOfFruitVegetable.TOMATO.name(),20,4 );
        Vegetable potatoes = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),60,50);
        Vegetable letucce = new GreenVegetable(GreenVegetable.listOfGreenVegetable.LETTUCE.name(),30,20);
        salad.add(tomato);
        salad.add(potatoes);
        salad.add(letucce);
        Assert.assertEquals(calculatingService.calculateKiloCalories(salad), 36.8);
    }

    @Test
    void sortProductInSalatByKiloCalories() {
        ArrayList<Vegetable> salad = new ArrayList<>();
        Vegetable tomato = new FruitVegetable(FruitVegetable.listOfFruitVegetable.TOMATO.name(),20,4 );
        Vegetable potatoes = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),60,50);
        Vegetable letucce = new GreenVegetable(GreenVegetable.listOfGreenVegetable.LETTUCE.name(),30,20);
        salad.add(tomato);
        salad.add(potatoes);
        salad.add(letucce);
        List<Vegetable> testProductsList = Arrays.asList(tomato, letucce, potatoes);
        List<Vegetable> listProducts = calculatingService.sortByKiloCalories(salad);
        for (int i = 0; i < testProductsList.size(); i++) {
            Assert.assertEquals(testProductsList.get(i), listProducts.get(i));
        }
    }

    @Test
    void sortByKiloCaloriesAndWeight() {
        ArrayList<Vegetable> salad = new ArrayList<>();
        Vegetable tomato = new FruitVegetable(FruitVegetable.listOfFruitVegetable.TOMATO.name(),100,50);
        Vegetable potatoes = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),60,85);
        Vegetable potatoes2 = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),25,85);
        Vegetable potatoes3 = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),100,85);
        Vegetable letucce = new GreenVegetable(GreenVegetable.listOfGreenVegetable.LETTUCE.name(),30,25);
       salad.add(tomato);
       salad.add(potatoes);
       salad.add(potatoes2);
       salad.add(potatoes3);
       salad.add(letucce);
        for (Vegetable v: salad){
            System.out.println(v);
        }
        List<Vegetable> testProductsList = Arrays.asList(letucce, potatoes2, tomato, potatoes, potatoes3);
        List<Vegetable> listProducts = calculatingService.sortByKiloCaloriesAndWeight(salad);
        for (int i = 0; i < testProductsList.size(); i++) {
            Assert.assertEquals(testProductsList.get(i), listProducts.get(i));
        }
    }
}
