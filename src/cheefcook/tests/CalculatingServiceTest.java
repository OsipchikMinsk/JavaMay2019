package cheefcook.tests;

import cheefcook.entity.Salad;
import cheefcook.entity.Vegetable;
import cheefcook.entity.vagetables.FruitVegetable;
import cheefcook.entity.vagetables.GreenVegetable;
import cheefcook.entity.vagetables.RootVegetable;
import org.testng.Assert;
import org.testng.annotations.Test;
import cheefcook.service.implementations.CalculatingServiceImpl;
import java.util.*;

public class CalculatingServiceTest {
    CalculatingServiceImpl calculatingService = new CalculatingServiceImpl();

    @Test
    void calculateProductKiloCalories() {
        HashMap<Vegetable, Integer> products = new HashMap<>();
        Vegetable tomato = new FruitVegetable(FruitVegetable.listOfFruitVegetable.TOMATO.name(),20);
        Vegetable potatoes = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),60);
        Vegetable letucce = new GreenVegetable(GreenVegetable.listOfGreenVegetable.LETTUCE.name(),30);
        products.put(tomato, 50);
        products.put(potatoes, 100);
        products.put(letucce, 75);
        Salad salad = new Salad("CheefSalad", products);
        Assert.assertEquals(calculatingService.calculateKiloCalories(salad), 225.0);


    }

    @Test
    void sortSaladProductsByKiloCalories() {
        HashMap<Vegetable, Integer> products = new HashMap<>();
        Vegetable tomato = new FruitVegetable(FruitVegetable.listOfFruitVegetable.TOMATO.name(),100);
        Vegetable potatoes = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),60);
        Vegetable letucce = new GreenVegetable(GreenVegetable.listOfGreenVegetable.LETTUCE.name(),30);
        products.put(tomato, 50);
        products.put(potatoes, 100);
        products.put(letucce, 175);
        Salad salad = new Salad("KingSizeSalad", products);
        List<Vegetable> testProductsList = Arrays.asList(letucce, potatoes, tomato);
        List<Vegetable> listProducts = calculatingService.sortByKiloCalories(salad);
        for (int i = 0; i < testProductsList.size(); i++) {
            Assert.assertEquals(testProductsList.get(i), listProducts.get(i));
        }
    }

    @Test
    void sortSaladProductsByKiloCaloriesAndKeepingTime() {
        HashMap<Vegetable, Integer> products = new HashMap<>();
        Vegetable tomato = new FruitVegetable(FruitVegetable.listOfFruitVegetable.TOMATO.name(),100);
        Vegetable potatoes = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),60);
        Vegetable potatoes2 = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),60);
        potatoes.setKeepingTime(100);
        Vegetable potatoes3 = new RootVegetable(RootVegetable.listOfRootVegetable.POTATOES.name(),60);
        potatoes2.setKeepingTime(500);
        potatoes3.setKeepingTime(600);
        Vegetable letucce = new GreenVegetable(GreenVegetable.listOfGreenVegetable.LETTUCE.name(),30);
        products.put(tomato, 50);
        products.put(potatoes, 100);
        products.put(potatoes2, 100);
        products.put(potatoes3, 100);
        products.put(letucce, 175);
        Salad salad = new Salad("KingSizeSalad", products);
        List<Vegetable> testProductsList = Arrays.asList(letucce, potatoes, potatoes2, potatoes3, tomato);
        List<Vegetable> listProducts = calculatingService.sortByKiloCaloriesAndKeepingTime(salad);
        for (int i = 0; i < testProductsList.size(); i++) {
            Assert.assertEquals(testProductsList.get(i), listProducts.get(i));
        }
    }
}