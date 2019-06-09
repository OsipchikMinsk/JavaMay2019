package cheefcook.tests;

import cheefcook.entity.Vegetable;
import cheefcook.entity.vagetables.FruitVegetable;
import cheefcook.entity.vagetables.GreenVegetable;
import cheefcook.entity.vagetables.RootVegetable;
import cheefcook.service.implementations.CookingServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static cheefcook.service.interfaces.ParsingFileService.kilocaloriesDataOfProducts;

public class CookingServiceTest {
    CookingServiceImpl cookingService = new CookingServiceImpl();
    @Test
    void prepareSaladTest() {
        kilocaloriesDataOfProducts.put("POTATOES", 85);
        kilocaloriesDataOfProducts.put("PARSLEY", 15);
        kilocaloriesDataOfProducts.put("CUCUMBER", 85);
        kilocaloriesDataOfProducts.put("CARROT", 40);
        List<String> testProductsList = Arrays.asList("POTATOES 20", "PARSLEY 5", "CUCUMBER 60", "CARROT 48");
        ArrayList<Vegetable> productsTest = new ArrayList<>();
        productsTest.add(new RootVegetable("POTATOES", 20, 85));
        productsTest.add(new GreenVegetable("PARSLEY", 5, 15));
        productsTest.add(new FruitVegetable("CUCUMBER", 60, 85));
        productsTest.add(new RootVegetable("CARROT", 48, 40));
        ArrayList<Vegetable> products = cookingService.prepareSalad(testProductsList);
        int size = productsTest.size();
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(products.get(i), productsTest.get(i));
        }

    }
}
