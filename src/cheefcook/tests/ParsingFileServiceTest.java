package cheefcook.tests;

import cheefcook.entity.Vegetable;
import cheefcook.entity.vagetables.FruitVegetable;
import cheefcook.entity.vagetables.GreenVegetable;
import cheefcook.entity.vagetables.RootVegetable;
import cheefcook.service.interfaces.ParsingFileService;
import org.testng.Assert;
import org.testng.annotations.Test;
import cheefcook.service.implementations.ParsingFileServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;

import static cheefcook.service.interfaces.ParsingFileService.kilocaloriesDataOfProducts;

public class ParsingFileServiceTest {

    private ParsingFileServiceImpl parsingFileService = new ParsingFileServiceImpl();
    private final String PATH_TO_RECIPY = "C:\\Users\\ARTos\\IdeaProjects\\IntroductionToJava\\src\\cheefcook" +
            "\\resources\\recipes.txt";

   @Test
    void getProductsFromFileTest() {
        ArrayList<String> testSaladsList = new ArrayList<>();
        ArrayList testSalad = new ArrayList();
        testSalad.add("POTATOES 20");
        testSalad.add("PARSLEY 5");
        testSalad.add("TOMATO 50");
        testSalad.add("LETTUCE 100");
        testSalad.add("PEPPER 55");
        testSalad.add("CUCUMBER 60");
        testSalad.add("ARAGULA 20");
        testSalad.add("CARROT 48");
        ArrayList<String> productListFromFile = parsingFileService.getProductsFromFile(PATH_TO_RECIPY);
        int size = testSaladsList.size();
        for (int i = 0;i<size;i++){
            Assert.assertEquals(testSalad.get(i),productListFromFile.get(i));
        }

    }
    @Test
    void initTestKiloCalData (){
       HashMap<String,Integer> testKiloCalories = new HashMap<>();
       testKiloCalories.put("POTATOES", 82);
       testKiloCalories.put("PARSLEY", 45);
       testKiloCalories.put("TOMATO", 19);
       testKiloCalories.put("LETTUCE", 14);
       testKiloCalories.put("PEPPER", 23);
       testKiloCalories.put("CUCUMBER", 15);
       testKiloCalories.put("ARAGULA", 14);
       testKiloCalories.put("CARROT", 33);
       final String PATH_TO_CALORIES = "C:\\Users\\ARTos\\IdeaProjects\\IntroductionToJava\\" +
               "src\\cheefcook\\resources\\kilocalories.txt";
        parsingFileService.getKilocaloriesData(PATH_TO_CALORIES);
        Assert.assertEquals(testKiloCalories,kilocaloriesDataOfProducts);

    }




}


