package cheefcook.service.interfaces;

import cheefcook.entity.Vegetable;

import java.util.ArrayList;
import java.util.HashMap;


public interface ParsingFileService {
     public static HashMap<String,Integer> kilocaloriesDataOfProducts = new HashMap<>();//база данных по калорийности
     public void getKilocaloriesData(String path);
     ArrayList<String> getProductsFromFile (String path);


}
